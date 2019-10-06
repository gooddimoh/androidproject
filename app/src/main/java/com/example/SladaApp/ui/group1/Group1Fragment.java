package com.example.my32.ui.group1;

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

import com.example.my.R;

public class Group1Fragment extends Fragment {

    private com.example.myapplication.ui.group1.Group1ViewModel Group1ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Group1ViewModel =
                ViewModelProviders.of(this).get(com.example.myapplication.ui.group1.Group1ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_group1, container, false);
        final TextView textView = root.findViewById(R.id.text_group1);
        Group1ViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}