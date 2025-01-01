public class Main {
    public static void main(String[] args){

        punto p1 =new punto(3,5);
        punto centro =new punto(6,8);
        cerchio c =new cerchio(centro,32);
        System.out.println("distanza:"+p1.distanza(centro));
        System.out.println(c.toString());


    }






}