package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtv2, editText1;
    EditText txt1;
    Button btnInsert, btn1, btn0, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnpeso, btneuro, btnesterlina, btndolar, btnCE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        btnInsert= findViewById(R.id.bottomInsert);
        btn0= findViewById(R.id.bottom0);
        btn1= findViewById(R.id.bottom1);
        btn2= findViewById(R.id.bottom2);
        btn3= findViewById(R.id.bottom3);
        btn4= findViewById(R.id.bottom4);
        btn5= findViewById(R.id.bottom5);
        btn6= findViewById(R.id.bottom6);
        btn7= findViewById(R.id.bottom7);
        btn8= findViewById(R.id.bottom8);
        btn9= findViewById(R.id.bottom9);
        btnCE= findViewById(R.id.bottomCE);
        btndolar= findViewById(R.id.bottomdolar);
        btnesterlina= findViewById(R.id.bottomesterlinas);
        btneuro= findViewById(R.id.bottomeuro);
        btnpeso= findViewById(R.id.bottompeso);
        txt1= findViewById(R.id.Txt1);
        txtv2= findViewById(R.id.Txt2);
        editText1=findViewById(R.id.textNumber);
        btnInsert.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        txtv2.setVisibility(View.VISIBLE);
        txtv2.setText(txt1.getText());
        txt1.setText("");
        txt1.setVisibility(View.INVISIBLE);
        btnInsert.setVisibility(View.INVISIBLE);
        btnpeso.setEnabled(true);
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btnCE.setEnabled(true);
        btndolar.setEnabled(true);
        btnesterlina.setEnabled(true);
        btneuro.setEnabled(true);

    }

    public void peso(View view){
        editText1.setText("RD$"+Integer.parseInt(editText1.getText().toString()) * 52 + " pesos dominicanos");
    }

    public void dolar(View view){
        editText1.setText("$"+Integer.parseInt(editText1.getText().toString()) / 52 + " dolares");
    }

    public void euro(View view){
        editText1.setText("€"+Integer.parseInt(editText1.getText().toString()) / 56 + " euros");
    }

    public void esterlina(View view){
        editText1.setText("£"+Integer.parseInt(editText1.getText().toString()) / 61 + " libras esterlinas");
    }

    public void cero(View view){
        if(editText1.getText()!= null)
            editText1.setText(editText1.getText()+"0");
    }
    public void uno(View view){
        editText1.setText(editText1.getText()+"1");
    }
    public void limpiar(View view){
        editText1.setText("");
    }
    public void tres(View view){
        editText1.setText(editText1.getText()+"3");
    }
    public void cuatro(View view){
        editText1.setText(editText1.getText()+"4");
    }
    public void cinco(View view){
        editText1.setText(editText1.getText()+"5");
    }
    public void seis(View view){
        editText1.setText(editText1.getText()+"6");
    }
    public void siete(View view){
        editText1.setText(editText1.getText()+"7");
    }
    public void ocho(View view){
       editText1.setText(editText1.getText()+"8");
    }
    public void nueve(View view){
        editText1.setText(editText1.getText()+"9");
    }
    public void dos(View view){
        editText1.setText(editText1.getText()+"2");
    }
}