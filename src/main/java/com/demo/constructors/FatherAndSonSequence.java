package com.demo.constructors;

public class FatherAndSonSequence {
	public static void main(String[] args) {
		//System.out.println("--父类主程序--");
	    //FatherTest father=new FatherTest("父亲的名字");
	    //father.speak();
	    
	    System.out.println("--子类主程序--");
	    FatherTest father=new FatherTest("父亲的名字");
	    father.speak();
	    SonTest son=new SonTest("儿子的名字");
	    son.speak();
	    
	    Child c=new Child("mike");
	    System.out.println();
	    System.out.println(c.toString());
	}

}

class FatherTest {
    private String name;
	
    FatherTest(){
       System.out.println("--父类的无参构造函数--");
    }
	
    FatherTest(String name){
       this.name=name;
       System.out.println("--父类的有参构造函数--"+this.name);
    }
	
    static{
       System.out.println("--父类的静态代码块--");
    }

    {

       System.out.println("--父类的非静态代码块--");

    }

    public void speak(){
       System.out.println("--父类的方法--");
    }
}

class SonTest extends FatherTest {
    private String name;
    static{
       System.out.println("--子类的静态代码块--");
    }

    {
       System.out.println("--子类的非静态代码块--");
    }

    SonTest(){
       System.out.println("--子类的无参构造函数--");
    }

    SonTest(String name){
       this.name=name;
       System.out.println("--子类的有参构造函数--"+this.name);
    }

    @Override
    public void speak(){
       System.out.println("--子类Override了父类的方法--");
    }  
}

class People{

    String name;
    public People(){
        System.out.printf("1");
    }

    public People(String name){
        System.out.printf("2");
        this.name=name;
    }
}

class Child extends People{
	People father;
    public Child(String name){
        System.out.printf("3");
        this.name=name;
        father=new People(name+"F");
    }
    public Child(){
        System.out.printf("4");
    }
}
