/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.chat.server;

import java.io.IOException;
import servidor.Servidor;
import servidor.Servidor;

/**
 *
 * @author arace
 */
public class MainServidor
{
    public static void main(String[] args) throws IOException
    {
        Servidor serv = new Servidor("servidor"); 

        System.out.println("Iniciando servidor\n");
        serv.iniciarServidor(); 
    }
}
