package com.example.mini_project_1_christian_geoca;



import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag_1 extends Fragment {

    private static final String[] WORDS ={"Tiger","Lion","Snow Leopard"};
    String word ="";
    View myView;
    ImageView imv;

    public frag_1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_frag_1, container, false);
        imv= (ImageView) myView.findViewById(R.id.myimg);

        return myView;
    }


}
