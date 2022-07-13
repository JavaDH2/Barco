public class Main {
    public static void main(String[] args) {
        CargableFactory f = CargableFactory.getInstance();
        Cargable tvLed = f.crearCargable("TV LED");
        Cargable medicamentos = f.crearCargable("Medicamentos");
        Cargable evergreen = f.crearCargable("Evergreen");
        //crear el barco

        Barco poo = new Barco();
        poo.agregarBarco(tvLed);
        poo.agregarBarco(medicamentos);
        poo.agregarBarco(evergreen);

        poo.mostarBarcos();


    }
}
