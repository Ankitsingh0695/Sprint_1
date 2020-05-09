package distributor;

public class DistributorModel {
	

	private String distributorId;
	private String distributorName;
	private String distributorEmail;
	private String distributorPhone;
	private String distributorProdId;
	public DistributorModel(String distributorId, String distributorName, String distributorEmail, String distributorPhone,String distributorRawId) {
	super();
	this.distributorId = distributorId;
	this.distributorName = distributorName;
	this.distributorEmail = distributorEmail;
	this.distributorPhone = distributorPhone;
	this.distributorProdId = distributorProdId;
	}
	public String getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}
	public String getDistributorName() {
		return distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	public String getDistributorEmail() {
		return distributorEmail;
	}
	public void setDistributorEmail(String distributorEmail) {
		this.distributorEmail = distributorEmail;
	}
	public String getDistributorPhone() {
		return distributorPhone;
	}
	public void setDistributorPhone(String distributorPhone) {
		this.distributorPhone = distributorPhone;
	}
	public String getDistributorProdId() {
		return distributorProdId;
	}
	public void setDistributorProdId(String distributorProdId) {
		this.distributorProdId = distributorProdId;
	}
	

	}


