package lab6;

    class Average {

        public static double average(int[] array) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum / array.length;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

            System.out.println(average(array));
        }
    }
