package ch05;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class q13 {

	public static void main(String args[]) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String char[] 을 로 변환
			// question 을 리스트로 만듦 
				int s = (int)(Math.random() * question.length);
				char[] temp = new char[question.length-1];
				for (int j = 0; j < s; j++) {
					temp[j] = question[j];
				}
				for (int j = s; j < temp.length; j++) {
					
				}
			
			
			
			
		}
	} // main의 끝
}
// class
