import java.util. Scanner;
class IfTest{
  public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
   System.out.println("��������");
int year = scan. nextInt();
System.out.println("��������");
int month = scan. nextInt();
System.out.println("��������");
int day  = scan. nextInt();
int sumdays= 0;
switch (month )     {
case 12 :
   sumdays += 30;
case 11 :
   sumdays += 31;
case 10 :
   sumdays += 30;
case 9 :
   sumdays += 31;
case 8 :
   sumdays += 31;
case 7 :
   sumdays += 30;
case 6 :
   sumdays += 31;
case 5 :
   sumdays += 30;
case 4  :
   sumdays += 30;
case 3 :
   if (year % 400 == 0){
  sumdays += 29;
  } else
  {sumdays += 28;}
case 2 :
   sumdays += 31;
case 1 :
   sumdays += day;
}
System.out.println(year +"��" + month + "��"  + day + "��" + "��" + sumdays  + "��");

  }
}
