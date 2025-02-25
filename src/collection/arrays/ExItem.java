package collection.arrays;

public class ExItem {

    public static void main(String[] args) {
        Item[] array = new Item[3];
        array[0] = new Item("Item A", 100);
        array[1] = new Item("Item B", 300);
        array[2] = new Item("Item C", 200);

        Object[] result = process(array);

        Item min = (Item) result[0];
        Item max = (Item) result[1];
        Double avg = (Double) result[2];

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);
    }

    private static Object[] process(Item[] array) {
        Item min = array[0];
        Item max = array[0];
        double sum = 0.0;

        for (Item item : array) {
            if (item.getPrice() < min.getPrice()) {
                min = item;
            }

            if (item.getPrice() > max.getPrice()) {
                max = item;
            }

            sum += item.getPrice();
        }

        double avg = sum / array.length;

        return new Object[] { min, max, avg };
    }
}
