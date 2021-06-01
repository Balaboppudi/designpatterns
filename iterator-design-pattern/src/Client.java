
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings=new String[] {"s","d","f","g","h"};
		StringArray array=new StringArray(strings);
		Iterator iterator=array.createIterator();
		System.out.println(iterator.currentItem());
		System.out.println(iterator.currentItem());

		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.previous());
	}

}
