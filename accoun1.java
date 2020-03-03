import java.util.ArrayList;
import java.util.List;

interface account1
{
    public void add(Account bankaccount);
    public  abstract ArrayList<Account> list();
    public  abstract Account fetch(int k);
    public  abstract ArrayList<Account> delete(int k);
}