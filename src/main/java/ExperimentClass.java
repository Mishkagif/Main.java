public class ExperimentClass {
    String myField = " ";

    ExperimentClass() {

    }

    public String getMyField() {
        return myField;
    }

    public void setMyField(String myField) {
        this.myField = myField;
    }

    public void speak() {
        System.out.println("ExperimentClass: speak(): myField= "+myField  );
    }
}

