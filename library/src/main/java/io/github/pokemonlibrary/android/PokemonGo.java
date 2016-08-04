package io.github.pokemonlibrary.android;

import android.content.Context;
import android.util.Log;

import com.getkeepsafe.relinker.ReLinker;
import com.nianticlabs.nia.javawrap.NianticPluginWrapper;

/**
 * Created by fabianterhorst on 04.08.16.
 */

public class PokemonGo {

    public PokemonGo(Context context) {
        //ReLinker.loadLibrary(context, "unity");
        //ReLinker.loadLibrary(context, "vrunity");
        //ReLinker.loadLibrary(context, "main");

        ReLinker.loadLibrary(context, "il2cpp");
        ReLinker.loadLibrary(context, "pgpplugin");
        ReLinker.loadLibrary(context, "NianticLabsPlugin", new ReLinker.LoadListener() {
            @Override
            public void success() {
                NianticPluginWrapper pluginWrapper = new NianticPluginWrapper();
                pluginWrapper.initialize();
                Log.d("api", String.valueOf(pluginWrapper.getApi()));
                //pluginWrapper.dispose();
            }

            @Override
            public void failure(Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
