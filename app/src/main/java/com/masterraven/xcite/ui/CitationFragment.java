package com.masterraven.xcite.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.masterraven.xcite.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Tahir on 21.8.2018.
 */

public class CitationFragment extends Fragment {


    public CitationFragment(){}

    public static CitationFragment newInstance(){
        return new CitationFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.frag_citation, container, false);
        ButterKnife.bind(this, rootView);


        return rootView;
    }
}
