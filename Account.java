
public class Account implements Comparable< Account>{

    private String name;
    private int acno;
    private static int counter=1000;
    private int tobal = 0;
   // private String message;
   // private String message1;
   // private int accId;

    public void deposit(int add){
        tobal = tobal+add;
    }
   

    public int withdraw(int remove){
        tobal = tobal-remove;
        return remove;
    }
    
    public int show(){
        return tobal;
    }

    public String name() {
        return name;
    }
    public Account(String name, int tobal,int acno) {
        this.name = name;
        this.tobal = tobal;
       // this.acno = counter++;
       this.acno=acno;
    }
/*
    public Account(String name) {
        this.name = name;
        this.acno = counter++;
    }
*/
    public long getAccountNumber(){
        return acno;
    }

    @Override
	public String toString() {
		return "Account [name=" + name + ", acno=" + acno + ", tobal=" + tobal +"]";
	}
	@Override
    public int compareTo(Account ba) {
        int result = (int)(this.acno-ba.acno);
        return 0;
    }
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + acno;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

  
}