package com.example.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] arg){
		simpleString();
		simpleNumber();
		simpleStringNumber();
		reversSorting();
		
	}
	public static void simpleString(){
		// 문자열 배열 정렬 (가나다 순으로 소팅)
	    String s[] = {  "맹구","배용준","땡칠이", "장동건","강수정","송창식","황당해","고은아"};

	    Arrays.sort(s);
	    System.out.println(Arrays.toString(s));
	}
	public static void simpleNumber(){
	    // 숫자 배열 정렬
	    double num[] = {-1000,0.07890264912715708,0.2,-0.18441624291164838,0,123,-0.1,-0.1,1000,0.4999};

	    Arrays.sort(num);
	    System.out.println(Arrays.toString(num));
	}
	public static void simpleStringNumber(){
		String[] s = { "bbb", "AAA", "DDD", "CCC", "aaa" };
	    // 대소문자 구분하여 정렬
	    Arrays.sort(s);
	    System.out.println(Arrays.toString(s));
	    // 대소문자 구분 없이 정렬
	    Arrays.sort(s, String.CASE_INSENSITIVE_ORDER);
	    System.out.println(Arrays.toString(s));
	}
	public static void reversSorting(){
		String[] a = { "bbb", "AAA", "DDD", "똠방각하", "CCC", "aaa" };
	    Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);

	    // 배열을 리스트로 변환
	    List<String> list = Arrays.asList(a);

	    // 리스트 뒤집어 주기
	    Collections.reverse(list);

	    // 리스트를 배열로 다시 변환
	    a = list.toArray(new String[list.size()]);

	    // 순서 뒤집어진 배열을 문자열로 변환 후 출력
	    String s = Arrays.toString(a);
	    System.out.println(s);
	}
}
