package io.pokemongolibrary.android.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.pokemonlibrary.android.PokemonGo;
import io.pokemongolibrary.android.sample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new PokemonGo(this);
    }
}
