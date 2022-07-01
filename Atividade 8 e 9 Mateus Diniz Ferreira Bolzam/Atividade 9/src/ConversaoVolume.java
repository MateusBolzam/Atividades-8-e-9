public class ConversaoVolume
{
    public static float litrosCm3(float litros) {  return litros*1000;  }

    public static float m3Litros(float m3) {  return m3*1000;  }

    public static float m3Cm3(float m3){  return litrosCm3(m3Litros(m3));  }

    public static float m3Pes3(float m3){  return m3*35.32f;  }

    public static float galaoAmLitros(float galoes) {  return galoes * 3.785f;  }
}
