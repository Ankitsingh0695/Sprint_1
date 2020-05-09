package PlaceOrder;

import java.io.Serializable;
import java.util.Date;

public class RawMaterialOrderModel implements Serializable
{
	private String orderId;
	private String rawMaterialId;
	private String supplier;
	private Date orderDate;
	private Date deliveryDate;
	private double quantity;
	private double price;
	private String status="p";
	private Date processDate;
	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getQA() {
		return QA;
	}

	public void setQA(String qA) {
		QA = qA;
	}

	private Date manufacturingDate;
	private Date expiryDate;
	private String QA;
	public RawMaterialOrderModel(String orderId,String rawMaterialId,String supplier,Date orderDate,Date deliveryDate, double quantity,double price )
	{
	this.orderId= orderId;
	this.rawMaterialId =rawMaterialId;
	this.supplier = supplier;
	this.orderDate =orderDate;
	this.quantity=quantity;
	this.deliveryDate=deliveryDate;
	this.price= price;

	}

	public String getOrderId() {
	return orderId;
	}

	public void setOrderId(String orderId) {
	this.orderId = orderId;
	}

	public String getRawMaterialId() {
	return rawMaterialId;
	}

	public void setRawMeterialId(String rawMaterialId) {
	this.rawMaterialId = rawMaterialId;
	}

	public String getSupplierId() {
	return supplier;
	}

	public void setSupplierId(String supplier) {
	this.supplier = supplier;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Date getOrderDate() {
	return orderDate;
	}

	public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
	return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
	this.deliveryDate = deliveryDate;
	}

	public double getPrice() {
	return price;
	}

	public void setPrice(double price) {
	this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
