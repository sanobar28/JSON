package stockAccountMangmt;

public interface IStockOperation {

	/**
	 * Create a new account from file
	 * 
	 * @param fileName
	 */
	public void readStockAccount(String fileName);

	/**
	 * Total value of account dollars
	 * 
	 * @return
	 */
	public double valueOf();

	/**
	 * add shares of stock to account
	 * 
	 * @param noOfShares
	 * @param shareName
	 * @param stockName
	 */
	public void buy(int noOfShares, String shareName, String stockName);

	/**
	 * subtract shares of stock from account
	 * 
	 * @param amount
	 * @param symbol
	 */
	public void sell(int noOfShares, String shareName, String stockName);

	/**
	 * save account to file
	 * 
	 * @param fileName
	 */
	public void save(String fileName);

	/**
	 * print a detailed report of stocks and values
	 */
	public void printReport();
}

