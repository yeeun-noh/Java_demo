package ex10;

class Parent2 {
   int x = 100;

   Parent2() {
      this(200);
      System.out.println("Parent2()");
   }

   Parent2(int x) {
      System.out.println("Parent2(int x)");
      this.x = x; 
   }

   int getX() { return x; }
}

class Child2 extends Parent2 {
   int x = 3000;

   Child2() { 
      this(1000);
      System.out.println("Child2()");
   }

   Child2(int x) {    
      this.x = x;
      System.out.println("Child2(int x)");
   }
}

class Exam09 {
   public static void main(String[] args) {
      Child2 c = new Child2();
      System.out.println("getX()= " + c.getX());
      System.out.println("x= " + c.x);
   }
}

/* (실행결과:)

Parent2(int x)
Parent2()
Child2(int x)
Child2()
getX()= 200
x= 1000

 */
