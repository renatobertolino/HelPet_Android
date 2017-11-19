package br.com.novaroma.helpet.presentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.novaroma.helpet.R;

public class AdoptionDetails extends AppCompatActivity {

    private Button btnAdoption;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoption_details);

        btnAdoption = findViewById(R.id.btnToAopt);

        Toast.makeText(this, (String) getIntent().getSerializableExtra("TESTE"),
                Toast.LENGTH_SHORT).show();

        btnAdoption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Adotado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
