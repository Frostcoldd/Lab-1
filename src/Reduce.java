public class Reduce {
    static void main(String[] args) {
        int i = 100;
        int k = 0;
        while(i != 0){
            boolean even = i % 2 == 0;
            boolean odd = i % 2 == 1;
            if (even){
            i = i/2;
                k++;}
            if (odd){
            i--;
                k++;}
        }
        System.out.println(k);
    }
}
