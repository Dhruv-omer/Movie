import java.util.*;
public class movie
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Guess the movie name!! (Note: Enter all alphabets in lower case) :)");
System.out.println("_i___a_");
String m="singham";
String s="_i___a_";
String w="";
while(m.equals(s)==false)
{
System.out.print("Enter an alphabet  : ");
char a=in.next().charAt(0);

if(m.indexOf(a)!=-1&&a!='a'&&a!='e'&&a!='i'&&a!='u'&&a!='o')
{
for(int i=0;i<s.length();i++)
{
if(i==m.indexOf(a))
w=w+a;
else
w=w+s.charAt(i);
}
s=w;
w="";
System.out.println(s+"  Good.. ");
}
else
System.out.println("Wrong!!  Try again!!");
}
}
}
