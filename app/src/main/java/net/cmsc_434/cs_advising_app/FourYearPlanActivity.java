package net.cmsc_434.cs_advising_app;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class FourYearPlanActivity extends AppCompatActivity {
    public Spinner class1_1;
    public Spinner class1_2;
    public Spinner class1_3;
    public Spinner class1_4;
    public Spinner class1_5;
    public Spinner class2_1;
    public Spinner class2_2;
    public Spinner class2_3;
    public Spinner class2_4;
    public Spinner class2_5;
    public Spinner class3_1;
    public Spinner class3_2;
    public Spinner class3_3;
    public Spinner class3_4;
    public Spinner class3_5;
    public Spinner class4_1;
    public Spinner class4_2;
    public Spinner class4_3;
    public Spinner class4_4;
    public Spinner class4_5;
    public Spinner class5_1;
    public Spinner class5_2;
    public Spinner class5_3;
    public Spinner class5_4;
    public Spinner class5_5;
    public Spinner class6_1;
    public Spinner class6_2;
    public Spinner class6_3;
    public Spinner class6_4;
    public Spinner class6_5;
    public Spinner class7_1;
    public Spinner class7_2;
    public Spinner class7_3;
    public Spinner class7_4;
    public Spinner class7_5;
    public Spinner class8_1;
    public Spinner class8_2;
    public Spinner class8_3;
    public Spinner class8_4;
    public Spinner class8_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<Spinner> spinners = new ArrayList<Spinner>();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_year_plan);
        setTitle("Four Year Plan Builder");
        populateSpinners(spinners);
        ArrayAdapter a = ArrayAdapter.createFromResource(this, R.array.course_selection, android.R.layout.simple_spinner_item);
        setAdapters(spinners, a);

        for (Spinner s : spinners) {
            s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }
    }

    private void populateSpinners(ArrayList<Spinner> spinnerList) {
        class1_1 = findViewById(R.id.addClass1_1);
        spinnerList.add(class1_1);
        class1_2 = findViewById(R.id.addClass1_2);
        spinnerList.add(class1_2);
        class1_3 = findViewById(R.id.addClass1_3);
        spinnerList.add(class1_3);
        class1_4 = findViewById(R.id.addClass1_4);
        spinnerList.add(class1_4);
        class1_5 = findViewById(R.id.addClass1_5);
        spinnerList.add(class1_5);
        class2_1 = findViewById(R.id.addClass2_1);
        spinnerList.add(class2_1);
        class2_2 = findViewById(R.id.addClass2_2);
        spinnerList.add(class2_2);
        class2_3 = findViewById(R.id.addClass2_3);
        spinnerList.add(class2_3);
        class2_4 = findViewById(R.id.addClass2_4);
        spinnerList.add(class2_4);
        class2_5 = findViewById(R.id.addClass2_5);
        spinnerList.add(class2_5);
        class3_1 = findViewById(R.id.addClass3_1);
        spinnerList.add(class3_1);
        class3_2 = findViewById(R.id.addClass3_2);
        spinnerList.add(class3_2);
        class3_3 = findViewById(R.id.addClass3_3);
        spinnerList.add(class3_3);
        class3_4 = findViewById(R.id.addClass3_4);
        spinnerList.add(class3_4);
        class3_5 = findViewById(R.id.addClass3_5);
        spinnerList.add(class3_5);
        class4_1 = findViewById(R.id.addClass4_1);
        spinnerList.add(class4_1);
        class4_2 = findViewById(R.id.addClass4_2);
        spinnerList.add(class4_2);
        class4_3 = findViewById(R.id.addClass4_3);
        spinnerList.add(class4_3);
        class4_4 = findViewById(R.id.addClass4_4);
        spinnerList.add(class4_4);
        class4_5 = findViewById(R.id.addClass4_5);
        spinnerList.add(class4_5);
        class5_1 = findViewById(R.id.addClass5_1);
        spinnerList.add(class5_1);
        class5_2 = findViewById(R.id.addClass5_2);
        spinnerList.add(class5_2);
        class5_3 = findViewById(R.id.addClass5_3);
        spinnerList.add(class5_3);
        class5_4 = findViewById(R.id.addClass5_4);
        spinnerList.add(class5_4);
        class5_5 = findViewById(R.id.addClass5_5);
        spinnerList.add(class5_5);
        class6_1 = findViewById(R.id.addClass6_1);
        spinnerList.add(class6_1);
        class6_2 = findViewById(R.id.addClass6_2);
        spinnerList.add(class6_2);
        class6_3 = findViewById(R.id.addClass6_3);
        spinnerList.add(class6_3);
        class6_4 = findViewById(R.id.addClass6_4);
        spinnerList.add(class6_4);
        class6_5 = findViewById(R.id.addClass6_5);
        spinnerList.add(class6_5);
        class7_1 = findViewById(R.id.addClass7_1);
        spinnerList.add(class7_1);
        class7_2 = findViewById(R.id.addClass7_2);
        spinnerList.add(class7_2);
        class7_3 = findViewById(R.id.addClass7_3);
        spinnerList.add(class7_3);
        class7_4 = findViewById(R.id.addClass7_4);
        spinnerList.add(class7_4);
        class7_5 = findViewById(R.id.addClass7_5);
        spinnerList.add(class7_5);
        class8_1 = findViewById(R.id.addClass8_1);
        spinnerList.add(class8_1);
        class8_2 = findViewById(R.id.addClass8_2);
        spinnerList.add(class8_2);
        class8_3 = findViewById(R.id.addClass8_3);
        spinnerList.add(class8_3);
        class8_4 = findViewById(R.id.addClass8_4);
        spinnerList.add(class8_4);
        class8_5 = findViewById(R.id.addClass8_5);
        spinnerList.add(class8_5);
    }

    private void setAdapters(ArrayList<Spinner> spinnerList, ArrayAdapter arrayAdapter) {
        for (Spinner s : spinnerList) {
            s.setAdapter(arrayAdapter);
        }
    }
}
