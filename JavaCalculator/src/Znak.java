public class Znak {
    double  rezultatDeistviya(int a, int b, char znak) {

        try {
            WrongInput.WrongInput(znak);
        } catch (ZnakException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        if (znak == '+') return (double)a + b;
        else if (znak == '-') return  (double)a - b;
        else if (znak == '*') return  (double)a * b;
        else return  (double)a / b;

    }
}
