package idk.content;

import arc.*;
import arc.graphics.*;
import mindustry.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.ctype.UnlockableContent;

public class EarthItems{
    public static Item 
        //unit stuff
        lightchasis, mediumchasis, heavychasis, lightweapons, mediumweapons, heavyweapons, 
        //voltite
        voltite, 
    //other things
    iron, lithium, tin, steel, stone, aluminum, uranium;
  //add voltite alloys
    public static void load(){
        voltite = new Item("voltite", Color.valueOf("00f0ec")){{
            localizedName = "voltite";
               description = "seemingly magical substance. holds a lot of charge and will react violently with itself in certain conditions. when alloyed with metals, they become far more durable for some reason. this was discovered hundreds of years ago but was never published for unknown reasons, we only know this because of some old documents found aboard the spacecraft that crashed on Serpulo.";
                charge = 9.5f;
                radioactivity = 0f;
                explosiveness = 1f;
                flammability = 0.2f;
                cost = 0.1f;
                //hardness = 15;
       }};


      
        iron = new Item("iron"){{
            localizedName = "iron";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};

        lithium = new Item("lithium"){{
            localizedName = "lithium";
            description = "used in batteries and other electronic components, also a bit explosive";
            flammability = 0.1f;
            explosiveness = 0.3f;
            charge = 0.75f;
            hardness = 1;
        }};

        tin = new Item("tin"){{
            localizedName = "tin";
            description = "like iron but not quite, used for building things";
            explosiveness = 0f;
            hardness = 1;
        }};

        stone = new Item("stone"){{
            description = "very basic resource, used for some basic machinery and other basic stuff. makes strong walls";
            localizedName = "stone";
            hardness = 0;
        }};

        steel = new Item("steel", Color.valueOf("ec83af")){{
            description = "stronger than iron, steel is used in many advanced machines";
            localizedName = "steel";
            flammability = 0f;
            cost = 2;
        }};
        aluminum = new Item("aluminum", Color.valueOf("ec83af")){{
            description = "lightweight, durable metal. useful for unit construction and some buildings";
            localizedName = "aluminum";
            flammability = 0f;
            hardness = 2;
            cost = 1;
        }};
        uranium = new Item("uranium", Color.valueOf("ec83af")){{
            description = "used in a similer way to thorium but is far more radioactive";
            localizedName = "uranium";
            hardness = 3;
            radioactivity = 2f;
            flammability = 0f;
            cost = 1;
        }};
                lightchasis = new Item("lightchasis"){{
            localizedName = "lightchasis";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};
                        mediumchasis = new Item("mediumchasis"){{
            localizedName = "mediumchasis";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};
                        heavychasis = new Item("heavychasis"){{
            localizedName = "heavychasis";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};
                lightweapons = new Item("lightweapons"){{
            localizedName = "lightweapons";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};
                mediumweapons = new Item("mediumweapons"){{
            localizedName = "mediumweapons";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};        
                heavyweapons = new Item("heavyweapons"){{
            localizedName = "heavyweapons";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};        
    }
}
