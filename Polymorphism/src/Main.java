public class Main {

    public static void main(String[] args) {

        Phone phone = new Phone("Oppo A57");
        System.out.println(phone.getModel());
        phone.features();


        Samsung samsung = new Samsung("Samsung A53");
        // samsung.setModel("A53");
        System.out.println(samsung.getModel());
        samsung.features();

        System.out.println("==================================");
        // Polymorphism
        Phone phonesam1 = new Main().phone(2);
        System.out.println(phonesam1.getModel());
        phonesam1.features();

        Phone phonesam = new Samsung("Samsung Note 8");
        System.out.println(phonesam.getModel());
        phonesam.features();

        System.out.println("==================================");

        Phone nokia1 = new Main().phone(1);
        System.out.println(nokia1.getModel());
        nokia1.features();

        Phone nokia = new Nokia("Nokia 3310");
        System.out.println(nokia.getModel());
        nokia.features();
    }

    public Phone phone(int dailyDriver){

        switch (dailyDriver)
        {
            case 1:
                return new Nokia("3310");
            case 2:
                return new Samsung("A73");
        }
        return null;
    }
}
