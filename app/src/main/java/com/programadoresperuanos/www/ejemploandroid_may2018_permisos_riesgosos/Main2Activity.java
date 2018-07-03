package com.programadoresperuanos.www.ejemploandroid_may2018_permisos_riesgosos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mimenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.opcion1:
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                return true;
            case R.id.opcion2:
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                return true;
            case R.id.opcion3:
                solicitarTodos();
                return true;
            case R.id.opcion4:
                configurarAplicacion();
                return true;
            case R.id.opcion5:
                startActivity(new Intent(getApplicationContext(),Main3Activity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void configurarAplicacion() {

    }

    private void solicitarTodos() {

    }
}
