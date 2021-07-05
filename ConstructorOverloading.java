
class ConPrac{
    int no1, no2;
    String name;
    
    ConPrac(){
        no1 = 5;
    }
    
    ConPrac(int no, String pName){
        no1 = no;
        name = pName
        no2 = 30
    }
    
    public void func1(){
        System.out.println(no1);
    }
    
}

public class ConstructorOverloading
{
	public static void main(String[] args) {
        ConPrac obj1 = new ConPrac(10, "Shivam");
        obj1.func1();
	}
}
