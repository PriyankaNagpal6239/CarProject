package Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Record")
public class CarEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CarNumber;
	private String CarName;
	private String CarType;
	public int getCarNumber() {
		return CarNumber;
	}
	public void setCarNumber(int carNumber) {
		CarNumber = carNumber;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
	public CarEntity(int carNumber, String carName, String carType) {
		super();
		CarNumber = carNumber;
		CarName = carName;
		CarType = carType;
	}
	public CarEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "CarEntity [CarName=" + CarName + ", CarType=" + CarType + ", CarNumber=" + CarNumber + "]";
	}
	
	
}
