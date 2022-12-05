package com.vitor.alcan.jogosgrtis.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.vitor.alcan.jogosgrtis.Dados;
import com.vitor.alcan.jogosgrtis.R;

import java.util.ArrayList;

public class JogosAdapter extends RecyclerView.Adapter<JogosAdapter.viewHolder> {
    private Context context;
    private ArrayList<Dados> dadosArrayList;

    public JogosAdapter(Context context, ArrayList<Dados> dadosArrayList) {
        this.context = context;
        this.dadosArrayList = dadosArrayList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.recycle_view, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), android.R.anim.slide_in_left);
        Dados dados = dadosArrayList.get(position);


        holder.titulo.setText(dados.getTitulo());
        String[] plataformas = dados.getPlataformas().split(",");

        for (int i = 0; i < plataformas.length; i++) {
            plataformas[i] = plataformas[i].replaceAll("\\s+", "");
        }

        for (int i = 0; i < plataformas.length; i++) {

            if (plataformas[i].equals("PC")) {
                holder.ivPc.setVisibility(View.VISIBLE);

            } else if (plataformas[i].equals("EpicGamesStore")) {
                holder.ivEpic.setVisibility(View.VISIBLE);

            } else if (plataformas[i].equals("Steam")) {
                holder.ivSteam.setVisibility(View.VISIBLE);
            } else if (plataformas[i].equals("Playstation4") || plataformas[i].equals("Playstation5")) {
                holder.ivPs.setVisibility(View.VISIBLE);

            } else if (plataformas[i].equals("XboxSeriesX|S") || plataformas[i].equals("XboxOne")) {
                holder.ivXb.setVisibility(View.VISIBLE);

            } else if (plataformas[i].equals("Android")) {
                holder.ivAndroid.setVisibility(View.VISIBLE);
            } else if (plataformas[i].equals("iOS")) {
                holder.ivApple.setVisibility(View.VISIBLE);
            }
        }

        String dtInicio;
        String dtFim;


        if (!dados.getDtFim().equals("N/A")) {
            String[] dataIni = dados.getDtInicio().split("-");
            dataIni[2] = dataIni[2].replaceAll("\\s.*", "");
            String[] dataFim = dados.getDtFim().split("-");
            dataFim[2] = dataFim[2].replaceAll("\\s.*", "");
            dtInicio = dataIni[2] + "/" + dataIni[1] + "/" + dataIni[0];
            dtFim = dataFim[2] + "/" + dataFim[1] + "/" + dataFim[0];
            holder.tvData.setText(dtInicio + " - " + dtFim);

            if (Integer.parseInt(dataFim[0]) >= 2022) {
                holder.tvData.setVisibility(View.VISIBLE);
            }


        }

        Picasso.with(context).load(dados.getImagem()).into(holder.iv_thumbnail);
        String tipo = dados.getTipo();


        if (tipo.equals("Game")) {
            holder.tipo.setText("Jogo");
        } else if (tipo.equals("Early Access")) {
            holder.tipo.setText("Acesso Antecipado");

        } else {
            holder.tipo.setText("Itens e DLCs");
        }

        String valor = dados.getValor();

        if (!valor.equals("N/A")) {
            holder.tvValor.setText(valor);
            holder.tvValor.setVisibility(View.VISIBLE);
        }

        holder.itemView.startAnimation(animation);

    }

    @Override
    public int getItemCount() {
        return this.dadosArrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private TextView titulo, tipo, tvData, tvValor;
        private ImageView iv_thumbnail, ivPc, ivEpic, ivSteam, ivXb, ivPs, ivAndroid, ivApple;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tv_titulo);
            iv_thumbnail = itemView.findViewById(R.id.iv_thumbnail);
            ivPc = itemView.findViewById(R.id.ivPc);
            ivEpic = itemView.findViewById(R.id.ivEpic);
            ivSteam = itemView.findViewById(R.id.ivSteam);
            ivXb = itemView.findViewById(R.id.ivXb);
            ivPs = itemView.findViewById(R.id.ivPs);
            ivAndroid = itemView.findViewById(R.id.ivAndroid);
            ivApple = itemView.findViewById(R.id.ivApple);

            tipo = itemView.findViewById(R.id.tv_tipo);
            tvData = itemView.findViewById(R.id.tvData);
            tvValor = itemView.findViewById(R.id.tvValor);

            ivPc.setVisibility(View.GONE);
            ivEpic.setVisibility(View.GONE);
            ivSteam.setVisibility(View.GONE);
            ivXb.setVisibility(View.GONE);
            ivPs.setVisibility(View.GONE);
            ivAndroid.setVisibility(View.GONE);
            ivApple.setVisibility(View.GONE);
            tvData.setVisibility(View.GONE);
            tvValor.setVisibility(View.GONE);


        }
    }

}
