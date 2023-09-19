public class ProductValidator {
    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("yapıcı blok çalıştı");
    }
    // bir ürünü kaydederken uygunluk testi yapılır;
    // Ana classı static yapamayız;
    // inner class yaparsak kullanabiliriz;

    public static boolean isValid(Product product){


        if (product.price>0 && !product.name.isEmpty()) {
            return true;
        }else {
            return false;
        }
        }

}
