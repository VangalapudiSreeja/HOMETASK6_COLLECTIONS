package HOMETASK6_COLLECTIONS;

public class LIST<E> {
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object elem[] = new Object[DEFAULT_CAPACITY ];
	
	public void add(Object obb ) {
	       if (size == elem.length) {
	           Modify();
	       }
	       elem[size] = obb;
	       size++;
	       
	   }
	private void Modify() {
	       int newSize = elem.length * 2;
	       Object[] newar = new Object[newSize];
			for(int i=0;i<elem.length;i++){
				newar[i]=elem[i];
			}
			elem= newar;
	}
	
	
	
	public E get(int i) {
	       if (i >= size || i < 0) {
	           throw new IndexOutOfBoundsException("Index out of bound");
	       }
	       return (E) elem[i];
	   }
	
	
	
	
	public void remove(int i){
		System.out.println("Element is:" +elem[i]);
		if(i<0 ||i>=size()){
			throw new IndexOutOfBoundsException("Index out of bound");
		}
		while(i<size()-1){
			elem[i]=elem[i+1];
			i++;
		}
		elem[i]=null;
		size--;
		
	}
	public void print(){
		System.out.print("(");
		for(int i=0;i<size;i++){
			System.out.print(elem[i]+" ");
		}
		System.out.print(")");
	}
	int size(){
		return size;
	}
	
	
		

}
