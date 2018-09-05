package com.example.abyandafa.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public String str ="";
    Character op = 'q';
    float i,num,numtemp;
    EditText showResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (EditText) findViewById(R.id.Ans);
    }

    public void btnClicked(View v)
    {
        switch (v.getId())
        {
            case R.id.buttonA0:
                insert(0);
                break;
            case R.id.buttonA1:
                insert(1);
                break;
            case R.id.buttonA2:
                insert(2);
                break;
            case R.id.buttonA3:
                insert(3);
                break;
            case R.id.buttonA4:
                insert(4);
                break;
            case R.id.buttonA5:
                insert(5);
                break;
            case R.id.buttonA6:
                insert(6);
                break;
            case R.id.buttonA7:
                insert(7);
                break;
            case R.id.buttonA8:
                insert(8);
                break;
            case R.id.buttonA9:
                insert(9);
                break;
            case R.id.buttonCalc:
                calculate();
                break;
            case R.id.buttonClear:
                reset();
                break;
            case R.id.buttonDivide:
                perform();
                op = '/';
                break;
            case R.id.buttonSum:
                perform();
                op = '+';
                break;
            case R.id.buttonSub:
                perform();
                op = '-';
                break;
            case R.id.buttonMult:
                perform();
                op = '*';
                break;
        }
    }
    private void reset() {
        // TODO Auto-generated method stub
        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }
    private void insert(int j) {
        // TODO Auto-generated method stub
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);

    }
    private void perform() {
        // TODO Auto-generated method stub
        str = "";
        calculateNoShow();
        numtemp = num;

    }
    private void calculate() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
        showResult.setText(""+num);
    }

    private void calculateNoShow() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
    }
}
