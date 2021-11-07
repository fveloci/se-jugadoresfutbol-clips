/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.jugadoresfutbol;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author VELOCI
 */
public class OperacionArchivo {
    //crea el archivo en disco, recibe como parámetro la lista de estudiantes
	public static void crearArchivo() {
		FileWriter flwriter = null;
		try {
			//crea el flujo para escribir en el archivo
			flwriter = new FileWriter("D:\\Franco\\archivos\\operaciones.txt", true);
			//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
			BufferedWriter bfwriter = new BufferedWriter(flwriter);			
			//cierra el buffer intermedio
			bfwriter.close();
			System.out.println("Archivo creado satisfactoriamente..");
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {//cierra el flujo principal
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	//añadir más estudiantes al archivo
	public static void aniadirArchivo(String usuario, String respuesta) {
		FileWriter flwriter = null;
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                 LocalDateTime now = LocalDateTime.now(); 
		try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
			flwriter = new FileWriter("D:\\Franco\\archivos\\operaciones.txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			bfwriter.write("Usuario: "+usuario+", fecha: "+now+"- datos usados:"+ respuesta+ "\n");
			bfwriter.close();
			System.out.println("Archivo modificado satisfactoriamente..");
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}	
}
