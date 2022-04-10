package net.cmsc_434.cs_advising_app;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class AdvisingAppointment extends AppCompatActivity implements
        DatePickerDialog.OnDateSetListener, View.OnClickListener {

    HashMap<String, ArrayList<String>> timesTaken = new HashMap<String, ArrayList<String>>();
    ArrayList<String> allTimes = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int year, month, day;
        String [] taken;
        allTimes.add("09:00 AM");
        allTimes.add("09:30 AM");
        allTimes.add("10:00 AM");
        allTimes.add("10:30 AM");
        allTimes.add("11:00 AM");
        allTimes.add("11:30 AM");
        allTimes.add("12:00 PM");
        allTimes.add("12:30 PM");
        allTimes.add("01:00 PM");
        allTimes.add("01:30 PM");
        allTimes.add("02:00 PM");
        allTimes.add("02:30 PM");
        allTimes.add("03:00 PM");
        allTimes.add("03:30 PM");
        allTimes.add("04:00 PM");
        allTimes.add("04:30 PM");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment_activity);

        //get system clock time
        Calendar now = Calendar.getInstance();
        Calendar maxDate = Calendar.getInstance();
        year = now.get(Calendar.YEAR);
        month = now.get(Calendar.MONTH);
        day = now.get(Calendar.DAY_OF_MONTH);

        //Date picker
        DatePickerDialog datePickerDialog = DatePickerDialog.newInstance(
                AdvisingAppointment.this, year, month, day);
        //Disable picking past dates
        datePickerDialog.setMinDate(now);
        //Disable picking dates more than 3 months from now
        maxDate.add(Calendar.DATE, 90);
        datePickerDialog.setMaxDate(maxDate);
        //Date
        ((Button) findViewById(R.id.dayButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog.show(getSupportFragmentManager(),"Select Date");
            }
        });


        //pull data from file
        try{
            final InputStream file = getAssets().open("timesTaken.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(file));
            String data = reader.readLine();
            while(data != null){
                String key = data.substring(0,10);
                String value = data.substring(11, data.length());
                if (timesTaken.get(key) == null) {
                    ArrayList<String> arr = new ArrayList<String>();
                    arr.add(value);
                    timesTaken.put(key, arr);
                } else {
                    timesTaken.get(key).add(value);
                }
                data = reader.readLine();
            }
            reader.close();
        } catch(IOException ioe){
            ioe.printStackTrace();
        }

        //remove dates with full entries and weekends
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
        List<Calendar> block = new ArrayList<>();
        for (String key : timesTaken.keySet()) {
            if (timesTaken.get(key).size() == allTimes.size()) {
                try {
                    Date date = formatter.parse(key);
                    Calendar temp = Calendar.getInstance();
                    temp.setTime(date);
                    block.add(temp);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        Calendar[] blk = block.toArray(new Calendar[block.size()]);
        datePickerDialog.setDisabledDays(blk);



        //Time Spinner
        Spinner timeSpinner = (Spinner) findViewById(R.id.timeSpinner);
        timeSpinner.setEnabled(false);
        View outline = (View) findViewById(R.id.outline);
        outline.setBackgroundColor(Color.parseColor("#8c8c8c"));

        //Request Buttons
        Button requestBtn = (Button) findViewById(R.id.requestButton);
        requestBtn.setBackgroundColor(Color.parseColor("#8c8c8c"));
        requestBtn.setEnabled(false);
        requestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requestBtn.setBackgroundColor(Color.parseColor("#8c8c8c"));
                requestBtn.setText("Request Sent!");
                requestBtn.setEnabled(false);
            }
        });


    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int month, int dayOfMonth) {
        String str, monthStr, dayStr;
        month += 1;
        monthStr = Integer.toString(month);
        dayStr = Integer.toString(dayOfMonth);
        if (month < 10) {
            monthStr = "0" + monthStr;
        }
        if (dayOfMonth < 10) {
            dayStr = "0" + dayStr;
        }
        str = monthStr + "/" + dayStr + "/" + year;
        TextView textView = (TextView) findViewById(R.id.apptDay);
        textView.setText(str);
        //Modify timeSpinner

        Spinner timeSpinner = (Spinner) findViewById(R.id.timeSpinner);
        ArrayList<String> spinn = (ArrayList<String>) allTimes.clone();
        if (timesTaken.get(str) != null) {
            spinn.removeAll(timesTaken.get(str));
        }
        ArrayAdapter ad = new ArrayAdapter(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, spinn);
        timeSpinner.setAdapter(ad);

        //Enable timeSpinner
        timeSpinner.setEnabled(true);
        View outline = (View) findViewById(R.id.outline);
        outline.setBackgroundColor(Color.parseColor("#D02905"));
        Button request = (Button) findViewById(R.id.requestButton);
        request.setBackgroundColor(Color.parseColor("#D02905"));
        request.setEnabled(true);

    }


}
