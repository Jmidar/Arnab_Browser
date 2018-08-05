package com.example.jmidar.arnab_browser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etxtURL;
    Button btnSearch, btnFacebook, btnLinkedin, btnTwitter, btnYoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFacebook = findViewById(R.id.btnFb);
        btnLinkedin = findViewById(R.id.btnLinkedin);
        btnSearch = findViewById(R.id.btnSearch);
        btnTwitter = findViewById(R.id.btnTwitter);
        btnYoutube = findViewById(R.id.btnYoutube);

        etxtURL = findViewById(R.id.etxtURL);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = etxtURL.getText().toString();

                if(url.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter URl", Toast.LENGTH_SHORT).show();

                }
                else{
                    Intent intent = new Intent(MainActivity.this, WebActivity.class);
                    intent.putExtra("url", url);
                    startActivity(intent);

                }
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","Facebook.com");
                startActivity(intent);
            }
        });

        btnLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","Linkedin.com");
                startActivity(intent);
            }
        });

        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","Youtube.com");
                startActivity(intent);
            }
        });

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url","Twitter.com");
                startActivity(intent);
            }
        });

    }
}
