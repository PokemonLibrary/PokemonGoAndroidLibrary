package io.github.pokemonlibrary.android;

import android.content.Context;
import android.util.Log;

import com.getkeepsafe.relinker.ReLinker;

import io.github.pokemonlibrary.android.internal.NianticPluginWrapper;

/**
 * Created by fabianterhorst on 04.08.16.
 */

public class PokemonGo {

    public PokemonGo(Context context) {
        //ReLinker.loadLibrary(context, "unity");
        //ReLinker.loadLibrary(context, "vrunity");

        //ReLinker.loadLibrary(context, "il2cpp");
        //ReLinker.loadLibrary(context, "main");
        //ReLinker.loadLibrary(context, "NianticLabsPlugin");
        //ReLinker.loadLibrary(context, "pgpplugin");
        NianticPluginWrapper pluginWrapper = new NianticPluginWrapper();
        Log.d("api", String.valueOf(pluginWrapper.getApi()));
    }
}
