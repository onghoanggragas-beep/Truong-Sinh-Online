package com.tso.game;
import com.badlogic.gdx.*; import com.badlogic.gdx.graphics.*; import com.badlogic.gdx.graphics.g2d.*;
public class TSOScreen extends ScreenAdapter{ TSOGame g; SpriteBatch b; Texture bg,pl;
  public TSOScreen(TSOGame g){this.g=g;} public void show(){ b=new SpriteBatch();
    bg=g.a.get("maps/bg_1.png",Texture.class); pl=g.a.get("characters/player_m_512.png",Texture.class); }
  public void render(float d){ ScreenUtils.clear(0,0,0.05f,1); b.begin(); b.draw(bg,0,0,1280,720); b.draw(pl,520,180,256,256); b.end(); }
  public void dispose(){ b.dispose(); }
}