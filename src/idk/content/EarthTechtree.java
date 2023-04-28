package idk.content;

import arc.struct.*;
import mindustry.game.Objectives.*;

import static idk.content.*;
import static mindustry.content.*;
import static mindustry.content.SectorPresets.*;
import static mindustry.content.TechTree.*;
import static mindustry.content.UnitTypes.*;

public class SerpuloTechTree{

    public static void load(){
        Planets.earth.techTree = nodeRoot("earth", fortress, () -> {

            node(conveyor, () -> {

                node(junction, () -> {
                    node(router, () -> {
                        
                        node(distributor);
                        node(sorter, () -> {
                            node(invertedSorter);
                            node(overflowGate, () -> {
                                node(underflowGate);
                            });
                        });
                        //node(container, Seq.with(new SectorComplete(biomassFacility)), () -> {
                          //  node(unloader);
                          //  node(vault, Seq.with(new SectorComplete(stainedMountains)), () -> {

                          //  });
                        //});

                        node(itemBridge, () -> {
                            node(titaniumConveyor, () -> {
                                node(phaseConveyor, () -> {
                                    node(massDriver, () -> {

                                    });
                                });

                                node(payloadConveyor, () -> {
                                    node(payloadRouter, () -> {

                                    });
                                });

                                node(armoredConveyor, () -> {
                                    node(plastaniumConveyor, () -> {

                                    });
                                });
                            });
                        });
                    });
                });
            });

            node(stronghold, () -> {
                node(bunker, () -> {

                });
            });

            node(mechanicalDrill, () -> {

                node(mechanicalPump, () -> {
                    node(conduit, () -> {
                        node(liquidJunction, () -> {
                            node(liquidRouter, () -> {
                                node(liquidContainer, () -> {
                                    node(liquidTank);
                                });

                                node(bridgeConduit);

                                node(pulseConduit);

                                    node(platedConduit, () -> {

                                    });

                                    
                                });
                            });
                        });
                    });
                });

                
                    node(pneumaticDrill, () -> {
                       

                        

                      //  node(laserDrill, () -> {
                          //  node(blastDrill, () -> {

                          //  });

                            node(waterExtractor);
                                //node(oilExtractor, () -> {

                                //});
                       // });
                   

                   // node(pyratiteMixer, () -> {
                   //     node(blastMixer, () -> {

                    //    });
                  //  });

                    node(siliconSmelter);

                        //node(sporePress, () -> {
                         //   node(coalCentrifuge, () -> {
                           //     node(multiPress, () -> {
                           //         node(siliconCrucible, () -> {

                            ///        });
                           //     });
                           // });

                           
                        });

                        node(kiln, () -> {
                            
                                        node(surgeSmelter, () -> {

                                        });


                     });

                        //logic disabled until further notice
                        node(microProcessor, () -> {
                            node(switchBlock, () -> {
                                node(message, () -> {
                                    node(logicDisplay, () -> {
                                        node(largeLogicDisplay, () -> {

                                        });
                                    });

                                    node(memoryCell, () -> {
                                        node(memoryBank, () -> {

                                        });
                                    });
                                });

                                node(logicProcessor, () -> {
                                    node(hyperProcessor, () -> {

                                    });
                                });
                            });
                        });

                        node(illuminator, () -> {

                        });
                    });
                });


                node(combustionGenerator, Seq.with(new Research(Items.coal)), () -> {
                    node(powerNode, () -> {
                        node(powerNodeLarge, () -> {
                            node(diode, () -> {
                                node(surgeTower, () -> {

                                });
                            });
                        });

                        node(battery, () -> {
                            node(batteryLarge, () -> {

                            });
                        });

                        node(mender, () -> {
                            node(mendProjector, () -> {
                                node(forceProjector, Seq.with(new SectorComplete(impact0078)), () -> {
                                    node(overdriveProjector, Seq.with(new SectorComplete(impact0078)), () -> {
                                        node(overdriveDome, Seq.with(new SectorComplete(impact0078)), () -> {

                                        });
                                    });
                                });

                                node(repairPoint, () -> {
                                    node(repairTurret, () -> {

                                    });
                                });
                            });
                        });

                        node(steamGenerator, Seq.with(new SectorComplete(craters)), () -> {
                            node(thermalGenerator, () -> {
                                node(differentialGenerator, () -> {
                                    node(thoriumReactor, Seq.with(new Research(Liquids.cryofluid)), () -> {
                                        node(impactReactor, () -> {

                                        });

                                        node(rtgGenerator, () -> {

                                        });
                                    });
                                });
                            });
                        });

                        node(solarPanel, () -> {
                            node(largeSolarPanel, () -> {

                            });
                        });
                    });
                });
            });

            node(duo, () -> {
                node(copperWall, () -> {
                    node(copperWallLarge, () -> {
                        node(titaniumWall, () -> {
                            node(titaniumWallLarge);

                            node(door, () -> {
                                node(doorLarge);
                            });
                            node(plastaniumWall, () -> {
                                node(plastaniumWallLarge, () -> {

                                });
                            });
                            node(thoriumWall, () -> {
                                node(thoriumWallLarge);
                                node(surgeWall, () -> {
                                    node(surgeWallLarge);
                                    node(phaseWall, () -> {
                                        node(phaseWallLarge);
                                    });
                                });
                            });
                        });
                    });
                });
node(trio, () -> {
                node(scatter, () -> {
                    node(hail, Seq.with(new SectorComplete(craters)), () -> {
                        node(salvo, () -> {
                            node(swarmer, () -> {
                                node(cyclone, () -> {
                                    node(spectre, Seq.with(new SectorComplete(nuclearComplex)), () -> {

                                    });
                                });
                            });
                        });

                            node(ripple, () -> {
                                node(fuse, () -> {

                                });
                            });
                        });
                    });
                });

                node(scorch, () -> {
                    node(arc, () -> {
                        node(wave, () -> {
                            node(parallax, () -> {
                                node(segment, () -> {

                                });
                            });

                            node(tsunami, () -> {

                            });
                        });

                        node(lancer, () -> {
                            node(meltdown, () -> {
                                node(foreshadow, () -> {

                                });
                            });

                            node(shockMine, () -> {

                            });
                        });
                    });
                });
            });

            node(groundFactory, () -> {

                node(dagger, () -> {
                    node(mace, () -> {
                        node(fortress, () -> {
                            node(scepter, () -> {
                                node(reign, () -> {

                                });
                            });
                        });
                    });

                    node(nova, () -> {
                        node(pulsar, () -> {
                            node(quasar, () -> {
                                node(vela, () -> {
                                    node(corvus, () -> {

                                    });
                                });
                            });
                        });
                    });

                    node(crawler, () -> {
                        node(atrax, () -> {
                            node(spiroct, () -> {
                                node(arkyid, () -> {
                                    node(toxopid, () -> {

                                    });
                                });
                            });
                        });
                    });
                });

                node(airFactory, () -> {
                    node(flare, () -> {
                        node(horizon, () -> {
                            node(zenith, () -> {
                                node(antumbra, () -> {
                                    node(eclipse, () -> {

                                    });
                                });
                            });
                        });

                        node(mono, () -> {
                            node(poly, () -> {
                                node(mega, () -> {
                                    node(quad, () -> {
                                        node(oct, () -> {

                                        });
                                    });
                                });
                            });
                        });
                    });

                    

                node(additiveReconstructor, Seq.with(new SectorComplete(biomassFacility)), () -> {
                    node(multiplicativeReconstructor, () -> {
                        node(exponentialReconstructor, Seq.with(new SectorComplete(overgrowth)), () -> {
                            node(tetrativeReconstructor, () -> {

                            });
                        });
                    });
                });
            });

            

             
            nodeProduce(Items.copper, () -> {
                nodeProduce(Liquids.water, () -> {

                });

                nodeProduce(Items.lead, () -> {
                    nodeProduce(Items.titanium, () -> {
                        nodeProduce(Liquids.cryofluid, () -> {

                        });

                        nodeProduce(Items.thorium, () -> {
                            nodeProduce(Items.surgeAlloy, () -> {

                            });

                            nodeProduce(Items.phaseFabric, () -> {

                            });
                        });
                    });

                    nodeProduce(Items.metaglass, () -> {

                    });
                });

                nodeProduce(Items.sand, () -> {
                    nodeProduce(Items.scrap, () -> {
                        nodeProduce(Liquids.slag, () -> {

                        });
                    });

                    nodeProduce(Items.coal, () -> {
                        nodeProduce(Items.graphite, () -> {
                            nodeProduce(Items.silicon, () -> {

                            });
                        });

                        nodeProduce(Items.pyratite, () -> {
                            nodeProduce(Items.blastCompound, () -> {

                            });
                        });

                        nodeProduce(Items.sporePod, () -> {

                        });

                        nodeProduce(Liquids.oil, () -> {
                            nodeProduce(Items.plastanium, () -> {

                            });
                        });
                    });
                });
            });
        });
    }
}
