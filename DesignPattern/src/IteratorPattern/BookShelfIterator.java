package IteratorPattern;

import java.util.Iterator;
import java.util.NoSuchElementException;

//BookShelf 클래스의 검색을 실행
public class BookShelfIterator implements Iterator<Book> {

	private BookShelf bookShelf; //BookShelfIterator가 검색할 책장
	private int index; //현재 보고 있는 책을 가리킴
	
	//전달된 인스턴스픞 필드에 저장, index를 0으로 초기화
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		//다음 책이 있는지?
		if(index < bookShelf.getLength()) { 
			return true;
		} else {
			return false;
		}
	}

	//현재 주목하고 있는 책을 반환하고 다음으로 진행시킴
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
