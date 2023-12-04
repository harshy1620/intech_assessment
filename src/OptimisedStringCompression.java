class OptimisedStringCompression {

    public static void optimisedCompress(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length();i++){
            int repetition = 1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                repetition++;
                i++;
            }
            sb.append(s.charAt(i)).append(repetition);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // Input: a2b2c1a3c3
        String str = "a2b2c1a3c3";
       optimisedCompress(str);
    }
}