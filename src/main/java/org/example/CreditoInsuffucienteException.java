package org.example;

public class CreditoInsuffucienteException extends RossiGoException {
    public CreditoInsuffucienteException() {
        super("credito sotto la soglia di sblocco");
    }
}
