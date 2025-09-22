package semana.vi.patrón.adapter_ejerciciousb;

// 1. Interfaz requerida por el cliente
// 2. Es aquello con lo que los demás dispositivos deben cumplir
// 3. El problama a resolver es que interactue con los elementos dispositivos que no son USB. 
public interface USB {
    
    // Solo declara comportamientos (Métodos)
    void conectarConUsb(); // Este cumplirá el rol de target
    
}
