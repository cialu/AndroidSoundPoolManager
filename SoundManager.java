package com.lucaciavatta.soundmanager;



import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundManager extends Activity
{
  static SoundPool soundPool;
  static int[] sm;
  static Context mcontext;
  static AudioManager amg;
  
  
  public static void InitSound(Context context) {
    mcontext = context;
    // this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
    soundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
    
    sm = new int[3];
    // fill your sounds
    sm[0] = soundPool.load(mcontext, R.raw.sound_1, 1);
    sm[1] = soundPool.load(mcontext, R.raw.sound_2, 1);
    sm[2] = soundPool.load(mcontext, R.raw.sound_3, 1);
    
    System.out.println(sm[0]);
    System.out.println(sm[1]);
    System.out.println(sm[2]);
    
    amg = (AudioManager)mcontext.getSystemService(Context.AUDIO_SERVICE);
  }
 
  static void playSound(int sound) {
	  
      soundPool.play(sm[sound], 1, 1, 1, 0, 1f);
	  
  
  }
 
   public final void cleanUpIfEnd() {
    sm = null;
    mcontext = null;
    soundPool.release();
    soundPool = null;
  } 
}
