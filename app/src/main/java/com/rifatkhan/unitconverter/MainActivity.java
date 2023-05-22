package com.rifatkhan.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcome_text, result_text;
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_text= findViewById(R.id.welcome_view);
        result_text= findViewById(R.id.result_view);
        btn= findViewById(R.id.btn);
        editText= findViewById(R.id.editText);

        //funtionalities

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            double kilos_entered= Double.parseDouble(editText.getText().toString());

            result_text.setText(""+convertTopound(kilos_entered));

            }
        });

    }

    public double convertTopound(double kilos){

        double pound_result= kilos*2.20462;
        return pound_result;
    }
}