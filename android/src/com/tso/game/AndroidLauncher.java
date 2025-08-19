package com.tso.game;
import android.os.Bundle; import com.badlogic.gdx.backends.android.*;
public class AndroidLauncher extends AndroidApplication{ protected void onCreate(Bundle s){ super.onCreate(s);
  AndroidApplicationConfiguration c=new AndroidApplicationConfiguration(); initialize(new TSOGame(),c);} }