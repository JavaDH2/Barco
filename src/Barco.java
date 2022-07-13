import java.util.ArrayList;

public class Barco {
    private ArrayList<Cargable> listaBarcos;
    private String nombre;

    public Barco() {
        this.listaBarcos = new ArrayList<>();
    }

    public void agregarBarco(Cargable c){this.listaBarcos.add(c);}

    public void mostarBarcos(){
        for (Cargable c : this.listaBarcos){
            System.out.println("La carga " +  c.getNombre() + " su peso es: " + c.calcularPeso());
        }
    }
}
