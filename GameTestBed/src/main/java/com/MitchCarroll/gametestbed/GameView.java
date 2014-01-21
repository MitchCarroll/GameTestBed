package com.MitchCarroll.gametestbed;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;

/**
 * Created by mowgli on 1/20/14.
 */
public class GameView extends SurfaceView {
    private Bitmap b = Bitmap.createBitmap(100,100, Bitmap.Config.ARGB_8888);
    private Canvas c = new Canvas(b);

    public GameView(Context context) {
        super(context);
    }
}
