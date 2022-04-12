package net.cmsc_434.cs_advising_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FourYearPlanActivity extends AppCompatActivity {
    public Button class1_1 = (Button)findViewById(R.id.addClass1_1);
    public Button class1_2 = (Button)findViewById(R.id.addClass1_2);
    public Button class1_3 = (Button)findViewById(R.id.addClass1_3);
    public Button class1_4 = (Button)findViewById(R.id.addClass1_4);
    public Button class1_5 = (Button)findViewById(R.id.addClass1_5);
    public Button class2_1 = (Button)findViewById(R.id.addClass2_1);
    public Button class2_2 = (Button)findViewById(R.id.addClass2_2);
    public Button class2_3 = (Button)findViewById(R.id.addClass2_3);
    public Button class2_4 = (Button)findViewById(R.id.addClass2_4);
    public Button class2_5 = (Button)findViewById(R.id.addClass2_5);
    public Button class3_1 = (Button)findViewById(R.id.addClass3_1);
    public Button class3_2 = (Button)findViewById(R.id.addClass3_2);
    public Button class3_3 = (Button)findViewById(R.id.addClass3_3);
    public Button class3_4 = (Button)findViewById(R.id.addClass3_4);
    public Button class3_5 = (Button)findViewById(R.id.addClass3_5);
    public Button class4_1 = (Button)findViewById(R.id.addClass4_1);
    public Button class4_2 = (Button)findViewById(R.id.addClass4_2);
    public Button class4_3 = (Button)findViewById(R.id.addClass4_3);
    public Button class4_4 = (Button)findViewById(R.id.addClass4_4);
    public Button class4_5 = (Button)findViewById(R.id.addClass4_5);
    public Button class5_1 = (Button)findViewById(R.id.addClass5_1);
    public Button class5_2 = (Button)findViewById(R.id.addClass5_2);
    public Button class5_3 = (Button)findViewById(R.id.addClass5_3);
    public Button class5_4 = (Button)findViewById(R.id.addClass5_4);
    public Button class5_5 = (Button)findViewById(R.id.addClass5_5);
    public Button class6_1 = (Button)findViewById(R.id.addClass6_1);
    public Button class6_2 = (Button)findViewById(R.id.addClass6_2);
    public Button class6_3 = (Button)findViewById(R.id.addClass6_3);
    public Button class6_4 = (Button)findViewById(R.id.addClass6_4);
    public Button class6_5 = (Button)findViewById(R.id.addClass6_5);
    public Button class7_1 = (Button)findViewById(R.id.addClass7_1);
    public Button class7_2 = (Button)findViewById(R.id.addClass7_2);
    public Button class7_3 = (Button)findViewById(R.id.addClass7_3);
    public Button class7_4 = (Button)findViewById(R.id.addClass7_4);
    public Button class7_5 = (Button)findViewById(R.id.addClass7_5);
    public Button class8_1 = (Button)findViewById(R.id.addClass8_1);
    public Button class8_2 = (Button)findViewById(R.id.addClass8_2);
    public Button class8_3 = (Button)findViewById(R.id.addClass8_3);
    public Button class8_4 = (Button)findViewById(R.id.addClass8_4);
    public Button class8_5 = (Button)findViewById(R.id.addClass8_5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_year_plan);
        setTitle("Four Year Plan Builder");
        registerAllButtonsForMenu();
    }

    private void registerAllButtonsForMenu() {
        registerForContextMenu(class1_1);
        registerForContextMenu(class1_2);
        registerForContextMenu(class1_3);
        registerForContextMenu(class1_4);
        registerForContextMenu(class1_5);
        registerForContextMenu(class2_1);
        registerForContextMenu(class2_2);
        registerForContextMenu(class2_3);
        registerForContextMenu(class2_4);
        registerForContextMenu(class2_5);
        registerForContextMenu(class3_1);
        registerForContextMenu(class3_2);
        registerForContextMenu(class3_3);
        registerForContextMenu(class3_4);
        registerForContextMenu(class3_5);
        registerForContextMenu(class4_1);
        registerForContextMenu(class4_2);
        registerForContextMenu(class4_3);
        registerForContextMenu(class4_4);
        registerForContextMenu(class4_5);
        registerForContextMenu(class5_1);
        registerForContextMenu(class5_2);
        registerForContextMenu(class5_3);
        registerForContextMenu(class5_4);
        registerForContextMenu(class5_5);
        registerForContextMenu(class6_1);
        registerForContextMenu(class6_2);
        registerForContextMenu(class6_3);
        registerForContextMenu(class6_4);
        registerForContextMenu(class6_5);
        registerForContextMenu(class7_1);
        registerForContextMenu(class7_2);
        registerForContextMenu(class7_3);
        registerForContextMenu(class7_4);
        registerForContextMenu(class7_5);
        registerForContextMenu(class8_1);
        registerForContextMenu(class8_2);
        registerForContextMenu(class8_3);
        registerForContextMenu(class8_4);
        registerForContextMenu(class8_5);
    }
}
