public class LinearSearcher {
    public static void main(String[] args) {
        int toBesearched = Integer.parseInt(args[0]);
        if(getNumchecker(toBesearched)) {
            System.out.println("number  present in the list");
            return;
        }
        System.out.println("number is not in the list");
}

    private static boolean getNumchecker(int number) {
        int[] serachNumIn = {12, 34, 23, 45, 67, 8, 76, 53, 55, 67, 2, 56, 78, 43, 6};
        for (int num : serachNumIn) {
            if (number == num) {
                return true;
            }
        }
        return false;
    }

}

