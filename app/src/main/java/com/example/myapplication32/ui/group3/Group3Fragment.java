package com.example.myapplication.ui.group3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

public class Group3Fragment extends Fragment {

    private Group3ViewModel Group3ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Group3ViewModel =
                ViewModelProviders.of(this).get(Group3ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_group3, container, false);
        final TextView textView = root.findViewById(R.id.text_group3);
        Group3ViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}