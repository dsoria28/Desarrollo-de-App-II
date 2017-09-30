package mx.edu.utng.dsoria.telefoniastrategy;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner cmbOpciones;
    EditText txtMinutosLocal;
    EditText txtMinutosLD;
    EditText txtTotal;
    Button btnCalcular;
    Button btnLimpiar;
    Button btnMostrar;
    int op;//compañia
    Contexto contexto;
    String[] opciones={"Telcel", "Unefon", "Mycompany"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relacionando los controles con las vistas
        cmbOpciones=(Spinner)findViewById(R.id.cmb_opciones);
        txtMinutosLocal=(EditText)findViewById(R.id.txt_minutos_local);
        txtMinutosLD=(EditText)findViewById(R.id.txt_minutos_ld);
        txtTotal=(EditText)findViewById(R.id.txt_total);
        btnCalcular=(Button)findViewById(R.id.btn_calcular);
        btnLimpiar=(Button)findViewById(R.id.btn_limpiar);
        btnMostrar=(Button)findViewById(R.id.btn_mostrar);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.spinner_item, opciones);
        cmbOpciones.setAdapter(adapter);
        cmbOpciones.setOnItemSelectedListener(this);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),CreditosActivity.class);
                startActivity(intent);
            }
        });
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int minutosLocal;
                int minutosLD;
                double total=0;

                minutosLocal= Integer.parseInt(txtMinutosLocal.getText().toString());
                minutosLD=Integer.parseInt(txtMinutosLD.getText().toString());

                total= contexto.calcularTarifaLocal(minutosLocal)+ contexto.calcularTarifaLD(minutosLD);
                txtTotal.setText(""+total);

            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMinutosLD.setText("");
                txtMinutosLocal.setText("");
                txtTotal.setText("");
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        op= (int)cmbOpciones.getSelectedItemId()+1;
        switch (op){
            case 1:
                contexto= new Contexto(new Telcel());
                break;
            case 2:
                contexto= new Contexto(new Unefon());
                break;
            case 3:
                contexto= new Contexto((new MyCompany()));
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        op= 1;
    }
}
