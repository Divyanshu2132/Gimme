package com.kalabhedia.gimme;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OneFragment extends Fragment {
    View view;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_one, container, false);
        FloatingActionButton fab = view.findViewById(R.id.fab);
        fab.setOnClickListener((View v) ->
        {
            ((MainActivity) getActivity()).tabLayout.setVisibility(View.GONE);
            ((MainActivity) getActivity()).swapFragment(new AddingNewContactFragment(), null, null);
        });
        return view;
    }
}