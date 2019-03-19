package legato;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Books_Details")
public class Books {
@Id
@Column (name="id")
@GeneratedValue
private int BookId;

@Column (name="Name")
private String BookName;


@Column(name="IssueDate")
private Date BookingDate;


public String getBookName() {
	return BookName;
}
public void setBookName(String bookName) {
	this.BookName = bookName;
}

public int getBookId() {
	return BookId;
}
public void setBookId() {
	this.BookId = BookId;
}
public Date getBookingDate() {
	return BookingDate;
}
public void setBookingDate(Date bookingDate) {
	BookingDate = bookingDate;
}


}
