
package org.dimigo.basic;

/**
 * <pre>
 *  org.dimigo.basic
 *    |_PrimitiveDataType
 * 
 * 1. 개요 : 1. 아이유 프로필
 * 2. 작성일 : 
 * </pre>
 *   
 * @author : add74
 * @version : 1.0
 */
public class PrimitiveDataType {

	
	public static void main(String[] args) {
		 System.out.println("<<아이유 프로필>>");
		   String name = "아이유";
		   boolean isMale = false;
		   double height = 161.8;
		   float weight = 44.3f;
		   char bloodType = 'A';
		   System.out.println("이름 : " + name);
		   
		   if(isMale){
		      System.out.println("성별 : 남자");
		   }
		   else{
		      System.out.println("성별 : 여자");
		   }
		   int age = 25;
		   System.out.println("나이 : " + age + "세");
		   System.out.println("키 : " + height + "cm");
		   System.out.println("몸무게 : " + weight + "kg");
		   System.out.println("혈액형 : " + bloodType + "형");
	}

}
