 /**
 *
 * @author sljim
 */

package Universo;

import java.util.*;

public class Universe {
    
    //------------------------------------------
    // Atributos
    //------------------------------------------
    
    /**
     * Array que contiene a las personas
     */
    private ArrayList<Person> people;
    
    //------------------------------------------
    // Cosntructor
    //------------------------------------------
    
    /**
     * Inicializa la lista de personas en el universo
     */
    public Universe( )
    {
        people = new ArrayList<>();
    }
    
    //------------------------------------------
    // Metodos
    //------------------------------------------
    
    /**
     * Da a todas las personas en el universo
     * @return lista con todas las personas del universo
     */
    public ArrayList<Person> darPersonas( )
    {
        return people;
    }
    
    /**
     * Crea una persona y la añade a la lista de personas 
     * @param pName nombre que tendra la persona
     * @param pGender genero que tendra la persona
     * @param pMadre madre de la persona, madre puede ser null
     * @param pPadre padre de la persona, padre puede ser null
     */
    public void crearPersona( String pName, String pGender, String pMadre, String pPadre)
    {
        
        Person madre = buscarPersona(pMadre);
        Person padre = buscarPersona(pPadre);
        
        Person nuevo = new Person(pName, pGender, madre, padre);
        
        if(madre != null)
        {
        madre.darHijos().add(nuevo);
        }
        
        if(padre != null)
        {
        padre.darHijos().add(nuevo);
        }
        
        people.add(nuevo);
        
    }
 
    /**
     * Busa a la persona dada por parametro
     * @param pNombre nombre de la persona requerida
     * @return la primera persona que posea tal nombre
     */
    public Person buscarPersona( String pNombre)
    {
        
        Person buscada = null;
        
        for(Person e: people)
        {
            if(e.darNombre().equals(pNombre))
            {
                buscada = e;
            }
        }
        
        return buscada;
    }
    
    /**
     * Cuenta la cantidad de personas con hijas
     * @return 
     */
    public int contarHijas( )
    {
        int contador = 0;
        
        for(Person padre: people)
        {
            Boolean niñas = false;
            
            for(int i = 0 ; i < padre.darHijos().size() && !niñas; i++)
            {
                if(padre.darHijos().get(i).darGenero().equals(Person.genders[0]))
                {
                    niñas = true;
                }
            }
            
            if(niñas)
            {
                contador++;
            }
            
        }
        
        return contador;
    }
    
    /**
     * Da la informacion de cada persona en la lista people, la informacion se retorna de la siguiente manera:
     * [Padre]
     * [nombre]:[genero]:[nombre del padre, si existe]:[nombre de la madre, si existe]
     * [Hijos]
     * [nombre del hijo]:[genero del hijo]:[nombre del padre del hijo]:[nombre de la madre del hijo]
     * 
     * @return informacion de cada persona y sus hijos en la lista people
     */
    public String darInformacion( )
    {
        
        String info = "";
        
        for(Person p : people)
        {
            
            info += "Nombre: " + "\n" + p.darNombre() +"\n"+ " Su genero es: " + p.darGenero();
            
            if(p.darMadre() != null)
            {
                info += " El nombre de la madre es: " + p.darMadre().darNombre();
            }
            if(p.darPadre() != null)
            {
                info += " El nombre del Padre es: " + p.darPadre().darNombre();
            }
            
            info += "\n" + "Sus hijos son: " + "\n";
            
            for(Person s: p.darHijos())
            {
                info += " "+s.darNombre() + " Su genero es: " + s.darGenero();
            
                if(s.darMadre() != null)
                {
                    info += " El nombre de la madre es: " + s.darMadre().darNombre();
                }
                if(s.darPadre() != null)
                {
                    info += " El nombre del padre es: " + s.darPadre().darNombre();
                }
                
                info+="\n";
                
            }
            
            info += "\n" + "" + "\n";
                    
        }
        
        return info;
    }



    
    
}