/*
 *  �÷��� �����ӿ�ũ (Collection Framework)
 *  
 *  - �迭 ������
 *  		: 1) ������ �� �ִ� ��ü���� �迭�� ������ �� ������.
 *  			��Ư�� �ټ��� ��ü�� �����ϱ⿡�� ������ ��.
 *  		  2) ��ü �������� �� �ش� �ε����� ��� ��.
 *  			��ü�����Ϸ��� ��� ����ִ��� Ȯ���ؾ���.
 *  
 *  - �÷��� �����ӿ�ũ
 *  		: ��ü���� ȿ�������� �߰�, ����, �˻��� �� �ֵ��� �����Ǵ� �÷��� ���̺귯��.
 * 			�������̽��� ���ؼ� ����ȭ�� ������� �پ��� �÷��� Ŭ���� �̿�.
 * 			- �÷����� ���׸�(Generic) ������� ������.
 * 			- ���׸� : Ư�� Ÿ�Ը� �ٷ��� �ʰ�, ���� ������ Ÿ������ ������ �� �ֵ��� 
 * 						Ŭ������ �޼ҵ带 �Ϲ�ȭ��Ű�� ���.
 * 						- <E>, <K>, <V> : Ÿ�� �Ű� ���� (���Ÿ���� �Ϲ�ȭ�� Ÿ��)
 * 						- ��) ���׸� ���� : Vector<E>
 * 								E�� Ư�� Ÿ������ ��üȭ.
 * 								������ �ٷ�� ���� Vector<Integer>
 * 								���ڿ��� �ٷ�� ���� Vector<String>
 * 								
 * 	- �÷��� Ŭ����
 * 			List	Set		Map	==> �������̽�
 * 			List => ArrayList, Vector, LinkedList, Queue, Stack
 * 					 =========  ======
 * 				= ������ �����ϰ� �ִ�. (�� �����͸��� index�� ������ ����)
 * 				= �ߺ��� ����Ѵ�.
 * 				= �����ͺ��̽� ���α׷�.
 * 
 * 						
 * 			Set => TreeSet, HashSet
 * 				= ������ ����.
 * 				= �ߺ�������� �ʴ´�.
 * 				= XML ���α׷�.
 * 
 * 			Map => Hashtable, HashMap
 * 				= ������ �ִ�.
 * 				= �ߺ����(Value), �ߺ�������� ����(Key)
 * 				= Key, Value�� ���ÿ� ����
 * 				= Ŭ���� ����, �����ȣ... (Spring)
 * 				= ������(MapReduce)
 * 				 �� ==>
 * 					a.jsp ==> b.jsp : if, pwd
 * 					 b.jsp?id=aaa&pwd=1234
 * 					�Ϲ� ���α׷� => �����͸� ������ �� �޼ҵ��� �Ű�����
 * 	
 * 	- ArrayLIst => Ŭ������ ������ ����(����� ����, ���̺귯��)
 * 		= add(��ü��) ����(�ڿ� �ٴ´�)
 * 			add(index, ��ü��) (���ϴ� ��ġ�� ����)
 * 			INSERT INTO ~~
 * 				insert()
 * 		= remove(index) => ������ ����
 * 			DELETE ~ SET
 * 			 	delete()
 * 		= set(index, ��ü��) => ������ ����
 * 			UPDATE ~ SET
 * 				update()
 * 		= get(index)	=> ������ �˻�
 * 			SELECT ~ FROM
 * 				find()
 * 		
 * 		= size() => ���� ����
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
		list.add("�̼���");	// String	==> 3
		list.add(1, "A");	//			==> 1
		System.out.println("���� ���� : " + list.size());
		
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
		list2.add("�̹��");
		list2.add("�Ϸ�");
		list2.add("�ξ�");
		list2.add("�ֿ�");
		list2.add("������");
		
		for(int i=0;i<list.size();i++){
			String name = list2.get(i);
			System.out.println("index : " + (i) + " => " + name);
		}
		
		
		// for~each (�迭, �÷���)
		for(String name : list2){
			System.out.print(name + " ");
		}
		
	}
}
