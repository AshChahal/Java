public class Bottles{
public static void main(String[] args)
{
int x=99;
for(int y=1;y<=2;y++)
{
while(x>0)
{
if(x==1)
{
System.out.println(x+" "+"bottles of beer on the wall,"+" "+x+" "+"bottles of beer.");
x=99;
System.out.println("Go to the store and buy some more,"+ " "+x+" "+" bottles of beer on the wall.");
System.out.println();
break;
}

System.out.println(x+" "+"bottles of beer on the wall,"+" "+x+" "+"bottles of beer.");
x--;
System.out.println("Take one down and pass it around,"+" "+x+" "+"bottles of beer on the wall.");
System.out.println();
}
}
}
}