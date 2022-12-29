public class QueRecursion {
    //The process in which a function calls itself directly or indirectly
    // is called recursion and the corresponding function is called as recursive function. 
    // Using recursive algorithm, certain problems can be solved quite easily.

    public static void main(String[] args) {
        System.out.println(power(2,5));
    }

    public static int power(int base, int raise){
        if (raise==0){
            return 1;
        }else{
            return base*power(base, raise-1);
        }
    }
}
