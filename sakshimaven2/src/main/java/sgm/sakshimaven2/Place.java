package sgm.sakshimaven2;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="place")
public class Place {
	

	
	
	@Id
	private int id;
	private String name;
	private int fare;
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getFare() {
	return fare;
	}
	public void setFare(int fare) {
	this.fare = fare;
	}
	@Override
	public String toString() {
	return "Place [id=" + id + ", name=" + name + ", fare=" + fare + "]";
	}


	}

