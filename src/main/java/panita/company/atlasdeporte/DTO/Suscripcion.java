package panita.company.atlasdeporte.DTO;

import java.util.Date;

public class Suscripcion {
    private Date Fecha_Inicio;
    private int Valor_Suscripcion;
    private String Equipo_Suscriptos;
    private int Abono_Total;
    private String Correlativo_venta;
    private int Numero;
    private String Usuario;
    
    public Suscripcion(){
        this.Abono_Total = 0;
        this.Correlativo_venta = "";
        this.Equipo_Suscriptos = "";
        this.Fecha_Inicio = new Date ();
        this.Valor_Suscripcion = 0;
        this.Numero = 0;
        this.Usuario = "";
        
        
    }

    public Suscripcion(Date Fecha_Inicio, int Valor_Suscripcion, String Equipo_Suscriptos, int Abono_Total, String Correlativo_venta, int Numero, String Usuario) {
        this.Fecha_Inicio = Fecha_Inicio;
        this.Valor_Suscripcion = Valor_Suscripcion;
        this.Equipo_Suscriptos = Equipo_Suscriptos;
        this.Abono_Total = Abono_Total;
        this.Correlativo_venta = Correlativo_venta;
        this.Numero = Numero;
        this.Usuario = Usuario;
    }

    public Date getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(Date Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public int getValor_Suscripcion() {
        return Valor_Suscripcion;
    }

    public void setValor_Suscripcion(int Valor_Suscripcion) {
        this.Valor_Suscripcion = Valor_Suscripcion;
    }

    public String getEquipo_Suscriptos() {
        return Equipo_Suscriptos;
    }

    public void setEquipo_Suscriptos(String Equipo_Suscriptos) {
        this.Equipo_Suscriptos = Equipo_Suscriptos;
    }

    public int getAbono_Total() {
        return Abono_Total;
    }

    public void setAbono_Total(int Abono_Total) {
        this.Abono_Total = Abono_Total;
    }

    public String getCorrelativo_venta() {
        return Correlativo_venta;
    }

    public void setCorrelativo_venta(String Correlativo_venta) {
        this.Correlativo_venta = Correlativo_venta;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

}