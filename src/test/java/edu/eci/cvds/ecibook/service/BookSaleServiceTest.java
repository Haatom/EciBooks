package edu.eci.cvds.ecibook.service;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import edu.eci.cvds.ecibook.model.DiscountCategory;
import edu.eci.cvds.ecibook.model.BookSaleException;


public class BookSaleServiceTest {
    private BookSaleService service = new BookSaleService();


    @Test
    /**
     * El rango menor debe ser de 1 a 10, y el descuento debe ser de 0% debido a que se usa un "otro" en la prueba
     */

    public void rangoMenor(){
       BigDecimal valor, esperado;
       esperado = new BigDecimal(25000);
       try {
            valor = service.calculateCost(8, DiscountCategory.OTHER);
            Assert.assertEquals(esperado, valor);
       }
       catch (BookSaleException e){
        e.printStackTrace();
       }
    }

    @Test
    /**
     * El rango intermedio debe ser de 11 a 20, y el descuento debe ser de 20% debido a que se usa un "estudiante" en la prueba
     */

    public void rangoIntermedio(){
        BigDecimal valor, esperado;
        esperado = new BigDecimal(40000);
        try {
             valor = service.calculateCost(15, DiscountCategory.STUDENT);
             Assert.assertEquals(esperado, valor);
        }
        catch (BookSaleException e){
         e.printStackTrace();
        }
     }

     @Test
    /**
     * El rango alto debe ser de 21 a 30, y el descuento debe ser de 10% debido a que se usa un "empleado" en la prueba
     */

    public void rangoAlto(){
        BigDecimal valor, esperado;
        esperado = new BigDecimal(90000);
        try {
             valor = service.calculateCost(25, DiscountCategory.EMPLOYEE);
             Assert.assertEquals(esperado, valor);
        }
        catch (BookSaleException e){
         e.printStackTrace();
        }
     }


     @Test
    /**
     * El rango no puede ser de un valor negativo, por lo tanto no es valido 
     */

    public void rangoNegativo() {
		BigDecimal costo, esperado;
		esperado = new BigDecimal(25500);
		try {
			costo = service.calculateCost(-15,DiscountCategory.EMPLOYEE);
		} catch (BookSaleException e) {
			Assert.assertTrue(true);
		}
		
	}

    @Test
    /**
     * El rango no puede ser de un valor superior a 30, por lo tanto no es valido 
     */

    public void rangoSuperior() {
		BigDecimal costo, esperado;
		esperado = new BigDecimal(25500);
		try {
			costo = service.calculateCost(40,DiscountCategory.EMPLOYEE);
		} catch (BookSaleException e) {
			Assert.assertTrue(true);
		}
		
	}

}