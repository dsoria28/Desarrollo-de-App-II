package mx.edu.utng.dsoria.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    CalculadoraCientifica cientifica= new CalculadoraCientifica();
    CalculadoraNormal normal= new CalculadoraNormal();
    EditText txtN1;
    EditText txtN2;
    EditText txtRsultado;
    Button btnSumar;
    Button btnRestar;
    Button btnDividir;
    Button btnMulti;
    Button btnLimpiar;
    Button btnFactorial;
    Spinner cmbOpciones;
    String[] opciones={"Normal","Cientifica"};
    int op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtN1=(EditText)findViewById(R.id.txtNum1);
        txtN2=(EditText)findViewById(R.id.txtNum2);
        txtRsultado=(EditText)findViewById(R.id.txtResultado);
        btnSumar=(Button)findViewById(R.id.btnSumar);
        btnRestar=(Button)findViewById(R.id.btnRestar);
        btnDividir=(Button)findViewById(R.id.btnDividir);
        btnMulti=(Button)findViewById(R.id.btnMulti);
        btnLimpiar=(Button)findViewById(R.id.btnLimpiar);
        btnFactorial=(Button)findViewById(R.id.btnFactorial);
        cmbOpciones=(Spinner)findViewById(R.id.cmb_opciones);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.spinner, opciones);
        cmbOpciones.setAdapter(adapter);
        cmbOpciones.setOnItemSelectedListener(this);

        btnSumar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double n1;
                double n2;
                double res;

                n1= Double.parseDouble(txtN1.getText().toString());
                n2= Double.parseDouble(txtN2.getText().toString());
                res= normal.sumar(n1,n2);
                res=cientifica.sumar(n1,n2);
                txtRsultado.setText(""+res);
            }
        });
        btnRestar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double n1;
                double n2;
                double res;

                n1= Double.parseDouble(txtN1.getText().toString());
                n2= Double.parseDouble(txtN2.getText().toString());

                res= normal.restar(n1,n2);
                res= cientifica.restar(n1,n2);
                txtRsultado.setText(""+res);
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double n1;
                double n2;
                double res;

                n1= Double.parseDouble(txtN1.getText().toString());
                n2= Double.parseDouble(txtN2.getText().toString());

                res= normal.dividir(n1,n2);
                txtRsultado.setText(""+res);
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double n1;
                double n2;
                double res;

                n1= Double.parseDouble(txtN1.getText().toString());
                n2= Double.parseDouble(txtN2.getText().toString());

                res= normal.multiplicar(n1,n2);
                txtRsultado.setText(""+res);
            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int res;
                int n1;

                n1= Integer.parseInt(txtN1.getText().toString());

                res=cientifica.factorial(n1);
                txtRsultado.setText(""+res);
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                txtN1.setText("");
                txtN2.setText("");
                txtRsultado.setText("");
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        op=(int) cmbOpciones.getSelectedItemId();
        switch (op){
            case 0:
                btnFactorial.setVisibility(View.GONE);
                btnDividir.setVisibility(View.VISIBLE);
                btnMulti.setVisibility(View.VISIBLE);
                break;
            case 1:
                btnDividir.setVisibility(View.GONE);
                btnMulti.setVisibility(View.GONE);
                btnFactorial.setVisibility(View.VISIBLE);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
