package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    String url;
    private List<LibSample> libSamples = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        readLibData();
        imageView = findViewById(R.id.imageView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Iterator<LibSample> iterator = libSamples.iterator();
                while(iterator.hasNext()){
                    LibSample libSample = iterator.next();
                    url = libSample.getMap();
                    Toast.makeText(MainActivity.this, "url: "+ url, Toast.LENGTH_SHORT).show();
                    Picasso.get().load(url).into(imageView);
                    break;
                }
            }
        });
    }

    private void readLibData() {
        InputStream is = getResources().openRawResource(R.raw.data);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );

        String line = "";
        try {
            reader.readLine();

            while ((line = reader.readLine()) != null){
                Log.d("MyActivity", "Line:  "+line);

                String[] tokens = line.split(",");
                LibSample sample = new LibSample();
                sample.setFloor(tokens[0]);
                sample.setRange(tokens[1]);
                sample.setBeginning(tokens[2]);
                sample.setMap(tokens[3]);
                sample.setRext(tokens[4]);
                libSamples.add(sample);

                Log.d("MyActivity", "Just created: "+sample);
            }
        } catch (IOException e) {
            Log.wtf("MyActivity", "Error reading data file on line "+ line, e);
            e.printStackTrace();
        }
    }
}
