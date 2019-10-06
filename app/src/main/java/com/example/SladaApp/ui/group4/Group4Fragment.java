package com.example.myapplication.ui.group4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

public class Group4Fragment extends Fragment {

    private Group4ViewModel Group4ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Group4ViewModel =
                ViewModelProviders.of(this).get(Group4ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_group4, container, false);
        final TextView textView = root.findViewById(R.id.text_group4);
        Group4ViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}