import java.util.ArrayList;

public class CargaContenedor implements Cargable{
    private String nombreCargaContenedor, descripcion;
    private Double  pesoContenedor;
    private ArrayList<Cargable> contenedorCargas;

    public CargaContenedor(String nombre, String descripcion, Double pesoContenedor) {
        this.nombreCargaContenedor = nombre;
        this.descripcion = descripcion;
        this.pesoContenedor = pesoContenedor;
        this.contenedorCargas = new ArrayList<>();
    }
    public void agregarCarga(Cargable c){this.contenedorCargas.add(c);}
    @Override
    public Double calcularPeso() {
        Double pesoTotal = 0.0;
        for( Cargable c : this.contenedorCargas){
            pesoTotal = this.pesoContenedor + c.calcularPeso();
        }
        return pesoTotal;
    }

    @Override
    public String getNombre() {
        return this.nombreCargaContenedor;
    }
}
