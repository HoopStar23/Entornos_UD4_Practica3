import java.util.ArrayList;

public class LibroAddress {

    private int codigo;

    private ArrayList<Persona>pers;

    public LibroAddress(){
        codigo = 0;
        pers = new ArrayList<Persona>(0);
    }

    public LibroAddress(int codigo, ArrayList<Persona> totalPers){
        this.codigo = codigo;
        this.pers = totalPers;
    }

    public LibroAddress(int codigo){
        this.codigo = codigo;
        pers = new ArrayList<Persona>(0);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Persona> getPers() {
        return pers;
    }

    public void setPers(ArrayList<Persona> pers) {
        this.pers = pers;
    }

    @Override
    public String toString() {
        return "LibroAddress{" +
                "codigo=" + codigo +
                ", pers=" + pers +
                '}';
    }
}
