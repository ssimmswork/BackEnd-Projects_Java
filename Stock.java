//Stock Problem

public class Stock {

	public static void main(String[] args) {
				
				double purchasePrice, sellingPrice, profit,gainLoss;
				
				purchasePrice = 31.77;
				sellingPrice = 40.25;
				
				if(purchasePrice > sellingPrice) {
					profit = purchasePrice - sellingPrice;
				}
				profit = sellingPrice - purchasePrice;
				
				gainLoss = profit / purchasePrice; 
			
				
				System.out.println("Stock");
				System.out.println(purchasePrice);
				System.out.println(profit);
				System.out.println(gainLoss);
	}

}
