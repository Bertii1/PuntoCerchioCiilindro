public class cerchio extends punto {
    private float raggio;

    // Costruttore
    public cerchio(float pX, float pY, float raggio) {
        super(pX, pY); // Chiamata al costruttore della classe base
        this.raggio = raggio;
    }

    // Metodo per calcolare l'area
    public double area() {
        return Math.PI * Math.pow(raggio, 2);
    }

    // Metodo per calcolare il perimetro
    public double perimetro() {
        return 2 * Math.PI * raggio;
    }

    // Getter per il raggio
    public float getRaggio() {
        return raggio;
    }

    // Setter per il raggio (opzionale)
    public void setRaggio(float raggio) {
        this.raggio = raggio;
    }

    // Getter per il centro (ereditato da Punto)
    public punto getCentro() {
        return new punto(getX(), getY());
    }

    @Override
    public String toString() {
        return "Cerchio: {Centro=(" + getX() + ", " + getY() + "), Raggio=" + raggio + "}";
    }
}
