/*
 *  컬렉션 프레임워크 (Collection Framework)
 *  
 *  - 배열 문제점
 *  		: 1) 저장할 수 있는 객체수가 배열을 생성할 때 결정됨.
 *  			불특정 다수의 개체를 저장하기에는 문제가 됨.
 *  		  2) 객체 삭제했을 때 해당 인덱스가 비게 됨.
 *  			객체저장하려면 어디가 비어있는지 확인해야함.
 *  
 *  - 컬렉션 프레임워크
 *  		: 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 제공되는 컬렉션 라이브러리.
 * 			인터페이스를 통해서 정형화된 방법으로 다양한 컬렉션 클래스 이용.
 * 			- 컬렉션은 제네릭(Generic) 기법으로 구현됨.
 * 			- 제네릭 : 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 
 * 						클래스나 메소드를 일반화시키는 기법.
 * 						- <E>, <K>, <V> : 타입 매개 변수 (요소타입을 일반화한 타입)
 * 						- 예) 제네릭 벡터 : Vector<E>
 * 								E에 특정 타입으로 구체화.
 * 								정수만 다루는 벡터 Vector<Integer>
 * 								문자열만 다루는 벡터 Vector<String>
 * 								
 * 	- 컬렉션 클래스
 * 			List	Set		Map	==> 인터페이스
 * 			List => ArrayList, Vector, LinkedList, Queue, Stack
 * 					 =========  ======
 * 				= 순서를 유지하고 있다. (각 데이터마다 index를 가지고 있음)
 * 				= 중복을 허용한다.
 * 				= 데이터베이스 프로그램.
 * 
 * 						
 * 			Set => TreeSet, HashSet
 * 				= 순서가 없다.
 * 				= 중복허용하지 않는다.
 * 				= XML 프로그램.
 * 
 * 			Map => Hashtable, HashMap
 * 				= 순서가 있다.
 * 				= 중복허용(Value), 중복허용하지 않음(Key)
 * 				= Key, Value를 동시에 저장
 * 				= 클래스 관리, 우편번호... (Spring)
 * 				= 빅데이터(MapReduce)
 * 				 웹 ==>
 * 					a.jsp ==> b.jsp : if, pwd
 * 					 b.jsp?id=aaa&pwd=1234
 * 					일반 프로그래 => 데이터를 전송할 때 메소드의 매개변수
 * 	
 * 	- ArrayLIst => 클래스만 저장이 가능(사용자 정의, 라이브러리)
 * 		= add(객체값) 저장(뒤에 붙는다)
 * 			add(index, 객체명) (원하는 위치에 저장)
 * 			INSERT INTO ~~
 * 				insert()
 * 		= remove(index) => 데이터 삭제
 * 			DELETE ~ SET
 * 			 	delete()
 * 		= set(index, 객체명) => 데이터 수정
 * 			UPDATE ~ SET
 * 				update()
 * 		= get(index)	=> 데이터 검색
 * 			SELECT ~ FROM
 * 				find()
 * 		
 * 		= size() => 저장 갯수
 * 			SELECT COUNT(*) FROM ~
 * 				count()
 * 
 * 		A a = new A();
 * 		add(a)
 * 		======
 * 		a =========>
 * 		======
 * 		O
 * 		
 * 		A b = new 
 * 		add(b)
 * 		====	====
 * 		a		b
 * 		====	====
 * 
 * 		A c = new A();
 * 		add(1, c)
 * 		==== ====== =====
 * 		a	 b		C
 * 		=========== ====
 */

import java.util.*;

public class MainClass {
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		// Integer i = 10;
		list.add(10);		// Integer	==> 0
		list.add(15.5);	// Double		==> 2
		list.add("이성계");	// String	==> 3
		list.add(1, "A");	//			==> 1
		System.out.println("저장 갯수 : " + list.size());
		
		int a = (int)list.get(0);
		double b = (double)list.get(2);
		String c = (String) list.get(3);
		String d = (String)list.get(1);
			
		System.out.println("Index : 0 =>" + a);
		System.out.println("Index : 0 =>" + b);
		System.out.println("Index : 0 =>" + c);
		System.out.println("Index : 0 =>" + d);

		ArrayList<String> list2 = new ArrayList<String>();
		// Object => String
		list2.add("이방원");
		list2.add("하륜");
		list2.add("민씨");
		list2.add("최영");
		list2.add("이인임");
		
		for(int i=0;i<list.size();i++){
			String name = list2.get(i);
			System.out.println("index : " + (i) + " => " + name);
		}
		
		
		// for~each (배열, 컬렉션)
		for(String name : list2){
			System.out.print(name + " ");
		}
		
	}
}
