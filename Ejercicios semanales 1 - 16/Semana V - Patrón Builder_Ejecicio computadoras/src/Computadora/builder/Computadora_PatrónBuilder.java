package Computadora.builder;

public class Computadora_PatrónBuilder {

    public static void main(String[] args) {
        Computadora basica = new ComputadoraBuilder()
                .setMarca("Lenovo")
                .setModelo("IdeaPad 3")
                .build();
        basica.mostrarDatos();
        System.out.println("*****************************************");

        Computadora oficina = new ComputadoraBuilder()
                .setMarca("HP").setModelo("")
                .setProcesador("Intel core i5")
                .setAlmacenamiento(1060)
                .setTipoAlmacenamiento("Disco duro SATA")
                .setSistemaOperativo("Windows 11")
                .build();
        oficina.mostrarDatos();

        System.out.println("*****************************************");

        Computadora Gamer = new ComputadoraBuilder()
                .setMarca("HP")
                .setModelo("")
                .setProcesador("Intel core i9")
                .setTarjetaGrafica("NVIDIA RTX 4090")
                .setAlmacenamiento(1060)
                .setMemoriaRAM(32)
                .setTipoAlmacenamiento("Disco duro SSD")
                .setSistemaOperativo("Windows 11 pro")
                .build();
        Gamer.mostrarDatos();
    }

}
