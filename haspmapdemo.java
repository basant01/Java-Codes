import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class haspmapdemo {

	public static void main(String[] args) {
		
		Account account1 = new Account("Basant",20000,1001);
		Account account2 = new Account("antik",20000,1000);
		Account account3 = new Account("raghav",20000,1002);
		Map<Long,Account> map = new HashMap<>();
		
		map.put(1001L, account1);
		map.put(1000L, account2);
		map.put(1002L, account3);

		
		Account ac =map.get(1002L);
		
		System.out.println("Bank account for id 1002 is"+ac);
		
		//Set<Long> keys =map.keySet();
		/*
	Iterator<Long> it =keys.iterator();
	
	while(it.hasNext())
	{
		System.out.println(map.get(it.next()));
	}
	*/
		/*
		Collection<Account> values =map.values();
		Iterator<Account> il=values.iterator();
		while(il.hasNext())
		{
			Account a=(Account) il.next();
			System.out.println(a);
		}*/
		
	Set<Map.Entry<Long,Account>> entrySet =map.entrySet();
	Iterator<Map.Entry<Long,Account>> i =entrySet.iterator();
	
	while(i.hasNext()){
		Map.Entry<Long,Account> entry=i.next();
		System.out.printf("key is %s , Values is %s %n",entry.getKey(),entry.getValue());
		}
	
		}
	

}
