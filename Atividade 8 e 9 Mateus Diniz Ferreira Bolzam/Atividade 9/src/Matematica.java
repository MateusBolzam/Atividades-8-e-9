import java.lang.Math;

public class Matematica
{

    public static float regraDeTres(float n1, float n1Resposta, float n2){  return (n1Resposta * n2)/n1;  }

    public static float[] bhaskara(float a, float b, float c)
    {
        float[] rtrn = new float[2];
        float delta = ((float)Math.pow(b, 2.0d) - (4*a*c));
        rtrn[0] = ((b*(-1)) + (float)Math.sqrt(delta))/(2*a);
        rtrn[1] = ((b*(-1)) - (float)Math.sqrt(delta))/(2*a);
        return rtrn;
    }

    public static float hipotenusa(float catAdj, float catOposto) {  return (float)Math.sqrt((float)Math.pow(catAdj,2.0d) + (float)Math.pow(catOposto,2.0d));  }

    public static float areaTrapezio(float bMenor, float bMaior, float h) {  return ((bMaior + bMenor) * h)/2;  }
}
