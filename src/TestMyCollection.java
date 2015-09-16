

public class TestMyCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			MyArrayList mas = new MyArrayList();
			Employee e = new Employee("李飞",21,10000.00);
			Employee e1 = new Employee("李飞1",21,10000.00);
			Employee e2 = new Employee("李飞2",21,10000.00);
			Employee e3 = new Employee("加油",21,10000.00);
//			mas.add(e);
//			mas.add(e1);
//			mas.add(e2);
////			mas.add(e3);
//			mas.add(1, e3);
//			Employee ee =(Employee) mas.get(0);
//			Employee e11 =(Employee) mas.get(1);
//			Employee e12 =(Employee) mas.get(2);
//			Employee e13 =(Employee) mas.get(3);
//			System.out.println(ee.getName());
//			System.out.println(e11.getName());
//			System.out.println(e12.getName());
//			System.out.println(e13.getName());
			
			
//			MyLinkedList  mls = new MyLinkedList();
//			mls.add(e);
//			mls.add(e1);
//			mls.add(e2);
//			mls.add(e3);
////			mls.add(1, e3);
//			Employee eee = (Employee) mls.get(1).getdata();
//			Employee e111 =(Employee) mls.get(2).getdata();
//			Employee e122 =(Employee) mls.get(3).getdata();
//			Employee e133 =(Employee) mls.get(4).getdata();
//			System.out.println(eee.getName());
//			System.out.println(e111.getName());
//			System.out.println(e122.getName());
//			System.out.println(e133.getName());
			MySingleLinkedList<String> list = new MySingleLinkedList<String>();
//			MyLinkedList<String> list = new MyLinkedList<String>();
			list.add("aaa");
			list.add("bbb");
			list.add("ccc");
//			list.remove(1);
			System.out.println(list.get(0).getData()); 
			System.out.println(list.get(1).getData());
			System.out.println(list.get(2).getData()); 
			
	}

}
