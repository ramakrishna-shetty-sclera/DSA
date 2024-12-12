class Main {

    public static void main(String[] args) {
        Max_number_of_K_pairs test = new Max_number_of_K_pairs();
        int[] array = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        Integer result =  test.maxOperations(array,2);
        System.out.println(result);
        System.out.println(array);
    }
}
