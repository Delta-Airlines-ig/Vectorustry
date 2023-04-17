package idk.content;

import arc.*;
import arc.graphics.*;
import mindustry.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.type.*;

public class EarthItems{
    public static Item 
        //voltite
        //voltite, 
    //other things
    iron, lithium, tin, steel, stone;
  //add voltite alloys
//static here? \/
    public static void load(){
       // voltite = new Item("voltite", Color.valueOf("00f0ec")){{
                //description = "seemingly magical substance. holds alot of charge and will react violently with itself in certain conditions. when alloyed with metals, they become far more durable for some reason. this was discovered hundreds of years ago but was never published for unknown reasons, we only know this because of some old documents found aboard the spacecraft that crashed on Serpulo.";
                //charge = 9.5f;
                //radioactivity = 0f;
                //explosiveness = 1f;
                //flammability = 0f;
                //cost = 0.1f;
                //hardness = 15;
      //  }};


      
        iron = new Item("iron"){{
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};

        lithium = new Item("lithium"){{
            flammability = 0.1f;
            explosiveness = 0.3f;
            charge = 0.75f;
            hardness = 1;
        }};

        tin = new Item("tin"){{
            explosiveness = 0f;
            hardness = 1;
        }};

        stone = new Item("stone"){{
            hardness = 0;
        }};

        steel = new Item("steel", Color.valueOf("ec83af")){{
            flammability = 0f;
            cost = 2;
        }};

    }
}
