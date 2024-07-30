package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AltoRecord")
public class AltoEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int AltoNumber;
	private String AltoName;
	private String AltoType;
	public int getAltoNumber() {
		return AltoNumber;
	}
	public void setAltoNumber(int altoNumber) {
		AltoNumber = altoNumber;
	}
	public String getAltoName() {
		return AltoName;
	}
	public void setAltoName(String altoName) {
		AltoName = altoName;
	}
	public String getAltoType() {
		return AltoType;
	}
	public void setAltoType(String altoType) {
		AltoType = altoType;
	}
	public AltoEntity(int altoNumber, String altoName, String altoType) {
		super();
		AltoNumber = altoNumber;
		AltoName = altoName;
		AltoType = altoType;
	}
	public AltoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "AltoEntity [AltoName=" + AltoName + ", AltoType=" + AltoType + ", AltoNumber=" + AltoNumber + "]";
	}
}
