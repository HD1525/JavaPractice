/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *  org.dimigo.inheritance
 *    |_SmartPhoneTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 12. 
 * </pre>
 *   
 * @author : add74
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SmartPhone g = new Galaxy("갤럭시 S8","삼성",800000);
		SmartPhone i = new IPhone("iPhone 7","애플",900000);
		System.out.println(i);
		i.turnOn();
		i.pay();
		SmartPhone.useSpecialFunction(i);
		i.turnOff();
		System.out.println();
		System.out.println(g);
		g.turnOn();
		g.pay();
		SmartPhone.useSpecialFunction(g);
		g.turnOff();
		
	}

}
