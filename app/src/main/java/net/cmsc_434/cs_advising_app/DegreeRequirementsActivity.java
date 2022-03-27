package net.cmsc_434.cs_advising_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DegreeRequirementsActivity extends AppCompatActivity {

    public Button generalReqs;
    public Button lowerLeverlReqs;
    public Button upperLevelConcentrationReqs;
    public Button trackSpecificReqs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree_requirements);

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

    }
}