public class cilindro{

    private float altezza ;

    public cilindro(cerchio c,float altezza) {
        altezza = this.altezza;
    }

    public double areasuperficie(){
        return 2*(Math.PI*cerchio.getRaggio()*altezza) + 2*(Math.PI*Math.pow(cerchio.getRaggio(),2));//Stot=2πrh+2πr2

    }


}
