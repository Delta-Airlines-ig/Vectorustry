package Vec.content;

import arc.*;
import arc.graphics.*;
import arc.struct.*;
import mindustry.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.ctype.UnlockableContent;

import static mindustry.content.Items.*;

public class EarthItems{
    public static Item 
    //other things
    kilobyte, byte, bit, object, file, directory;
  //add voltite alloys
    
   public static final Seq<Item> KeepItems = new Seq<>();
    public static final Seq<Item> Begone = new Seq<>();
    
    public static void load(){
        kilobyte = new Item("kilobyte", Color.valueOf("d99d73")){{
            localizedName = "kilobyte";
            hardness = 1;
            cost = 0.5f;
            alwaysUnlocked = true;
        }};
        byte = new Item("byte", Color.valueOf("8c7fa9")){{
            localizedName = "byte";
            hardness = 1;
            cost = 0.7f;
        }};
        bit = new Item("bit"){{
            localizedName = "bit";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};
              object = new Item("object"){{
            localizedName = "object";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};
                    file = new Item("file"){{
            localizedName = "file";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};
                          directory = new Item("directory"){{
            localizedName = "directory";
            description = "iron, sort of like copper, used in many buildings";
            flammability = 0f;
            explosiveness = 0f;
            hardness = 0;
        }};
        //        KeepItems.addAll(
        //        voltite, iron, lithium, tin, steel, aluminum, uranium, carbon, oxidizer, explosivemix, silicon, copper2, lead2, sand, surgeAlloy, phaseFabric, graphite
       // );
       //                 Begone.addAll(
       //         thorium, beryllium, tungsten, oxide, carbide, fissileMatter, dormantCyst, scrap, coal, titanium, plastanium, sporePod, blastCompound, pyratite, copper, metaglass, lead
       // );
    }
}
