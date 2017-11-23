package in.co.stl.manageBean;

import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OrderTEST {

	
	
	static class Order{
		String orderNo;
		String productName;
		BigDecimal price;
		int qty;
		
		public String getOrderNo() {
			return orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		
	}
}
