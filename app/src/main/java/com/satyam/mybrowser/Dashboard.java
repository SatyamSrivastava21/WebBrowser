package com.satyam.mybrowser;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
public class Dashboard extends AppCompatActivity {
    Button chrome,brave , wiki,ddg,bing;
    ImageView imageView , ig1;
    ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        chrome = findViewById(R.id.chrome);
        brave =  findViewById((R.id.brave));
        bing =  findViewById((R.id.bing));
        ddg =  findViewById((R.id.ddg));
        wiki =  findViewById((R.id.wiki));
        bar = findViewById(R.id.progressbar);
        imageView = findViewById(R.id.imageView);
        ig1 =findViewById(R.id.ig1);
        Animation rotate = AnimationUtils.loadAnimation(this,R.anim.rotate);
        imageView.startAnimation(rotate);
        Animation move = AnimationUtils.loadAnimation(this,R.anim.move);
        ig1.startAnimation(move);
        chrome.setOnClickListener(view -> {
            bar.setVisibility(View.VISIBLE);
            Intent iNext;
            iNext = new Intent(Dashboard.this,chrome.class);
            startActivity(iNext);
            bar.setVisibility(View.GONE);
            Toast.makeText(Dashboard.this, "You Chossed Chrome Engine", Toast.LENGTH_SHORT).show();
        });
        brave.setOnClickListener(view -> {
            bar.setVisibility(View.VISIBLE);
            Intent iNext;
            iNext = new Intent(Dashboard.this,brave.class);
            startActivity(iNext);
            bar.setVisibility(View.GONE);
            Toast.makeText(Dashboard.this, "You Chossed Brave Engine", Toast.LENGTH_SHORT).show();
        });
        bing.setOnClickListener(view -> {
            bar.setVisibility(View.VISIBLE);
            Intent iNext;
            iNext = new Intent(Dashboard.this,bing.class);
            startActivity(iNext);
            bar.setVisibility(View.GONE);
            Toast.makeText(Dashboard.this, "You Chossed Bing Engine", Toast.LENGTH_SHORT).show();
        });
        ddg.setOnClickListener(view -> {
            bar.setVisibility(View.VISIBLE);
            Intent iNext;
            iNext = new Intent(Dashboard.this,duck.class);
            startActivity(iNext);
            bar.setVisibility(View.GONE);
            Toast.makeText(Dashboard.this, "You Chossed DuckDuckGo Engine", Toast.LENGTH_SHORT).show();
        });
        wiki.setOnClickListener(view -> {
            bar.setVisibility(View.VISIBLE);
            Intent iNext;
            iNext = new Intent(Dashboard.this,wiki.class);
            startActivity(iNext);
            bar.setVisibility(View.GONE);
            Toast.makeText(Dashboard.this, "You Chossed WIKI Engine", Toast.LENGTH_SHORT).show();
        });
    }
    @Override
    public void onBackPressed() {
        // super.onBackPressed();
    }}



