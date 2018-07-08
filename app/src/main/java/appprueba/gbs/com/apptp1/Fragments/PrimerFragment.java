package appprueba.gbs.com.apptp1.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import appprueba.gbs.com.apptp1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrimerFragment extends Fragment {


    public PrimerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_primer, container, false);
        return view;
    }

}
