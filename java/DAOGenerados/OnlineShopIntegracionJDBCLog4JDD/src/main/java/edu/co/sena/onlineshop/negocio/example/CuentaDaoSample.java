/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.negocio.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.onlineshop.integracion.dao.CuentaDao;
import edu.co.sena.onlineshop.integracion.dto.Cuenta;
import edu.co.sena.onlineshop.integracion.exceptions.CuentaDaoException;
import edu.co.sena.onlineshop.integracion.factory.CuentaDaoFactory;

public class CuentaDaoSample
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
		// findByUsuario("");
		// findWherePrimerNombreEquals("");
		// findWhereSegundoNombreEquals("");
		// findWherePrimerApellidoEquals("");
		// findWhereSegundoApellidoEquals("");
		// findWhereTipoDocumentoEquals("");
		// findWhereNumeroDocumentoEquals("");
		// findWherePasswordEquals("");
		// findWhereCorreoElectronicoEquals("");
		// findWhereUsuarioEquals("");
		// findWhereUsuarioIdusuarioEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByUsuario'
	 * 
	 * @param usuarioIdusuario
	 */
	public static void findByUsuario(String usuarioIdusuario)
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findByUsuario(usuarioIdusuario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePrimerNombreEquals'
	 * 
	 * @param primerNombre
	 */
	public static void findWherePrimerNombreEquals(String primerNombre)
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findWherePrimerNombreEquals(primerNombre);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSegundoNombreEquals'
	 * 
	 * @param segundoNombre
	 */
	public static void findWhereSegundoNombreEquals(String segundoNombre)
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findWhereSegundoNombreEquals(segundoNombre);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePrimerApellidoEquals'
	 * 
	 * @param primerApellido
	 */
	public static void findWherePrimerApellidoEquals(String primerApellido)
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findWherePrimerApellidoEquals(primerApellido);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSegundoApellidoEquals'
	 * 
	 * @param segundoApellido
	 */
	public static void findWhereSegundoApellidoEquals(String segundoApellido)
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findWhereSegundoApellidoEquals(segundoApellido);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTipoDocumentoEquals'
	 * 
	 * @param tipoDocumento
	 */
	public static void findWhereTipoDocumentoEquals(String tipoDocumento)
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findWhereTipoDocumentoEquals(tipoDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNumeroDocumentoEquals'
	 * 
	 * @param numeroDocumento
	 */
	public static void findWhereNumeroDocumentoEquals(String numeroDocumento)
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findWhereNumeroDocumentoEquals(numeroDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePasswordEquals'
	 * 
	 * @param password
	 */
	public static void findWherePasswordEquals(String password)
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findWherePasswordEquals(password);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCorreoElectronicoEquals'
	 * 
	 * @param correoElectronico
	 */
	public static void findWhereCorreoElectronicoEquals(String correoElectronico)
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findWhereCorreoElectronicoEquals(correoElectronico);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereUsuarioEquals'
	 * 
	 * @param usuario
	 */
	public static void findWhereUsuarioEquals(String usuario)
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findWhereUsuarioEquals(usuario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereUsuarioIdusuarioEquals'
	 * 
	 * @param usuarioIdusuario
	 */
	public static void findWhereUsuarioIdusuarioEquals(String usuarioIdusuario)
	{
		try {
			CuentaDao _dao = getCuentaDao();
			Cuenta _result[] = _dao.findWhereUsuarioIdusuarioEquals(usuarioIdusuario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getCuentaDao'
	 * 
	 * @return CuentaDao
	 */
	public static CuentaDao getCuentaDao()
	{
		return CuentaDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Cuenta dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getPrimerNombre() );
		buf.append( ", " );
		buf.append( dto.getSegundoNombre() );
		buf.append( ", " );
		buf.append( dto.getPrimerApellido() );
		buf.append( ", " );
		buf.append( dto.getSegundoApellido() );
		buf.append( ", " );
		buf.append( dto.getTipoDocumento() );
		buf.append( ", " );
		buf.append( dto.getNumeroDocumento() );
		buf.append( ", " );
		buf.append( dto.getPassword() );
		buf.append( ", " );
		buf.append( dto.getCorreoElectronico() );
		buf.append( ", " );
		buf.append( dto.getUsuario() );
		buf.append( ", " );
		buf.append( dto.getUsuarioIdusuario() );
		System.out.println( buf.toString() );
	}

}
