package net.cmsc_434.cs_advising_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toolbar;

import java.util.ArrayList;

public class SelectTrackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_track);

        setTitle("Select a Track");
        centerTitle();

        Button nextButton = findViewById(R.id.nextButton);
        nextButton.setVisibility(View.GONE);

        RadioButton general = findViewById(R.id.general);
        RadioButton cyber = findViewById(R.id.cybersecurity);
        RadioButton qi = findViewById(R.id.quantumInfo);
        RadioButton ds = findViewById(R.id.dataScience);
        RadioButton ml = findViewById(R.id.machineLearning);


        RadioGroup trackSelect = findViewById(R.id.radioGroup1);
        trackSelect.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                nextButton.setVisibility(View.VISIBLE);
                if(i == R.id.general){
                    nextButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(SelectTrackActivity.this,GeneralCourseworkDegreeRequirements.class);
                            startActivity(intent);
                        }
                    });
                }
                else if(i == R.id.dataScience){
                    nextButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(SelectTrackActivity.this,DataScienceCourseworkDegreeRequirements.class);
                            startActivity(intent);
                        }
                    });
                }
                else if(i == R.id.cybersecurity) {
                    nextButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(SelectTrackActivity.this,CyberSecurityCourseworkDegreeRequirements.class);
                            startActivity(intent);
                        }
                    });
                }
                else if(i == R.id.machineLearning) {
                    nextButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(SelectTrackActivity.this,MachineLearningCourseworkDegreeRequirements.class);
                            startActivity(intent);
                        }
                    });
                }
                else  if(i == R.id.quantumInfo) {
                    nextButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(SelectTrackActivity.this,QuantumInformationCourseworkDegreeRequirements.class);
                            startActivity(intent);
                        }
                    });
                }
            }
        });

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