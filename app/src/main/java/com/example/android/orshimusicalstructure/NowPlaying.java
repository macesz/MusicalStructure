package com.example.android.orshimusicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Set the content of the activity to use the activity_artist.xml layout file
        setContentView(R.layout.activity_now_playing);

        // find the View that shows the now playing category

        TextView nowPlaying = (TextView) findViewById(R.id.playing);

        // set clickListener on this method

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Now Playing Activity]
                Intent nowPlayingIntent = new Intent(NowPlaying.this,
                        NowPlaying.class);

                // Start new activity
                startActivity(nowPlayingIntent);
            }
        });

        // find the View that shows the artist category

        TextView artist = (TextView) findViewById(R.id.artist);

        // set clickListener on this method

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Artist Activity]
                Intent artistIntent = new Intent(NowPlaying.this,
                        Artist.class);

                // Start new activity
                startActivity(artistIntent);
            }
        });

        // find the View that shows the Lyrics category

        TextView lyrics = (TextView) findViewById(R.id.lyrics);

        // set clickListener on this method

        lyrics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Lyrics Activity]
                Intent lyricsIntent = new Intent(NowPlaying.this,
                        Lyrics.class);

                // Start new activity
                startActivity(lyricsIntent);
            }
        });

        // find the View that shows the Playlist category

        TextView playlist = (TextView) findViewById(R.id.playlist);

        // set clickListener on this method

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Lyrics Activity]
                Intent playlistIntent = new Intent(NowPlaying.this,
                        PlayList.class);

                // Start new activity
                startActivity(playlistIntent);
            }
        });

        // find the View that shows the Albums category

        TextView albums = (TextView) findViewById(R.id.albums);

        // set clickListener on this method

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Lyrics Activity]
                Intent albumsIntent = new Intent(NowPlaying.this,
                        Albums.class);

                // Start new activity
                startActivity(albumsIntent);
            }
        });

    }
}
