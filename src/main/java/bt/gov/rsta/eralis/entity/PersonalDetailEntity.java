package bt.gov.rsta.eralis.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_personal_dtls")
public class PersonalDetailEntity  implements Serializable {
	
	  private static final long serialVersionUID = 1L;

		 @Id
		  private int Personal_Info_Id;
		  private String Customer_Id;
		  private String First_Name;
		  private String Middle_Name;
		  private String Last_Name;
		  
		public PersonalDetailEntity() {
			super();
			// TODO Auto-generated constructor stub
		}

		public PersonalDetailEntity(int personal_Info_Id, String customer_Id, String first_Name, String middle_Name,
				String last_Name) {
			super();
			Personal_Info_Id = personal_Info_Id;
			Customer_Id = customer_Id;
			First_Name = first_Name;
			Middle_Name = middle_Name;
			Last_Name = last_Name;
		}

		public int getPersonal_Info_Id() {
			return Personal_Info_Id;
		}

		public void setPersonal_Info_Id(int personal_Info_Id) {
			Personal_Info_Id = personal_Info_Id;
		}

		public String getCustomer_Id() {
			return Customer_Id;
		}

		public void setCustomer_Id(String customer_Id) {
			Customer_Id = customer_Id;
		}

		public String getFirst_Name() {
			return First_Name;
		}

		public void setFirst_Name(String first_Name) {
			First_Name = first_Name;
		}

		public String getMiddle_Name() {
			return Middle_Name;
		}

		public void setMiddle_Name(String middle_Name) {
			Middle_Name = middle_Name;
		}

		public String getLast_Name() {
			return Last_Name;
		}

		public void setLast_Name(String last_Name) {
			Last_Name = last_Name;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

}
