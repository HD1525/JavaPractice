/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 *  org.dimigo.oop
 *    |_Question
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31. 
 * </pre>
 *   
 * @author : add74
 * @version : 1.0
 */
public class Question {
	
	public static void main(String[] args) {
		String[] question = {"가수","배우","과목"};
		String[] answers = {"빅뱅","공유","응용프로그래밍"};
		Scanner scanner = new Scanner(System. in);
		
		
		for(int i=0;i<3;i++){
		System.out.println("가장 좋아하는 "+question[i]+"는?");
		String answer = scanner.nextLine();
		if(answer.equals(answers[i])) System.out.println("정답입니다!"); 
		else System.out.println("틀렸습니다!");
		}
		System.out.println("<< 결과 출력 >>");
		
		for(int i=0;i<3;i++){
			StringBuilder sb = new StringBuilder("");
			sb.append(answers[i]);
			System.out.println("가장 좋아하는 "+question[i]+"는? "+sb+"입니다.");
		}
	}

}
