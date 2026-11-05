public class Student {
    private String name;
    private double score;

    public Student(String name, double initialScore){
        this.name =name;
        setScore(initialScore);
    }
    public double getScore(){
        return score;
    }
    public String getName() {
        return name;
    }
    public void setScore(double score){
        if(score < 0 || score > 100){
            throw new IllegalArgumentException("Score must be between 1 and 100");

        }
        this.score= score;
    }
}
