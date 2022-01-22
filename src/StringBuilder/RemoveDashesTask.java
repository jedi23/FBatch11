package StringBuilder;

public class RemoveDashesTask {

    /*
      Task: create a method that will take StringBuilder as a parameter
      and this method will delete "dashes"(-) from it
      and return/show the word without dashes
      I-n-te-rv-i-ew
     */

    public static void deletingDash(StringBuilder builder){
        for (int i = 0; i<builder.length(); i++){
            if (builder.charAt(i) == '-'){
                builder.deleteCharAt(i);
            }
        }
        System.out.println(builder);
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("I-n-t-e-r-v-i-e-w");
        deletingDash(stringBuilder);
    }

}
