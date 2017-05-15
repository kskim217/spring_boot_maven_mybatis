package com.example.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users = getCreateUsers();
		System.out.println("===== 정렬 하기전 =====");
		for (User temp : users) {
			System.out.println(temp);
		}

		Collections.sort(users, new NameCompare(true));
		System.out.printf("\n\n===== 오름 차순 정렬 =====\n");
		for (User temp : users) {
			System.out.println(temp);
		}

		Collections.sort(users, new NameCompare(false));
		System.out.printf("\n\n===== 내림 차순 정렬 =====\n");
		for (User temp : users) {
			System.out.println(temp);
		}
		Collections.sort(users, new NoCompare(true));
		System.out.printf("\n\n===== 숫자  내림 차순 정렬 =====\n");
		for (User temp : users) {
			System.out.println(temp);
		}
		Collections.sort(users, new NoCompare(false));
		System.out.printf("\n\n===== 숫자  오름 차순 정렬 =====\n");
		for (User temp : users) {
			System.out.println(temp);
		}
	}

	/**
	 * User Data Create
	 * 
	 * @return
	 */
	private static List<User> getCreateUsers() {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();

		 User user = new User();
		 user.setName("고철수");
		 user.setAddress("경기도 성남시 분당구");
		 user.setPhone("010-1234-0192");
		 user.setNo(1);
		 users.add(user);
 
 
		 user = new User();
		 user.setName("박영희");
		 user.setAddress("부산 해운대");
		 user.setPhone("010-4234-0192");
		 user.setNo(2);
		 users.add(user);
 
 
		 user = new User();
		 user.setName("감수왕");
		 user.setAddress("충북 제천");
		 user.setPhone("010-7234-0192");
		 user.setNo(3);
		 users.add(user);
 
 
		 user = new User();
		 user.setName("이사람");
		 user.setAddress("강원도 영울");
		 user.setPhone("010-0234-0192");
		 user.setNo(4);
		 users.add(user);
		
		 return users;
	}
	
	static class NameCompare implements Comparator<User> {

		private boolean asc = true;
		public NameCompare(boolean asc){
			this.asc = asc;
		}
		@Override
		public int compare(User arg0, User arg1) {
			if(asc){
				return arg0.getName().compareTo(arg1.getName());
			}else{
				return arg1.getName().compareTo(arg0.getName());
			}
		}
	}

	/**
	 * 이름 내림차순
	 * 
	 * @author falbb
	 *
	 */
	static class NoCompare implements Comparator<User> {

		private boolean asc = true;
		public NoCompare(boolean asc){
			this.asc = asc;
		}
		/**
		 * 내림차순(DESC)
		 */
		@Override
		public int compare(User arg0, User arg1) {
			if(this.asc){
				return arg0.getNo() < arg1.getNo() ? -1 : arg0.getNo() > arg1.getNo() ? 1 : 0;
			}else{
				return arg0.getNo() > arg1.getNo() ? -1 : arg0.getNo() < arg1.getNo() ? 1 : 0;
			}
		}

	}

//	/**
//	 * No 오름차순
//	 * 
//	 * @author falbb
//	 *
//	 */
//	static class NoAscCompare implements Comparator<User> {
//
//		/**
//		 * 오름차순(ASC)
//		 */
//		@Override
//		public int compare(User arg0, User arg1) {
//			// TODO Auto-generated method stub
//			return arg0.getNo() < arg1.getNo() ? -1 : arg0.getNo() > arg1.getNo() ? 1 : 0;
//		}
//	}
//
//	/**
//	 * No 내림차순
//	 * 
//	 * @author falbb
//	 *
//	 */
//	static class NoDescCompare implements Comparator<User> {
//
//		/**
//		 * 내림차순(DESC)
//		 */
//		@Override
//		public int compare(User arg0, User arg1) {
//			// TODO Auto-generated method stub
//			return arg0.getNo() > arg1.getNo() ? -1 : arg0.getNo() < arg1.getNo() ? 1 : 0;
//		}
//
//	}

}
