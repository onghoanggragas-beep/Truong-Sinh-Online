package com.tso.game;
import com.badlogic.gdx.*; import com.badlogic.gdx.graphics.*; import com.badlogic.gdx.audio.*; import com.badlogic.gdx.assets.*;
public class TSOGame extends Game{ public AssetManager a;
  public void create(){ a=new AssetManager();
    String[] t={"ui/skill_slot.png","ui/hp_bar_bg.png","ui/mp_bar_bg.png","characters/player_m_512.png","characters/player_f_512.png",
    "monsters/monster_1.png","monsters/monster_2.png","monsters/monster_3.png","monsters/monster_4.png",
    "maps/bg_1.png"};
    for(String s:t) a.load(s,Texture.class);
    for(int i=1;i<=10;i++) a.load("skills/skill_"+i+".png",Texture.class);
    a.load("audio/bgm.wav",Music.class); a.finishLoading(); setScreen(new TSOScreen(this)); }
}