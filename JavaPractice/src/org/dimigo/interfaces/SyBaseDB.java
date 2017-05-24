/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 *  org.dimigo.interfaces
 *    |_SyBaseDB
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 24. 
 * </pre>
 *   
 * @author : add74
 * @version : 1.0
 */
public class SyBaseDB implements IDBManager{

	public void insert(){
		System.out.println("Sybase DB 저장");
	};
	public void search(){
		System.out.println("Sybase DB 조회");
	};
	public void update(){
		System.out.println("Sybase DB 변경");
	};
	public void delete(){
		System.out.println("Sybase DB 삭제");
	};
}
