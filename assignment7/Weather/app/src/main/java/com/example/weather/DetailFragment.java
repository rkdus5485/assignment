package com.example.weather;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Bundle data = getArguments();
        String detailData = null;
        if (data != null){
            detailData = data.getString("data");
        }
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView detailTextView = rootView.findViewById(R.id.detail_textview);
        detailTextView.setText(detailData);

        return rootView;
    }
}
