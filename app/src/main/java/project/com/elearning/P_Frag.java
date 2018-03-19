package project.com.elearning;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Drishti on 7/30/2017.
 */

public class P_Frag extends Fragment implements View.OnClickListener  {
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle s) {

        View v = inflater.inflate(
                R.layout.prac_frag,
                container,
                false
        );

        CardView sth = (CardView)v.findViewById(R.id.prac1);
        sth.setOnClickListener(this);
        CardView ds = (CardView)v.findViewById(R.id.prac2);
        ds.setOnClickListener(this);
        CardView cs = (CardView)v.findViewById(R.id.prac3);
        cs.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){

//            case R.id.prac1:
//                Intent a= new Intent(getActivity(),Content.class);
//                a.putExtra("message","https://drive.google.com/open?id=0B3kKT0tVc-RPbVJtZzRfWk04SEE");
//                startActivity(a);
//                break;
//            case R.id.prac2:
//                Intent b = new Intent(getActivity(),Content.class);
//                b.putExtra("message","https://drive.google.com/open?id=0B3kKT0tVc-RPOGtKdTk4T0s2X3c");
//                startActivity(b);
//                break;
//            case R.id.prac3:
//                Intent c = new Intent(getActivity(),Content.class);
//                c.putExtra("message","https://drive.google.com/open?id=0B3kKT0tVc-RPc1Jic0hDNnZyX0E");
//                startActivity(c);
//                break;
//            //case R.id.prac4:
              //  Intent d = new Intent(getActivity(),Content.class);
               // d.putExtra("message","https://drive.google.com/open?id=0B3kKT0tVc-RPRmVNUzFaZ0FFVDg");
               // startActivity(d);
                //break;
        }
    }
}
