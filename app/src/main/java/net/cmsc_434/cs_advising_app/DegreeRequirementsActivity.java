package net.cmsc_434.cs_advising_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import java.util.ArrayList;

public class DegreeRequirementsActivity extends AppCompatActivity {

    public Button generalReqs;
    public Button lowerLeverlReqs;
    public Button upperLevelConcentrationReqs;
    public Button trackSpecificReqs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree_requirements);
        setTitle("Degree Requirements");
        centerTitle();

        generalReqs = findViewById(R.id.generalRequirements);
        upperLevelConcentrationReqs = findViewById(R.id.upperLevelConcentrationRequirements);
        lowerLeverlReqs = (Button)findViewById(R.id.lowerLevelRequirements);
        trackSpecificReqs = findViewById(R.id.trackSpecificRequirements);

        lowerLeverlReqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DegreeRequirementsActivity.this,LowerLevelCourseworkDegreeRequirementsActivity.class);
                startActivity(intent);
            }
        });

        trackSpecificReqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(DegreeRequirementsActivity.this,SelectTrackActivity.class);
                startActivity(intent);
            }
        });

//        generalReqs.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(DegreeRequirementsActivity.this,GeneralCourseworkDegreeRequirements.class);
//                startActivity(intent);
//            }
//        });

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