package LEC11_Encapsulation.Finalvariable;

class Bike {

    final void run() {
        System.out.println("running");
    }

    class Honda extends Bike {

        @Override
        void run() {
            System.out.println("Running safely with 100kmph");
        }

        public static void main(String[] args) {
            Honda honda = new Honda();
            honda.run();
        }
    }
}
