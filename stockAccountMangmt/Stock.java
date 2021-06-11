package stockAccountMangmt;

public class Stock {
	
	private int NumberOfShare;
	private int Price;
	private int StockVal;
	private int TotalValShare;
	private String stockName;
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumberOfShare() {
		return NumberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		NumberOfShare = numberOfShare;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getStockVal() {
		return StockVal;
	}
	public void setStockVal(int stockVal) {
		StockVal = stockVal;
	}
	public int getTotalValShare() {
		return TotalValShare;
	}
	public void setTotalValShare(int totalValShare) {
		TotalValShare = totalValShare;
	}
	

}
