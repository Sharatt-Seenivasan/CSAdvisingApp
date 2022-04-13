package net.cmsc_434.cs_advising_app;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

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
    public Button add131and132;
    public Spinner selectSemester;
    public TableLayout firstSemester;
    public TableLayout secondSemester;
    public TableLayout thirdSemester;
    public TableLayout fourthSemester;
    public TableLayout fifthSemester;
    public TableLayout sixthSemester;
    public TableLayout seventhSemester;
    public TableLayout eighthSemester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<Spinner> spinners = new ArrayList<Spinner>();
        String[] courses = getResources().getStringArray(R.array.course_selection);
        String[] selectedCourses = new String[70];
        int currentSemester = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_year_plan);
        setTitle("Four Year Plan Builder");
        populateSpinners(spinners);
        ArrayAdapter a = ArrayAdapter.createFromResource(this, R.array.course_selection, android.R.layout.simple_spinner_item);
        setAdapters(spinners, a);

        selectSemester = findViewById(R.id.select_semester);
        ArrayAdapter selectSems = ArrayAdapter.createFromResource(this, R.array.semester_selection, android.R.layout.simple_spinner_item);
        selectSemester.setAdapter(selectSems);
        selectSemester.setSelection(0);

        for (Spinner s : spinners) {
            s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                    if (parent.getItemAtPosition(i).equals("CMSC 420 (3 credits) or CMSC 421 (3 credits)") ||
                    parent.getItemAtPosition(i).equals("CMSC 434 (3 credits) or CMSC 436 (3 credits)")) {
                        Toast.makeText(getBaseContext(),"This is a tough workload!", Toast.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }

        add131and132 = findViewById(R.id.add131and132);
        add131and132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                class1_1.setSelection(1);
                class2_1.setSelection(2);
            }
        });

        selectSemester = findViewById(R.id.select_semester);
        assignSemesterViews();
        TableLayout[] semesters = new TableLayout[8];
        organizeSemesterViews(semesters);

        selectSemester.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                int count = 0;
                while (count < i) {
                    semesters[count].setBackgroundColor(getResources().getColor(R.color.green));
                    count += 1;
                }

                semesters[count].setBackgroundColor(getResources().getColor(R.color.yellow));
                count += 1;

                while (count < 8) {
                    semesters[count].setBackgroundColor(getResources().getColor(R.color.umd_red));
                    count += 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void assignSemesterViews() {
        firstSemester = findViewById(R.id.firstSemester);
        secondSemester = findViewById(R.id.secondSemester);
        thirdSemester = findViewById(R.id.thirdSemester);
        fourthSemester = findViewById(R.id.fourthSemester);
        fifthSemester = findViewById(R.id.fifthSemester);
        sixthSemester = findViewById(R.id.sixthSemester);
        seventhSemester = findViewById(R.id.seventhSemester);
        eighthSemester = findViewById(R.id.eighthSemester);
    }

    private void organizeSemesterViews(TableLayout[] sems) {
        sems[0] = firstSemester;
        sems[1] = secondSemester;
        sems[2] = thirdSemester;
        sems[3] = fourthSemester;
        sems[4] = fifthSemester;
        sems[5] = sixthSemester;
        sems[6] = seventhSemester;
        sems[7] = eighthSemester;
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
            s.setSelection(0);
        }
    }
}
