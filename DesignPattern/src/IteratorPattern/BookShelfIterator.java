package IteratorPattern;

import java.util.Iterator;
import java.util.NoSuchElementException;

//BookShelf Ŭ������ �˻��� ����
public class BookShelfIterator implements Iterator<Book> {

	private BookShelf bookShelf; //BookShelfIterator�� �˻��� å��
	private int index; //���� ���� �ִ� å�� ����Ŵ
	
	//���޵� �ν��Ͻ��a �ʵ忡 ����, index�� 0���� �ʱ�ȭ
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		//���� å�� �ִ���?
		if(index < bookShelf.getLength()) { 
			return true;
		} else {
			return false;
		}
	}

	//���� �ָ��ϰ� �ִ� å�� ��ȯ�ϰ� �������� �����Ŵ
	@Override
	public Book next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		} 
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
