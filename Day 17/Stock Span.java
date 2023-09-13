// Afzal has been working with an organization called 'Money Traders' for the past few years. The organization is into the money trading business. His manager assigned him a task. For a given array/list of stock's prices for N days, find the stock's span for each day.
// The span of the stock's price today is defined as the maximum number of consecutive days(starting from today and going backwards) for which the price of the stock was less than today's price.
// For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85], then the stock spans will be [1, 1, 1, 2, 1, 4, 6].
// Explanation:
// On the sixth day when the price of the stock was 75, the span came out to be 4, because the last 4 prices(including the current price of 75) were less than the current or the sixth day's price.

// Similarly, we can deduce the remaining results.
// Afzal has to return an array/list of spans corresponding to each day's stock's price. Help him to achieve the task.

public class Solution {

	public static int[] stockSpan(int[] price) {
		//Your code goes here
		int[] arrAns=new int[price.length];
		for(int i=0; i<price.length;i++){
			int count=0;
			for(int j=i-1;j>=0;j--){
				if(price[j]>=price[i]){
					break;
				}
				else if(price[j]<price[i]){
					count++;
				}
			}
			arrAns[i]=count+1;
		}
		return arrAns;
	}



}