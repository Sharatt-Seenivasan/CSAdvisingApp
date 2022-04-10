package net.cmsc_434.cs_advising_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class InfoPopUpWindowActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.infopopupwindow);

        Intent intent = getIntent();
        String activity = intent.getStringExtra("activity");
        TextView info = (TextView)findViewById(R.id.requirementInfo);

        if(activity.equals("generalTrack")){
            setTitle("General Track Information");
            centerTitle();
            info.setText("Students must take five (5) CMSC 400 level courses from at least three different areas with no more than three courses in a given area. " +
                    "An additional two (2) CMSC electives, totaling 6 credits, are also required. " +
                    "If students take more than three courses from an area, the additional course(s) will be counted as upper level computer science electives.");
        }
        if(activity.equals("machineLearningTrack")){
            setTitle("Machine Learning Track Information");
            centerTitle();
            info.setText("Students must fulfill their computer science upper level course requirements from at least 3 areas. " +
                    "Students may fulfill an area requirement under the Upper Level Elective Courses requirement.");
        }
        if(activity.equals("dataScienceTrack")){
            setTitle("Data Science Information");
            centerTitle();
            info.setText("Students must fulfill their computer science upper level course requirements from at least 3 areas. " +
                    "Students may fulfill an area requirement under the Upper Level Elective Courses requirement.");
        }
        if(activity.equals("cybersecurityTrack")){
            setTitle("Cybersecurity Track Information");
            centerTitle();
            info.setText("Students must fulfill their computer science upper level course requirements from at least 3 areas. " +
                    "Students may fulfill an area requirement under the Upper Level Elective Courses requirement.");
        }
        if(activity.equals("quantumInformationTrack")){
            setTitle("Quantum Information Track Information");
            centerTitle();
            info.setText("Students must fulfill their computer science upper level course requirements from at least 3 areas. " +
                    "Students may fulfill an area requirement under the Upper Level Elective Courses requirement.");
        }
        if(activity.equals("upperLevelConcentration")){
            setTitle("Upper Level Concentration Information");
            centerTitle();
            info.setText("All students, regardless of specialization, must complete 12 credit hours of 300 - 400 level courses in one discipline outside of Computer Science. " +
                    "Courses added to the 4-year plan and marked as ULC (Upper Level Concentration) courses will appear in the 'ULC Courses Completed' list");
        }
        if(activity.equals("lowerLevelRequirements")){
            setTitle("Lower Level Requirements Information");
            centerTitle();
            info.setText("All students, regardless of specialization, are required to take the following lower level coursework. It is highly" +
                    " recommended that you complete all of these classes before taking an upper level CMSC class related to your specialization");
        }
        if(activity.equals("generalEducationRequirements")){
            setTitle("General Education Requirements Information");
            centerTitle();
            info.setText("All students must take and pass all of the listed general education courses in each category in order to qualify for graduation.");
        }


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.8),(int)(height*0.3));
        //getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

    }

    private void centerTitle() {
        ArrayList<View> textViews = new ArrayList<>();

        getWindow().getDecorView().findViewsWithText(textViews, getTitle(), View.FIND_VIEWS_WITH_TEXT);

        if(textViews.size() > 0) {
            AppCompatTextView appCompatTextView = null;
            if(textViews.size() == 1) {
                appCompatTextView = (AppCompatTextView) textViews.get(0);
            } else {
                for(View v : textViews) {
                    if(v.getParent() instanceof Toolbar) {
                        appCompatTextView = (AppCompatTextView) v;
                        break;
                    }
                }
            }

            if(appCompatTextView != null) {
                ViewGroup.LayoutParams params = appCompatTextView.getLayoutParams();
                params.width = ViewGroup.LayoutParams.MATCH_PARENT;
                appCompatTextView.setLayoutParams(params);
                appCompatTextView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            }
        }
    }
}