public class Student {
    String name;
    double csc303;
    double mth201;
    double gst202;
    double csc315; // Fourth course


    double average() {
        return (csc303 + mth201 + gst202 + csc315) / 4.0;
    }

    String grade() {
        double avg = average();
        if(avg >= 70) return "A";
        else if(avg >= 60) return "B";
        else if(avg >= 50) return "C";
        else if (avg >= 45) return "D";
        else return "F";
    }

    // Updated highest to include fourth course
    double highest() {
        return Math.max(csc303, Math.max(mth201, Math.max(gst202, csc315)));
    }

    // POST LAB EXERCISE: status() method
    String status() {
        if (average() >= 45) {
            return "Pass";
        } else {
            return "Carry over";
        }
    }

    void printReport() {
        System.out.println("Name    : " + name);
        System.out.println("Average : " + average());
        System.out.println("Grade   : " + grade());
        System.out.println("Highest : " + highest());
        System.out.println("Status  : " + status());
        System.out.println("----------------------------------");
    }

    public static void main(String[] args){
        Student[] students = new Student[3];
        
        students[0] = new Student();
        students[0].name = "Amaka";
        students[0].csc303 = 72;
        students[0].mth201 = 55;
        students[0].gst202 = 63;
        students[0].csc315 = 70;

        students[1] = new Student();
        students[1].name = "Bola";
        students[1].csc303 = 40;
        students[1].mth201 = 48;
        students[1].gst202 = 52;
        students[1].csc315 = 42;


        students[2] = new Student();
        students[2].name = "Oluchi";
        students[2].csc303 = 79;
        students[2].mth201 = 80;
        students[2].gst202 = 99;
        students[2].csc315 = 91;


        System.out.println("==================================");
        System.out.println("      SEMESTER RESULTS SHEET      ");
        System.out.println("==================================");

        for (int i = 0; i < students.length; i++) {
            students[i].printReport();
        }
    }
}

