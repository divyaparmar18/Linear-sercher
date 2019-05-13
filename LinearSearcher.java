public class LinearSearcher {
    public static void main(String[] args) {
        int toBeSearched = Integer.parseInt(args[0]);
        if(IfNumberInList(toBeSearched)) {
            System.out.println("number  present in the list");
            return;
        }
        System.out.println("number is not in the list");
}

    private static boolean IfNumberInList(int number) {
        int[] serachNumIn = {12, 34, 23, 45, 67, 8, 76, 53, 55, 67, 2, 56, 78, 43, 6};
        for (int i = 0; i < serachNumIn.length; i++) {
            if(serachNumIn[i] == number){
              return true;
            }
        }
        return false;
    }

}

