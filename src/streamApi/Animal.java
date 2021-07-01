package streamApi;

public class Animal {
    private String specie;
    private boolean canFly;
    private int age;
    private Classification classification;

    public Animal() {
    }

    public Animal(String specie) {
        this.specie = specie;
    }

    public Animal(String specie, int age, boolean canFly, Classification classification) {
        this.specie = specie;
        this.canFly = canFly;
        this.age = age;
        this.classification = classification;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public boolean canFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "streamApi.Animal{" +
                "specie='" + specie + '\'' +
                ", canFly=" + canFly +
                ", age=" + age +
                ", classification=" + classification +
                '}';
    }
}
