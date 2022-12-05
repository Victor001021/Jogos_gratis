package com.vitor.alcan.jogosgrtis.ui.xone;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.vitor.alcan.jogosgrtis.Dados;
import com.vitor.alcan.jogosgrtis.Links;
import com.vitor.alcan.jogosgrtis.R;
import com.vitor.alcan.jogosgrtis.adapter.JogosAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XoneFragment extends Fragment {

    private String url = "https://www.gamerpower.com/api/giveaways?platform=xbox-one&sort-by=popularity";
    private RecyclerView rv_xone;
    private TextView tvAviso, tvSpinner;
    private ImageView ivAviso;
    private ProgressBar progressBar;
    private Links link;
    private Spinner spinner;
    private int tipo = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_xone, container, false);
        rv_xone = view.findViewById(R.id.rv);
        spinner = view.findViewById(R.id.spinner);
        tvSpinner = view.findViewById(R.id.tvSpinner);
        tvAviso = view.findViewById(R.id.tvAviso);
        ivAviso = view.findViewById(R.id.ivAviso);
        progressBar = view.findViewById(R.id.progressBar);

        spinnerListener();

        //link.listar(url, tipo, rv_xone, tvAviso, getActivity());

        return view;

    }

    public void spinnerListener(){
        link = new Links();
        link.spinnerListener(spinner, tvSpinner, rv_xone, tvAviso, getActivity(), "Xone", ivAviso, progressBar);

    }

}