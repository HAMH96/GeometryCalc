package com.example.humor.geometrycalc;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioCircle;
    private RadioButton radioTriangle;
    private RadioButton radioSquare;
    private RadioButton radioCube;
    private TextView labelSide;
    private TextView labelRadius;
    private TextView labelArea;
    private TextView labelPerim;
    private TextView labelVol;
    private TextView showArea;
    private TextView showPerim;
    private TextView showVol;
    private EditText editSide;
    private EditText editRadius;
    private Button calculate;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioCircle = (RadioButton) findViewById(R.id.radioCircle);
        radioTriangle = (RadioButton) findViewById(R.id.radioTriangle);
        radioSquare = (RadioButton) findViewById(R.id.radioSquare);
        radioCube = (RadioButton) findViewById(R.id.radioCube);
        labelSide = (TextView) findViewById(R.id.labelSide);
        labelArea = (TextView) findViewById(R.id.labelArea);
        labelPerim = (TextView) findViewById(R.id.labelPerim);
        labelRadius = (TextView) findViewById(R.id.labelRadius);
        showArea = (TextView) findViewById(R.id.showArea);
        showPerim = (TextView) findViewById(R.id.showPerim);
        showVol = (TextView) findViewById(R.id.showVol);
        labelVol = (TextView) findViewById(R.id.labelVol);
        editSide = (EditText) findViewById(R.id.editSide);
        editRadius = (EditText) findViewById(R.id.editRadius);
        calculate = (Button) findViewById(R.id.calculate);
        clear = (Button) findViewById(R.id.clear);

        labelSide.setVisibility(View.INVISIBLE);
        labelArea.setVisibility(View.INVISIBLE);
        labelPerim.setVisibility(View.INVISIBLE);
        labelRadius.setVisibility(View.INVISIBLE);
        labelVol.setVisibility(View.INVISIBLE);
        editRadius.setVisibility(View.INVISIBLE);
        editSide.setVisibility(View.INVISIBLE);
        calculate.setVisibility(View.INVISIBLE);
        clear.setVisibility(View.INVISIBLE);
        showArea.setVisibility(View.INVISIBLE);
        showPerim.setVisibility(View.INVISIBLE);
        showVol.setVisibility(View.INVISIBLE);
    }
    public void chooseCircle(View view){
        if (radioCircle.isChecked()) {
            radioTriangle.setChecked(false);
            radioCube.setChecked(false);
            radioSquare.setChecked(false);
            labelSide.setVisibility(View.INVISIBLE);
            labelArea.setVisibility(View.INVISIBLE);
            labelPerim.setVisibility(View.INVISIBLE);
            labelRadius.setVisibility(View.VISIBLE);
            labelVol.setVisibility(View.INVISIBLE);
            editRadius.setVisibility(View.VISIBLE);
            editSide.setVisibility(View.INVISIBLE);
            calculate.setVisibility(View.VISIBLE);
            clear.setVisibility(View.VISIBLE);
            showArea.setVisibility(View.INVISIBLE);
            showPerim.setVisibility(View.INVISIBLE);
            showVol.setVisibility(View.INVISIBLE);
            editSide.setText("");
            editRadius.setText("");
        }
    }

    public void chooseTriangle(View view){
        if (radioTriangle.isChecked()){
            radioSquare.setChecked(false);
            radioCube.setChecked(false);
            radioCircle.setChecked(false);
            labelSide.setVisibility(View.VISIBLE);
            labelArea.setVisibility(View.INVISIBLE);
            labelPerim.setVisibility(View.INVISIBLE);
            labelRadius.setVisibility(View.INVISIBLE);
            labelVol.setVisibility(View.INVISIBLE);
            editRadius.setVisibility(View.INVISIBLE);
            editSide.setVisibility(View.VISIBLE);
            calculate.setVisibility(View.VISIBLE);
            clear.setVisibility(View.VISIBLE);
            showArea.setVisibility(View.INVISIBLE);
            showPerim.setVisibility(View.INVISIBLE);
            showVol.setVisibility(View.INVISIBLE);
            editSide.setText("");        }
    }
    public void chooseSquare(View view){
        if(radioSquare.isChecked()){
            radioCircle.setChecked(false);
            radioCube.setChecked(false);
            radioTriangle.setChecked(false);
            labelSide.setVisibility(View.VISIBLE);
            labelArea.setVisibility(View.INVISIBLE);
            labelPerim.setVisibility(View.INVISIBLE);
            labelRadius.setVisibility(View.INVISIBLE);
            labelVol.setVisibility(View.INVISIBLE);
            editRadius.setVisibility(View.INVISIBLE);
            editSide.setVisibility(View.VISIBLE);
            calculate.setVisibility(View.VISIBLE);
            clear.setVisibility(View.VISIBLE);
            showArea.setVisibility(View.INVISIBLE);
            showPerim.setVisibility(View.INVISIBLE);
            showVol.setVisibility(View.INVISIBLE);
            editSide.setText("");
        }
    }
    public void chooseCube(View view){
        if(radioCube.isChecked()){
            radioSquare.setChecked(false);
            radioTriangle.setChecked(false);
            radioCircle.setChecked(false);
            labelSide.setVisibility(View.VISIBLE);
            labelArea.setVisibility(View.INVISIBLE);
            labelPerim.setVisibility(View.INVISIBLE);
            labelRadius.setVisibility(View.INVISIBLE);
            labelVol.setVisibility(View.INVISIBLE);
            editRadius.setVisibility(View.INVISIBLE);
            editSide.setVisibility(View.VISIBLE);
            calculate.setVisibility(View.VISIBLE);
            clear.setVisibility(View.VISIBLE);
            showArea.setVisibility(View.INVISIBLE);
            showPerim.setVisibility(View.INVISIBLE);
            showVol.setVisibility(View.INVISIBLE);
            editSide.setText("");
        }
    }
    public void clr(View view){
        editSide.setText("");
        editRadius.setText("");
        showPerim.setText("");
        showVol.setText("");
        showArea.setText("");
        labelArea.setVisibility(View.INVISIBLE);
        showArea.setVisibility(View.INVISIBLE);
        labelPerim.setVisibility(View.INVISIBLE);
        showPerim.setVisibility(View.INVISIBLE);
        labelVol.setVisibility(View.INVISIBLE);
        showVol.setVisibility(View.INVISIBLE);
    }
    public void calc(View view){
        String textRadius = editRadius.getText().toString();
        String textSide = editSide.getText().toString();
        double area;
        double perim;
        double side;
        if (radioCircle.isChecked()&&!(textRadius.equals(""))){
            double radius = Double.parseDouble(textRadius);
            area =(Math.PI)*Math.pow(radius,2);
            perim =(Math.PI)*2* radius;
            showArea.setVisibility(View.VISIBLE);
            showPerim.setVisibility(View.VISIBLE);
            labelArea.setVisibility(View.VISIBLE);
            labelPerim.setVisibility(View.VISIBLE);
            showArea.setText(Double.toString(area));
            showPerim.setText(Double.toString(perim));
        }
        else if(radioTriangle.isChecked()&&!(textSide.equals(""))){
            side =Double.parseDouble(textSide);
            area =Math.pow(side,2)*Math.sqrt(3)/2;
            perim = side *3;
            showArea.setVisibility(View.VISIBLE);
            showPerim.setVisibility(View.VISIBLE);
            labelArea.setVisibility(View.VISIBLE);
            labelPerim.setVisibility(View.VISIBLE);
            showArea.setText(Double.toString(area));
            showPerim.setText(Double.toString(perim));
        }
        else if(radioSquare.isChecked()&&!(textSide.equals(""))){
            side =Double.parseDouble(textSide);
            area = side * side;
            perim = side *4;
            showArea.setVisibility(View.VISIBLE);
            showPerim.setVisibility(View.VISIBLE);
            labelArea.setVisibility(View.VISIBLE);
            labelPerim.setVisibility(View.VISIBLE);
            showArea.setText(Double.toString(area));
            showPerim.setText(Double.toString(perim));
        }
        else if(radioCube.isChecked()&&!(textSide.equals(""))){
            side =Double.parseDouble(textSide);
            area =Math.pow(side,2)*6;
            double vol = side * 3;
            showArea.setVisibility(View.VISIBLE);
            showVol.setVisibility(View.VISIBLE);
            labelArea.setVisibility(View.VISIBLE);
            labelVol.setVisibility(View.VISIBLE);
            showPerim.setText("");
            showArea.setText(Double.toString(area));
            showVol.setText(Double.toString(vol));
        }
    }
}