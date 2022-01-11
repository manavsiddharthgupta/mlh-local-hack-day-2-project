public class reversing {
    public static void main(String[] args) {
        String name = "em gnikcehc rof uoyknaht ih";
        System.out.println(reverse(name));
    }
    public static String reverse(String name) {
        String str = "";
        char[] ans = new char[name.length()];
        for (int i = ans.length-1; i >= 0 ; i--) {
            ans[i]= name.charAt(ans.length-1-i);
            str=ans[i]+str;
        }
        return str;
    }
}
