package ua.goit.java;

import java.util.*;



abstract class Instrument{
    public abstract String getType();

    @Override
    public String toString() {
        return "Instrument{"+getType()+"}";
    }
}
class Trumpet extends Instrument {

    @Override
    public String getType() {
        return "trumpet";
    }
}

     class Piano extends Instrument {

        @Override
        public String getType() {
            return "piano";
        }
    }


     class Guitar extends Instrument {

        @Override
        public String getType() {
            return "guitar";
        }


    }

    class InstrumentsShop {
        int pianos;
        int guitars;
        int trumpets;

        public int getPianos() {
           return pianos;
        }

        public void setPianos(int pianos) {
            this.pianos = pianos;
        }

        public int getGuitars() {
            return guitars;
        }

        public void setGuitars(int guitars) {
            this.guitars = guitars;
        }

        public int getTrumpets() {
            return trumpets;
        }

        public void setTrumpets(int trumpets) {
            this.trumpets = trumpets;
       }





        @Override
        public String toString() {
            return "Instrumental shop{" +
                    "pianos=" + pianos +
                    ", guitars=" + guitars +
                    " and Trumpets=" + trumpets + "}";
        }
    }
        public class NumbersOfMusicalInstruments {

            public static void main(String[] args) {
                InstrumentsShop shop = new InstrumentsShop();

                shop.setPianos(2);
                shop.setGuitars(16);
                shop.setTrumpets(7);

                System.out.println(shop);
                System.out.println();

                Map<String, Integer> order1 = new HashMap<>();
                order1.put("pianos", 0);
                order1.put("guitars", 7);
                order1.put("trumpets", 2);

                Map<String, Integer> order2 = new HashMap<>();
                order2.put("pianos", 1);
                order2.put("guitars", 0);
                order2.put("trumpets", 0);

                Map<String, Integer> order3 = new HashMap<>();
                order3.put("pianos", 1);
                order3.put("guitars", 8);
                order3.put("trumpets", 6);


                System.out.println("First order: 0 pianos, 7 guitars, 2 trumpets");
                List<Instrument> instrumentsToRemove = prepareOrder(shop, order1);

                System.out.println("First order has done!");
                System.out.println(shop);
                System.out.println();

                System.out.println("Second order: 1 pianos, 0 guitars, 0 trumpets");
                List<Instrument> instrumentsToRemove2 = prepareOrder(shop, order2);

                System.out.println("Second order has done!");
                System.out.println(shop);
                System.out.println();

                System.out.println("Third order: 1 pianos, 8 guitars, 6 trumpets");
                List<Instrument> instrumentsToRemove3 = prepareOrder(shop, order3);
                System.out.println(shop);

                System.out.println();

            }

            private static List<Instrument> prepareOrder(InstrumentsShop shop, Map<String, Integer> order1) {
                int numberOfPianosToRemove = order1.get("pianos");
                int numberOfGuitarsToRemove = order1.get("guitars");
                int numberOfTrumpetsToRemove = order1.get("trumpets");

                try {

                    if (shop.getPianos() < numberOfPianosToRemove) throw new IllegalStateException();
                    if (shop.getGuitars() < numberOfGuitarsToRemove) throw new IllegalStateException();
                    if (shop.getTrumpets() < numberOfTrumpetsToRemove) throw new IllegalStateException();

                    shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
                    shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
                    shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetsToRemove);

                    List<Instrument> result = new ArrayList<>();
                    for (int i = 0; i < numberOfPianosToRemove; i++) {
                        result.add(new Piano());
                    }
                    for (int i = 0; i < numberOfGuitarsToRemove; i++) {
                        result.add(new Guitar());
                    }
                    for (int i = 0; i < numberOfTrumpetsToRemove; i++) {
                        result.add(new Trumpet());
                    }
                    return result;
                } catch (IllegalStateException ex) {
                    System.out.println("Order hasn't done, not enough musical instruments in the shop!");
                } return null;
            }
            private static List<Instrument> prepareOrder2(InstrumentsShop shop, Map<String, Integer> order2) {
                int numberOfPianosToRemove = order2.get("pianos");
                int numberOfGuitarsToRemove = order2.get("guitars");
                int numberOfTrumpetsToRemove = order2.get("trumpets");

                if (shop.getPianos() < numberOfPianosToRemove) throw new IllegalStateException();
                if (shop.getGuitars() < numberOfGuitarsToRemove) throw new IllegalStateException();
                if (shop.getTrumpets() < numberOfTrumpetsToRemove) throw new IllegalStateException();

                shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
                shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
                shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetsToRemove);

                List<Instrument> result = new ArrayList<>();
                for (int i = 0; i < numberOfPianosToRemove; i++) {
                    result.add(new Piano());
                }
                for (int i = 0; i < numberOfGuitarsToRemove; i++) {
                    result.add(new Guitar());
                }
                for (int i = 0; i < numberOfTrumpetsToRemove; i++) {
                    result.add(new Trumpet());
                }
                return result;
            }
            private static List<Instrument> prepareOrder3(InstrumentsShop shop, Map<String, Integer> order3) {
                int numberOfPianosToRemove = order3.get("pianos");
                int numberOfGuitarsToRemove = order3.get("guitars");
                int numberOfTrumpetsToRemove = order3.get("trumpets");

                if (shop.getPianos() < numberOfPianosToRemove) throw new IllegalStateException();
                if (shop.getGuitars() < numberOfGuitarsToRemove) throw new IllegalStateException();
                if (shop.getTrumpets() < numberOfTrumpetsToRemove) throw new IllegalStateException();

                shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
                shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
                shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetsToRemove);

                List<Instrument> result = new ArrayList<>();
                for (int i = 0; i < numberOfPianosToRemove; i++) {
                    result.add(new Piano());
                }
                for (int i = 0; i < numberOfGuitarsToRemove; i++) {
                    result.add(new Guitar());
                }
                for (int i = 0; i < numberOfTrumpetsToRemove; i++) {
                    result.add(new Trumpet());
                }
                return result;
            }
        }






