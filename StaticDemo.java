
package com.mycompany.myjavaproject;

class Test{
static int x =10;

static void display(){
System.out.println(x);

}


}

class StaticDemo {
    public static void main(String main[]){
        
        Test obj1 , obj2;
                
        obj1 = new Test();
        obj2 = new Test();
        
        ++obj1.x;
        System.out.print(" x in obj1 :");
        obj1.display();
        
        ++obj2.x;
        System.out.print(" x in obj2 :");
        obj2.display();
        
    }
}
