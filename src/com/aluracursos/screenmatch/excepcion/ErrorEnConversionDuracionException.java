package com.aluracursos.screenmatch.excepcion;

public class ErrorEnConversionDuracionException extends Throwable {
    private String mensaje;

    public ErrorEnConversionDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
