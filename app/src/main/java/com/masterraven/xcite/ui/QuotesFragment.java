package com.masterraven.xcite.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.masterraven.xcite.R;

import butterknife.ButterKnife;

/**
 * Created by Tahir on 21.8.2018.
 */

public class QuotesFragment extends Fragment {

    public QuotesFragment(){}

    public static QuotesFragment newInstance(){
        return new QuotesFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.frag_quotes, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }
}
