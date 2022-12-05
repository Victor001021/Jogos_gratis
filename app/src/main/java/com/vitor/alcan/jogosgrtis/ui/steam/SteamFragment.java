package com.vitor.alcan.jogosgrtis.ui.steam;

import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.vitor.alcan.jogosgrtis.Dados;
import com.vitor.alcan.jogosgrtis.Links;
import com.vitor.alcan.jogosgrtis.R;
import com.vitor.alcan.jogosgrtis.adapter.JogosAdapter;

import java.util.ArrayList;

public class SteamFragment extends Fragment {

    private String url = "https://www.gamerpower.com/api/giveaways?platform=steam&sort-by=popularity";
    private RecyclerView rv_steam;
    private ArrayList<Dados> dados;
    private JogosAdapter jogosAdapter;
    private TextView tvAviso, tvSpinner;
    private ImageView ivAviso;
    private ProgressBar progressBar;
    private Links link;
    private Spinner spinner;
    private int tipo = 0;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_steam, container, false);
        rv_steam = view.findViewById(R.id.rv);
        ivAviso = view.findViewById(R.id.ivAviso);
        /*dados = new ArrayList<>();


        rv_steam.setLayoutManager(new LinearLayoutManager(getContext()));
        jogosAdapter = new JogosAdapter(getContext(), dados);
        rv_steam.setAdapter(jogosAdapter);*/

        spinner = view.findViewById(R.id.spinner);
        tvSpinner = view.findViewById(R.id.tvSpinner);
        tvAviso = view.findViewById(R.id.tvAviso);
        progressBar = view.findViewById(R.id.progressBar);

        spinnerListener();
        //link.listar(url, tipo, rv_steam, tvAviso, getActivity());

        //listar(url, tipo);



        return view;
    }


   /* public void listar(String url, int tipo){
        rv_steam.setVisibility(View.VISIBLE);
        tvAviso.setVisibility(View.GONE);

        ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {


            JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
                @Override
                public void onResponse(JSONArray response) {
                    try {
                        JSONObject jsonObject = null;
                        int i;
                        dados.clear();
                        for(i = 0; i < response.length(); i++){
                            jsonObject = response.getJSONObject(i);
                            String title = jsonObject.getString("title");
                            String imagem = jsonObject.getString("image");
                            String plataformas = jsonObject.getString("platforms");
                            String dtInicio = jsonObject.getString("published_date");
                            String dtFim = jsonObject.getString("end_date");
                            String tipo = jsonObject.getString("type");

                            dados.add(new Dados(title, plataformas, dtInicio, dtFim, imagem, tipo));
                        }
                        jogosAdapter.notifyDataSetChanged();

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    rv_steam.setVisibility(View.GONE);
                    tvAviso.setVisibility(View.VISIBLE);

                    if(tipo == 0){
                        tvAviso.setText(R.string.erro_all);
                    }else if(tipo == 1){
                        tvAviso.setText(R.string.erro_jogo);
                    }else if(tipo == 2){
                        tvAviso.setText(R.string.erro_dlc);
                    }else{
                        tvAviso.setText(R.string.erro_aa);
                    }

                }
            });

            RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
            requestQueue.add(jsonArrayRequest);


        }else{
            rv_steam.setVisibility(View.GONE);
            tvAviso.setVisibility(View.VISIBLE);
            tvAviso.setText(R.string.erro_internet);
        }

    }*/

    public void spinnerListener(){

        link = new Links();
        link.spinnerListener(spinner, tvSpinner, rv_steam, tvAviso, getActivity(), "Steam", ivAviso, progressBar);

        /*spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                tvSpinner.setText(item);

                if(item.equals("Jogos")){
                    url = link.getSteamJogos();
                    tipo = 1;
                }else if(item.equals("Itens e DLCs")){
                    url = link.getSteamDlc();
                    tipo = 2;
                }else if(item.equals(("Acesso Antecipado"))){
                    url = link.getSteamBeta();
                    tipo = 3;
                }else{
                    url = link.getSteamAll();
                    tipo = 0;
                }
                link.listar(url, tipo, rv_steam, tvAviso, getActivity());
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