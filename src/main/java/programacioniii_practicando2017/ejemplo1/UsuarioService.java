/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioniii_practicando2017.ejemplo1;

import java.io.Serializable;
import javax.ejb.LocalBean;

/**
 *
 * @author kevin
 */
@LocalBean
public class UsuarioService implements Serializable{
    
 public String nombreUsuario(final int idUsuario){
     
     return "Usuario no disponible";
     
 }  
}
