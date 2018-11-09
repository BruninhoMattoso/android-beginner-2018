package br.app.dextra.android_begginer_2018;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import br.app.dextra.android_begginer_2018.demo.HomeHeaderFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadButtonText();

        // Controlador de fragments da activity
        FragmentManager supportFragmentManager = getSupportFragmentManager();

        supportFragmentManager
                .beginTransaction() // comeca uma transicao de fragments

                // Adicionamos nossa fragment no nosso container
                .replace(R.id.container1, HomeHeaderFragment.newInstance()) // .add() ou .remove() ou qualquer funcao que quiser implementar no contianer


                .commitAllowingStateLoss();

    }

    private void loadButtonText() {
        // Carregando informação da intent
        Bundle extras = getIntent().getExtras();
        String username = extras.getString("username");

        // Carregando texto do botão
        String buttonText = getString(R.string.username, username);

        // Aplicando texto do botão
        Button button = findViewById(R.id.sayHelloButton);
        button.setText(buttonText);
    }
}
