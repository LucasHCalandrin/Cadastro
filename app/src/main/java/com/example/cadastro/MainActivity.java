package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding amb;
    private String sexo;
    private String ingressar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());

        amb.salvarBt.setOnClickListener(view -> {

            sexo = (amb.femininoRb.isChecked())? "Feminino" : "Masculino";

            ingressar = (amb.listaCb.isChecked())? "Sim" : "Não";

            Toast.makeText(this, "Nome Completo: " + amb.nomeCompletoEt.getText().toString() + "\n" +
                    "Telefone: " + amb.telefoneEt.getText().toString() + "\n" + "E-mail: " + amb.emailEt.getText().toString() + "\n" +
                    "Ingressar na lista de e-mail? " + ingressar + "\n" + "Sexo: " + sexo + "\n" + "Cidade: " + amb.cidadeEt.getText().toString() + "\n" +
                    "UF: " + amb.ufSp.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        });

        amb.limparBt.setOnClickListener( view -> {
            amb.nomeCompletoEt.setText("");
            amb.telefoneEt.setText("");
            amb.emailEt.setText("");
            amb.listaCb.setChecked(false);
            amb.masculinoRb.setChecked(true);
            sexo = "Masculino";
            amb.cidadeEt.setText("");
            amb.ufSp.setSelection(0);
        });

    }
}