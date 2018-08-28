package com.masterraven.xcite.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.masterraven.xcite.R;

/**
 * Created by Tahir on 26.8.2018.
 */

public class CreateCitationFragment extends DialogFragment {

    public CreateCitationFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.frag_create_citation, container, false);

        return root;
    }
}
