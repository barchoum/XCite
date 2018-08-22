package com.masterraven.xcite.ui;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.masterraven.xcite.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.masterraven.xcite.Constants.CITATION;
import static com.masterraven.xcite.Constants.LIBRARY;
import static com.masterraven.xcite.Constants.QUOTES;

public class SelectionActivity extends AppCompatActivity {

    String ACTION;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        ButterKnife.bind(this);

        FragmentManager fm = getSupportFragmentManager();

        Intent intent = getIntent();
        if(intent != null){
            ACTION = intent.getAction();
        }

        if(ACTION != null && !ACTION.isEmpty()){
            switch (ACTION){
                case CITATION:
                    fragment = CitationFragment.newInstance();
                    break;
                case QUOTES:
                    fragment = QuotesFragment.newInstance();
                    break;
                case LIBRARY:
                    fragment = LibraryFragment.newInstance();
            }
        }

        fm.beginTransaction().add(R.id.selection_activity_frame, fragment).commit();
    }
}
