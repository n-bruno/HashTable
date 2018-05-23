public class HashTestClient {
    public static void main(String[] args) {

        HashClass hash = new HashClass(11);
        
        hash.insert(11);
        hash.print();
        System.out.println(hash.belongs(11));
        hash.omit(11);
        hash.print();
    }
}
