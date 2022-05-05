package com.example.bmi_calculator_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText height;
    private EditText weight;

    private TextView calculator;
    private TextView bmi_result;
    private TextView bmi_txt_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        calculator = findViewById(R.id.btn_calculate);
        bmi_result = findViewById(R.id.bmi_result);
        bmi_txt_result = findViewById(R.id.bmi_txt_result);

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double _h = Double.parseDouble( height.getText().toString());
                double _w = Double.parseDouble( weight.getText().toString());

                double res  = _w / (_h*_h) ;

                bmi_result.setText( String.format("%.2f", res));


                String _txtResult = "";
                if(res > 25)
                    _txtResult = "You\'re over weight";
                else if(res >= 18.5 && res <=25)
                    _txtResult = "You\'re over weight";
                else
                    _txtResult = "You\'re under weight";

                bmi_txt_result.setText(_txtResult);




            }
        });
    }
}