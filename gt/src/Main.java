public class Main {
    public static void main(String[] args) {
        //1D Array for names
        String[] names = {"Juan", "Pedro", "Carlos", "Pacita", "Alejandro", "Ricardo", "Rodolfo", "Gonzalo", "Fidel", "Jesus"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();
        //1D Array with 20 Elements

        int sum = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
    }
}