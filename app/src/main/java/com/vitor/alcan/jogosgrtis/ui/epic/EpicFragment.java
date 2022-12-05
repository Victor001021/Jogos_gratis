package com.vitor.alcan.jogosgrtis.ui.epic;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
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

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

public class EpicFragment extends Fragment {
    private String url = "https://www.gamerpower.com/api/giveaways?plataform=epic-games-store&sort-by=popularity";
    private RecyclerView rv_epic;
    private TextView tvAviso, tvSpinner;
    private ImageView ivAviso;
    private ProgressBar progressBar;
    private Links link;
    private Spinner spinner;
    private int tipo = 0;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_epic, container, false);
        rv_epic = view.findViewById(R.id.rv);
        tvAviso = view.findViewById(R.id.tvAviso);
        spinner = view.findViewById(R.id.spinner);
        tvSpinner = view.findViewById(R.id.tvSpinner);
        ivAviso = view.findViewById(R.id.ivAviso);
        progressBar = view.findViewById(R.id.progressBar);

        spinnerListener();

        //link.listar(url, tipo, rv_epic, tvAviso, getActivity());


        return view;

    }

    public void spinnerListener(){
        link = new Links();
        link.spinnerListener(spinner, tvSpinner, rv_epic, tvAviso, getActivity(), "Epic", ivAviso, progressBar);


        /*spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                tvSpinner.setText(item);

                if(item.equals("Jogos")){
                    url = link.getEpicJogos();
                    tipo = 1;
                }else if(item.equals("Itens e DLCs")){
                    url = link.getEpicDlc();
                    tipo = 2;
                }else if(item.equals(("Acesso Antecipado"))){
                    url = link.getEpicBeta();
                    tipo = 3;
                }else{
                    url = link.getEpicAll();
                    tipo = 0;
                }
                link.listar(url, tipo, rv_epic, tvAviso, getActivity());

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}