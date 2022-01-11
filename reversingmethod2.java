public class reversingmethod2 {
    public static void main(String[] args) {
        String name = "uoyknaht";
        System.out.println(reversing(name));
    }

    public static StringBuilder reversing(String name) {

        StringBuilder ans = new StringBuilder();
        char[] temp = name.toCharArray();
        for (int i = temp.length-1; i >= 0; i--) {
            ans.append(temp[i]);
        }
        return ans;
    }
}
