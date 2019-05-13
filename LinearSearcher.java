public class LinearSearcher {
    public static void main(String[] args) {
        int toBeSearched = Integer.parseInt(args[0]);
        if(IfNumberInList(toBeSearched)) {
            return;
        }
        System.out.println("number is not in the list");
}

    private static boolean IfNumberInList(int number) {
        int[] serachNumIn = {12, 34, 23, 45, 67, 8, 76, 53, 55, 67, 2, 56, 78, 43, 6};
        for (int i = 0; i < serachNumIn.length; i++) {
            if(serachNumIn[i] == number){
                System.out.println("Number present in the list and it is at index " + i);

                return true;
            }
        }
        return false;
    }

}

