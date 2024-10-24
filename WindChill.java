public class WindChill {
    public static void main(String[] args) {
        double temparatur = Double.parseDouble(args[0]);
        double windgeschwindigkeit = Double.parseDouble(args[1]);
        double effektiveTemperatur= 35.74 + 0.6215 * temparatur + (0.4275 * temparatur - 35.75) * Math.pow(windgeschwindigkeit, 0.16);

        System.out.println(effektiveTemperatur);

    }
}
