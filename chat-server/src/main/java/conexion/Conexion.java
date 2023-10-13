/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author oscar
 */
public class Conexion {
    
    private final int PORT = 3000;
    private final String HOST = "localhost";
    
    protected String mensajeServidor;
    protected ServerSocket serverSocket;
    protected Socket clientSocket;
    protected DataOutputStream salidaServidor, salidaCliente;
    
    public Conexion(String tipo) throws IOException {
        this.crearConexion(tipo);
    }
    
    public final void crearConexion(String tipo) throws IOException {
        if (tipo.equalsIgnoreCase("servidor")) {
            this.serverSocket = new ServerSocket(this.PORT);
            this.clientSocket = new Socket();
        } else {
            this.clientSocket = new Socket(this.HOST, this.PORT);
        }
    }
}
