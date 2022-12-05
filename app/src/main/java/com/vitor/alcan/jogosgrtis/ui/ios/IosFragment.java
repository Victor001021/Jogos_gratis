package com.vitor.alcan.jogosgrtis.ui.ios;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.vitor.alcan.jogosgrtis.Links;
import com.vitor.alcan.jogosgrtis.R;

public class IosFragment extends Fragment {
    private RecyclerView rv_ios;
    private TextView tvAviso, tvSpinner;
    private ImageView ivAviso;
    private ProgressBar progressBar;
    private Links link;
    private Spinner spinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ios, container, false);
        rv_ios = view.findViewById(R.id.rv);
        spinner = view.findViewById(R.id.spinner);
        tvSpinner = view.findViewById(R.id.tvSpinner);
        tvAviso = view.findViewById(R.id.tvAviso);
        ivAviso = view.findViewById(R.id.ivAviso);
        progressBar = view.findViewById(R.id.progressBar);

        spinnerListener();


        return view;
    }


    public void spinnerListener(){
        link = new Links();
        link.spinnerListener(spinner, tvSpinner, rv_ios, tvAviso, getActivity(), "IOS", ivAviso, progressBar);


    }
}