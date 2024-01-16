public class Persona {

    private String nombre;
    private int telefono;
    private String email;

    private LibroAddress libroAddress;
    private Address address;

    public Persona(){
        nombre = "Saleem";
        telefono = 987123456;
        email = "Cole@gmail.com";
        libroAddress = new LibroAddress();
        address = new Address();
    }

    public Persona(String nombre, int telefono, String email, LibroAddress libro, Address address){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.libroAddress = libro;
        this.address = address;
    }

    public Persona(String nombre, int telefono, String email){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.libroAddress = new LibroAddress();
        this.address = new Address();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LibroAddress getLibroAddress() {
        return libroAddress;
    }

    public void setLibroAddress(LibroAddress libroAddress) {
        this.libroAddress = libroAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void comprarParking(){

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                ", libroAddress=" + libroAddress +
                ", address=" + address +
                '}';
    }
}
