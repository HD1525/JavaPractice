/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *    |_SnackTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6. 
 * </pre>
 *   
 * @author : add74
 * @version : 1.0
 */
public class SnackTest {
	
	public static void main(String[] args) {
		int calc = 0;
		Snack[] snackArr = {
			new Snack("새우깡","농심",1100,2),	
			new Snack("콘칲","크라운",1200,1),	
			new Snack("허니버터칩","해태",1500,4)
		};
		for(int i=0;i<snackArr.length;i++){
			System.out.println(snackArr[i].toString());
			System.out.println();
			calc+=snackArr[i].calcPrice(snackArr[i].getPrice(),snackArr[i].getNumber());
			}
			System.out.println("총 구매 금액 : " + String.format("%,d", calc) + "원");
			
		
	}
	
	
	
	
}
