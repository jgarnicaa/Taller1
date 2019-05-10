/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universo;

import java.*;
import java.util.ArrayList;

/**
 * Clase que representa a una persona
 * @author sljim
 */
public class Person {
    
    //---------------------------------------
    //  Atributos
    //---------------------------------------
    
    /**
     * Nombre de la persona
     */
    private String name;
    
    /**
     * Genero de la persona
     */
    private String gender;
    
    /**
     * ArrayList con los hijos de la persona
     */
    private ArrayList<Person> children;
    
    /**
     * Representa al padre de la persona
     */
    private Person padre;
    
    /**
     * Representa a la madre de la persona
     */
    private Person madre;
    
    //---------------------------------------
    // Constantes
    //---------------------------------------
    
    /**
     * Constantes que representan los generos de las personas 
     */
    public final static String[] genders = {"femenino","masculino"};
    
    //----------------------------------------
    // Constructor
    //----------------------------------------
    
    /**
     * Constructora de la clase Person, inicializa la lista children, asigna un padre y una madre a la persona, puede haber solo un padre
     * @param pName nombre de la persona
     * @param pGender genero de la persona, pertenece a genders puede ser femenino o masculino
     * @param madre persona que se asignara como la madre
     * @param padre persona que se asignara como el padre
     */
    public Person( String pName, String pGender, Person pMadre, Person pPadre )
    {
        
      gender = pGender;
      name = pName;
        
      padre = pPadre;
      madre = pMadre;
      
      children = new ArrayList<>();
      
    }

    /**
     * Da el nombre de la persona
     * @return Nombre de la persona 
     */
    public String darNombre()
    {
        
    return name;    
        
    }
    
    /**
     * Da el genero de la persona
     * @return genero de la persona
     */
    public String darGenero()
    {
        return gender;
    }       
    
    /**
     * Da al padre de la persona
     * @return padre de la persona 
     */
    public Person darPadre()
    {
        return padre;
    }
    
    /**
     * Da a la madre de la persona
     * @return madre de la persona
     */
    public Person darMadre()
    {
        return madre;
    }
    
    /**
     * Retorna a todos los hijos de la persona 
     * @return ArrayList<> con todos los hijos de la persona 
     */
    public ArrayList<Person> darHijos()
    {
        return children;
    }

    
}
