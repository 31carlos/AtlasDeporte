package panita.company.atlasdeporte.DTO;

import java.util.Date;

public class Clubes {
    private String Codigo;
    private String Nombre_Club;
    private String Nombre_Fundacion;
    private Date Añofundacion;
    private String Pais_Origen;
    private String Lema;
    private String Colores;
    private int Valor_Suscripcion;
    
    
    public Clubes (){
        this.Nombre_Fundacion = "";
        this.Codigo = "";
        this.Nombre_Club = "";
        this.Añofundacion = new Date ();
        this.Colores = "";
        this.Lema = "";
        this.Valor_Suscripcion = 0;
        this.Pais_Origen ="";
        
    
    } 

    public Clubes(String Codigo, String Nombre_Club, String Nombre_Fundacion, Date Añofundacion, String Pais_Origen, String Lema, String Colores, int Valor_Suscripcion) {
        this.Codigo = Codigo;
        this.Nombre_Club = Nombre_Club;
        this.Nombre_Fundacion = Nombre_Fundacion;
        this.Añofundacion = Añofundacion;
        this.Pais_Origen = Pais_Origen;
        this.Lema = Lema;
        this.Colores = Colores;
        this.Valor_Suscripcion = Valor_Suscripcion;
        
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre_Club() {
        return Nombre_Club;
    }

    public void setNombre_Club(String Nombre_Club) {
        this.Nombre_Club = Nombre_Club;
    }

    public String getNombre_Fundacion() {
        return Nombre_Fundacion;
    }

    public void setNombre_Fundacion(String Nombre_Fundacion) {
        this.Nombre_Fundacion = Nombre_Fundacion;
    }

    public Date getAñofundacion() {
        return Añofundacion;
    }

    public void setAñofundacion(Date Añofundacion) {
        this.Añofundacion = Añofundacion;
    }

    public String getPais_Origen() {
        return Pais_Origen;
    }

    public void setPais_Origen(String Pais_Origen) {
        this.Pais_Origen = Pais_Origen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }

    public int getValor_Suscripcion() {
        return Valor_Suscripcion;
    }

    public void setValor_Suscripcion(int Valor_Suscripcion) {
        this.Valor_Suscripcion = Valor_Suscripcion;
    }
    
}

   