class EnumExample4{
enum Season{ 
WINTER(5), SPRING(10), SUMMER(15), FALL(20); 

private int value;
private Season(int value){
this.value=value;
}
}
public static void main(String args[]){
for (Season s : Season.values())
System.out.println(s+" - ordinal="+s.ordinal()+", Value="+s.value);

System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal()); 

}}
