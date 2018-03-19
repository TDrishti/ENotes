package project.com.elearning;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

/**
 * Created by Drishti on 3/18/2018.
 */

public class Sem1 extends Activity {

    private Toolbar mtoolbar;
    BottomNavigationView navigation;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;
    private Toolbar mSupportActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sem1);

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        changeFragment(0);

        BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.navigation_tut:
                        changeFragment(0);
                        return true;

                    case R.id.navigation_prac:
                        changeFragment(1);
                        return true;

                    case R.id.navigation_notes:
                        changeFragment(2);
                        return true;

                }
                return false;
            }


        };
    }

    private void changeFragment(int position) {

        Fragment newFragment = null;

        if (position == 0) {
            newFragment = new N_Frag();

        } else if (position % 2 != 0) {
            newFragment = new P_Frag();
        } else {
            newFragment = new Q_Frag();
        }

        getFragmentManager().beginTransaction().replace(R.id.content,newFragment).commit();


    }

}
