package com.vitor.alcan.jogosgrtis;

import java.io.Serializable;

public class Dados implements Serializable{
    private String titulo, plataformas, dtInicio, dtFim, imagem, tipo, valor, url;

    public Dados(String titulo, String plataformas, String dtInicio, String dtFim, String imagem, String tipo, String valor, String url) {
        this.titulo = titulo;
        this.plataformas = plataformas;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.imagem = imagem;
        this.tipo = tipo;
        this.valor = valor;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtFim() {
        return dtFim;
    }

    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
