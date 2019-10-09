public class Primer {
    void primer (String... stroki){

        try {
            int a = Integer.parseInt(stroki[0]);
            int b = Integer.parseInt(stroki[2]);
            char znak = stroki[1].charAt(0);

            try {
                WrongInput.WrongInput(a,b);
            }catch (NamberException e){
                System.out.println(e.getMessage());
                System.exit(0);
            }

            double z = new Znak().rezultatDeistviya(a, b, znak);

            if ( z % 1==0) System.out.println( (int)z);
            else System.out.println(z);

        }catch (NumberFormatException e){
            System.out.println( new PrimerR().rimNamber(stroki));
        }

    }
}
