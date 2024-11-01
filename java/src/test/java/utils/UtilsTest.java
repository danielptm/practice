package utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class UtilsTest {

    @Test
    public void testing2() {
        int[] nums = new int[]{1, 2, 3};
        int num = 4;
        int[] result = Utils.addItemToArray(num, nums);
        Assert.assertEquals(4, result.length);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(4, result[3]);
    }

    @Test
    public void testing3() {
        int[] nums = new int[]{1, 2, 3};
        int index = 1;
        int[] result = Utils.removeItemFromArray(index, nums);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(3, result[1]);
    }

    @Test
    public void testing4() {
        int[] nums = new int[]{1, 2, 3, 5, 6, 7, 8};
        int index = 3;
        int[] result = Utils.removeItemFromArray(index, nums);
        Assert.assertEquals(6, result[3]);
        List<String> items = new ArrayList<>();
    }


    @Test
    public void testing5() {
        int[] nums = new int[]{1, 2, 3, 5, 6, 7, 8};
        int num = 3;
        boolean result = Utils.contains(num, nums);
        Assert.assertTrue(result);
        int num2 = 100;
        boolean result2 = Utils.contains(num2, nums);
        Assert.assertFalse(result2);
    }

    @Test
    public void testing6() {
        int num = 2;
        int index = 1;
        int[] items = new int[]{1, 3};
        int[] result = Utils.insertItemAtIndex(index, num, items);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);
        Assert.assertEquals(3, result[2]);
    }

    @Test
    public void testing7() {
        int[] items = new int[]{1, 2, 3};
        List<Integer> listItems = Arrays
                .stream(items)
                .boxed()
                .collect(Collectors.toList());
        int[] items2 = listItems.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(items2[0]);
    }

    interface Stock {
        public double getAmount();
    }

    class Bid  implements Stock {
        private double amount;
        String name;

        public Bid(String name, double amount) {
            this.amount = amount;
            this.name = name;
        }

        @Override
        public double getAmount() {
            return this.amount;
        }
    }

    class Offer implements Stock {
        private double amount;
        private String name;

        public Offer(String name, double amount) {
            this.amount = amount;
            this.name = name;
        }

        @Override
        public double getAmount() {
            return this.amount;
        }
    }

    class StockData {
        private String name;
        private List<Stock> offers;
        private List<Stock> bids;
        public StockData(String name, List<Stock> offers, List<Stock> bids) {
            this.name = name;
            this.offers = offers;
            this.bids = bids;
        }

        public String getName() {
            return name;
        }

        public List<Stock> getOffers() {
            return offers;
        }

        public List<Stock> getBids() {
            return bids;
        }
    }

    @Test
    public void testing8() {
        Map<String, StockData> stockData = new HashMap<>();
        List<Stock> bids = new ArrayList<>();
        bids.add(new Bid("AAPL", 4.2));
        bids.add(new Bid("AAPL", 4.3));
        bids.add(new Bid("AAPL", 4.4));

        List<Stock> offers = new ArrayList<>();
        offers.add(new Offer("AAPL", 4.5));
        offers.add(new Offer("AAPL", 4.6));
        offers.add(new Offer("AAPL", 4.4));

        Sort(bids);
        Sort(offers);

        stockData.put("AAPL", new StockData("AAPL", offers, bids));

        String x = "sasdf";
    }

    void Sort(List<Stock> stocks) {
        Collections.sort(stocks, (price1, price2) -> {
            if (price1.getAmount() > price2.getAmount()) {
                return 1;
            }
            return -1;
        });
    }
}
