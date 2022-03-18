package net.cmsc_434.cs_advising_app;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DegreeRequirementsActivity extends AppCompatActivity {

    public Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree_requirements);

        nextButton = (Button)findViewById(R.id.nextButton);

    }
}