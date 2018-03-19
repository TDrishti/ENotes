package project.com.elearning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Drishti on 3/18/2018.
 */

public class HomeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button sem1bt,sem2bt;

        sem1bt = findViewById(R.id.sem1);
      //  sem2bt = findViewById(R.id.sem2);

        sem1bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Sem1.class);
                startActivity(intent);
            }
        });
    }
}
