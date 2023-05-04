package idk.content;

import arc.struct.*;
import mindustry.game.Objectives.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.content.*;
//import static mindustry.content.SectorPresets.*;
import static mindustry.content.TechTree.*;
import static idk.content.EarthUnitTypes.*;
import static idk.content.EarthBlocks.*;

public class EarthTechtree{

    public static void load(){
        EarthPlanets.earth.techTree = nodeRoot("earth", EarthBlocks.fortress, false, () -> {
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
                            });
                            node(EarthBlocks.sorter, () -> {
                                node(EarthBlocks.reversesorter);
                                node(EarthBlocks.surplussorter);
                                node(EarthBlocks.shortagesorter);
                            });
                               node(EarthBlocks.smallsilo, () -> {
                                node(EarthBlocks.largesilo);
                            });
                       });//idk im testing stuff
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
            node(EarthBlocks.leadWall, () -> {
                    node(EarthBlocks.leadWallLarge);
                    node(EarthBlocks.ironWall, () -> {
                    node(EarthBlocks.ironWallLarge);
                    //node(EarthBlocks.smallbattery, () -> {
                   // node(EarthBlocks.largebattery);
                   // });
                    });
                });//walls
                      node(EarthBlocks.solo, () -> {
            node(EarthBlocks.trio, () -> {
            node(EarthBlocks.volley);
            });
            node(EarthBlocks.char1, () -> {
                        node(EarthBlocks.pelt, () -> {
            node(EarthBlocks.rust);
                            node(EarthBlocks.ordnance, () -> {
            node(EarthBlocks.ridge);
            });
            });
            });
                  node(EarthBlocks.splice, () -> {
                                    node(EarthBlocks.spear, () -> {
                  node(EarthBlocks.break1);
                  node(EarthBlocks.intercept);
                                        node(EarthBlocks.anticipate, () -> {
                                                    node(EarthBlocks.cataclysm, () -> {
            node(EarthBlocks.aperture);
            });
            });
                  });   
                  });          
                node(EarthBlocks.converge, () -> {
                    node(EarthBlocks.apparition);
                    node(EarthBlocks.hurricane, () -> {
                    node(EarthBlocks.limit);
                    });
                });
            });//turrets
                                    node(EarthBlocks.carbonsequestrator, () -> {
            node(EarthBlocks.carboncatalyst, () -> {
            node(EarthBlocks.steelSmelter, () -> {
            
            node(EarthBlocks.siliconblastfurnace, () -> {
                        node(EarthBlocks.surgeblastfurnace, () -> {
                            node(EarthBlocks.phasefabricator, () -> {
            node(EarthBlocks.voltitesynthesizer);
            });
            });
            });
                  //node(EarthBlocks.oxidationmixer, () -> {
                    //  node(EarthBlocks.explosivespacker, () -> {
                   //   node(EarthBlocks.flamemixer);
                    //  });
                //  });
                                    
                node(EarthBlocks.bronzefurnace, () -> {
                    node(EarthBlocks.boiler, () -> {
                    node(EarthBlocks.pressurizer);
                    });
                });
            });
            });
            
            });//crafters
                            node(EarthBlocks.broadcaster, () -> {
                    node(EarthBlocks.stronghold, () -> {
                    node(EarthBlocks.bunker);
                    });
                });//cores
            node(EarthBlocks.groundassembler, () -> {
                    node(EarthUnitTypes.LCLW, () -> {
                    node(EarthUnitTypes.LCLWA);
                    });
                    node(EarthUnitTypes.MCLW, () -> {
                    node(EarthUnitTypes.MCLWA);
                    });
                    node(EarthUnitTypes.HCLW, () -> {
                    node(EarthUnitTypes.HCLWA);
                    });
                    node(EarthUnitTypes.LCMW, () -> {
                    node(EarthUnitTypes.LCMWA);
                    });
                    node(EarthUnitTypes.MCMW, () -> {
                    node(EarthUnitTypes.MCMWA);
                    });
                    node(EarthUnitTypes.HCMW, () -> {
                    node(EarthUnitTypes.HCMWA);
                    });
                    node(EarthUnitTypes.LCHW, () -> {
                    node(EarthUnitTypes.LCHWA);
                    });
                    node(EarthUnitTypes.MCHW, () -> {
                    node(EarthUnitTypes.MCHWA);
                    });
                    node(EarthUnitTypes.HCHW, () -> {
                    node(EarthUnitTypes.HCHWA);
                    });
                    node(EarthBlocks.droneport, () -> {
                    node(EarthUnitTypes.smallbuilderdrone);
                    });
                });//units 
        });//end of whole tree
 }
  }
