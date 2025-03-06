package com.alejandracm;

public class ValidadorContraseña {

    // Método que valida o contrasinal
    public boolean esValida(String contraseña) {
        if (contraseña == null) {
            return false;
        }

        // Verificar lonxitude
        if (contraseña.length() < 8) {
            return false;
        }

        // Verificar mayus, minus, num, caracE
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCarácterEspecial = false;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (esCarácterEspecial(c)) {
                tieneCarácterEspecial = true;
            }
        }
        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneCarácterEspecial;
    }

    // Método que verifica si un carácter é un carácter especial
    private boolean esCarácterEspecial(char c) {
        return "!@#$%^&*".indexOf(c) >= 0;
    }
}

