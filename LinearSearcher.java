public class LinearSearcher {
    public static void main(String[] args) {
        int toBesearched = Integer.parseInt(args[0]);
        int [] serachNumIn = {12,34,23,45,67,8,76,53,55,67,2,56,78,43,6};
        for(int number : serachNumIn){
            if (toBesearched == number){
                System.out.println("yes number is present in the list");
                return;
            }
        }
        System.out.println("not present in the list");
    }
}
