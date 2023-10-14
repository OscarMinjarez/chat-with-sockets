/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import conexion.Conexion;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author oscar
 */
public class Servidor extends Conexion {
    
    public Servidor(String tipo) throws IOException {
        super(tipo);
    }
    
    public void iniciarServidor() {
        try {
            System.out.println("Esperando...");
            
            this.clientSocket = this.serverSocket.accept(); // Va a esperar a que se conecte un cliente
            
            System.out.println("Cliente en linea");
            
            this.salidaCliente = new DataOutputStream(this.clientSocket.getOutputStream());
            
            this.salidaCliente.writeUTF("Peticion recibida y aceptada");
            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
            
            while ((this.mensajeServidor = entrada.readLine()) != null) {
                System.out.println(this.mensajeServidor);
            }
            
            System.out.println("Fin de la conexion");
            
            this.serverSocket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
