/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 *  org.dimigo.interfaces
 *    |_IDBManager
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 24. 
 * </pre>
 *   
 * @author : add74
 * @version : 1.0
 */
public interface IDBManager {

	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	public void insert();
	public void search();
	public void update();
	public void delete();
	public static IDBManager getDBObject(String database){
		if(database != null){
		if(database.equals("ORACLE")) return new OracleDB();
		else if(database.equals("SYBASE")) return new SyBaseDB();
		}
		return null;
	}
}
