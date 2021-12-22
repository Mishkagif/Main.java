public  class OtherStaticClass {
//
   static String myField = "Собака";

    OtherStaticClass() {
//
    }

    public String getMyField() {
        return myField;
    }

    public void setMyField(String myField) {
        this.myField = myField;
    }

    public void speak() {
        System.out.println("ExperimentClass: speak(): myField= " + myField);

    }

}

