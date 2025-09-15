package semana.i;

public class CirculoTest {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        //circulo.setColor(amarillo);
        //circulo.setRadio(12);

        System.out.println(circulo.getColor()); // Parametro y argumento 
        System.out.println(circulo.area()); // Obtengo el área del circulo 
        System.out.println(circulo.area(6.55)); // Obtengo el área del circulo 
        //System.out.println(circulo.radio); // Salida: "radio has private access" 
        System.out.println(circulo.toString());
    }

}
