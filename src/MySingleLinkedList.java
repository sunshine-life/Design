

public class MySingleLinkedList<E> {
	private Node headNode;
	private Node tail;
	private int size;
	public int size(){
		return size;
	}
	public void add(E e){
		Node n = new Node();
		if(this.headNode==null){
			n.setData(e);
			n.setNext(null);
			this.headNode = n;
			tail = n;
		}else{
			//直接往last节点后增加新的节点
			n.setData(e);
			n.setNext(null);
			this.tail.setNext(n);
			this.tail = n;
		}
		size++;
	}
	public Node get(int index){   //2
		// 0 1 2 3 4
		Node temp = null;
		if(headNode!=null){
			temp = headNode;
			for(int i=0;i<index;i++){
				temp = temp.next;
			}
		}
		return temp;
	}
	
//	public Node node(int index){
//		Node temp = null;
//		if(headNode!=null){
//			temp = headNode;
//			for(int i=0;i<index;i++){
//				temp = temp.next;
//			}
//		}
//		return temp;
//	}
	public Node getHeadNode() {
		return headNode;
	}
	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	
	
	
	
	

		class Node{
			Object data;
			Node next;
			public Object getData() {
				return data;
			}
			public void setData(Object data) {
				this.data = data;
			}
			public Node getNext() {
				return next;
			}
			public void setNext(Node next) {
				this.next = next;
			}
			
		}
}
