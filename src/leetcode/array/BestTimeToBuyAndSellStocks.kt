package leetcode.array

class BestTimeToBuyAndSellStocks {
    fun maxProfit(prices: IntArray): Int {
        var res = 0
        var minBuy = prices[0]
        var i = 1

        while(i < prices.size){
            var profit = prices[i] -  minBuy
            res = Math.max(res, profit)
            if(minBuy > prices[i]) minBuy = prices[i]
            i++
        }

        return res
    }
}