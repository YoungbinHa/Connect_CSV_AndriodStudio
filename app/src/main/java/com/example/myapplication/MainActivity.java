package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readLibData();
    }

    private List<LibSample> libSamples = new ArrayList<>();
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
                sample.setLownumber(Integer.parseInt(tokens[1]));
                sample.setHighnumber(Integer.parseInt(tokens[2]));
                sample.setBeginning(tokens[3]);
                sample.setEnding(tokens[4]);
                sample.setMap(tokens[5]);
                sample.setText(tokens[6]);
                libSamples.add(sample);

                Log.d("MyActivity", "Just created: "+sample);
            }
        } catch (IOException e) {
            Log.wtf("MyActivity", "Error reading data file on line "+ line, e);
            e.printStackTrace();
        }
    }
}
