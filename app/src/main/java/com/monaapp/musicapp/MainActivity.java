package com.monaapp.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Component
    private Button btnRed;
    private Button btnOrange;
    private Button btnYellow;
    private Button btnTurquoise;
    private Button btnGreen;
    private Button btnBlue;
    private Button btnPurple;

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool soundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create soundPool Object
        soundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        btnRed = (Button) findViewById(R.id.btn_red);
        btnOrange = (Button) findViewById(R.id.btn_orange);
        btnYellow = (Button) findViewById(R.id.btn_yellow);
        btnTurquoise = (Button) findViewById(R.id.btn_turquoise);
        btnGreen = (Button) findViewById(R.id.btn_green);
        btnBlue = (Button) findViewById(R.id.btn_blue);
        btnPurple = (Button) findViewById(R.id.btn_purple);

        // Load and get Id of sound
        mCSoundId = soundPool.load(getApplicationContext(), R.raw.note1_c, PRIORITY);
        mDSoundId = soundPool.load(getApplicationContext(), R.raw.note2_d, PRIORITY);
        mESoundId = soundPool.load(getApplicationContext(), R.raw.note3_e, PRIORITY);
        mFSoundId = soundPool.load(getApplicationContext(), R.raw.note4_f, PRIORITY);
        mGSoundId = soundPool.load(getApplicationContext(), R.raw.note5_g, PRIORITY);
        mASoundId = soundPool.load(getApplicationContext(), R.raw.note6_a, PRIORITY);
        mBSoundId = soundPool.load(getApplicationContext(), R.raw.note7_b, PRIORITY);

        btnRed.setOnClickListener(this);
        btnOrange.setOnClickListener(this);
        btnYellow.setOnClickListener(this);
        btnTurquoise.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnPurple.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_red :
                soundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                break;
            case R.id.btn_orange :
                soundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                break;
            case R.id.btn_yellow :
                soundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                break;
            case R.id.btn_turquoise :
                soundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                break;
            case R.id.btn_green :
                soundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                break;
            case R.id.btn_blue :
                soundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                break;
            case R.id.btn_purple :
                soundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                break;
            default:
                break;
        }
    }
}
