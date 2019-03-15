package linkedlist;
//By:Tamer Raid Al Naizi, ID:1201707707.

import linkedlist.student;
import java.util.Comparator;

public class studentCompartor implements Comparator<student> {

    @Override
    public int compare(student s1, student s2) {
        if (s1.getAvg() > s2.getAvg()) {
            return 1;
        } else {
            if (s1.getAvg() < s2.getAvg()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
