
public class Phrase{

public static void main(String[] args)
{
String[] wordListOne={"a","b","c","d"};

String[]  wordListTwo={"1","2","3"};

String[] wordListThree={"hello","Hi","Bye","Good Morning"};

int one=wordListOne.length;
int two=wordListTwo.length;
int three=wordListThree.length;

int rand1=(int)(Math.random()*one);
int rand2=(int)(Math.random()*two);
int rand3=(int)(Math.random()*three);

String phrase=wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
System.out.println("What we need is a : " + phrase);
}
}
