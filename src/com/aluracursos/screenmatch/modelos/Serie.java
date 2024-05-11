package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{

    int temporadas;
    int episodioPorTeporada;
    int minutosPorEpisoio;

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodioPorTeporada * minutosPorEpisoio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTeporada() {
        return episodioPorTeporada;
    }

    public void setEpisodioPorTeporada(int episodioPorTeporada) {
        this.episodioPorTeporada = episodioPorTeporada;
    }

    public int getMinutosPorEpisoio() {
        return minutosPorEpisoio;
    }

    public void setMinutosPorEpisoio(int minutosPorEpisoio) {
        this.minutosPorEpisoio = minutosPorEpisoio;
    }
}
