package com.example.first_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //before taking input from user, we need to declare the variable
    public EditText edit;
    public Button button;
    public TextView show_output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Now we need to declare those varible from id
        edit = findViewById(R.id.inputTextId);  // store id of edit text field
        button = findViewById(R.id.ConvertButton);   // store id from activity main.xml button id to button
        show_output = findViewById(R.id.ViewOutput);   // similarly output buttoon

        //now lets work on button field
        // what happend if we click the button field
        // lets work on that
        //button.setOnClickListener(new view.OnClickListener());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int userInput = Integer.parseInt(edit.getText().toString());
                double us_dollar = userInput/104.68;
               // show_output.setText("BDT "+userInput+" = "+us_dollar+"$");
                show_output.setText(String.format("Amount in USD: %.2f$", us_dollar));

            }
        });


    }
}