public class CargaSimple implements Cargable{
    private String nombreCargaSimple, descripcion;
    private Double pesoCargaSimple;
    private Boolean refrigeracion;

    public CargaSimple(String nombre, String descripcion, Double pesoBarcoSimple, Boolean refrigeracion) {
        this.nombreCargaSimple = nombre;
        this.descripcion = descripcion;
        this.pesoCargaSimple = pesoBarcoSimple;
        this.refrigeracion = refrigeracion;
    }

    @Override
    public Double calcularPeso() {
        if(refrigeracion == true){
            Double pesoTotal = 0.0;
            return pesoTotal = (this.pesoCargaSimple += this.pesoCargaSimple*0.10);
        }return this.pesoCargaSimple;


    }

    @Override
    public String getNombre() {
        return this.nombreCargaSimple;
    }
}
