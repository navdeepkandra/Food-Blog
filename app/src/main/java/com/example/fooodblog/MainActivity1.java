package com.example.fooodblog;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    RadioGroup locationRadioGroup;
    Button nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        RadioButton radioButton1 = findViewById(R.id.pavagadaRadioButton);
        radioButton1.setButtonTintList(ColorStateList.valueOf(Color.parseColor("#FF0000")));
        radioButton1.setTextColor(Color.parseColor("#FFFFFF"));

        RadioButton radioButton2 = findViewById(R.id.tipturRadioButton);
        radioButton2.setButtonTintList(ColorStateList.valueOf(Color.parseColor("#FF0000")));
        radioButton2.setTextColor(Color.parseColor("#FFFFFF"));

        RadioButton radioButton3 = findViewById(R.id.raichurRadioButton);
        radioButton3.setButtonTintList(ColorStateList.valueOf(Color.parseColor("#FF0000")));
        radioButton3.setTextColor(Color.parseColor("#FFFFFF"));

        RadioButton radioButton4 = findViewById(R.id.mysoreRadioButton);
        radioButton4.setButtonTintList(ColorStateList.valueOf(Color.parseColor("#FF0000")));
        radioButton4.setTextColor(Color.parseColor("#FFFFFF"));

        RadioButton radioButton5 = findViewById(R.id.bengaluruRadioButton);
        radioButton5.setButtonTintList(ColorStateList.valueOf(Color.parseColor("#FF0000")));
        radioButton5.setTextColor(Color.parseColor("#FFFFFF"));

        RadioButton radioButton6 = findViewById(R.id.hyderabadRadioButton);
        radioButton6.setButtonTintList(ColorStateList.valueOf(Color.parseColor("#FF0000")));
        radioButton6.setTextColor(Color.parseColor("#FFFFFF"));

        locationRadioGroup = findViewById(R.id.locationRadioGroup);
        nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = locationRadioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedId);

                // Get the selected location
                String selectedLocation = selectedRadioButton.getText().toString();

                // Send the selected location to the next activity
                Intent intent = new Intent(MainActivity1.this, SecondActivity.class);
                intent.putExtra("location", selectedLocation);
                startActivity(intent);
            }
        });
    }
}
