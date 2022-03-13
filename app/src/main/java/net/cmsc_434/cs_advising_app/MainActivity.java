package net.cmsc_434.cs_advising_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public Button degreeRequirementButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        degreeRequirementButton = (Button)findViewById(R.id.button10);

        degreeRequirementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DegreeRequirementsActivity.class);
                startActivity(intent);
            }
        });
    }
}