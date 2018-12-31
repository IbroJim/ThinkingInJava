public class Main {

    public static void main(String[] args) {
        DataOnly dataOnly=new DataOnly();
        dataOnly.i=4;
        dataOnly.b=true;
        dataOnly.d=14.4d;
        System.out.println("int i="+dataOnly.i+'\n'+"boolean b="+dataOnly.b+"\n"+"double d="+dataOnly.d);

    }
}
