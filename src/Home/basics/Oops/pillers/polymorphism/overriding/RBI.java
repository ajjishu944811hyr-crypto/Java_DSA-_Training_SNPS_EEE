package Home.basics.Oops.pillers.polymorphism.overriding;

public class RBI {
    double rateofinterest() {
        return 6.8;
    }
}


    class HDFC extends RBI {
        @Override
        double rateofinterest() {
            return 7.2;
        }
    }

    class ICICI extends RBI {
        @Override
        double rateofinterest() {
            return 7.5;
        }

    }
    class CANARA extends RBI {
        @Override
        double rateofinterest() {
            return 7.9;
        }


        public static void main(String[] args) {
            //Upcasting -> Parent obj = new Child();
            RBI rbi = new RBI();
            HDFC hdfc = new HDFC();
            ICICI icici = new ICICI();
            CANARA canara = new CANARA();
            System.out.println("The ROI of RBI is: " + rbi.rateofinterest() + "%");
            System.out.println("The ROI of HDFC is: " + hdfc.rateofinterest() + "%");
            System.out.println("The ROI of ICICI is: " + icici.rateofinterest() + "%");
            System.out.println("The ROI of CANARA is: " + canara.rateofinterest() + "%");
        }
    }
