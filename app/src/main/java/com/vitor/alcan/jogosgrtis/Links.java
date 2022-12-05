package com.vitor.alcan.jogosgrtis;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.vitor.alcan.jogosgrtis.adapter.JogosAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.app.Activity;


public class Links {
    private String epicJogos = "https://www.gamerpower.com/api/giveaways?platform=epic-games-store&sort-by=popularity&type=game";
    private String epicDlc = "https://www.gamerpower.com/api/giveaways?platform=epic-games-store&sort-by=popularity&type=loot";
    private String epicBeta = "https://www.gamerpower.com/api/giveaways?platform=epic-games-store&sort-by=popularity&type=beta";
    private String epicAll = "https://www.gamerpower.com/api/giveaways?platform=epic-games-store&sort-by=popularity";

    private String steamJogos = "https://www.gamerpower.com/api/giveaways?platform=steam&sort-by=popularity&type=game";
    private String steamDlc = "https://www.gamerpower.com/api/giveaways?platform=steam&sort-by=popularity&type=loot";
    private String steamBeta = "https://www.gamerpower.com/api/giveaways?platform=steam&sort-by=popularity&type=beta";
    private String steamAll = "https://www.gamerpower.com/api/giveaways?platform=steam&sort-by=popularity";

    private String pcJogos = "https://www.gamerpower.com/api/giveaways?platform=pc&sort-by=popularity&type=game";
    private String pcDlc = "https://www.gamerpower.com/api/giveaways?platform=pc&sort-by=popularity&type=loot";
    private String pcBeta = "https://www.gamerpower.com/api/giveaways?platform=pc&sort-by=popularity&type=beta";
    private String pcAll = "https://www.gamerpower.com/api/giveaways?platform=pc&sort-by=popularity";

    private String ps4Jogos = "https://www.gamerpower.com/api/giveaways?platform=ps4&sort-by=popularity&type=game";
    private String ps4Dlc = "https://www.gamerpower.com/api/giveaways?platform=ps4&sort-by=popularity&type=loot";
    private String ps4Beta = "https://www.gamerpower.com/api/giveaways?platform=ps4&sort-by=popularity&type=beta";
    private String ps4All = "https://www.gamerpower.com/api/giveaways?platform=ps4&sort-by=popularity";

    private String ps5Jogos = "https://www.gamerpower.com/api/giveaways?platform=ps5&sort-by=popularity&type=game";
    private String ps5Dlc = "https://www.gamerpower.com/api/giveaways?platform=ps5&sort-by=popularity&type=loot";
    private String ps5Beta = "https://www.gamerpower.com/api/giveaways?platform=ps5&sort-by=popularity&type=beta";
    private String ps5All = "https://www.gamerpower.com/api/giveaways?platform=ps5&sort-by=popularity";

    private String xoneJogos = "https://www.gamerpower.com/api/giveaways?platform=xbox-one&sort-by=popularity&type=game";
    private String xoneDlc = "https://www.gamerpower.com/api/giveaways?platform=xbox-one&sort-by=popularity&type=loot";
    private String xoneBeta = "https://www.gamerpower.com/api/giveaways?platform=xbox-one&sort-by=popularity&type=beta";
    private String xoneAll = "https://www.gamerpower.com/api/giveaways?platform=xbox-one&sort-by=popularity";    
    
    private String xsJogos = "https://www.gamerpower.com/api/giveaways?platform=xbox-series-xs&sort-by=popularity&type=game";
    private String xsDlc = "https://www.gamerpower.com/api/giveaways?platform=xbox-series-xs&sort-by=popularity&type=loot";
    private String xsBeta = "https://www.gamerpower.com/api/giveaways?platform=xbox-series-xs&sort-by=popularity&type=beta";
    private String xsAll = "https://www.gamerpower.com/api/giveaways?platform=xbox-series-xs&sort-by=popularity";

    private String androidJogos = "https://www.gamerpower.com/api/giveaways?platform=android&sort-by=popularity&type=game";
    private String androidDlc = "https://www.gamerpower.com/api/giveaways?platform=android&sort-by=popularity&type=loot";
    private String androidBeta = "https://www.gamerpower.com/api/giveaways?platform=android&sort-by=popularity&type=beta";
    private String androidAll = "https://www.gamerpower.com/api/giveaways?platform=android&sort-by=popularity";

    private String iosJogos = "https://www.gamerpower.com/api/giveaways?platform=ios&sort-by=popularity&type=game";
    private String iosDlc = "https://www.gamerpower.com/api/giveaways?platform=ios&sort-by=popularity&type=loot";
    private String iosBeta = "https://www.gamerpower.com/api/giveaways?platform=ios&sort-by=popularity&type=beta";
    private String iosAll = "https://www.gamerpower.com/api/giveaways?platform=ios&sort-by=popularity";

    private int tipo;
    private String urlAtual;

    public String getEpicJogos() {
        return epicJogos;
    }

    public void setEpicJogos(String epicJogos) {
        this.epicJogos = epicJogos;
    }

    public String getEpicDlc() {
        return epicDlc;
    }

    public void setEpicDlc(String epicDlc) {
        this.epicDlc = epicDlc;
    }

    public String getEpicBeta() {
        return epicBeta;
    }

    public void setEpicBeta(String epicBeta) {
        this.epicBeta = epicBeta;
    }

    public String getEpicAll() {
        return epicAll;
    }

    public void setEpicAll(String epicAll) {
        this.epicAll = epicAll;
    }

    public String getSteamJogos() {
        return steamJogos;
    }

    public void setSteamJogos(String steamJogos) {
        this.steamJogos = steamJogos;
    }

    public String getSteamDlc() {
        return steamDlc;
    }

    public void setSteamDlc(String steamDlc) {
        this.steamDlc = steamDlc;
    }

    public String getSteamBeta() {
        return steamBeta;
    }

    public void setSteamBeta(String steamBeta) {
        this.steamBeta = steamBeta;
    }

    public String getSteamAll() {
        return steamAll;
    }

    public void setSteamAll(String steamAll) {
        this.steamAll = steamAll;
    }

    public String getPcJogos() {
        return pcJogos;
    }

    public void setPcJogos(String pcJogos) {
        this.pcJogos = pcJogos;
    }

    public String getPcDlc() {
        return pcDlc;
    }

    public void setPcDlc(String pcDlc) {
        this.pcDlc = pcDlc;
    }

    public String getPcBeta() {
        return pcBeta;
    }

    public void setPcBeta(String pcBeta) {
        this.pcBeta = pcBeta;
    }

    public String getPcAll() {
        return pcAll;
    }

    public void setPcAll(String pcAll) {
        this.pcAll = pcAll;
    }

    public String getPs4Jogos() {
        return ps4Jogos;
    }

    public void setPs4Jogos(String ps4Jogos) {
        this.ps4Jogos = ps4Jogos;
    }

    public String getPs4Dlc() {
        return ps4Dlc;
    }

    public void setPs4Dlc(String ps4Dlc) {
        this.ps4Dlc = ps4Dlc;
    }

    public String getPs4Beta() {
        return ps4Beta;
    }

    public void setPs4Beta(String ps4Beta) {
        this.ps4Beta = ps4Beta;
    }

    public String getPs4All() {
        return ps4All;
    }

    public void setPs4All(String ps4All) {
        this.ps4All = ps4All;
    }

    public String getPs5Jogos() {
        return ps5Jogos;
    }

    public void setPs5Jogos(String ps5Jogos) {
        this.ps5Jogos = ps5Jogos;
    }

    public String getPs5Dlc() {
        return ps5Dlc;
    }

    public void setPs5Dlc(String ps5Dlc) {
        this.ps5Dlc = ps5Dlc;
    }

    public String getPs5Beta() {
        return ps5Beta;
    }

    public void setPs5Beta(String ps5Beta) {
        this.ps5Beta = ps5Beta;
    }

    public String getPs5All() {
        return ps5All;
    }

    public void setPs5All(String ps5All) {
        this.ps5All = ps5All;
    }

    public String getXoneJogos() {
        return xoneJogos;
    }

    public void setXoneJogos(String xoneJogos) {
        this.xoneJogos = xoneJogos;
    }

    public String getXoneDlc() {
        return xoneDlc;
    }

    public void setXoneDlc(String xoneDlc) {
        this.xoneDlc = xoneDlc;
    }

    public String getXoneBeta() {
        return xoneBeta;
    }

    public void setXoneBeta(String xoneBeta) {
        this.xoneBeta = xoneBeta;
    }

    public String getXoneAll() {
        return xoneAll;
    }

    public void setXoneAll(String xoneAll) {
        this.xoneAll = xoneAll;
    }

    public String getXsJogos() {
        return xsJogos;
    }

    public void setXsJogos(String xsJogos) {
        this.xsJogos = xsJogos;
    }

    public String getXsDlc() {
        return xsDlc;
    }

    public void setXsDlc(String xsDlc) {
        this.xsDlc = xsDlc;
    }

    public String getXsBeta() {
        return xsBeta;
    }

    public void setXsBeta(String xsBeta) {
        this.xsBeta = xsBeta;
    }

    public String getXsAll() {
        return xsAll;
    }

    public void setXsAll(String xsAll) {
        this.xsAll = xsAll;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getUrlAtual() {
        return urlAtual;
    }

    public void setUrlAtual(String urlAtual) {
        this.urlAtual = urlAtual;
    }

    public String getAndroidJogos() {
        return androidJogos;
    }

    public void setAndroidJogos(String androidJogos) {
        this.androidJogos = androidJogos;
    }

    public String getAndroidDlc() {
        return androidDlc;
    }

    public void setAndroidDlc(String androidDlc) {
        this.androidDlc = androidDlc;
    }

    public String getAndroidBeta() {
        return androidBeta;
    }

    public void setAndroidBeta(String androidBeta) {
        this.androidBeta = androidBeta;
    }

    public String getAndroidAll() {
        return androidAll;
    }

    public void setAndroidAll(String androidAll) {
        this.androidAll = androidAll;
    }

    public ArrayList<Dados> getDados() {
        return dados;
    }

    public void setDados(ArrayList<Dados> dados) {
        this.dados = dados;
    }

    public JogosAdapter getJogosAdapter() {
        return jogosAdapter;
    }

    public void setJogosAdapter(JogosAdapter jogosAdapter) {
        this.jogosAdapter = jogosAdapter;
    }

    public String getIosJogos() {
        return iosJogos;
    }

    public void setIosJogos(String iosJogos) {
        this.iosJogos = iosJogos;
    }

    public String getIosDlc() {
        return iosDlc;
    }

    public void setIosDlc(String iosDlc) {
        this.iosDlc = iosDlc;
    }

    public String getIosBeta() {
        return iosBeta;
    }

    public void setIosBeta(String iosBeta) {
        this.iosBeta = iosBeta;
    }

    public String getIosAll() {
        return iosAll;
    }

    public void setIosAll(String iosAll) {
        this.iosAll = iosAll;
    }

    /*public void spinnerListener(Spinner spinner, TextView tvSpinner){
        tvSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinner.performClick();
            }
        });



        final List<String> tipos = Arrays.asList("Todos", "Jogos", "Itens e DLCs", "Acesso Antecipado");

        ArrayAdapter adapter = new ArrayAdapter<>(spinner.getContext(), android.R.layout.simple_spinner_dropdown_item, tipos );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);





        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                tvSpinner.setText(item);

                Links link = new Links();

                if(item.equals("Jogos")){
                    link.setUrlAtual(link.getSteamJogos());
                    link.setTipo(1);
                }else if(item.equals("Itens e DLCs")){
                    link.setUrlAtual(link.getSteamDlc());
                    link.setTipo(2);
                }else if(item.equals(("Acesso Antecipado"))){
                    link.setUrlAtual(link.getSteamBeta());
                    link.setTipo(3);
                }else{
                    link.setUrlAtual(link.getSteamAll());
                    link.setTipo(0);
                }
                //link.listar(link.getUrlAtual(), link.getTipo(), rv_steam, tvAviso, getActivity());

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }*/




    public void spinnerListener(Spinner spinner, TextView tvSpinner, RecyclerView rv, TextView tvAviso, Context context, String plataforma, ImageView ivAviso, ProgressBar progressBar){
        tvSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinner.performClick();
            }
        });



        final List<String> tipos = Arrays.asList("Todos", "Jogos", "Itens e DLCs", "Acesso Antecipado");

        ArrayAdapter adapter = new ArrayAdapter<>(spinner.getContext(), android.R.layout.simple_spinner_dropdown_item, tipos );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);





        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                tvSpinner.setText(item);
                Links link = new Links();


                if(item.equals("Jogos")){
                    switch (plataforma) {
                        case "Android":
                            link.setUrlAtual(link.getAndroidJogos());
                            break;
                        case "Epic":
                            link.setUrlAtual(link.getEpicJogos());
                            break;
                        case "Steam":
                            link.setUrlAtual(link.getSteamJogos());
                            break;
                        case "Pc":
                            link.setUrlAtual(link.getPcJogos());
                            break;
                        case "Ps4":
                            link.setUrlAtual(link.getPs4Jogos());
                            break;
                        case "Ps5":
                            link.setUrlAtual(link.getPs5Jogos());
                            break;
                        case "Xone":
                            link.setUrlAtual(link.getXoneJogos());
                            break;
                        case "Xs":
                            link.setUrlAtual(link.getXsJogos());
                            break;
                        case "IOS":
                            link.setUrlAtual(link.getIosJogos());
                            break;
                    }
                    link.setTipo(1);
                }else if(item.equals("Itens e DLCs")){
                    switch (plataforma) {
                        case "Android":
                            link.setUrlAtual(link.getAndroidDlc());
                            break;
                        case "Epic":
                            link.setUrlAtual(link.getEpicDlc());
                            break;
                        case "Steam":
                            link.setUrlAtual(link.getSteamDlc());
                            break;
                        case "Pc":
                            link.setUrlAtual(link.getPcDlc());
                            break;
                        case "Ps4":
                            link.setUrlAtual(link.getPs4Dlc());
                            break;
                        case "Ps5":
                            link.setUrlAtual(link.getPs5Dlc());
                            break;
                        case "Xone":
                            link.setUrlAtual(link.getXoneDlc());
                            break;
                        case "Xs":
                            link.setUrlAtual(link.getXsDlc());
                            break;
                        case "IOS":
                            link.setUrlAtual(link.getIosDlc());
                            break;
                    }
                    link.setTipo(2);
                }else if(item.equals(("Acesso Antecipado"))){
                    switch (plataforma) {
                        case "Android":
                            link.setUrlAtual(link.getAndroidBeta());
                            break;
                        case "Epic":
                            link.setUrlAtual(link.getEpicBeta());
                            break;
                        case "Steam":
                            link.setUrlAtual(link.getSteamBeta());
                            break;
                        case "Pc":
                            link.setUrlAtual(link.getPcBeta());
                            break;
                        case "Ps4":
                            link.setUrlAtual(link.getPs4Beta());
                            break;
                        case "Ps5":
                            link.setUrlAtual(link.getPs5Beta());
                            break;
                        case "Xone":
                            link.setUrlAtual(link.getXoneBeta());
                            break;
                        case "Xs":
                            link.setUrlAtual(link.getXsBeta());
                            break;
                        case "IOS":
                            link.setUrlAtual(link.getIosBeta());
                            break;
                    }
                    link.setTipo(3);
                }else{
                    switch (plataforma) {
                        case "Android":
                            link.setUrlAtual(link.getAndroidAll());
                            break;
                        case "Epic":
                            link.setUrlAtual(link.getEpicAll());
                            break;
                        case "Steam":
                            link.setUrlAtual(link.getSteamAll());
                            break;
                        case "Pc":
                            link.setUrlAtual(link.getPcAll());
                            break;
                        case "Ps4":
                            link.setUrlAtual(link.getPs4All());
                            break;
                        case "Ps5":
                            link.setUrlAtual(link.getPs5All());
                            break;
                        case "Xone":
                            link.setUrlAtual(link.getXoneAll());
                            break;
                        case "Xs":
                            link.setUrlAtual(link.getXsAll());
                            break;
                        case "IOS":
                            link.setUrlAtual(link.getIosAll());
                            break;
                    }
                    link.setTipo(0);
                }
                dados = link.listar(link.getUrlAtual(), link.getTipo(), rv, tvAviso, context, ivAviso, progressBar);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        rv.addOnItemTouchListener(new RecyclerItemClickListener(context, rv, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Dados urlItem = dados.get(position);

                //Toast.makeText(context, urlItem.getUrl(), Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse(urlItem.getUrl());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        }));



    }






    private ArrayList<Dados> dados;
    private JogosAdapter jogosAdapter;




    public ArrayList<Dados> listar(String url, int tipo, RecyclerView rv, TextView tvAviso, Context context, ImageView ivAviso, ProgressBar progressBar){
        rv.setVisibility(View.VISIBLE);
        tvAviso.setVisibility(View.GONE);
        ivAviso.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);

        dados = new ArrayList<>();

        dados.clear();
        rv.setLayoutManager(new LinearLayoutManager(context));
        jogosAdapter = new JogosAdapter(context, dados);
        rv.setAdapter(jogosAdapter);


        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {


            JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
                @Override
                public void onResponse(JSONArray response) {
                    try {
                        JSONObject jsonObject = null;
                        int i;

                        for(i = 0; i < response.length(); i++){
                            jsonObject = response.getJSONObject(i);
                            String title = jsonObject.getString("title");
                            String imagem = jsonObject.getString("image");
                            String plataformas = jsonObject.getString("platforms");
                            String dtInicio = jsonObject.getString("published_date");
                            String dtFim = jsonObject.getString("end_date");
                            String tipo = jsonObject.getString("type");
                            String valor = jsonObject.getString("worth");
                            String url = jsonObject.getString("open_giveaway_url");
                            dados.add(new Dados(title, plataformas, dtInicio, dtFim, imagem, tipo, valor, url));
                        }
                        jogosAdapter.notifyDataSetChanged();

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    rv.setVisibility(View.GONE);
                    tvAviso.setVisibility(View.VISIBLE);
                    ivAviso.setVisibility(View.VISIBLE);
                    ivAviso.setImageResource(R.drawable.sadface);

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

            RequestQueue requestQueue = Volley.newRequestQueue(context);
            requestQueue.add(jsonArrayRequest);
            progressBar.setVisibility(View.GONE);

        }else{
            progressBar.setVisibility(View.GONE);
            rv.setVisibility(View.GONE);
            tvAviso.setVisibility(View.VISIBLE);
            tvAviso.setText(R.string.erro_internet);
            ivAviso.setVisibility(View.VISIBLE);
            ivAviso.setImageResource(R.drawable.ic_baseline_wifi_off_24);
        }
        return dados;
    }




}
