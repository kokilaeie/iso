import java.util.LinkedHashSet;
import java.util.Scanner;
public class isomorphic {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String a=s.next();
String b=s.next();
if(a.length()==b.length())
{
LinkedHashSet ls=new LinkedHashSet();
char[] c=a.toCharArray();
String d="";
for(char i:c)
{
ls.add(i);
}
for(char i:c)
{
d+=i;
}
for(int i=0;i<d.length();i++)
{
a=a.replace(d.charAt(i),b.charAt(i) );	
}
if(a.equals(b))
{
System.out.println("True");
}else
{
System.out.println("False");
}
}else
{
System.out.println("False");
}
}
}
