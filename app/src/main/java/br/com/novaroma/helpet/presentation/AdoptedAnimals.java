package br.com.novaroma.helpet.presentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.novaroma.helpet.R;

public class AdoptedAnimals extends AppCompatActivity {

    private ListView lv;

    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopted_animals);

        arrayList = new ArrayList<>();
        arrayList.add("Adotado1");
        arrayList.add("Adotado2");
        arrayList.add("Adotado3");

        lv = findViewById(R.id.lv_adopted_animals);

        lv.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1,
                arrayList));
    }
}
