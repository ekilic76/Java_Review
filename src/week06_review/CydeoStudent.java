package week06_review;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public boolean isMarried, isEmployed;
    public int batchName;
    public String programmingLanguage;
    public String groupName;

    public void setInfo(String name, int age, char gender, boolean isMarried, boolean isEmployed, int batchName, String programmingLanguage, String groupName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        this.batchName = batchName;
        this.programmingLanguage = programmingLanguage;
        this.groupName = groupName;
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                ", batchName=" + batchName +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    public void study(){
        System.out.println(name + " is studying " + programmingLanguage);

    }


}
/*
In each object, user should be able to store the:
 name, age, gender, isMarried, isEmployeed, batch, programming language,
 and group number information of the Cydeo student
 */