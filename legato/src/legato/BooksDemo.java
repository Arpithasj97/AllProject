package legato;

  import java.util.Date;
  import java.util.Iterator;
  import java.util.List;
  import java.util.Scanner;

  import org.hibernate.Session;
  import org.hibernate.SessionFactory;
  import org.hibernate.Transaction;
  import org.hibernate.cfg.Configuration;


  public class BooksDemo {

  	public static void main(String[] args) {
  		// TODO Auto-generated method stub

  		
  		SessionFactory factory = new Configuration().configure().buildSessionFactory();
  		
  		Scanner scr = new Scanner(System.in);
  		
  		while(true) {
  		
  			System.out.println("Enter 1 for addbooks \n " + "2 for displaybooks \n" 
  			+ "3 for update\n" + "4 for delete"+" 5 for exit");
  			
  			int option = scr.nextInt();
  			
  			switch(option) 
  			{
  			case 1:
  				addbooks(factory, scr);
  			break;
  			case 2 :
  				displaybooks(factory, scr);
  			case 3:
  				update(factory, scr);
  			case 4:
  				delete(factory, scr);
  			break;
  			case 5:
  				System.exit(0);
  			break;
  			default:
  			System.out.println("Enter the correct option");
  			}
  		
  		
  		}
  		
  		
  }

  	/* Method to CREATE an employee in the database */
  	private static void addbooks(SessionFactory factory, Scanner scr) {
  		
  		Session session  = factory.openSession();
  		
  		Transaction tx = session.beginTransaction();
  		
  		System.out.println("How many books do you want to create ?");
  		
  		int count = scr.nextInt();
  		
  		for ( int i=0; i<count; i++ )
  		{
  		Books b1 = new Books();
  		
  		b1.setBookId();
  		System.out.println("Please enter the book name");
  		String bookName = scr.next();
  		b1.setBookName(bookName);
  		b1.setBookingDate(new Date());
  	//	b1.setReturnDate(new Date());
  		
  		session.save(b1);
  		
  		}
  		
  		tx.commit();
  		session.close(); 
  		
  	}
  	
  	private static void displaybooks(SessionFactory factory, Scanner scr) {
  		
  		/*Session session = factory.openSession();
  		Books book = session.get(Books.class,1);
  		
  		System.out.println(book);
  		session.close();
  		
  		session = factory.openSession();
  		List bookList = session.createQuery("from Books where BookName='hibernate'").list();
  		
  		Iterator itr = bookList.iterator();
  		
  		while(itr.hasNext()){  
  			System.out.println("BookName"+itr.next());}*/
  		Session session = factory.openSession();
  List bookList = session.createQuery("from Books").list();
  		
  		Iterator itr = bookList.iterator();
  		
  		while(itr.hasNext()){  
  			System.out.println(itr.next());}
  	}	
  	

  	private static void delete(SessionFactory factory, Scanner scr) {

  		Session session  = factory.openSession();
  		System.out.println("Please enter the BookId you want to delete");
  		int BookId = scr.nextInt();
  		Transaction tx = session.beginTransaction();
  		Books book = session.get(Books.class, BookId);
  		
  		session.delete(book);
  		tx.commit();
  		session.close(); 
  	}

  	private static void update(SessionFactory factory, Scanner scr) {
  		
  		Session session  = factory.openSession();
  		System.out.println("Please enter the BookId you want to update");
  		int BookId = scr.nextInt();
  		Transaction tx = session.beginTransaction();
  		Books book = session.get(Books.class, BookId);
  		System.out.println("Please enter the BookName you want to update");
  		String bookName = scr.next();
  		book.setBookName(bookName);
  		
  		session.update(book);
  		tx.commit();
  		session.close(); 
  		
  	}



  }
  	
 
