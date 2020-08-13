package bt.gov.rsta.onlinepayment.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_payment_dtls")
public class PaymentEntity {
	
	@Id
	private int Payment_Id;
	private String Application_Number;
	private String Application_Type;
	private int Service_Id;
	private double Amount_Paid;
	private double Penalty_Paid;
	private String 	Receipt_No;
	private Date Receipt_Date;
	private String Created_By;
	private Timestamp Created_On;
	private String  String;
	
	public PaymentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentEntity(int payment_Id, java.lang.String application_Number, java.lang.String application_Type,
			int service_Id, double amount_Paid, double penalty_Paid, java.lang.String receipt_No, Date receipt_Date,
			java.lang.String created_By, Timestamp created_On, java.lang.String string) {
		super();
		Payment_Id = payment_Id;
		Application_Number = application_Number;
		Application_Type = application_Type;
		Service_Id = service_Id;
		Amount_Paid = amount_Paid;
		Penalty_Paid = penalty_Paid;
		Receipt_No = receipt_No;
		Receipt_Date = receipt_Date;
		Created_By = created_By;
		Created_On = created_On;
		String = string;
	}

	public int getPayment_Id() {
		return Payment_Id;
	}

	public void setPayment_Id(int payment_Id) {
		Payment_Id = payment_Id;
	}

	public String getApplication_Number() {
		return Application_Number;
	}

	public void setApplication_Number(String application_Number) {
		Application_Number = application_Number;
	}

	public String getApplication_Type() {
		return Application_Type;
	}

	public void setApplication_Type(String application_Type) {
		Application_Type = application_Type;
	}

	public int getService_Id() {
		return Service_Id;
	}

	public void setService_Id(int service_Id) {
		Service_Id = service_Id;
	}

	public double getAmount_Paid() {
		return Amount_Paid;
	}

	public void setAmount_Paid(double amount_Paid) {
		Amount_Paid = amount_Paid;
	}

	public double getPenalty_Paid() {
		return Penalty_Paid;
	}

	public void setPenalty_Paid(double penalty_Paid) {
		Penalty_Paid = penalty_Paid;
	}

	public String getReceipt_No() {
		return Receipt_No;
	}

	public void setReceipt_No(String receipt_No) {
		Receipt_No = receipt_No;
	}

	public Date getReceipt_Date() {
		return Receipt_Date;
	}

	public void setReceipt_Date(Date receipt_Date) {
		Receipt_Date = receipt_Date;
	}

	public String getCreated_By() {
		return Created_By;
	}

	public void setCreated_By(String created_By) {
		Created_By = created_By;
	}

	public Timestamp getCreated_On() {
		return Created_On;
	}

	public void setCreated_On(Timestamp created_On) {
		Created_On = created_On;
	}

	public String getString() {
		return String;
	}

	public void setString(String string) {
		String = string;
	}

}
