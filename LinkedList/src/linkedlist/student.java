package linkedlist;
//By:Tamer Raid Al Naizi, ID:1201707707.

public class student implements Comparable<student> {

    private int id;
    private String name;
    private double avg;
    
    public student(int id){
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAvg() {
        return avg;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public int compareTo(student s) {
        if (this.getId() > s.getId()) {
            return -1;
        } else {
            if (this.getId() < s.getId()) {
                return 1;
            } else {
                return 0;
            }

        }
    }

}
