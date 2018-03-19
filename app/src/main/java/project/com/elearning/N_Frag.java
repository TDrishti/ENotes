package project.com.elearning;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Drishti on 7/30/2017.
 */

public class N_Frag extends Fragment implements View.OnClickListener {
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle s) {

        View v= inflater.inflate(
                R.layout.notes_frag,
                container,
                false
        );



        CardView maths = (CardView)v.findViewById(R.id.nt1);
        maths.setOnClickListener(this);

        CardView comp = (CardView)v.findViewById(R.id.nt2);
        comp.setOnClickListener(this);

        CardView std = (CardView)v.findViewById(R.id.nt3);
        std.setOnClickListener(this);

        CardView cs = (CardView)v.findViewById(R.id.nt4);
        cs.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nt1:
                Intent i = new Intent(getActivity(),CO.class);
                startActivity(i);
                break;
//
//            case R.id.nt2:
//                Intent j = new Intent(getActivity(),Content.class);
//                startActivity(j);
//                break;
//
//            case R.id.nt3:
//                Intent k = new Intent(getActivity(),Content.class);
//                startActivity(k);
//                break;
//
//            case R.id.nt4:
//                Intent l = new Intent(getActivity(),Content.class);
//                startActivity(l);
//                break;
        }
    }
}


