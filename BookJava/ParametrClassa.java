package BookJava;

public class ParametrClassa {
    public static void main(String[] args) {

        Body body = new Body();

        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();

         Robot <SmallHead> robot1  = new Robot<SmallHead>(body,smallHead);
          robot1.getHead().sayIt();

         Robot <BigHead> robot2 = new Robot<BigHead>(body,bigHead);
         robot2.getHead().sowIt();

         Robot<MediumHead> robot3 = new Robot<MediumHead>(body,mediumHead);
         robot3.getHead().doIT();



    }





}
