/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.cliente;

import conexion.Conexion;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author arace
 */
public class Cliente extends Conexion {

    public Cliente() throws IOException {
        super("cliente");
    }

    public void startClient() {
        try {
            salidaServidor = new DataOutputStream(this.clientSocket.getOutputStream());
            for (int i = 0; i < 2; i++) {
                salidaServidor.writeUTF("Este es el mensaje número " + (i + 1) + "\n");
            }
            
            this.clientSocket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
