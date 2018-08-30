package com.masterraven.xcite.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.masterraven.xcite.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Tahir on 21.8.2018.
 */

public class CitationFragment extends Fragment {

    @BindView(R.id.save_citation) Button saveCitationButton;
    @BindView(R.id.cancel_saving) Button cancelSavingButton;
    @BindView(R.id.last_name) EditText lastNameEdit;
    @BindView(R.id.first_name) EditText firstNameEdit;
    @BindView(R.id.middle_name) EditText middleNameEdit;
    @BindView(R.id.year_published) EditText yearPublishedEdit;
    @BindView(R.id.source_name) EditText sourceNameEdit;
    @BindView(R.id.city) EditText cityEdit;
    @BindView(R.id.state) EditText stateEdit;
    @BindView(R.id.publisher) EditText publisherEdit;
    @BindView(R.id.url) EditText urlEdit;
    @BindView(R.id.sub_title) EditText subtitleEdit;
    @BindView(R.id.notes) EditText notesEdit;

    String lastName, firstName, middleName, yearPublished, sourceName, city, state, publisher, url,
            subtitle, notes;

    public CitationFragment(){}

    public static CitationFragment newInstance(){
        return new CitationFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.frag_citation, container, false);
        ButterKnife.bind(this, rootView);

        saveCitationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getTextsFromUser();
                // TODO: 29.8.2018 more todo here.
            }
        });

        cancelSavingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 29.8.2018 if dual pane!
                getActivity().finish();
            }
        });


        return rootView;
    }

    void getTextsFromUser() {
        lastName = lastNameEdit.getText().toString();
        firstName = firstNameEdit.getText().toString();
        middleName = middleNameEdit.getText().toString();
        // TODO: 29.8.2018 must be a date
        yearPublished = yearPublishedEdit.getText().toString();
        sourceName = sourceNameEdit.getText().toString();
        city = cityEdit.getText().toString();
        state = stateEdit.getText().toString();
        publisher = publisherEdit.getText().toString();
        url = urlEdit.getText().toString();
        subtitle = subtitleEdit.getText().toString();
        notes = notesEdit.getText().toString();
    }
}
