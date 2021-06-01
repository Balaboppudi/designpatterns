
public class StringArray implements Iterable {
	
	private String [] items;
	private int presentIndex = 0;
	public StringArray(String [] items) {
		this.items = items;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new StringIterator();
	}
	
	class StringIterator implements Iterator{

		@Override
		public boolean hasNext() {
			
			return presentIndex<items.length;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(hasNext()) {
				return items[++presentIndex];
			}
			throw new RuntimeException("No more elements");
		}

		@Override
		public Object previous() {
			// TODO Auto-generated method stub
			return items[--presentIndex];
		}

		@Override
		public Object currentItem() {
			// TODO Auto-generated method stub
			return items[presentIndex];
		}
		
	}

}

