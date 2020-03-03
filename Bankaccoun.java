import java.util.ArrayList;
import java.util.List;

public class Bankaccoun implements account1
{
    private ArrayList<Account> account = new ArrayList<>();
    @Override
    public void add(Account bankaccount) {
      account.add(bankaccount);

    }

    @Override
    public ArrayList<Account> list() {
  
        return account;
    }

    @Override
    public Account fetch(int k) {
     
       return account.get(k);
   
       
   
    }

    @Override
    public ArrayList<Account> delete(int k) {
        
        if( account.get(k) != null)
        {
           account.remove(k);
        }
        return account;
    }

}