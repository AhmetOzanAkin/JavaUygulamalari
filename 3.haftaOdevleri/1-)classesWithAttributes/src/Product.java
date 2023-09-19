public class Product {
    public Product(int id,String name, String description, double price,int stokAmount){

        System.out.println("yapıcı çalıştı");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stokAmount = stokAmount;
    }
    public Product() {

    }
    private String name;
    private String description;
    private int id;
    private double price;
    private int stokAmount;

    private String kod;



    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStokAmount() {
        return stokAmount;
    }

    public void setStokAmount(int stokAmount) {
        this.stokAmount = stokAmount;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }


}
