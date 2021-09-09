package edu.eci.cvds.ecibook.model;

public class BookSaleException extends Exception {
	public static final String INVALID = "El rango no puede ser negativo ni mayor a 30";
    public static final String INVALID_CAT = "La categoria no es valida";
	public BookSaleException(String o) {
		super(o);
	}
}