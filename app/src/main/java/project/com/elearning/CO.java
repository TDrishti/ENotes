package project.com.elearning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Utsav on 3/19/2018.
 */

public class CO extends Activity {

    DataBase db = new DataBase();
    String json;

    Button one,two,three,four;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.co);

        one = findViewById(R.id.onebt);
        two = findViewById(R.id.twobt);
        three = findViewById(R.id.threebt);
        four = findViewById(R.id.fourbt);

        json = null;
        try {
            InputStream data = getAssets().open("database.json");
            int size = data.available();
            byte[] buffer = new byte[size];
            data.read(buffer);
            data.close();
            json = new String(buffer,"UTF-8");


        } catch (IOException e) {
            e.printStackTrace();
        }

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    SetData("UNIT 1");
                    Intent intent = new Intent(CO.this,PDFView.class);
                    intent.putExtra("URL",db.getUrl());
                    startActivity(intent);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    SetData("UNIT 2");
                    Intent intent = new Intent(CO.this,PDFView.class);
                    intent.putExtra("URL",db.getUrl());
                    startActivity(intent);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    SetData("UNIT 3");
                    Intent intent = new Intent(CO.this,PDFView.class);
                    intent.putExtra("URL",db.getUrl());
                    startActivity(intent);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    SetData("UNIT 4");
                    Intent intent = new Intent(CO.this,PDFView.class);
                    intent.putExtra("URL",db.getUrl());
                    startActivity(intent);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    public void SetData(String unit) throws JSONException {

        JSONObject jsonObject = new JSONObject(json);
        JSONObject sem = jsonObject.getJSONObject("Semester 1");
        JSONObject sub = sem.getJSONObject("COMPUTER ORGANISATION");
        String url = sub.getString(unit);
        db.setUrl(url);

    }


}