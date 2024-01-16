import java.util.ArrayList;

public class Address {

    private String calle;
    private String ciudad;
    private int codigoPostal;

    private ArrayList<Persona>pers;
    private Estado estado;

    public Address(){
        calle = "Calle tengel";
        ciudad = "Los angeles";
        codigoPostal = 8053;
        pers = new ArrayList<Persona>(0);
        estado = new Estado();
    }

    public Address(String calle, String ciudad, int codigoPostal, ArrayList<Persona> totalPers, Estado  estado){
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pers = totalPers;
        this.estado = estado;
    }

    public Address(String calle, String ciudad, int codigoPostal, Estado  estado){
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        pers = new ArrayList<Persona>(0);
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public ArrayList<Persona> getPers() {
        return pers;
    }

    public void setPers(ArrayList<Persona> pers) {
        this.pers = pers;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Address{" +
                "calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", pers=" + pers +
                ", estado=" + estado +
                '}';
    }
}
