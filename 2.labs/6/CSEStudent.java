public class CSEStudent extends Student         /* a6q5 */
{
    static int total = 0;
    static String courses[] = {"CSE110", "CSE111", "CSE220", "CSE221"};

    static void details() {
        System.out.println("Total CSE Students: " + total);
        System.out.println("Available Lab Based Courses: ");
        System.out.println("CSE110 CSE111 CSE220 CSE221");
    }

    int find(String c) {
        for (int i = 0; i < courses.length; i++) {
            if (c.equals(courses[i])) {
                return i;
            }
        }
        return -1;
    }
    
    void addLabBasedCourse(String c) {
        int k = find(c);
        if (k == -1) {
            System.out.println("It is not a lab based course!");
        }
        else {
            super.courses += c + " ";
        }
    }

    CSEStudent(String n, int ag) {
        super(n, ag);
    }
}
