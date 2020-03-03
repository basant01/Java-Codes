public class BankAccount{

private Account[] account = new Account[10];
public int acno;
private static int index=0;

public void add(Account bankaccount)
{
this.account[index]=bankaccount;
index++;
}

public Account[] list()
{
        Account[] ac=new Account[index];
    for(int i=0;i<index;i++)
    {
        if(account[i]!=null)
        {
            ac[i]=account[i];
        }
        
    }
    return ac;
}

public Account fetch(int k)
{
    if(k==index)
    {
        System.out.println("index find");
    }
    return account[k];
}

public Account delete(int k)
{
    for(int j=0;j<index;j++)
    {
    if(k==index)
    {

     account[k]=null;
    }
}
    return account[k];
}

}



