package Tienda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorTiendaTest {

    private final GestorTienda gestor = new GestorTienda();

    
    @Test
    public void testCalcularDescuento() {
        
        assertEquals(10.0, gestor.calcularDescuento(100.0, 10), "El descuento para 10 o más productos debe ser 10%"); 
        assertEquals(5.0, gestor.calcularDescuento(100.0, 5), "El descuento para 5 o más productos debe ser 5%");
        assertEquals(0.0, gestor.calcularDescuento(100.0, 4), "El descuento para menos de 5 productos debe ser 0%");
    }

    
    @Test
    public void testCategorizarProducto() {
        assertEquals("Económico", gestor.categorizarProducto(9.99), "El producto debe ser categorizado como Económico");
        assertEquals("Estándar", gestor.categorizarProducto(25.0), "El producto debe ser categorizado como Estándar");
        assertEquals("Premium", gestor.categorizarProducto(50.0), "El producto debe ser categorizado como Premium");
    }


    @Test
    public void testBuscarProducto() {
 
        String[] inventario = {"producto1", "producto2", "producto3"};
        assertEquals("producto2", gestor.buscarProducto(inventario, "producto2"), "El producto debe ser encontrado en el inventario");
        assertNull(gestor.buscarProducto(inventario, "producto4"), "El producto no debe ser encontrado en el inventario");
    }
}
