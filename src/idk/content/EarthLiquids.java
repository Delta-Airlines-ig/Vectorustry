package mindustry.content;

import arc.graphics.*;
import mindustry.type.*;

public class EarthLiquids{
    public static Liquid oxygen, carbondioxide, steam, highpressuresteam;

    public static void load(){

        oxygen = new Liquid("oxygen", Color.valueOf("596ab8")){{
          gas = true;
          coolant = false;
            heatCapacity = 0.4f;
            flammability = 1.2f;
        }};

        carbondioxide = new Liquid("carbon-dioxide", Color.valueOf("ffa166")){{
          gas = true;
          coolant = false;

        }};

        steam = new Liquid("steam", Color.valueOf("313131")){{
          gas = true;
          coolant = false;
            temperature = 0.75f;
        }};

        highpressuresteam = new Liquid("high-pressure-steam", Color.valueOf("6ecdec")){{
          gas = true;
          coolant = false;
            heatCapacity = 0.9f;
            temperature = 0.75f;
        }};

    }
}
