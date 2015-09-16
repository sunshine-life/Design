

public class MyArrayList<E> {
	private Object[] elementData;
	int size = 0;
	public MyArrayList(){
		this.elementData= new Object[3];
	}
	public void add(E e){
		//对数组进行扩容
		if(this.size+1>elementData.length){
			Object[] newelementData = new Object[(size+1)*2];
			System.arraycopy(elementData, 0, newelementData, 0, elementData.length);
			this.elementData = newelementData;
		}
		this.elementData[size] = e;
		size++;
	}
	 public void add(int pos,E e){
		 if(this.size+1>elementData.length){
				Object[] newelementData = new Object[(size+1)*2];
				System.arraycopy(elementData, 0, newelementData, 0, elementData.length);
				this.elementData = newelementData;
			}
		 System.arraycopy(elementData, pos, elementData, pos+1, this.size+1);
		 this.elementData[pos] = e;
	 }
	public Object get(int index){
		return (Object)this.elementData[index];
	}
	public int size(){
		return size;}
	
}
