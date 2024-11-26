public class Main{
    public static void main(String[] args){
        System.out.println("Hello Word");

        String[] books = {"Jca Programming", "Database Design", "Web Development"};
        System.err.println("Avalable Books:");
        for (String book : books){
            System.err.println("-" + book);
        }
    }

}