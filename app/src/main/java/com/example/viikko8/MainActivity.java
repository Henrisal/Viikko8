package com.example.viikko8;
//GPT helped with String.ValueOf()
import      android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText numberInput;
    private EditText numberInput2;
    private EditText numberOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.editFirstNumber);
        numberInput2 = findViewById(R.id.editSecondNumber);
        numberOutput = findViewById(R.id.textSeeResult);



        }

    public void Plus(View view){
        int number1 = Integer.parseInt(numberInput.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        int result = number1+number2;
        numberOutput.setText(String.valueOf(result));
    }

    public void Minus(View view){
        int number1 = Integer.parseInt(numberInput.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        int result = number1-number2;
        numberOutput.setText(String.valueOf(result));
    }

    public void Multiply(View view){
        int number1 = Integer.parseInt(numberInput.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        int result = number1*number2;
        numberOutput.setText(String.valueOf(result));
    }

    public void Divide(View view){
        int number1 = Integer.parseInt(numberInput.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        int result = number1/number2;
        numberOutput.setText(String.valueOf(result));
    }
}