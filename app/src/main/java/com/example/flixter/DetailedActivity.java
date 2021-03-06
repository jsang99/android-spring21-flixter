package com.example.flixter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.flixter.models.Movie;

import org.parceler.Parcels;

public class DetailedActivity extends AppCompatActivity {

    TextView tvTitle2;
    TextView tvOverview2;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        tvTitle2 = findViewById(R.id.tvTitle2);
        tvOverview2 = findViewById(R.id.tvOverview2);
        ratingBar = findViewById(R.id.ratingBar);

        String title = getIntent().getStringExtra("title");
        Movie movie = Parcels.unwrap(getIntent().getParcelableExtra("movie"));
        tvTitle2.setText(movie.getTitle());
        tvOverview2.setText(movie.getOverview());
        ratingBar.setRating((float) movie.getRating());

    }
}