package br.app.dextra.android_begginer_2018;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import br.app.dextra.android_begginer_2018.demo.HomeContentFragment;
import br.app.dextra.android_begginer_2018.demo.HomeHeaderFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.container1, HomeHeaderFragment.newInstance())
                .commitAllowingStateLoss();

      /*
        O erro aconteceu porque o botao sayHelloButton nao esta mais no contexto da activity
        e sim do homeContentFragment :/

        Abaixo segue um exemplo de como passar esse dado de uma activity para uma fragment
     */
        Bundle extras = getIntent().getExtras();
        String username = extras.getString("username");

        supportFragmentManager
                .beginTransaction()
                .replace(R.id.container2, HomeContentFragment.newInstance(username))
                .commitAllowingStateLoss();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity: onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity: onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity: onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity: onDestroy", Toast.LENGTH_SHORT).show();
    }
}
