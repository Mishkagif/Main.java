public class Main {
    /**
     * Перечень хотелок To-do list
     */

    public static void main(String[] args) {
        ExperimentClass ec1 = new ExperimentClass();
        ExperimentClass ec2 = new ExperimentClass();
        ec1.setMyField("Фраза 1");
        ec2.setMyField("Фраза 2 ");
        ec1.speak();
        ec2.speak();


        OtherStaticClass osc1 = new OtherStaticClass();
        OtherStaticClass osc2 = new OtherStaticClass();
        osc1.setMyField("Фраза 3 ");
        osc2.setMyField("Фраза 4 ");
        osc1.speak();
        osc2.speak();

    }

}


