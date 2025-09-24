package semana.vi.progfunc_ejercicio02;


public class Producto {
    
    // Atributos de la clase producto 
    private String nombreProducto; 
    private double precioProducto;

    public Producto(String nombreProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }
    
    

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return nombreProducto + " => S./ " + precioProducto;
    }
    
    
    
    
}
