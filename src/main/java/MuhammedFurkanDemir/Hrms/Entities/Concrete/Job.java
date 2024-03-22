package MuhammedFurkanDemir.Hrms.Entities.Concrete;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Jobs")
public class Job {

	@Id
	@GeneratedValue
	@Column(name="Id")
	public int Id;
	
	@Column(name="Name")
	public String Name;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
}
