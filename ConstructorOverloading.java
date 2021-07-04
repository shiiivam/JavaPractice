
class ConPrac{
    int no1;
    
    ConPrac(){
        no1 = 5;
    }
    
    ConPrac(int no){
        no1 = no;
    }
    
    public void func1(){
        System.out.println(no1);
    }
    
}

public class ConstructorOverloading
{
	public static void main(String[] args) {
        ConPrac obj1 = new ConPrac();
        obj1.func1();
	}
}
