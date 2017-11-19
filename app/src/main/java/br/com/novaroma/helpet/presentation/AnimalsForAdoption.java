package br.com.novaroma.helpet.presentation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.novaroma.helpet.R;

public class AnimalsForAdoption extends Activity {

    private FloatingActionButton fab;
    private ListView lv;
    private Intent intent;

    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais_for_adoption);

        intent = new Intent(this, AdoptionDetails.class);
        arrayList = new ArrayList<>();
        arrayList.add("Para adoção");
        arrayList.add("Teste2");
        arrayList.add("Teste3");

        lv = findViewById(R.id.lv_animals_for_adoption);

        lv.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1,
                arrayList));

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnimalsForAdoption.this, AdoptionRegister.class));
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                intent.putExtra("TESTE", (String) lv.getItemAtPosition(i));
                startActivity(intent);
            }
        });


    }

}
