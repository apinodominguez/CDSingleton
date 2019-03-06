package singleton;

public class Singleton {
    
    // atributos de las instancias
    private String nombre;
    private int dni;
    private static Singleton singleton = null;

    private Singleton(String nombre, int dni) {

        
        this.nombre = nombre;
        this.dni = dni;
    }
 // nuevas instancias
 public static Singleton instanciar(String nombre, int dni) {

        if (singleton == null) {

            return singleton = new Singleton(nombre, dni);

        } else {
            return singleton;
        }

    }

 public static Singleton instanciar(){
     return singleton;
 }

    //Getters&Setters
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setdni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getdni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Singleton{" + "nombre=" + nombre + ", apellido=" + dni + '}';
    }

}


