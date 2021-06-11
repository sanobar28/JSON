package stockAccountMangmt;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class CompanyShares {
	
	private String stockSymbol;
	private long noOfShares;
	private double price;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateTime;

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public long getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(long noOfShares) {
		this.noOfShares = noOfShares;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "CompanyShares [stockSymbol=" + stockSymbol + ", noOfShares=" + noOfShares + ", price=" + price
				+ ", dateTime=" + dateTime + "]";
	}


}
