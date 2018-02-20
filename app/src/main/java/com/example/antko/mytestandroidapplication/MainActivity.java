package com.example.antko.mytestandroidapplication;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Определение элементов управления
        final EditText amt = (EditText) findViewById(R.id.bill_amt);
        final EditText tip = (EditText) findViewById(R.id.bill_per);
        final TextView result = (TextView) findViewById(R.id.res);

        Button calc = (Button) findViewById(R.id.button1);
        calc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Получение значений и выполение расчетов
                double amount = Double.parseDouble(amt.getText().toString());
                double tip_per = Double.parseDouble(tip.getText().toString());
                double tip_cal = (amount * tip_per) / 100;

                // Отображение результатов
                result.setText("Результат: " + Double.toString(tip_cal));
            }
        });
    }
}