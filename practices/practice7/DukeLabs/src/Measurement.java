public class Measurement {
    final String[] SI_UNITS = {"s", "m", "kg", "A", "K", "mol", "cd"};
    final String[] IMPERIAL_UNITS = {"ft", "lb", "F"};
    final double ft2m = 0.3048;
    final double lb2kg = 0.4536;
    String note;
    double value;
    String unit;

    boolean isSI(String unit){
        for (String u : SI_UNITS) {
            if (u.equals(unit)){
                return true;
            }
        }
        return false;
    }
}

