public class punto {
    private float pX;
    private float pY;
    private final float Max = 1000;

    // Costruttore
    public punto(float pX, float pY) {
        if (Math.abs(pX) > Max || Math.abs(pY) > Max) {
            throw new IllegalArgumentException("Le coordinate devono essere comprese tra -" + Max + " e " + Max);
        }
        this.pX = pX;
        this.pY = pY;
    }

    // Metodo per calcolare la distanza tra due punti Dee o'boia
    public double distanza(punto altropunto) {
        return Math.sqrt(Math.pow(altropunto.pX - this.pX, 2) + Math.pow(altropunto.pY - this.pY, 2));
    }

    // Metodo per spostare il punto
    public void muoviPunto(float mX, float mY) {
        float nuovoX = pX + mX;
        float nuovoY = pY + mY;

        if (Math.abs(nuovoX) > Max || Math.abs(nuovoY) > Max) {
            throw new IllegalArgumentException("Le nuove coordinate superano il limite di " + Max);
        }

        pX = nuovoX;
        pY = nuovoY;
    }

    // Getter per le coordinate
    public float getX() {
        return pX;
    }

    public float getY() {
        return pY;
    }

    // Override del metodo toString gg
    @Override
    public String toString() {
        return "Punto: (x: " + pX + ", y: " + pY + ")";
    }
}
