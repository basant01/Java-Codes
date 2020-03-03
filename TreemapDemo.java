import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		
		Account account1 = new Account("Basant",20000,1001);
		Account account2 = new Account("antik",20000,1000);
		Account account3 = new Account("raghav",20000,1002);
		Map<Long,Account> map = new TreeMap<>();
	
		
		map.put(1001L, account1);
		map.put(1000L, account2);
		map.put(1002L, account3);
	Account ac =map.get(1002L);
		
		System.out.println("Bank account for id 1002 is"+ac);
		
		Set<Map.Entry<Long,Account>> entrySet =map.entrySet();
		Iterator<Map.Entry<Long,Account>> i =entrySet.iterator();
		
		while(i.hasNext()){
			Map.Entry<Long,Account> entry=i.next();
			System.out.printf("key is %s , Values is %s %n",entry.getKey(),entry.getValue());
			}
		
	}

}
