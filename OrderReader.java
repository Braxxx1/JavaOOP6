import java.util.Scanner;

public class OrderReader {

    public static Order inputOrderFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Client name: ");
        String clientName = scanner.nextLine();
        System.out.print("Product: ");
        String product = scanner.nextLine();
        System.out.print("Quantity: ");
        int qnt = Integer.parseInt(scanner.nextLine());
        System.out.print("Price: ");
        int price = Integer.parseInt(scanner.nextLine());
        return new Order(clientName, product, qnt, price);
    }

    public static Order inputOrderFromBD(){
        // в этом классе можно добавлять различные методы чтения и выбирвть нужный нам
        System.out.print("Достаём из бд");
        return new Order(null, null, 0, 0);
    }


}
