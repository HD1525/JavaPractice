/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 *  org.dimigo.basic
 *    |_Operator
 * 
 * 1. 개요 : 2. 디미베네
 * 2. 작성일 : 2017. 3. 14. 
 * </pre>
 *   
 * @author : add74
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int money = 1700000;
		int man = 3;
		int str = 1500;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " +String.format("%,d",money) + "원");
		System.out.printf("점포 내 직원 수 : %d명\n",man);
		System.out.println("점포 수 : "+String.format("%,d",str) +"개");
		System.out.println();
		System.out.println();
		System.out.println("연간 인건비 : "+ String.format("%,d",(long)str*man*money*12) +"원");
	}

}
