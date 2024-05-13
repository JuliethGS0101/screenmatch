package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtro(Clasificable clasificable){
        if (clasificable.getClasificable() >= 4){
            System.out.println("El màs evaluado en le momento");
        } else if (clasificable.getClasificable() >= 2) {
            System.out.println("Popular en el monmento");
        }else {
            System.out.println("Colocalo en tu lista para verlo despues");
        }

    }
}
