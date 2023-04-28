package idk.content;

import arc.struct.*;
import mindustry.game.Objectives.*;

import idk.content.*;
//import static mindustry.content.*;
//import static mindustry.content.SectorPresets.*;
import static mindustry.content.TechTree.*;
//import static mindustry.content.UnitTypes.*;

public class EarthTechtree{

    public static void load(){
        EarthPlanets.earth.techTree = nodeRoot("earth", fortress, () -> {
            node(drillMechanical);
            
        });
 }
  }
