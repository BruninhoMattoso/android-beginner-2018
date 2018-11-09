package br.app.dextra.android_begginer_2018.demo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.app.dextra.android_begginer_2018.R;

public class HomeHeaderFragment extends Fragment {

    // Convention Generator Fragment
    public static HomeHeaderFragment newInstance() {
        return new HomeHeaderFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        // Aqui nos informamos para a activity qual o seu layout a ser inflado
        return inflater.inflate(R.layout.fragment_1, container, false);
    }
}
