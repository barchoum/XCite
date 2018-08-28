package com.masterraven.xcite.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.masterraven.xcite.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.masterraven.xcite.Constants.CITATION;
import static com.masterraven.xcite.Constants.LIBRARY;
import static com.masterraven.xcite.Constants.QUOTES;

/**
 * Created by Tahir on 21.8.2018.
 */

public class ModulesFragment extends Fragment {

    @BindView(R.id.citation_card_view) CardView citation;
    @BindView(R.id.quotes_card_view) CardView quotes;
    @BindView(R.id.library_card_view) CardView library;
    @BindView(R.id.citation_fab_create) FloatingActionButton fab;
    @BindView(R.id.my_projects_text_view) TextView myProjectsTextView;
    boolean isDualPane;
    FragmentManager fm;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.frag_modules, container, false);
        ButterKnife.bind(this, rootView);

        fm = getActivity().getSupportFragmentManager();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isDualPane){
                    CitationFragment fragment = CitationFragment.newInstance();
                    fm.beginTransaction().replace(R.id.content_frag, fragment).commit();
                } else {
                    Intent intent = new Intent(getActivity(), SelectionActivity.class);
                    intent.setAction(CITATION);
                    startActivity(intent);
                }
            }
        });

        quotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isDualPane){
                    QuotesFragment fragment = QuotesFragment.newInstance();
                    fm.beginTransaction().replace(R.id.content_frag, fragment).commit();
                } else {
                    Intent intent = new Intent(getActivity(), SelectionActivity.class);
                    intent.setAction(QUOTES);
                    startActivity(intent);
                }
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isDualPane){
                    LibraryFragment fragment = LibraryFragment.newInstance();
                    fm.beginTransaction().replace(R.id.content_frag, fragment).commit();
                } else {
                    Intent intent = new Intent(getActivity(), SelectionActivity.class);
                    intent.setAction(LIBRARY);
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        isDualPane = getActivity().findViewById(R.id.view_modules_dual) != null;
    }
}
