package com.example.temperatureproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputTemperatureEditText;
    private Button convertButton;
    private TextView temperatureConvertedTextView;
    private String inputTemperature;

    double ConvertTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertButton = (Button) findViewById(R.id.convert_button);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTemperatureEditText = (EditText) findViewById(R.id.input_temperature_edit_text);
                inputTemperature=inputTemperatureEditText.getText().toString();
                ConvertTemperature = (Double.parseDouble(inputTemperature)-32)*5/9;
                temperatureConvertedTextView = (TextView) findViewById(R.id.temperature_converted_text_view);
                temperatureConvertedTextView.setText(String.format("The temperature in degrees is: %s", Double.toString(ConvertTemperature)));
            }
        });
    }
}