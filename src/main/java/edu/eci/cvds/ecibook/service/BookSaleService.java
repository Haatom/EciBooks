package edu.eci.cvds.ecibook.service;

import java.math.BigDecimal;
import java.util.Locale.Category;

import edu.eci.cvds.ecibook.model.BookSaleException;
import edu.eci.cvds.ecibook.model.DiscountCategory;

/**
 * Subscription Service class in charge of calculating the monthly subscription.
 */
public class BookSaleService {

	/**
	 * Calculate the cost of a book, depending on the discount category and book category.
	 *
	 * @param bookCategory      The book category
	 * @param discountCategory  The discount category
	 * @return The amount to be charged to the client
	 */
	public BigDecimal calculateCost(final Integer bookCategory, final DiscountCategory discountCategory) throws BookSaleException {

		BigDecimal porcentaje, total;

		if (bookCategory < 0 || bookCategory > 30) {
			throw new BookSaleException(BookSaleException.INVALID);			
		}

		else if(discountCategory != DiscountCategory.EMPLOYEE && discountCategory != DiscountCategory.STUDENT &&  discountCategory != DiscountCategory.OTHER ) {
			throw new BookSaleException(BookSaleException.INVALID_CAT);
		}

		BigDecimal descuento = null;
		switch(discountCategory) {
			case EMPLOYEE:
				descuento = new BigDecimal(0.10);
				break;
			case STUDENT:
				descuento = new BigDecimal(0.20);
				break;
			case OTHER:
				descuento = new BigDecimal(0);
				break;
			}


		BigDecimal valor = null;
		if( bookCategory >= 1 && bookCategory <= 10 ) {
			valor = new BigDecimal(25000);
		}
		else if( bookCategory >= 11 && bookCategory <= 20 ) {
			valor = new BigDecimal(50000);
		}
		else if ( bookCategory >= 21 && bookCategory <= 30 ) {
			valor = new BigDecimal(100000);
		}
		
		porcentaje = descuento.multiply(valor);
		total = valor.subtract(porcentaje);
		return total;
		}
	/*
	 * Tip: Siempre qe se desee realizar cálculos matemáticos de alta precisión (por ejemplo para temas de dinero)
	 * es mucho más confiable usar el tipo de dato BigDecimal, pues soporta un alto rango de número, decimales y
	 * tiene mayor precisión en los cálculos. <br />
	 * Ejemplos básicos de operaciones con BigDecimal, teniendo las variables `bd1` y `bd2`:
	 * <ul>
	 * <li>Creación: <code>BigDecimal nuevo = new BigDecimal(10);</code></li>
	 * <li>Sumas: <code>BigDecimal suma = bd1.add(bd2);</code></li>
	 * <li>Restas: <code>BigDecimal resta = bd1.subtract(bd2);</code></li>
	 * <li>Multiplicación: <code>BigDecimal multiplicación = bd1.multiply(bd2);</code></li>
	 * <li>División: <code>BigDecimal division = bd1.divide(bd2);</code></li>
	 * </ul>
	 */
}
