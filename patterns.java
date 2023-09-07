public class patterns
  {
    public static void main(String args[])
    {
      // Pattern 1 - square
      for(int i = 1 ; i<=5 ; i++)
        {
          for(int j = 1 ; j<=5 ; j++)
            {
              System.out.print(i) ;
            }
          System.out.println() ;
        }
      // Pattern 2 - square
      for(int i = 1 ; i<=5 ; i++)
        {
          for(int j = 1 ; j<=5 ; j++)
            {
              System.out.print(j) ;
            }
          System.out.println() ;
        }
      // Pattern 3 - square
      for(int i = 1 ; i<=5 ; i++)
        {
          for(int j = 1 ; j<=5 ; j++)
            {
              System.out.print((i+j)) ;
            }
          System.out.println() ;
        }
      // Pattern 4 - triangle with bottom base
      for(int i = 1 ; i<=5 ; i++)
        {
          for(int j = 1 ; j<=i ; j++)
            {
              System.out.print(i) ;
            }
          System.out.println() ;
        }
      // Pattern 5 - triangle with bottom base
      for(int i = 1 ; i<=5 ; i++)
        {
          for(int j = 1 ; j<=i ; j++)
            {
              System.out.print(j) ;
            }
          System.out.println() ;
        }
      // Pattern 6 - triangle with bottom base
      for(int i = 1 ; i<=5 ; i++)
        {
          for(int j = 1 ; j<=i ; j++)
            {
              System.out.print((i+j)) ;
            }
          System.out.println() ;
        }
      // Pattern 7 - triangle with top base
      for(int i = 5 ; i>=1 ; i--)
        {
          for(int j = 1 ; j<=5 ; j++)
            {
              System.out.print(i) ;
            }
          System.out.println() ;
        }
      // Pattern 8 - triangle with top base
      for(int i = 5 ; i>=1 ; i--)
        {
          for(int j = 1 ; j<=5 ; j++)
            {
              System.out.print(j) ;
            }
          System.out.println() ;
        }
      // Pattern 9 - triangle with top base
      for(int i = 5 ; i>=1 ; i--)
        {
          for(int j = 1 ; j<=5 ; j++)
            {
              System.out.print((i+j)) ;
            }
          System.out.println() ;
        }
    }
  }
