package by.it.rydzeuski.jd01_04;

class InOut {
    public static void main(String[] args) {

    }

    static double[] getArray(String line) {
        // 1 2 3 4 5.24
        String[] strArr = line.split(" ");
        double[] res = new double[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            res[i] = Double.parseDouble(strArr[i]);
        }
        return res;
    }


    static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    static void printArray(double[ ] arr, String name, int columnCount){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-10.4f " ,name,i,arr[i]);
            if ((i+1)%columnCount==0 || i+1== arr.length)
                System.out.println();
        }
    }
}
