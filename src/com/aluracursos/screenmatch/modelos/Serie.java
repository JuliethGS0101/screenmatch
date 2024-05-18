package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{

    int temporadas;
    int episodioPorTemporada;
    int minutosPorEpisoio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodioPorTemporada * minutosPorEpisoio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTeporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTeporada(int episodioPorTeporada) {
        this.episodioPorTemporada = episodioPorTeporada;
    }

    public int getMinutosPorEpisoio() {
        return minutosPorEpisoio;
    }

    public void setMinutosPorEpisoio(int minutosPorEpisoio) {
        this.minutosPorEpisoio = minutosPorEpisoio;
    }
}
