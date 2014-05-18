public class Store
{
public static void main(String[] args)
{
RetailItem Jacket = new RetailItem("Jacket", 12, 59.95);
RetailItem Designer = new RetailItem("Designer Jeans", 40, 34.95);
RetailItem Shirt = new RetailItem("Shirt", 20, 24.95);
System.out.println(Jacket.getDes() + " " + Jacket.getUnits() + " " + Jacket.getPrice());
System.out.println(Designer.getDes() + " " + Designer.getUnits() + " " + Designer.getPrice());
System.out.println(Shirt.getDes() + " " + Shirt.getUnits() + " " + Shirt.getPrice());
}
}