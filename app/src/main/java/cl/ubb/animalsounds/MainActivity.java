package cl.ubb.animalsounds;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool mSoundPool;
    private int idSoundBird;
    private int idSoundCat;
    private int idSoundDuck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        idSoundBird = mSoundPool.load(getApplicationContext(), R.raw.bird, 1);
        idSoundCat = mSoundPool.load(getApplicationContext(), R.raw.cat, 1);
        idSoundDuck = mSoundPool.load(getApplicationContext(), R.raw.duck, 1);
    }

    public void playBird(View view) {

        mSoundPool.play(idSoundBird, 1,1,1,0, 1);
    }

    public void playCat(View view) {

        mSoundPool.play(idSoundCat, 1,1,1,0, 1);

    }

    public void playDuck(View view) {
        mSoundPool.play(idSoundDuck, 1,1,1,0, 1);
    }
}
