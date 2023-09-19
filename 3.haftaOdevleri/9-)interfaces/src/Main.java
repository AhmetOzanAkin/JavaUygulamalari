public class Main {
    public static void main(String[] args) {

        // Dal = Data Access Layer
        // implements onu inherit eden bir classı tutabilir;
        // interfacesler ve abstractlar new'lenemez;
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();

    }
}