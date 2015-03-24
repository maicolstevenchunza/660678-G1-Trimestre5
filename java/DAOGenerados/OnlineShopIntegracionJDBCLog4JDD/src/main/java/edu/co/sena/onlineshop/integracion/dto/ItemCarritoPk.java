/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.integracion.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the item_carrito table.
 */
public class ItemCarritoPk implements Serializable
{
	protected String carritoComprasIdCarrito;

	protected String productoIdProducto;

	/** 
	 * Sets the value of carritoComprasIdCarrito
	 */
	public void setCarritoComprasIdCarrito(String carritoComprasIdCarrito)
	{
		this.carritoComprasIdCarrito = carritoComprasIdCarrito;
	}

	/** 
	 * Gets the value of carritoComprasIdCarrito
	 */
	public String getCarritoComprasIdCarrito()
	{
		return carritoComprasIdCarrito;
	}

	/** 
	 * Sets the value of productoIdProducto
	 */
	public void setProductoIdProducto(String productoIdProducto)
	{
		this.productoIdProducto = productoIdProducto;
	}

	/** 
	 * Gets the value of productoIdProducto
	 */
	public String getProductoIdProducto()
	{
		return productoIdProducto;
	}

	/**
	 * Method 'ItemCarritoPk'
	 * 
	 */
	public ItemCarritoPk()
	{
	}

	/**
	 * Method 'ItemCarritoPk'
	 * 
	 * @param carritoComprasIdCarrito
	 * @param productoIdProducto
	 */
	public ItemCarritoPk(final String carritoComprasIdCarrito, final String productoIdProducto)
	{
		this.carritoComprasIdCarrito = carritoComprasIdCarrito;
		this.productoIdProducto = productoIdProducto;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof ItemCarritoPk)) {
			return false;
		}
		
		final ItemCarritoPk _cast = (ItemCarritoPk) _other;
		if (carritoComprasIdCarrito == null ? _cast.carritoComprasIdCarrito != carritoComprasIdCarrito : !carritoComprasIdCarrito.equals( _cast.carritoComprasIdCarrito )) {
			return false;
		}
		
		if (productoIdProducto == null ? _cast.productoIdProducto != productoIdProducto : !productoIdProducto.equals( _cast.productoIdProducto )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (carritoComprasIdCarrito != null) {
			_hashCode = 29 * _hashCode + carritoComprasIdCarrito.hashCode();
		}
		
		if (productoIdProducto != null) {
			_hashCode = 29 * _hashCode + productoIdProducto.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.onlineshop.integracion.dto.ItemCarritoPk: " );
		ret.append( "carritoComprasIdCarrito=" + carritoComprasIdCarrito );
		ret.append( ", productoIdProducto=" + productoIdProducto );
		return ret.toString();
	}

}
