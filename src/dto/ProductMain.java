package dto;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productId = "p1234";
		String pname = "아이폰12";
		int unitPrice = 1200000;
		String description = "4.7-inch, 1334x750 Renina HD display, 8-megapixes iSight Camera";
		String manufacturer = "애플";
		String category = "휴대폰";
		long unitsInStock = 100;
		String condition = "신상품";
		
		System.out.println(productId);
		System.out.println(pname);
		System.out.println(unitPrice);
		System.out.println(description);
		System.out.println(manufacturer);
		System.out.println(category);
		System.out.println(unitsInStock);
		System.out.println(condition);
		
		Product p1 = new Product();
		p1.setProductId("p001");
		p1.setPname("아이폰12Max");
		
		Product p2 = new Product();
		p2.setProductId("p002");
		p2.setPname("겔럭시20");
		
		System.out.println("----- ArrayList -----");
		
		
//		Java에서 데이터 처리를 쉽게 하기 위해서 미리 만들어 놓은 자료 구조를 컬렉션 프레임워크라고 함
//		컬렉션은 크게 2가지로 나누어짐 (Collection, Map)
//		Collection은 자바스크립트의 배열과 비슷한 방식 (ArrayList 를 가장 많이 사용)
//		Map은 자바스크립트의 object 와 비슷한 방식 (HashMap 을 가장 많이 사용)
		
//		ArrayList : 기존의 Array(배열)과 비슷하지만 동적으로 크기를 변경할 수 있는 데이터 타입
//		add(데이터) : ArrayList 객체에 데이터 저장
//		remove(index) : ArrayList 객체에서 지정한 index의 데이터 삭제
//		set(index, 데이터) : ArrayList 객체에서 지정한 index의 데이터를 수정
//		get(index) : ArrayList 객체에서 지정한 index의 데이터를 가져오기
//		size() : ArrayList 객체에 저장된 데이터 갯수 반환
//		clear() : ArrayList 객체에 저장된 모든 데이터 삭제
		
		ArrayList<String> listFruit = new ArrayList<String>();
		String[] arrFruit = new String[5];
		
		System.out.println("List를 사용한 과일목록의 크기 : " + listFruit.size());
		System.out.println("배열을 사용한 과일목록의 크기 : " + arrFruit.length);
		
		System.out.println("---배열과 리스트에 데이터 입력---");
		listFruit.add("수박");
		listFruit.add("한라봉");
		listFruit.add("딸기");
		
		arrFruit[0] = "수박";
		arrFruit[1] = "한라봉";
		arrFruit[2] = "딸기";
		
		System.out.println("List를 사용한 과일목록의 크기 : " + listFruit.size());
		System.out.println("배열을 사용한 과일목록의 크기 : " + arrFruit.length);
		
		System.out.println("--- 배열과 리스트에서 데이터 가져오기 ---");
		
		for (int i = 0; i < listFruit.size(); i++) {
			System.out.println("리스트 listFruit " + i + "번째 데이터 : " + listFruit.get(i));
		}
		
		for (int i = 0; i < arrFruit.length; i++) {
			System.out.println("배열 arrFruit " + i + "번째 데이터 : " + arrFruit[i]);
		}
		
		System.out.println("--- 배열과 리스트에서 데이터 수정 ---");
		listFruit.set(1, "천리향");
		arrFruit[1] = "천리향";
		
		for (int i = 0; i < listFruit.size(); i++) {
			System.out.println("리스트 listFruit " + i + "번째 데이터 : " + listFruit.get(i));
		}
		
		for (int i = 0; i < arrFruit.length; i++) {
			System.out.println("배열 arrFruit " + i + "번째 데이터 : " + arrFruit[i]);
		}
		
		System.out.println("--- 배열과 리스트에서 데이터 삭제 ---");
		listFruit.remove(2); // list는 해당 index를 완전 삭제
		arrFruit[2] = null; // 배열은 크기 변경이 불가능 하므로 해당 index의 데이터만 삭제
		
		for (int i = 0; i < listFruit.size(); i++) {
			System.out.println("리스트 listFruit " + i + "번째 데이터 : " + listFruit.get(i));
		}
		
		for (int i = 0; i < arrFruit.length; i++) {
			System.out.println("배열 arrFruit " + i + "번째 데이터 : " + arrFruit[i]);
		}
	}

}












