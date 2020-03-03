import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Client1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Comparator<Account> saving>
		Account ob1 = new Account("Antick",10000,1);
	       // Account ob2 = new Account("Basant");
	        //Account ob3 = new Account("manav");
	        Account ob4 = new Account("gagan",20000,2);
	        ob1.deposit(1000);
	        ob1.withdraw(500);
	        /*
	        Bankaccoun bc = new Bankaccoun();
	       bc.add(ob1);
	       bc.add(ob2);
	       bc.add(ob3);
	       bc.add(ob4);
	    
	       ArrayList<Account> ac = bc.list();
	       // Account ac[] =bc.list();
	        for(int i=0;i<ac.size();i++)
	        {
	            System.out.println(ac.get(i).name());
	        }
	//System.out.println(bc.delete(2));
	System.out.println(bc.fetch(0).name());
	bc.delete(1);
	ArrayList<Account> aci = bc.list();
	       // Account ac[] =bc.list();
	        for(int i=0;i<aci.size();i++)
	        {
	            System.out.println(aci.get(i).name());
	        }
	*/
	        ob2.deposit(100,"basant you add Rs100");
	         ob2.withdraw(50,"your account is hacked");

	        ob3.deposit(1000);
	        ob3.withdraw(50);

	        ob4.deposit(10000,"gagan your balance is");
	        ob4.withdraw(50,"you are idiot");

	        //System.out.printf("The Ammount of "+ob1.name()+" is %d %d %n ",ob1.show(),a);
	        //System.out.printf("The Ammount of "+ob2.name()+" is %d %d %n ",ob2.show());
	        //System.out.printf("The Ammount of "+ob3.name()+" is %d %n ",ob3.show());
	       // System.out.printf("The Ammount of "+ob4.name()+" is %d %n ",ob4.show());

	       Set<Account> b = new TreeSet<>();
	       b.add(ob1);
	       b.add(ob2);
	       b.add(ob3);
	       b.add(ob4);
	       Iterator <Account> value= b.iterator(); 
	    while(value.hasNext())
	    {
	        System.out.println(value.next()); 
	    }
	    }

	}
