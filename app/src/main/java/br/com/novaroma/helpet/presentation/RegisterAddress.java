package br.com.novaroma.helpet.presentation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.novaroma.helpet.Entitys.User;
import br.com.novaroma.helpet.Entitys.Address;
import br.com.novaroma.helpet.R;

public class RegisterAddress extends Activity {

    private EditText edtSteet, edtNeighborhood, edtCity, edtState;
    private Button btnRegister;
    private User user;
    private Address address;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_address);

        btnRegister = findViewById(R.id.btnRegister);

        edtSteet = findViewById(R.id.edtStreet);
        edtNeighborhood = findViewById(R.id.edtNeighborhood);
        edtCity = findViewById(R.id.edtCity);
        edtState = findViewById(R.id.edtState);

        address = new Address(edtSteet.toString(), edtNeighborhood.toString(), edtCity.toString(),
                edtState.toString());

        user = (User) getIntent().getSerializableExtra("USER");

        user.setAddress(address);

        Toast.makeText(this, user.toString(), Toast.LENGTH_SHORT).show();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Home.class));
            }
        });
    }
}
