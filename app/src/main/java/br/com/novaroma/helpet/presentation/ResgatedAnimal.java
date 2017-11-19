package br.com.novaroma.helpet.presentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.novaroma.helpet.R;

public class ResgatedAnimal extends AppCompatActivity {

    private ListView lv;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgated_animal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        arrayList = new ArrayList<>();
        arrayList.add("Resgatado");
        arrayList.add("Teste2");
        arrayList.add("Teste3");

        lv = findViewById(R.id.lv_resgatedAnimals);

        lv.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1,
                arrayList));
    }

}
