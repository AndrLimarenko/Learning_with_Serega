public class Girl extends Woman {

    public Girl(double weight, double height) {
        super(weight, height);
    }
    @Override
    public void imtWomanCalcuation (){
        double imt;
        double ideal = Math.abs(height-130);
        imt=weight/((height/100)*(height/100));
        System.out.println("IMT коэфициент:"+imt);
        if ((imt>=20)&(imt<=25))
            System.out.println("нормально все с весом");
        if (imt>25)
            System.out.println("лучше похудеть на " + (weight-ideal)+ " килограмм");
        if (imt<20)
            System.out.println("лучше набрать вес на " + (ideal-weight)+ " килограмм");
        System.out.println();
    }
}
