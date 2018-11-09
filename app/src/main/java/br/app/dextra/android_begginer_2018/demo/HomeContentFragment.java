package br.app.dextra.android_begginer_2018.demo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.app.dextra.android_begginer_2018.R;

public class HomeContentFragment extends Fragment {

    // Convention Generator Fragment
    public static HomeContentFragment newInstance() {
        return new HomeContentFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        // Aqui nos informamos para a activity qual o seu layout a ser inflado
        return inflater.inflate(R.layout.fragment_2, container, false);
    }
}
