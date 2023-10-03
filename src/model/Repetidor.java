package model;

import javax.swing.*;

/**
 *
 * @author Mike
 */
public class Repetidor {

    /**
     *
     * @return
     */
    public boolean intentaRepetir(){
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Deseas continuar?");
        if(respuesta !=0){
                JOptionPane.showMessageDialog(null, "Programa terminado");
                return false;
        }
        return true;
    }
}
