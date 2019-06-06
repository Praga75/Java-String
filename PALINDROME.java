import java.util.*;
public class Palindrome {
public static void main(String[] args) {
String str="goodgo";
int i;
ArrayList<Character> li=new ArrayList<Character>();
ArrayList<Character> list=new ArrayList<Character>();

for(i=0;i<str.length();i++) {

if(li.contains(str.charAt(i))) {
li.remove((Character)str.charAt(i));
}

else {
li.add(str.charAt(i));
list.add(str.charAt(i));
}

}

list.removeAll(li);
System.out.println(li);
System.out.println(list);


String s="";

for(char c:list) {
  s+=c;
}

for(char c:li) {
  s+=c;
}

Collections.reverse(list);

for(char c:list) {
  s+=c;
}
String s1="";
for(i=s.length()-1;i>=0;i--)
s1+=s.charAt(i);

if(s.equals(s1))
    System.out.print(s);
else 
    System.out.print("-1");
    
}
}
