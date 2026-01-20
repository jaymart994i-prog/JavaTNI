public class Student {

    private String name;
    private int study_year;
    private int score = 0;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setStudy_year(int study_year){
        this.study_year = study_year;
    }

    public int getStudy_year(){
        return  this.study_year;
    }

    public int getScore(){
        return this.score;
    }

    public void addPoint(int point){
        this.score += point;
        System.out.println(this.name + " got " + point + " points");
    }

    public String getGrade(){
        if (this.score >= 80) return "A";
        else if(this.score >= 70) return "B";
        else if(this.score >= 60) return "C";
        return "F";
    }
}



















