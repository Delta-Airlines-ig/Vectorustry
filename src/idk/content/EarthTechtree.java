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
        EarthPlanets.earth.techTree = nodeRoot("earth", EarthBlocks.fortress, () -> {
            node(EarthBlocks.drillMechanical, () -> {
                node(EarthBlocks.well);
              node(EarthBlocks.drillPneumatic, () -> {
                    node(EarthBlocks.drillBore, () -> {
                        node(EarthBlocks.drillExcavator);
                               });
                            });
                       });//end of drills
            node(EarthBlocks.ironconveyor, () -> {
            node(EarthBlocks.steelconveyor);
                node(EarthBlocks.allotor, () -> {
                    node(EarthBlocks.allocator);
                });
                node(EarthBlocks.interchange, () -> {
                    node(EarthBlocks.span);
                    node(EarthBlocks.surplussorter, () -> {
                    node(EarthBlocks.shortagesorter);
                    });
                });
            });//conveyors and stuff
            node(EarthBlocks.copperpipe, () -> {
            node(EarthBlocks.bronzepipe);
                node(EarthBlocks.smalltank, () -> {
                    node(EarthBlocks.largetank);
                });
                node(EarthBlocks.pipeallocator);
                node(EarthBlocks.pipeinterchange, () -> {
                    node(EarthBlocks.pipespan);
                });
            });//pipes and stuff
                        node(EarthBlocks.solarpanel, () -> {
            node(EarthBlocks.solarcollector);
                node(EarthBlocks.steamgenerator, () -> {
                    node(EarthBlocks.turbinegenerator);
                    node(EarthBlocks.nuclearreactor, () -> {
                                            node(EarthBlocks.fusionreactor, () -> {
                                                node(EarthBlocks.voltitereactor);
                });
                });
                });
                node(EarthBlocks.powerline, () -> {
                    node(EarthBlocks.powerpylon);
                    node(EarthBlocks.smallbattery, () -> {
                    node(EarthBlocks.largebattery);
                    });
                });
            });//power and stuff
                        node(EarthBlocks.solo, () -> {
            node(EarthBlocks.trio, () -> {
            node(EarthBlocks.volley);
            });
            node(EarthBlocks.char1, () -> {
                        node(EarthBlocks.pelt, () -> {
            node(EarthBlocks.rust);
            node(EarthBlocks.ordnance);
            });
            });
                  node(EarthBlocks.splice, () -> {
                  node(EarthBlocks.spear);
                  });          
                node(EarthBlocks.converge, () -> {
                    node(EarthBlocks.powerpylon);
                    node(EarthBlocks.smallbattery, () -> {
                    node(EarthBlocks.largebattery);
                    });
                });
            });//turrets
        });//end of whole tree
 }
  }
