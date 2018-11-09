package br.app.dextra.android_begginer_2018.demo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.app.dextra.android_begginer_2018.R;

public class HomeContentFragment extends Fragment {

    private String username;

    // Convention Generator Fragment
    public static HomeContentFragment newInstance(String username) {
        // Java Trick para atribuir parametros a fragments
        HomeContentFragment homeContentFragment = new HomeContentFragment();
        homeContentFragment.username = username;

        return homeContentFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        loadButtonText(view);

        return view;
    }

    private void loadButtonText(View view) {
        String buttonText = getString(R.string.username, username);

        Button button = view.findViewById(R.id.sayHelloButton);
        button.setText(buttonText);
    }
}
