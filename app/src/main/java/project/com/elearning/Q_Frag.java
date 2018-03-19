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

public class Q_Frag extends Fragment implements View.OnClickListener {

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle s) {

        View v= inflater.inflate(
                R.layout.question,
                container,
                false
        );

        CardView am = (CardView)v.findViewById(R.id.sub1);
        am.setOnClickListener(this);

        CardView com = (CardView)v.findViewById(R.id.sub2);
        com.setOnClickListener(this);

        CardView st = (CardView)v.findViewById(R.id.sub3);
        st.setOnClickListener(this);

        CardView cs = (CardView)v.findViewById(R.id.sub4);
        cs.setOnClickListener(this);

        //CardView ds = (CardView)v.findViewById(R.id.sub5);
        //ds.setOnClickListener(this);

        //CardView cg = (CardView)v.findViewById(R.id.sub6);
        //cg.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

//            case R.id.sub1:
//                Intent z = new Intent(getActivity(),Content.class);
//                z.putExtra("message","4834614");
//                startActivity(z);
//                break;
//
//            case R.id.sub2:
//                Intent y = new Intent(getActivity(),Content.class);
//                y.putExtra("message","4867958");
//                startActivity(y);
//                break;
//
//            case R.id.sub3:
//                Intent x = new Intent(getActivity(),Content.class);
//                x.putExtra("message","https://drive.google.com/open?id=0B3kKT0tVc-RPZTFrQzREa1E5UHM");
//                startActivity(x);
//                break;
//
//            case R.id.sub4:
//                Intent w = new Intent(getActivity(),Content.class);
//                w.putExtra("message","https://drive.google.com/open?id=0B3kKT0tVc-RPUTEyWFJmLUhGczQ");
//                startActivity(w);
//                break;

            //case R.id.sub5:
              //  Intent u = new Intent(getActivity(),Content.class);
                //u.putExtra("message","https://drive.google.com/open?id=0B3kKT0tVc-RPSUFlbm5hd0o0TEk");
               // startActivity(u);
                //break;

            //case R.id.sub6:
              //  Intent t = new Intent(getActivity(),Content.class);
               // t.putExtra("message","https://drive.google.com/open?id=0B3kKT0tVc-RPRzFoN0dWUTRxRzQ");
                //startActivity(t);
                //break;
        }

    }
}
