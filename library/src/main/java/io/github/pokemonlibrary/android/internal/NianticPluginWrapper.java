package io.github.pokemonlibrary.android.internal;

import com.getkeepsafe.relinker.ReLinker;

/**
 * Created by fabianterhorst on 04.08.16.
 */

public class NianticPluginWrapper {
    private long nativeHandle;

    private native void nativeDispose();

    private native long nativeGetApi();

    private native void nativeInitialize();

    public void initialize() {
        nativeInitialize();
    }

    public void dispose() {
        nativeDispose();
    }

    public long getApi() {
        return nativeGetApi();
    }

    static {
        System.loadLibrary("NianticLabsPlugin");
    }
}
