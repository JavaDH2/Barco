public class CargableFactory {
    private static CargableFactory instancia;

    public CargableFactory() {
    }

    public static CargableFactory getInstance(){
        if(instancia == null){
            instancia = new CargableFactory();
        }
        return instancia;
    }
    public Cargable crearCargable(String s){
        switch (s){
            case "TV LED":
                return new CargaSimple("TV LED", "", 3.0, false);
            case "Medicamentos":
                return new CargaSimple("Medicamentos", "",2.0,true );

            case "Evergreen":
                CargaContenedor contenedor1 = new CargaContenedor("Evergreen","",100.0);
                contenedor1.agregarCarga(new CargaSimple("TV LED", "", 3.0, false));
                contenedor1.agregarCarga(new CargaSimple("Medicamentos", "",2.0,true ));
                return contenedor1;
            default:
                return null;

        }
    }
}
