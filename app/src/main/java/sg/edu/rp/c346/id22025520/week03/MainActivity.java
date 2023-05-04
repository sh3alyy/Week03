package sg.edu.rp.c346.id22025520.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //Step 1 - declare variables
     TextView tvDisplay;
     Button buttonDisplay;
     EditText etInput;
     ToggleButton tbtn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        buttonDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action

                //get the state of the toggle button
                boolean isChecked = tbtn.isChecked();
                if (isChecked){
                    etInput.setEnabled(true);
                }else {
                    etInput.setEnabled(false);
                }


                //when the toggle button is unchecked, disable the EditText,
                // when the toggle button is checked, enable the the EditText
                // editTextInput when the toggle button is unchecked
                //enable it when it is checked





            }
        });



    }
}