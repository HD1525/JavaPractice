/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 *  org.dimigo.basic
 *    |_Loop
 * 
 * 1. 개요 : 3. 초간단 게임 프로그램
 * 2. 작성일 : 2017. 3. 16. 
 * </pre>
 *   
 * @author : add74
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] crt = {"마법사","영주","기사","농민"};
		Scanner scanner = new Scanner(System.in);
		int choice,atk = 100;
		do {
			System.out.println("-------------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("-------------------");
			System.out.printf("메뉴 입력 => ");

			choice = scanner.nextInt();
			switch(choice){
			case 1 : 
				atk=atk+10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+atk);
				break;
			case 2 : 
				atk=atk-10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+atk);
				break;
			case 3 : 
				Random random = new Random();
				int a = random.nextInt(3);
				System.out.println(crt[a]+"(으)로 설정되었습니다.");
				break;
			case 9 : 
				System.out.println("이제 공부하세요!");
				break;
			default : 
				System.out.println("없는 메뉴입니다!!");
				break;
			}
		} while (choice!=9);
		scanner.close();
	}

}
