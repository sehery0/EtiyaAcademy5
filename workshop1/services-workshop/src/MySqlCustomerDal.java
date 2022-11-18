import java.util.ArrayList;
import java.util.List;

public class MySqlCustomerDal implements ICustomerDal{
    List<Customer> customers = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        System.out.println("eklendi");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("silindi");
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Güncellendi");

    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public void getById(int id) {
        System.out.println(id);
    }

}
