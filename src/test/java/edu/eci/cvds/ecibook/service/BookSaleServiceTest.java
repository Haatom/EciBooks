package edu.eci.cvds.ecibook.service;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link BookSaleService}
 */
public class BookSaleServiceTest {

	/**
	 * The class under test.
	 */
	private BookSaleService service = new BookSaleService();

	@Test
	public void test() {

		Assert.assertEquals(BigDecimal.ZERO,  service.calculateCost(null, null));
	}
}
