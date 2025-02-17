import java.Supplier;
class LambdaExpression
{
    public static void main(String[] ar){
       Supplier<Double> g=()->Math.PI;
       System.out.println(g.get());
   }
}