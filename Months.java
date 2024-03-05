class Months
 {
   public static void main(String[]args)
    {
     int month=11;
     if(month%2==0)
      {
       System.out.println("the month number is even num");
      }
     else
      {
       System.out.println("the month number is odd num");
      } 
   
    switch(month)
    {
     case 1 -> System.out.println(" month="+ month +" january ");
     case 2 -> System.out.println(" month="+ month +" february");
     case 3 -> System.out.println(" month="+ month +" march");
     case 4 -> System.out.println(" month="+ month +" april");
     case 5 -> System.out.println(" month="+ month +" may");
     case 6 -> System.out.println(" month="+ month +" june");
     case 7 -> System.out.println(" month="+ month +" july");
     case 8 -> System.out.println(" month="+ month +" augest");
     case 9 -> System.out.println(" month="+ month +" september");
     case 10-> System.out.println(" month="+ month +" october");
     case 11-> System.out.println(" month="+ month +" november");
     case 12-> System.out.println(" month="+ month +" december");
     default ->System.out.println(" month="+ month +"it is not a month");
    }
  }//the month is even odd
   //month= 11 november
 }