public class MySqlCustomerDal implements ICustomerDal,IRepositoryDal{
    @Override
    public void add() {
        System.out.println("Veri Eklendi : MySql");
    }
}
