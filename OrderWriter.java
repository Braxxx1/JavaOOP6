import java.io.FileWriter;
import java.io.IOException;

public class OrderWriter {
    private Order order;
    private String fileName;

    public OrderWriter(Order order, String fileName){
        this.order = order;
        this.fileName = fileName;
    }

    public void saveToJson() {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}