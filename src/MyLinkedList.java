

public class MyLinkedList<E> {
	private Node first;
	private Node last;
	private int size;
	public void add(Object obj){
		Node n = new Node();
	
		if(first==null){
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
		}else{
			//ֱ����last�ڵ�������µĽڵ�
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);
			
			last = n;
		}
		size++;
	}
	
	public int size(){
		return size;
	}
	
	private void rangeCheck(int index){
		if(index<0||index>=size){
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public Object get(int index){   //2
		rangeCheck(index);
		
		// 0 1 2 3 4
		Node temp = node(index);
		if(temp!=null){
			return temp.obj;
		}
		return null;
	}
	
	public Node node(int index){
		Node temp = null;
		if(first!=null){
			temp = first;
			for(int i=0;i<index;i++){
				temp = temp.next;
			}
		}
		return temp;
	}
	
	
	public void remove(int index){
		Node temp = node(index);
		
		if(temp!=null){
			Node up = temp.previous;
			Node down = temp.next;
			up.next = down;
			down.previous = up;
			size--;
		}
		
	}
	
	public void add(int index,Object obj){
		Node temp = node(index);
		
		Node newNode = new Node();
		newNode.obj = obj;
		
		if(temp!=null){
			Node up = temp.previous;
			up.next = newNode;
			newNode.previous = up;
			
			newNode.next = temp;
			temp.previous = newNode;
			
			size++;
		}
		}
	class Node{
		Node previous;   //��һ���ڵ�
		 Object obj;
		 Node next;        //��һ���ڵ�
		
		public Node() {
		}
		
		public Node(Node previous, Object obj, Node next) {
			super();
			this.previous = previous;
			this.obj = obj;
			this.next = next;
		}

		public Node getPrevious() {
			return previous;
		}

		public void setPrevious(Node previous) {
			this.previous = previous;
		}

		public Object getObj() {
			return obj;
		}

		public void setObj(Object obj) {
			this.obj = obj;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		
		
		}
}
