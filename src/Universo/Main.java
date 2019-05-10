/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universo;

/**
 *
 * @author sljim
 */
public class Main {
    
    public static void main(String[] args)
    {
        Universe universo = new Universe();
        
        universo.crearPersona("Gabriel", Person.genders[1], null,null );
        universo.crearPersona("Valentina", Person.genders[0], null,null );
        universo.crearPersona("Johan", Person.genders[1], null, "Gabriel");
        universo.crearPersona("Eduardo", Person.genders[1],"Valentina", "Johan" );
        universo.crearPersona("Sara", Person.genders[0], "Valentina","Johan" );
        
        System.out.println(universo.darInformacion());
        System.out.println("\n" + "Encontre a: " + universo.buscarPersona("Gabriel").darNombre());
        System.out.println( "\n" + "Hay " + universo.contarHijas() + " personas con hijas");
        
    }
    
}
