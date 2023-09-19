public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","aciklama",300,5);
//        Product product = new Product();
//        product.setName("Laptop");
//        product.setDescription("MSI leptop");
//        product.setId(10);
//        product.setPrice(5000);
//        product.setStokAmount(10);
//        ProductManager productManager = new ProductManager();
//        productManager.Add(product);

        System.out.println(product.getKod());
    }
}