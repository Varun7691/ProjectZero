package com.varun.projectzero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mSpotifyStreamerBtn, mScoresAppBtn, mLibraryAppBtn, mBuildItBiggerBtn, mXYZReaderBtn, mCapstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyStreamerBtn = (Button) findViewById(R.id.spotify_streamer);
        mScoresAppBtn = (Button) findViewById(R.id.scores_app);
        mLibraryAppBtn = (Button) findViewById(R.id.library_app);
        mBuildItBiggerBtn = (Button) findViewById(R.id.build_it_bigger);
        mXYZReaderBtn = (Button) findViewById(R.id.xyz_reader);
        mCapstoneBtn = (Button) findViewById(R.id.capstone_my_own_app);


        mSpotifyStreamerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Spotify Streamer", Toast.LENGTH_SHORT).show();
            }
        });

        mScoresAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Scores App", Toast.LENGTH_SHORT).show();
            }
        });

        mLibraryAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Library App", Toast.LENGTH_SHORT).show();
            }
        });

        mBuildItBiggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger", Toast.LENGTH_SHORT).show();
            }
        });

        mXYZReaderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader", Toast.LENGTH_SHORT).show();
            }
        });

        mCapstoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}