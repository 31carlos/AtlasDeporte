package panita.company.atlasdeporte;

import panita.company.atlasdeporte.DTO.Clubes;
import panita.company.atlasdeporte.DTO.Suscripcion;
import panita.company.atlasdeporte.DTO.Usuarios;

public class AtlasDeporte {

    public static void main(String[] args) {
        //Usuarios//
        Usuarios Usu1 = new Usuarios();
        Usu1.setNombreUsuario("dcog");
        Usu1.setContraseña("Afds22231");
        Usu1.setMail("david.cogiolle@gmail.com");
        Usu1.setID(1000);
        
        Usuarios Usu2 = new Usuarios();
        Usu2.setNombreUsuario("ggft");
        Usu2.setContraseña("G1ovanniGg34");
        Usu2.setMail("gerr.adere@live.cl");
        Usu2.setID(1001);
        
        Usuarios Usu3 = new Usuarios();
        Usu3.setNombreUsuario("scodiio");
        Usu3.setContraseña("5534Gato33");
        Usu3.setMail("sergio.villanueva@gmail.com");
        Usu3.setID(1002);
        
        //clubes//
        Clubes Clubes1 = new Clubes();
        Clubes1.setCodigo("ARH11");
        Clubes1.setNombre_Club("Arsenal de Coquimbo");
        Clubes1.setLema("Cañones a los puertos");
        Clubes1.setValor_Suscripcion(10050);
        Clubes1.setColores("Amarillos, Rojo");
        
        Clubes Clubes2 = new Clubes();
        Clubes2.setCodigo("MCH12");
        Clubes2.setNombre_Club("Manquehue City");
        Clubes2.setLema("Vivir y Fuerza");
        Clubes2.setValor_Suscripcion(15100);
        Clubes2.setColores("Celeste, blanco");
        
        Clubes Clubes3 = new Clubes();
        Clubes3.setCodigo("LCH13");
        Clubes3.setNombre_Club("Los Condores Unidos");
        Clubes3.setLema("Desde lo alto al sol");
        Clubes3.setValor_Suscripcion(13200);
        Clubes3.setColores("Amarillo, Naranjos");
        
        //Suscripcion//
        Suscripcion Sus1 = new Suscripcion();
        Sus1.setNumero(1010);
        Sus1.setUsuario("Usuario1");
        Sus1.setAbono_Total(25150);
        Sus1.setEquipo_Suscriptos("ARH11 $10050, MCH12 $15100");
               
        Suscripcion Sus2 = new Suscripcion();
        Sus2.setNumero(1020);
        Sus2.setUsuario("Usuario2");
        Sus2.setAbono_Total(13200);
        Sus2.setEquipo_Suscriptos("LCH13 $13200");
        
        Suscripcion Sus3 = new Suscripcion();
        Sus3.setNumero(1030);
        Sus3.setUsuario("Usuario3");
        Sus3.setAbono_Total(18300);
        Sus3.setEquipo_Suscriptos("LCH13 $13200; MCH12 $15100");
        
        

        System.out.println("Usuario1: "+Sus1.getNumero());
        System.out.println("Suscripcion 1: "+Sus1.getUsuario());
        System.out.println("AbonoTotal 1: "+Sus1.getAbono_Total());
        System.out.println("EquipoSuscrito 1: "+Sus1.getEquipo_Suscriptos());
        
        
        System.out.println("Usuario1 2: "+Sus2.getNumero());
        System.out.println("Suscripcion 2: "+Sus2.getUsuario());
        System.out.println("AbonoTotal 2: "+Sus2.getAbono_Total());
        System.out.println("EquipoSuscrito 2: "+Sus2.getEquipo_Suscriptos());
        
        System.out.println("Usuario 3: "+Sus3.getNumero());
        System.out.println("Suscripcion 3: "+Sus3.getUsuario());
        System.out.println("AbonoTotal 3: "+Sus3.getAbono_Total());
        System.out.println("EquipoSuscrito 3: "+Sus3.getEquipo_Suscriptos());
       
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
