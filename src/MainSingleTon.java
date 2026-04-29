 class SingleTon {

     private static SingleTon instance;

     private SingleTon() {

         System.out.println("Object is created ");
     }

     public static SingleTon getInstance() {
         if (instance == null) {

             instance = new SingleTon();
         }

         return instance;
     }
 }
    public  class  MainSingleTon {

        static void main(String[] args) {

            SingleTon obj= SingleTon.getInstance();
            SingleTon obj1= SingleTon.getInstance();

            System.out.println(obj==obj1);
        }

    }

