
package panita.company.atlasdeporte.DTO;

public class Usuarios {
    private int ID;
    private String NombreCompleto;
    private int Rut;
    private String DV;
    private String FechaDeNacimiento;
    private int telefono;
    private String mail;
    private String NombreUsuario;
    private String contraseña;
    
    
    public Usuarios(){
        this.ID = 0;
        this.NombreCompleto = "";
        this.Rut = 0;
        this.DV = "";
        this.FechaDeNacimiento = "";
        this.telefono = 123456789;
        this.mail = "";
        this.NombreUsuario = "";
        this.contraseña = "";
    }

    public Usuarios(int ID, String NombreCompleto, int Rut, String DV, String FechaDeNacimiento, int telefono, String mail, String NombreUsuario, String contraseña) {
        this.ID = ID;
        this.NombreCompleto = NombreCompleto;
        this.Rut = Rut;
        this.DV = DV;
        this.FechaDeNacimiento = FechaDeNacimiento;
        this.telefono = telefono;
        this.mail = mail;
        this.NombreUsuario = NombreUsuario;
        this.contraseña = contraseña;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDV() {
        return DV;
    }

    public void setDV(String DV) {
        this.DV = DV;
    }

    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
   