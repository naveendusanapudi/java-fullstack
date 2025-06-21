class Stringsplit {
    public static void main(String[] args) {
        String s1 = "apple,banana,grape";
        String[] fruits = s1.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}