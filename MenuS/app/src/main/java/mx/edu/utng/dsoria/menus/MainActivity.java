package mx.edu.utng.dsoria.menus;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner cmbMenus;
    Spinner cmbCmbMenuSeleccionado;
    Button btnAgregarPlatillo;
    Button btnMostrarOrden;
    String[] desayunos={ "Huevos a la mexicana","Chilaquiles","Jugo de Naranja","Hotcakes","Crepas","Cóctel de Frutas"};
    String[] comidas= {"Chiles rellenos","Pollo empanizadas","Enchiladas verdes","Enchiladas rojas","Mole de olla"};
    String[] cenas ={"Tacos al pastor","Quesadillas","Ensalada","Pozole","Chocolate"};
    ArrayAdapter<String> adapter;
    MenuComponent desayunoMenu =  new Menu("Menu desayunos", "Desayunos") ;
    MenuComponent comidMenu=  new Menu("Menu comidas","Comidas");
    MenuComponent cenaMenu=  new Menu("Menu cenas","Cenas");
    MenuComponent allMenus  =  new Menu("Todos los menus","Menu combinado");
    TextView txtOrden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cmbMenus = (Spinner)findViewById(R.id.cmb_menus);
        btnMostrarOrden = (Button) findViewById(R.id.btn_mostrar_orden);
        cmbCmbMenuSeleccionado = (Spinner) findViewById(R.id.cmb_menu_disponible);
        btnAgregarPlatillo = (Button) findViewById(R.id.btn_agregar);
        adapter = new ArrayAdapter<String>(this,R.layout.spinner_layout,desayunos);
        cmbCmbMenuSeleccionado .setAdapter(adapter);
        cmbCmbMenuSeleccionado.setOnItemSelectedListener(this);
        cmbMenus.setOnItemSelectedListener(this);
        txtOrden = (TextView) findViewById(R.id.txt_orden);

        btnAgregarPlatillo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int m = (int) cmbMenus.getSelectedItemId();
                int p = (int) cmbCmbMenuSeleccionado.getSelectedItemId();
                MenuItem menuItem = null;

                switch (m){//Tipo de menu
                    case 0://Menu desayunos
                        switch(p) {//Platillos
                            case 0:
                                menuItem = new MenuItem("Huevos a la mexicana", "Huevos estrellados con salsa verde", true, 25.0);
                                break;
                            case 1:
                                menuItem = new MenuItem("Chilaquiles", "Chilaquiles rojos", true, 20.0);
                                break;
                        }
                        desayunoMenu.add(menuItem);
                        Toast.makeText(getApplicationContext(), "Se agrego el platillo!", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        switch(p){
                            case 0:
                                menuItem = new MenuItem("Chiles rellenos", "Chiles rellenos de queso", true, 25.0);
                                break;
                            case 1:
                                menuItem = new MenuItem("Pollo empanizado", "Milanesa de pollo con papas", false, 40.0);
                                break;
                        }
                        comidMenu.add(menuItem);
                        Toast.makeText(getApplicationContext(), "Se agrego el platillo!", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        switch(p){
                            case 0:
                                menuItem = new MenuItem("Tacos al pastor", "Orden de 4 tacos", false, 20.0);
                                break;
                            case 1:
                                menuItem = new MenuItem("Quesadillas", "Orden de 2 quesadillas de flor de calabaza", true, 20.0);
                                break;
                        }
                        cenaMenu.add(menuItem);
                        Toast.makeText(getApplicationContext(), "Se agrego el platillo!", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

        btnMostrarOrden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allMenus.add(desayunoMenu);
                allMenus.add(comidMenu);
                allMenus.add(cenaMenu);
                txtOrden.setText(allMenus.print());
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int m=0; //Menú
        if(parent.getId()==R.id.cmb_menus){
            m= (int)cmbMenus.getSelectedItemId();
            switch ((int)cmbMenus.getSelectedItemId()){
                case 0:
                    adapter = new ArrayAdapter<String>(this,R.layout.spinner_layout,desayunos);
                    break;
                case 1:
                    adapter = new ArrayAdapter<String>(this,R.layout.spinner_layout,comidas);
                    break;
                case 2:
                    adapter = new ArrayAdapter<String>(this,R.layout.spinner_layout,cenas);
                    break;
            }
            cmbCmbMenuSeleccionado.setAdapter(adapter);
        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
