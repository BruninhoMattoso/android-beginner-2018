package br.app.dextra.android_begginer_2018.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import br.app.dextra.android_begginer_2018.MainActivity;
import br.app.dextra.android_begginer_2018.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openMainActivity("Faustão");
            }
        }, 2000);
    }

    private void openMainActivity(String username) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("username", username);

        startActivity(intent);

        // Finaliza a SplashActivity, independente do que estiver rodando
        finish();
    }
}
