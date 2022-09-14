// Lab02vst.java

public class Lab02vst {

    public static void main(String args[]){
        System.out.println("Lab 02, 80 Point Version\n\n");
        System.out.print("Measure today's knowledge ");
        System.out.println("by yesterday's confusion.");
        System.out.println("Bewilderment + Exposure = Obvious\n");

        // An alternative method instead of manually doing System.out.println
        String[] lines = new String[] {
                "# ##### #####\t##### ##### # #   # ##### #####",
                "# #   # #   #\t#   # #   # # ##  #   #   #",
                "# #   # #   #\t##### #   # # # # #   #   #####",
                "# #   # #   #\t#     #   # # #  ##   #       #",
                "# ##### #####\t#     ##### # #   #   #   #####",
                "" // Extra line here as the example has an extra line at the end.
        };

        // now to loop instead of using println manually
        for (int i = 0; i < lines.length; i++) {
            String element = lines[i];
            System.out.println(element);
        }


    }

}
