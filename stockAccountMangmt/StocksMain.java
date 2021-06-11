package stockAccountMangmt;

public class StocksMain {

	public class StockMain extends StockPortfolio {

		public void main(String[] args) {
			StockMain stockMain = new StockMain();
			stockMain.readJson();
			stockMain.calculateStockValue();
			stockMain.writeToJson();
		}

	}
}