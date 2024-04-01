public class Program {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        OrderReader reader = new OrderReader();
        Order order = reader.inputOrderFromConsole();

        OrderWriter orderWriter = new OrderWriter(order, "test.json");
        orderWriter.saveToJson();
    }
}
