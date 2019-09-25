package edu.temple.colorpicker;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {
    Spinner spinner;
    String[] colors = {"Blue", "Cyan", "Gray", "Green", "Magenta", "Red", "Black", "Blue", "Green", "Yellow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.colorSpinner);
        ColorAdapter colorAdapter = new ColorAdapter(ColorActivity.this, colors);

        spinner.setAdapter(colorAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.WHITE); // when an item is selected, set Spinner background color to white
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
