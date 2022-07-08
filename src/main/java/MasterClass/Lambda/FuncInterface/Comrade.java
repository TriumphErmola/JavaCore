package MasterClass.Lambda.FuncInterface;


class Comrade {
    private String nameOfComrade;
    private int ageOfComrade;

    public Comrade(String nameOfComrade, int ageOfComrade) {
        this.nameOfComrade = nameOfComrade;
        this.ageOfComrade = ageOfComrade;
    }

    public String getNameOfComrade() {
        return nameOfComrade;
    }

    public void setNameOfComrade(String nameOfComrade) {
        this.nameOfComrade = nameOfComrade;
    }

    public int getAgeOfComrade() {
        return ageOfComrade;
    }

    public void setAgeOfComrade(int ageOfComrade) {
        this.ageOfComrade = ageOfComrade;
    }

    @Override
    public String toString() {
        return "Comrade{" +
                "nameOfComrade='" + nameOfComrade + '\'' +
                ", ageOfComrade=" + ageOfComrade +
                '}';
    }
}
