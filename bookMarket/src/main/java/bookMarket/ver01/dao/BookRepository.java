package bookMarket.ver01.dao;
import bookMarket.ver01.dto.Book;


import java.util.ArrayList;


public class BookRepository {

	private ArrayList<Book> listOfBooks = new ArrayList<Book>();

	
	private static BookRepository instance = new BookRepository(); // �߰� �ڵ�
	
	public static BookRepository getInstance() { //�߰� �ڵ�
		return instance;
	}
	
	public BookRepository() {
		Book book1 = new Book("a111", "��� ���� �⺻���� �����Ѵ�", 14400);
		book1.setAuthor("�տ���");
		book1.setDescription("�౸�����μ��� ��, �ƹ����μ��� ��, �����ڷμ��� �� �ڽ��� � ���� �ݼ��� ������ ��� ������ �ų�� ö��! ������ �౸�� ������ �ƹ����� ��ǰ�̴١�-�����");
		book1.setPublisher("|��������|");
		book1.setCategory("[������]");
		book1.setUnitsInStock(10);
		book1.setTotalPages(300);
		book1.setReleaseDate("2021�� 10�� 15��");
		book1.setCondition("New");
		book1.setFileName("a111.png");
		
		Book book2 = new Book("a222", "����õ��", 11000);
		book2.setAuthor("������");
		book2.setDescription("���� ���� �� �� ���ٴ�, Ȥ�� ������ �� �𸣰ڴٴ� �ʿ� ��, �츮 û��鿡�� ��ġ�� � �� �ٽ� ����ϰ� �� �������� ���");
		book2.setPublisher("|�å|");
		book2.setCategory("[������]");
		book2.setUnitsInStock(5);
		book2.setTotalPages(277);
		book2.setReleaseDate("2020�� 11�� 24��");
		book2.setCondition("Refurbished");
		book2.setFileName("a222.png");
		
		Book book3 = new Book("a333", "��ģ��", 8000);
		book3.setAuthor("�̹���");
		book3.setDescription("������ ���ѱ��Ρ��� �̾߱��� ���ΰ��� �� ��ġ�� �ִ� �̵��̴�. ���� ������ �� ���� �ѱ��� �̾߱⸦ ���� �ʹ�.�� ���ѱ� ���ڵ鿡�ԡ� �߿���");
		book3.setPublisher("|���÷翣��|");
		book3.setCategory("[����Ҽ�]");
		book3.setUnitsInStock(8);
		book3.setTotalPages(427);
		book3.setReleaseDate("2022�� 8�� 5��");
		book3.setCondition("old");
		book3.setFileName("a333.png");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
	}
	public ArrayList<Book> getAllBooks(){
		return listOfBooks;
	}
	
	//��ǰ��Ͽ��� �������� ��ĥ �� � ��ǰ���� �˱� ���ؼ� �ش�Ǵ� ��ǰ�� ã�°�.(���̵��)
	public Book getBookById(String bookId) {
		Book bookById=null;
		
		for(int i=0; i<listOfBooks.size(); i++) {
			Book book = listOfBooks.get(i);
			if(book != null && book.getBookId() != null && book.getBookId().equals(bookId)) {
				bookById=book;
				break;
			}
		}
		return bookById;
	}
	
	public void addBook(Book book) { //�߰� �ڵ�
		listOfBooks.add(book);
	}
}
