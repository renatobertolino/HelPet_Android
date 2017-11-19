package br.com.novaroma.helpet.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import br.com.novaroma.helpet.Entitys.Address;
import br.com.novaroma.helpet.Entitys.Animal;
import br.com.novaroma.helpet.Entitys.Complaint;
import br.com.novaroma.helpet.R;

public class ComplaintHome extends AppCompatActivity {

    private ListView lv;
    private FloatingActionButton fab;

    private ArrayList<String> arrayList;

    private Address address;
    private Animal animal;
    private Complaint complaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);

        arrayList = new ArrayList<>();
        arrayList.add("Denuncia1");
        arrayList.add("Teste2");
        arrayList.add("Teste3");

        lv = findViewById(R.id.lv_complaint);
        lv.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1,
                arrayList));

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ComplaintHome.this, ComplaintRegister.class));
            }
        });

    }


}
