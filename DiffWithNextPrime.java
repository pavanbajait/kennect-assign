public class DiffWithNextPrime {
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;

        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5; i <= num / 2; i = i + 1)
            if (num % i == 0 || num % (i + 2) == 0)
                return false;

        return true;
    }

    static int nextPrime(int N) {
        if (N <= 1)
            return 2;
        int prime = N;
        boolean found = false;
        while (!found) {
            prime++;
            if (isPrime(prime))
                found = true;
        }
        return prime;
    }

    public static void main(String[] args) {
        int N = 3;
        if (isPrime(N)) {
            System.out.println("The number " + N + " is Prime Number");
        } else {
            System.out.println("The number " + N + " is not Prime Number");
        }
        System.out.println("Difference between Number & the next Prime number " + (nextPrime(N) - N));
    }
}
