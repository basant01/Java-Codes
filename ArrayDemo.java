public class ArrayDemo {

   static int row = 4;
   static int col = 4;
   static int count =10;
   static int [][] a = new int [row][col];

    public void insert()
    {
        for(int i=0; i<a.length; i++)
       {
            for(int j=0; j<a.length; j++)
            {
                a[i][j] = count++;
            }
        }
    }

    public void print()
    {
        for(int i=0; i<4; i++)
       {
            for(int j=0; j<4; j++)
            {
            System.out.print(a[i][j]);
            System.out.print("\t");   
            }
            System.out.println();
       }
    }
    public static void main(String[] args)
    {   
      
        ArrayDemo obj = new ArrayDemo();
        obj.insert();
        obj.print();
    }
}