/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.negocio.example2;

import edu.co.sena.onlineshop.negocio.example.*;
import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.onlineshop.integracion.dao.ProductoDao;
import edu.co.sena.onlineshop.integracion.dto.Producto;
import edu.co.sena.onlineshop.integracion.exceptions.ProductoDaoException;
import edu.co.sena.onlineshop.integracion.factory.ProductoDaoFactory;

public class ProductoDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findByCategoria(0);
		// findByCatalogo(0);
		// findWhereIdProductoEquals("");
		// findWhereNombreProductoEquals("");
		// findWherePrecioEquals(0);
		// findWhereImagenEquals(null);
		// findWhereCantidadEquals(0);
		// findWhereActivoEquals(0);
		// findWhereFechaCreacionEquals(null);
		// findWhereUsuarioCreacionEquals("");
		// findWhereFechaUltimaModificacionEquals(null);
		// findWhereUsuarioUltimaModificacionEquals("");
		// findWhereCategoriaIdCategoriaEquals(0);
		// findWhereCatalogoIdCatalogoEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCategoria'
	 * 
	 * @param categoriaIdCategoria
	 */
	public static void findByCategoria(int categoriaIdCategoria)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findByCategoria(categoriaIdCategoria);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCatalogo'
	 * 
	 * @param catalogoIdCatalogo
	 */
	public static void findByCatalogo(int catalogoIdCatalogo)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findByCatalogo(catalogoIdCatalogo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdProductoEquals'
	 * 
	 * @param idProducto
	 */
	public static void findWhereIdProductoEquals(String idProducto)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereIdProductoEquals(idProducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNombreProductoEquals'
	 * 
	 * @param nombreProducto
	 */
	public static void findWhereNombreProductoEquals(String nombreProducto)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereNombreProductoEquals(nombreProducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePrecioEquals'
	 * 
	 * @param precio
	 */
	public static void findWherePrecioEquals(double precio)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWherePrecioEquals(precio);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereImagenEquals'
	 * 
	 * @param imagen
	 */
	public static void findWhereImagenEquals(byte[] imagen)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereImagenEquals(imagen);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCantidadEquals'
	 * 
	 * @param cantidad
	 */
	public static void findWhereCantidadEquals(float cantidad)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereCantidadEquals(cantidad);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereActivoEquals'
	 * 
	 * @param activo
	 */
	public static void findWhereActivoEquals(short activo)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereActivoEquals(activo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFechaCreacionEquals'
	 * 
	 * @param fechaCreacion
	 */
	public static void findWhereFechaCreacionEquals(Date fechaCreacion)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereFechaCreacionEquals(fechaCreacion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereUsuarioCreacionEquals'
	 * 
	 * @param usuarioCreacion
	 */
	public static void findWhereUsuarioCreacionEquals(String usuarioCreacion)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereUsuarioCreacionEquals(usuarioCreacion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFechaUltimaModificacionEquals'
	 * 
	 * @param fechaUltimaModificacion
	 */
	public static void findWhereFechaUltimaModificacionEquals(Date fechaUltimaModificacion)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereFechaUltimaModificacionEquals(fechaUltimaModificacion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereUsuarioUltimaModificacionEquals'
	 * 
	 * @param usuarioUltimaModificacion
	 */
	public static void findWhereUsuarioUltimaModificacionEquals(String usuarioUltimaModificacion)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereUsuarioUltimaModificacionEquals(usuarioUltimaModificacion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCategoriaIdCategoriaEquals'
	 * 
	 * @param categoriaIdCategoria
	 */
	public static void findWhereCategoriaIdCategoriaEquals(int categoriaIdCategoria)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereCategoriaIdCategoriaEquals(categoriaIdCategoria);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCatalogoIdCatalogoEquals'
	 * 
	 * @param catalogoIdCatalogo
	 */
	public static void findWhereCatalogoIdCatalogoEquals(int catalogoIdCatalogo)
	{
		try {
			ProductoDao _dao = getProductoDao();
			Producto _result[] = _dao.findWhereCatalogoIdCatalogoEquals(catalogoIdCatalogo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getProductoDao'
	 * 
	 * @return ProductoDao
	 */
	public static ProductoDao getProductoDao()
	{
		return ProductoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Producto dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdProducto() );
		buf.append( ", " );
		buf.append( dto.getNombreProducto() );
		buf.append( ", " );
		buf.append( dto.getPrecio() );
		buf.append( ", " );
		buf.append( dto.getImagen() );
		buf.append( ", " );
		buf.append( dto.getCantidad() );
		buf.append( ", " );
		buf.append( dto.getActivo() );
		buf.append( ", " );
		buf.append( dto.getFechaCreacion() );
		buf.append( ", " );
		buf.append( dto.getUsuarioCreacion() );
		buf.append( ", " );
		buf.append( dto.getFechaUltimaModificacion() );
		buf.append( ", " );
		buf.append( dto.getUsuarioUltimaModificacion() );
		buf.append( ", " );
		buf.append( dto.getCategoriaIdCategoria() );
		buf.append( ", " );
		buf.append( dto.getCatalogoIdCatalogo() );
		System.out.println( buf.toString() );
	}

}
