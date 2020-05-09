package supplier;

public class SupplierModel {
	

	private String supplierId;
	private String supplierName;
	private String supplierEmail;
	private String supplierPhone;
	private String supplierRawId;
	public SupplierModel(String supplierId, String supplierName, String supplierEmail, String supplierPhone,String supplierRawId) {
	super();
	this.supplierId = supplierId;
	this.supplierName = supplierName;
	this.supplierEmail = supplierEmail;
	this.supplierPhone = supplierPhone;
	this.supplierRawId = supplierRawId;
	}
	public String getSupplierId() {
	return supplierId;
	}
	public void setSupplierId(String supplierId) {
	this.supplierId = supplierId;
	}
	public String getSupplierName() {
	return supplierName;
	}
	public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
	}
	public String getSupplierEmail() {
	return supplierEmail;
	}
	public void setSupplierEmail(String supplierEmail) {
	this.supplierEmail = supplierEmail;
	}
	public String getSupplierPhone() {
	return supplierPhone;
	}
	public void setSupplierPhone(String supplierPhone) {
	this.supplierPhone = supplierPhone;
	}
	public String getSupplierRawId() {
	return supplierRawId;
	}
	public void setSupplierRawId(String supplierRawId) {
	this.supplierRawId = supplierRawId;
	}


	}


