package com.MitchCarroll.gametestbed;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    GameView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gv = new GameView(this);
        setContentView(gv);
    }
}
