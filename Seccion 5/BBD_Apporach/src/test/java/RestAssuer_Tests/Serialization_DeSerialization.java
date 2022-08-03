package RestAssuer_Tests;

class Test implements java.io.Serializable {
    int i =10,j=20;

}

public class Serialization_DeSerialization {

    public static void main(String[] args) throws java.io.IOException, ClassNotFoundException {
         Test t1 = new RestAssuer_Tests.Test();

         // Serialization
        java.io.FileOutputStream fos= new java.io.FileOutputStream("test.txt");
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
        oos.writeObject(t1);

        // De-serialization
        java.io.FileInputStream fis = new java.io.FileInputStream("test.txt");
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);

        Test t2 = (RestAssuer_Tests.Test) ois.readObject();
        System.out.println(t2.i +"  " + t2.j);

    }
}
