package idk.content;


import arc.graphics.*;
import arc.*;
import arc.graphics.g2d.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.content.*;
import idk.content.*;
//import idk.world.blocks.storage.*;

import static idk.content.EarthLiquids.*;
import static idk.content.EarthUnitTypes.*;
import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static arc.graphics.g2d.Draw.rect;
import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;

@SuppressWarnings("deprecation")
public class EarthBlocks{
    //environment
    
    public static Block Redsand, ExposedStone, ExposedStoneWall, RedishStoneWall, RedStonewall, RedStone, RedishStone,
    //ores
    oreIron, oreAluminum, oreLithium, oreTin, oreUranium, oreGraphite, oreCopper2, oreLead2,   //not done with uranium
    //walls
    leadWall, leadWallLarge, stoneWall, stoneWallLarge, ironWall, ironWallLarge, steelWall, steelWallLarge,
    //transport
    copperpipe, bronzepipe, ironconveyor, steelconveyor, allocator, allotor, interchange, span, surplussorter, shortagesorter, sorter, reversesorter, pipeinterchange, pipeallocator, pipespan, 
    //storage
    smalltank, largetank, smallsilo, largesilo, 
    //water drills
    well, 
    //drills
    drillMechanical, drillPneumatic, drillBore, drillExcavator, 
    //turrets
    solo, trio, converge, char1, pelt, splice, spear, volley, ridge, break1, rust, ordnance, intercept, hurricane, anticipate, apparition, cataclysm, divide, limit, aperture, 
    //cores
    damagedshard, fortress, stronghold, bunker, unitcomputer, broadcaster, //broadcaster will be required for completion of required sectors 
    //power
    voltitereactor, steamgenerator, turbinegenerator, nuclearreactor, fusionreactor, solarpanel, solarcollector, windturbine, powerline, powerpylon, smallbattery, largebattery,    
    //unit building
    groundassembler, airassembler, groundchasisassembler, 
    //drone port wip
    droneport, 
    //crafting
    steelSmelter, voltitesynthesizer, carboncatalyst, carbonsequestrator, siliconblastfurnace, surgeblastfurnace, phasefabricator, furnace, oxidationmixer, explosivespacker, boiler, pressurizer, flamemixer, bronzefurnace, 
    //world processor pt2
	   hyperworldprocessor, hyperworldcell; 

    public static void load() {
        Redsand = new Floor("redsand"){{
            localizedName = "redsand";
            itemDrop = Items.sand; 
            playerUnmineable = true;
            variants = 0;
            albedo = 0.5f;
        }};
        ExposedStone = new Floor("exposed-stone"){{
       //     itemDrop = EarthItems.stone; 
       //     localizedName = "exposed-stone";
            wall = ExposedStoneWall;
           // playerUnmineable = true;
            variants = 0;
            albedo = 0.5f;
        }};

        ExposedStoneWall = new StaticWall("exposed-stone-wall"){{
            localizedName = "exposed-stone-wall";
            variants = 0;
        }};
        RedishStoneWall = new StaticWall("redishstone-wall"){{
            localizedName = "redishstone-wall";
            variants = 0;
        }};
        RedStonewall = new StaticWall("redstone-wall"){{
            localizedName = "redstone-wall";
            variants = 0;
        }};

        RedStone = new Floor("redstone"){{
            localizedName = "redstone";
            wall = RedStonewall;
            speedMultiplier = 1f;
            variants = 0;
            albedo = 0.5f;
        }};
        RedishStone = new Floor("redishstone"){{
            localizedName = "redishstone";
            wall = RedishStoneWall;
            speedMultiplier = 1f;
            variants = 0;
            albedo = 0.5f;
        }};
        //endregion

        //ores
        oreIron = new OreBlock(EarthItems.iron){{
            oreDefault = true;
            oreThreshold = 0.841f;
            oreScale = 25.580953f;
            variants = 2;
        }};
                oreCopper2 = new OreBlock(EarthItems.copper2){{
            oreDefault = true;
            oreThreshold = 0.841f;
            oreScale = 25.580953f;
            variants = 2;
        }};
                        oreLead2 = new OreBlock(EarthItems.lead2){{
            oreDefault = true;
            oreThreshold = 0.841f;
            oreScale = 25.580953f;
            variants = 2;
        }};
        oreAluminum = new OreBlock(EarthItems.aluminum){{
            oreDefault = true;
            oreThreshold = 0.849f;
            oreScale = 15.580953f;
            variants = 2;
        }};
        oreLithium = new OreBlock(EarthItems.lithium){{
            oreDefault = true;
            oreThreshold = 0.869f;
            oreScale = 10.580953f;
            variants = 2;
        }};
        oreTin = new OreBlock(EarthItems.tin){{
            oreDefault = true;
            oreThreshold = 0.879f;
            oreScale = 9.580953f;
            variants = 2;
        }};
         oreGraphite = new OreBlock(Items.graphite){{
            oreDefault = true;
            oreThreshold = 0.841f;
            oreScale = 25.580953f;
            variants = 2;
        }};
          oreUranium = new OreBlock(EarthItems.uranium){{
            oreDefault = true;
            oreThreshold = 0.889f;
            oreScale = 25.580953f;
            variants = 2;
        }};
        //cores and stuff
        fortress = new CoreBlock("core-fortress"){{
            localizedName = "Fortress";
            requirements(Category.effect, BuildVisibility.editorOnly, with(EarthItems.copper2, 1000, EarthItems.lead2, 800));
            alwaysUnlocked = true;
            
   /*         drawer = new DrawMulti(
            new DrawDefault(),
            new DrawRegion("-radar"){{
                rotateSpeed = 2f;
            }},
            new DrawRegion("-radio"){{
                rotateSpeed = -2f;
                rotation = 45f;
                x = 25;
                y = 25;
            }}
            );
*/
            isFirstTier = true;
            unitType = EarthUnitTypes.delta;
            health = 3100;
            itemCapacity = 8000;
            size = 3;

            unitCapModifier = 16;
        }};

        stronghold = new CoreBlock("core-stronghold"){{
            localizedName = "Stronghold";
            requirements(Category.effect, with(EarthItems.copper2, 3000, EarthItems.lead2, 5000, Items.silicon, 3000, EarthItems.iron, 5000));
            
       /*     drawer = new DrawMulti(
            new DrawDefault(),
            new DrawRegion("-radar"){{
                rotateSpeed = 1f;
            }},
            new DrawRegion("-radio"){{
                rotateSpeed = -1f;
                rotation = 45f;
                x = 50;
                y = 50;
            }}
            );
*/
            unitType = EarthUnitTypes.theta;
            health = 8500;
            itemCapacity = 16000;
            size = 4;
            thrusterLength = 44/4f;

            unitCapModifier = 24;
            researchCostMultiplier = 0.07f;
        }};

        bunker = new CoreBlock("core-bunker"){{
            localizedName = "Bunker";
            requirements(Category.effect, with(EarthItems.copper2, 8000, EarthItems.lead2, 8000, Items.silicon, 5000, EarthItems.steel, 4000, EarthItems.lithium, 6000, EarthItems.aluminum, 5000, EarthItems.iron, 5000));

      /*      //drawer = new DrawMulti(
            //new DrawDefault(),
           // new DrawRegion("-radar"){{
           //     rotateSpeed = 1f;
          //      x = -75;
                
         //   }},
         ///   new DrawRegion("-radio"){{
         //       rotateSpeed = -1f;
        //        rotation = 45f;
        //        x = 75;
                y = 75;
          //  }}, 
          //  new DrawRegion("-windspeed"){{
         //       rotateSpeed = -5f;
          //      rotation = 45f;
        //        x = -75;
        //        y = -75;
            }}
            );
       */     
            unitType = EarthUnitTypes.zeta;
            health = 10000;
            itemCapacity = 32000;
            size = 5;
            thrusterLength = 60/4f;

            unitCapModifier = 32;
            researchCostMultiplier = 0.11f;
        }};
	    //drawers are annoying
	    
	        broadcaster = new GenericCrafter("broadcaster"){{
                    localizedName = "Radio Broadcaster";
            requirements(Category.crafting, with(EarthItems.iron, 260, Items.graphite, 100, EarthItems.aluminum, 50, Items.silicon, 50));
            size = 4;
            hasLiquids = false;

            drawer = new DrawMulti( new DrawRegion("-dish"){{
                rotateSpeed = 0.2f;
                rotation = 0f;
                x = 0;
                y = 0;
            }}, new DrawDefault());
				 
	    placeEffect =  new WaveEffect(){{
                                lifetime = 60f;
                                strokeFrom = 16f;
                                sizeTo = 1630f;
		    		//interp = Interp.ExpIn;
                            }};

	    craftEffect = new SeqEffect (new WaveEffect(){{
                                lifetime = 60f;
                                strokeFrom = 16f;
		    		colorFrom = Color.valueOf("ffffff").a(0f);
		    		colorTo = Color.valueOf("7aeb34").a(1f);
		    		//interp = Interp.ExpIn;
		    		sizeFrom = 100f;
                                sizeTo = 0f;
                            }}, new WaveEffect(){{
                                lifetime = 60f;
                                strokeFrom = 16f;
		    		colorTo = Color.valueOf("ffffff").a(0f);
		    		colorFrom = Color.valueOf("7aeb34").a(1f);
		    		//interp = Interp.ExpOut;
		    		sizeFrom = 0f;
                                sizeTo = 100f;
                            }});
			
	    updateEffect = new WaveEffect(){{
                                lifetime = 10f;
                                strokeFrom = 8f;
		    		colorTo = Color.valueOf("ffffff").a(0f);
		    		colorFrom = Color.valueOf("7aeb34").a(1f);
		    		//interp = Interp.ExpOut;
		    		sizeFrom = 0f;
                                sizeTo = 25f;
                            }};
	    updateEffectChance = 0.00f;
	    craftTime = 300f;
            researchCostMultiplier = 1.1f;
            ambientSound = sound.RadioAmbent;
            ambientSoundVolume = 0.5f;

      //      researchCost = with(Items.silicon, 2000, Items.oxide, 900, Items.beryllium, 2400);
        }};
        //transport
                ironconveyor = new Conveyor("iron-conveyor"){{
            requirements(Category.distribution, with(EarthItems.iron, 1));
            health = 50;
            speed = 0.035f;
            displayedSpeed = 4.4f;
            buildCostMultiplier = 2f;
            researchCost = with(EarthItems.iron, 5);
        }};
                steelconveyor = new Conveyor("steel-conveyor"){{
            requirements(Category.distribution, with(EarthItems.copper2, 1, EarthItems.iron, 1, EarthItems.steel, 1));
            health = 75;
            speed = 0.09f;
            displayedSpeed = 12f;
        }};
                allotor = new Router("allotor"){{
            requirements(Category.distribution, with(EarthItems.iron, 3));
            buildCostMultiplier = 4f;
        }};
                allocator = new Router("allocator"){{
            requirements(Category.distribution, with(EarthItems.lead2, 2, EarthItems.iron, 6));
            buildCostMultiplier = 3f;
            size = 2;
        }};
                span = new BufferedItemBridge("span"){{
            requirements(Category.distribution, with(EarthItems.lead2, 2, EarthItems.iron, 10));
            fadeIn = moveArrows = false;
            range = 5;
            speed = 76f;
            arrowSpacing = 4f;
            bufferCapacity = 28;
        }};
                interchange = new Junction("interchange"){{
            requirements(Category.distribution, with(EarthItems.iron, 2));
            speed = 30;
            capacity = 12;
            health = 40;
            buildCostMultiplier = 6f;
        }};
                surplussorter = new OverflowGate("surplus-sorter"){{
            requirements(Category.distribution, with(EarthItems.iron, 6));
            buildCostMultiplier = 3f;
        }};
                shortagesorter = new OverflowGate("shortage-sorter"){{
            requirements(Category.distribution, with(EarthItems.iron, 6));
            buildCostMultiplier = 3f;
            invert = true;
        }};
        //transport liquid
                copperpipe = new Conduit("copper-pipe"){{
            requirements(Category.liquid, with(EarthItems.copper2, 5));
            health = 50;
        }};
        bronzepipe = new Conduit("bronze-pipe"){{
            requirements(Category.liquid, with(EarthItems.bronze, 2, EarthItems.copper2, 1));
            liquidCapacity = 16f;
            liquidPressure = 1.025f;
            health = 100;
        }};
                pipeallocator = new LiquidRouter("pipe-allocator"){{
            requirements(Category.liquid, with(EarthItems.copper2, 6));
            liquidCapacity = 20f;
            underBullets = true;
            solid = false;
        }};
               pipeinterchange = new LiquidJunction("pipe-interchange"){{
            requirements(Category.liquid, with(EarthItems.copper2, 18));
            solid = false;
        }};
                pipespan = new LiquidBridge("pipe-span"){{
            requirements(Category.liquid, with(EarthItems.copper2, 18));
            fadeIn = moveArrows = false;
            arrowSpacing = 6f;
            range = 4;
            hasPower = false;
        }};
        //liquid storage
                smalltank = new LiquidRouter("small-tank"){{
            requirements(Category.liquid, with(EarthItems.copper2, 10, EarthItems.bronze, 15));
            liquidCapacity = 700f;
            size = 2;
            solid = true;
        }};
                largetank = new LiquidRouter("large-tank"){{
            requirements(Category.liquid, with(EarthItems.copper2, 30, EarthItems.bronze, 40));
            size = 3;
            solid = true;
            liquidCapacity = 1800f;
            health = 500;
        }};
        
        well = new SolidPump("well"){{
            requirements(Category.production, with(EarthItems.bronze, 30, Items.graphite, 30, EarthItems.copper2, 30, EarthItems.iron, 30));
            result = Liquids.water;
            pumpAmount = 0.16f;
            size = 2;
            liquidCapacity = 30f;
            rotateSpeed = 3f;
            attribute = Attribute.water;

            consumePower(1.3f);
        }};
//powerrrrrr
                powerline = new PowerNode("power-line"){{
            requirements(Category.power, with(EarthItems.copper2, 1, EarthItems.iron, 3, EarthItems.lithium, 5));
            maxNodes = 10;
            laserRange = 6;
        }};

        powerpylon = new PowerNode("power-pylon"){{
            requirements(Category.power, with(EarthItems.steel, 5, EarthItems.aluminum, 10, EarthItems.copper2, 3, EarthItems.lithium, 5));
            size = 2;
            maxNodes = 15;
            laserRange = 15f;
        }};
                smallbattery = new Battery("small-battery"){{
            requirements(Category.power, with(EarthItems.copper2, 5, EarthItems.lithium, 20));
            consumePowerBuffered(10000f);
            baseExplosiveness = 3f;
        }};

        largebattery = new Battery("large-battery"){{
            requirements(Category.power, with(EarthItems.iron, 20, EarthItems.lead2, 50, EarthItems.lithium, 30));
            size = 3;
            consumePowerBuffered(70000f);
            baseExplosiveness = 7f;
        }};
                steamgenerator = new ConsumeGenerator("steam-generator"){{
            requirements(Category.power, with(EarthItems.copper2, 75, Items.graphite, 35, EarthItems.bronze, 20, EarthItems.lithium, 30));
            powerProduction = 5.5f;
            consumeLiquid(EarthLiquids.steam, 0.2f);
            hasLiquids = true;
            size = 2;
            generateEffect = Fx.generatespark;

            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.06f;

            drawer = new DrawMulti(
            new DrawDefault(),
            new DrawWarmupRegion(),
            new DrawRegion("-turbine"){{
                rotateSpeed = 5f;
            }},
            new DrawRegion("-cap"),
            new DrawLiquidRegion()
            );
        }};
        
                        turbinegenerator = new ConsumeGenerator("turbine-generator"){{
            requirements(Category.power, with(EarthItems.copper2, 175, Items.graphite, 35, EarthItems.bronze, 30, EarthItems.lithium, 50));
            powerProduction = 8.5f;
            consumeLiquid(EarthLiquids.highpressuresteam, 0.3f);
            hasLiquids = true;
            size = 3;
            generateEffect = Fx.generatespark;

            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.06f;

            drawer = new DrawMulti(
            new DrawDefault(),
            new DrawWarmupRegion(),
            new DrawRegion("-turbine"){{
                rotateSpeed = 15f;
            }},
            new DrawRegion("-cap"),
            new DrawLiquidRegion()
            );
        }};
        
                nuclearreactor = new NuclearReactor("nuclear-reactor"){{
            requirements(Category.power, with(EarthItems.lead2, 300, Items.silicon, 200, EarthItems.steel, 150, EarthItems.uranium, 150, EarthItems.lithium, 50));
            ambientSound = Sounds.hum;
            ambientSoundVolume = 0.24f;
            size = 3;
            health = 700;
            itemDuration = 360f;
            powerProduction = 16f;
            heating = 0.03f;

            consumeItem(EarthItems.uranium);
            consumeLiquid(Liquids.water, heating / coolantPower).update(false);
        }};
        
        fusionreactor = new ImpactReactor("fusion-reactor"){{
            requirements(Category.power, with(EarthItems.lead2, 500, Items.silicon, 300, EarthItems.steel, 400, EarthItems.uranium, 100, Items.surgeAlloy, 250, EarthItems.lithium, 250));
            size = 4;
            health = 1000;
            powerProduction = 150f;
            ambientSound = Sounds.pulse;
            ambientSoundVolume = 0.07f;

            consumePower(40f);
            consumeLiquid(Liquids.hydrogen, 0.25f);
        }};
                voltitereactor = new ImpactReactor("voltite-reactor"){{
            requirements(Category.power, with(EarthItems.lead2, 700, Items.silicon, 600, EarthItems.steel, 600, EarthItems.uranium, 200, Items.surgeAlloy, 350, EarthItems.lithium, 450, EarthItems.voltite, 150));
            size = 4;
            health = 1500;
            powerProduction = 230f;
            itemDuration = 140f;
            ambientSound = Sounds.pulse;
            ambientSoundVolume = 0.09f;

            consumePower(30f);
            consumeItem(EarthItems.voltite);
            consumeLiquid(Liquids.water, 25f);
        }};
        solarpanel = new SolarGenerator("solar-panel"){{
            requirements(Category.power, with(EarthItems.copper2, 10, EarthItems.iron, 15));
            powerProduction = 0.3f;
        }};

        solarcollector = new SolarGenerator("solar-collector"){{
            requirements(Category.power, with(EarthItems.copper2, 80, EarthItems.iron, 110, EarthItems.steel, 15));
            size = 3;
            powerProduction = 1.5f;
        }};

        //turrets
        solo = new ItemTurret("solo"){{
            localizedName = "Solo";
            requirements(Category.turret, with(EarthItems.copper2, 10, EarthItems.iron, 25));
            ammo(
                EarthItems.copper2,  new BasicBulletType(6f, 5){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                    ammoMultiplier = 2;
                }},
                EarthItems.iron, new BasicBulletType(5f, 6){{
                    width = 9f;
                    height = 12f;
                    reloadMultiplier = 0.6f;
                    ammoMultiplier = 4;
                    lifetime = 60f;
                }}
            );
            health = 100;
            size = 1;
            reload = 30f;
            inaccuracy = 1.5f;
            shootCone = 30f;
            range = 100;
        }};
        trio = new ItemTurret("trio"){{
            localizedName = "Trio";
            requirements(Category.turret, with(EarthItems.copper2, 30, EarthItems.iron, 35));
                        ammo(
                EarthItems.copper2,  new BasicBulletType(9f, 7){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                    ammoMultiplier = 2;
                }},
                EarthItems.iron, new BasicBulletType(7f, 9){{
                    width = 9f;
                    height = 12f;
                    reloadMultiplier = 0.75f;
                    ammoMultiplier = 4;
                    lifetime = 60f;
                }}
            );
           shoot = new ShootAlternate(){{
                shots = 3;
                barrels = 3;
                spread = 3.5f;
                shotDelay = 10f;
            }};
            health = 300;
            size = 2;
            reload = 30f;
            inaccuracy = 4f;
            shootCone = 30f;
            range = 150;
        }};
        //scatter equivelent
         converge = new ItemTurret("converge"){{
             localizedName = "Converge";
            requirements(Category.turret, with(EarthItems.copper2, 95, EarthItems.lead2, 55, EarthItems.iron, 50));
            ammo(
                EarthItems.iron, new FlakBulletType(4f, 5){{
                    lifetime = 60f;
                    ammoMultiplier = 5f;
                    shootEffect = Fx.shootSmall;
                    reloadMultiplier = 0.75f;
                    width = 6f;
                    height = 8f;
                    hitEffect = Fx.flakExplosion;
                    splashDamage = 25f * 1.5f;
                    splashDamageRadius = 24f;
                }},
                EarthItems.aluminum, new BasicBulletType(6f, 1){{
                    lifetime = 60f;
                    ammoMultiplier = 5f;
                    shootEffect = Fx.shootSmall;
                    reloadMultiplier = 2f;
                    width = 4f;
                    height = 8f;
                }},
                Items.lead, new FlakBulletType(4.2f, 3){{
                    lifetime = 60f;
                    ammoMultiplier = 4f;
                    shootEffect = Fx.shootSmall;
                    width = 6f;
                    height = 8f;
                    hitEffect = Fx.flakExplosion;
                    splashDamage = 27f * 1.5f;
                    splashDamageRadius = 15f;
                }}
                
            );
            reload = 15f;
            range = 220f;
            size = 2;
            targetGround = false;

            shoot.shotDelay = 0f;
            shoot.shots = 5;

            recoil = 2f;
            rotateSpeed = 15f;
            inaccuracy = 20f;
            shootCone = 35f;

            scaledHealth = 200;
            shootSound = Sounds.shootSnap;
            coolant = consumeCoolant(0.2f);
            researchCostMultiplier = 0.05f;

            limitRange(2);
        }};
        //scortch equivelent
        char1 = new ContinuousLiquidTurret("char"){{
            localizedName = "Char";
            requirements(Category.turret, with(EarthItems.steel, 20, EarthItems.copper2, 150, EarthItems.iron, 140, EarthItems.lead2, 200));

       //     drawer = new DrawTurret("reinforced-"){{

      //          Color heatc = Color.valueOf("fa2859");
      //          heatColor = heatc;

      //          parts.addAll(
      //          new RegionPart("-back"){{
      //              progress = PartProgress.warmup;
      //              mirror = true;
       //             moveRot = 40f;
      //              x = 22 / 4f;
      //              y = -1f / 4f;
      //              moveY = 6f / 4f;
      //              under = true;
       //             heatColor = heatc;
       //         }},
        //        new RegionPart("-front"){{
        //            progress = PartProgress.warmup;
        //            mirror = true;
        //            moveRot = 40f;
         //           x = 20 / 4f;
         //           y = 17f / 4f;
         //           moveX = 1f;
         //           moveY = 1f;
        //            under = true;
        //            heatColor = heatc;
        //        }},
        //        new RegionPart("-nozzle"){{
        //            progress = PartProgress.warmup;
        //            mirror = true;
       //             moveX = 8f / 4f;
       //             heatColor = Color.valueOf("f03b0e");
       //         }});
       //     }};

            liquidConsumed = 10f / 60f;
            targetInterval = 5f;
            targetUnderBlocks = false;

            float r = range = 130f;

            loopSound = Sounds.torch;
            shootSound = Sounds.none;
            loopSoundVolume = 1f;
            targetGround = true;
            targetAir = false;

            //TODO balance, set up, where is liquid/sec displayed? status effects maybe?
            ammo(
            EarthLiquids.flammablemix, new ContinuousFlameBulletType(){{
                damage = 30f;
                length = r;
                knockback = 3f;
                pierceCap = 2;
                buildingDamageMultiplier = 0.3f;

                colors = new Color[]{Color.valueOf("ed752b").a(0.55f), Color.valueOf("ed9f2b").a(0.7f), Color.valueOf("edc32b").a(0.8f), Color.valueOf("f5e322")};
                flareColor = Color.valueOf("ed752b");
                lightColor = hitColor = flareColor;
                flareRotSpeed = 4;
                rotateFlare = true;
            }}
            );

            scaledHealth = 210;
            shootY = 7f;
            size = 3;

          //  researchCost = with(Items.tungsten, 400, Items.silicon, 400, Items.oxide, 80, Items.beryllium, 800);
        }};
        //hail equivelent
        pelt = new ItemTurret("pelt"){{
            localizedName = "pelt";
            requirements(Category.turret, with(EarthItems.copper2, 60, Items.graphite, 25, EarthItems.iron, 50));
            ammo(
                Items.graphite, new ArtilleryBulletType(3f, 10){{
                    knockback = 1f;
                    lifetime = 80f;
                    width = height = 11f;
                    collidesTiles = false;
                    splashDamageRadius = 30f * 0.75f;
                    splashDamage = 50f;
                }},
                Items.silicon, new ArtilleryBulletType(3f, 10){{
                    knockback = 0.8f;
                    lifetime = 80f;
                    width = height = 11f;
                    collidesTiles = false;
                    splashDamageRadius = 30f * 0.75f;
                    splashDamage = 60f;
                    reloadMultiplier = 1.2f;
                    ammoMultiplier = 3f;
                    homingPower = 0.08f;
                    homingRange = 50f;
                }},
                EarthItems.explosivemix, new ArtilleryBulletType(3f, 20){{
                    hitEffect = Fx.blastExplosion;
                    knockback = 0.8f;
                    lifetime = 80f;
                    width = height = 13f;
                    collidesTiles = false;
                    splashDamageRadius = 35f * 2f;
                    splashDamage = 180f;
                    status = StatusEffects.blasted;
                    statusDuration = 60f * 12f;
                    frontColor = Pal.lightishOrange;
                    backColor = Pal.lightOrange;
                    makeFire = true;
                    trailEffect = Fx.incendTrail;
                    ammoMultiplier = 4f;
                }}
            );
            targetAir = false;
            reload = 30f;
            recoil = 2f;
            shoot.shots = 2;
            range = 235f;
            inaccuracy = 5f;
            shootCone = 10f;
            health = 260;
            shootSound = Sounds.bang;
            coolant = consumeCoolant(0.1f);
            limitRange(0f);
        }};
//arc equivelent
        splice = new PowerTurret("splice"){{
            localizedName = "Splice";
            requirements(Category.turret, with(EarthItems.copper2, 75, EarthItems.lead2, 50, EarthItems.iron, 50, Items.silicon, 15));
            shootType = new LightningBulletType(){{
                damage = 5;
                lightningLength = 25;
                collidesAir = false;
                ammoMultiplier = 1f;

                //for visual stats only.
                buildingDamageMultiplier = 0.25f;

                lightningType = new BulletType(0.0001f, 0f){{
                    lifetime = Fx.lightning.lifetime;
                    hitEffect = Fx.hitLancer;
                    despawnEffect = Fx.none;
                    status = StatusEffects.shocked;
                    statusDuration = 10f;
                    hittable = false;
                    lightColor = Color.white;
                    collidesAir = false;
                    buildingDamageMultiplier = 0.25f;
                }};
            }};
            reload = 25f;
            shootCone = 40f;
            rotateSpeed = 8f;
            targetAir = false;
            range = 90f;
            shoot.shots = 20;
            shootEffect = Fx.lightningShoot;
            heatColor = Color.red;
            recoil = 1f;
            size = 1;
            health = 260;
            shootSound = Sounds.spark;
            consumePower(1.5f);
            coolant = consumeCoolant(0.1f);
        }};
        //lancer equivelent
          spear = new PowerTurret("spear"){{
            localizedName = "Spear";
            requirements(Category.turret, with(EarthItems.copper2, 60, EarthItems.lead2, 70, Items.silicon, 80, EarthItems.steel, 30));
            range = 200f;
            shoot = new ShootSpread(3, 15f);
            shoot.firstShotDelay = 25f;

            recoil = 3f;
            reload = 20f;
            shake = 2f;
            shootEffect = Fx.lancerLaserShoot;
            smokeEffect = Fx.none;
            heatColor = Color.red;
            size = 2;
            scaledHealth = 380;
            targetAir = false;
            moveWhileCharging = true;
            accurateDelay = true;
            shootSound = Sounds.laser;
            coolant = consumeCoolant(0.2f);

            consumePower(6f);

            shootType = new LaserBulletType(70){{
                colors = new Color[]{Pal.lancerLaser.cpy().a(0.4f), Pal.lancerLaser, Color.white};
                //TODO merge
                chargeEffect = new MultiEffect(Fx.lancerLaserCharge, Fx.lancerLaserChargeBegin);

                buildingDamageMultiplier = 0.25f;
                hitEffect = Fx.hitLancer;
                hitSize = 4;
                lifetime = 16f;
                drawSize = 400f;
                collidesAir = false;
                length = 173f;
                ammoMultiplier = 1f;
                pierceCap = 4;
            }};
        }};
        //salvo equivelent
        volley = new ItemTurret("volley"){{
            localizedName = "Volley";
            requirements(Category.turret, with(EarthItems.copper2, 100, Items.graphite, 80, EarthItems.steel, 70, EarthItems.aluminum, 50));
            ammo(
                EarthItems.copper2,  new BasicBulletType(2.5f, 6){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                    ammoMultiplier = 2;
                }},
                EarthItems.iron,  new BasicBulletType(2.2f, 8){{
                    width = 8f;
                    height = 10f;
                    lifetime = 60f;
                    ammoMultiplier = 2;
                }},
                Items.graphite, new BasicBulletType(3.5f, 15){{
                    width = 9f;
                    height = 12f;
                    reloadMultiplier = 0.6f;
                    ammoMultiplier = 4;
                    lifetime = 60f;
                }},
                EarthItems.explosivemix, new BasicBulletType(3f, 20){{
                    width = 10f;
                    height = 12f;
                    frontColor = Pal.lightishOrange;
                    backColor = Pal.lightOrange;
                    status = StatusEffects.blasted;
                    hitEffect = new MultiEffect(Fx.hitBulletSmall, Fx.fireHit);

                    ammoMultiplier = 5;

                    splashDamage = 22f;
                    splashDamageRadius = 33f;

                    makeFire = true;
                    lifetime = 60f;
                }},
                Items.silicon, new BasicBulletType(3f, 10, "bullet"){{
                    width = 7f;
                    height = 9f;
                    homingPower = 0.1f;
                    reloadMultiplier = 1.5f;
                    ammoMultiplier = 5;
                    lifetime = 60f;
                }}
            );

            size = 2;
            range = 190f;
            reload = 25f;
            consumeAmmoOnce = false;
            ammoEjectBack = 3f;
            recoil = 3f;
            shake = 1f;
            inaccuracy = 5f;
            shoot.shots = 16;
            shoot.shotDelay = 0.5f;

            ammoUseEffect = Fx.casing2;
            scaledHealth = 240;
            shootSound = Sounds.shootBig;

            limitRange();
            coolant = consumeCoolant(0.2f);
        }};
        //no equivelent, new turret
         rust = new ItemTurret("rust"){{
            localizedName = "Rust";
            requirements(Category.turret, with(EarthItems.copper2, 230, EarthItems.iron, 135, EarthItems.steel, 200, EarthItems.lead2, 300, Items.silicon, 250));
                        ammo(
                EarthItems.iron, new MissileBulletType(6f, 9){{
                    trailChance = 1f;
		            homingPower = 0.05f;
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                    ammoMultiplier = 4;
                    lifetime = 60f;
                    impact = true;
                }}
            );
           shoot = new ShootPattern(){{
                shots = 30;
                shotDelay = 0.5f;
            }};
	    velocityRnd = 0.8f;
            health = 300;
            size = 2;
            reload = 300f;
            inaccuracy = 30f;
            shootCone = 30f;
            range = 150;
        }};
	    //no equivelent, new turret, similer to pelt/hail
        ordnance = new ItemTurret("ordnance"){{
            localizedName = "Ordnance";
            requirements(Category.turret, with(EarthItems.copper2, 260, Items.graphite, 125, EarthItems.iron, 150, EarthItems.steel, 50));
		size = 2;
            ammo(
                Items.graphite, new ArtilleryBulletType(6f, 10){{
                    knockback = 1f;
                    lifetime = 280f;
                    width = height = 11f;
                    collidesTiles = false;
                    splashDamageRadius = 30f * 1f;
                    splashDamage = 60f;
                }},
                Items.silicon, new ArtilleryBulletType(6f, 10){{
                    knockback = 0.8f;
                    lifetime = 280f;
                    width = height = 11f;
                    collidesTiles = false;
                    splashDamageRadius = 30f * 1f;
                    splashDamage = 80f;
                    reloadMultiplier = 1.3f;
                    ammoMultiplier = 3f;
                    homingPower = 0.05f;
                    homingRange = 50f;
                }},
                EarthItems.explosivemix, new ArtilleryBulletType(6f, 20){{
                    hitEffect = Fx.blastExplosion;
                    knockback = 0.8f;
                    lifetime = 280f;
                    width = height = 13f;
                    collidesTiles = false;
                    splashDamageRadius = 35f * 3f;
                    splashDamage = 200f;
                    status = StatusEffects.blasted;
                    statusDuration = 60f * 12f;
                    frontColor = Pal.lightishOrange;
                    backColor = Pal.lightOrange;
                    makeFire = true;
                    trailEffect = Fx.incendTrail;
                    ammoMultiplier = 4f;
                }}
            );
            targetAir = false;
            reload = 60f;
            recoil = 2f;
            shoot.shots = 4;
	    velocityRnd = 0.2f;
	    ammoEjectBack = 6f;
            ammoUseEffect = Fx.casing3Double;
            ammoPerShot = 2;
            range = 535f;
            inaccuracy = 25f;
            shootCone = 25f;
            health = 460;
            shootSound = Sounds.bang;
            coolant = consumeCoolant(0.1f);
            limitRange(0f);
        }};
	    //segment equivelent kinda?
	            intercept = new PointDefenseTurret("intercept"){{
            requirements(Category.turret, with(Items.copper, 130, EarthItems.steel, 180, EarthItems.iron, 40, Items.lead, 40));
			    localizedName = "Intercept";
            scaledHealth = 350;
            range = 440f;
            hasPower = true;
            consumePower(16f);
            size = 2;
            shootLength = 10f;
            bulletDamage = 60f;
            reload = 30f;
            envEnabled |= Env.space;
        }};
        //ripple equivelent
         ridge = new ItemTurret("ridge"){{
             localizedName = "Ridge";
            requirements(Category.turret, with(EarthItems.copper2, 150, Items.graphite, 235, EarthItems.steel, 60, EarthItems.aluminum, 50));
            ammo(
                Items.graphite, new ArtilleryBulletType(3f, 20){{
                    knockback = 0.8f;
                    lifetime = 80f;
                    width = height = 11f;
                    collidesTiles = false;
                    splashDamageRadius = 25f * 0.75f;
                    splashDamage = 33f;
                }},
                Items.silicon, new ArtilleryBulletType(3f, 20){{
                    knockback = 0.8f;
                    lifetime = 80f;
                    width = height = 11f;
                    collidesTiles = false;
                    splashDamageRadius = 25f * 0.75f;
                    splashDamage = 33f;
                    reloadMultiplier = 1.2f;
                    ammoMultiplier = 3f;
                    homingPower = 0.08f;
                    homingRange = 50f;
                }},
                EarthItems.steel, new ArtilleryBulletType(3f, 25){{
                    knockback = 0.8f;
                    lifetime = 80f;
                    width = height = 15f;
                    collidesTiles = false;
                    splashDamageRadius = 25f * 0.6f;
                    splashDamage = 33f;
                }},
                EarthItems.explosivemix, new ArtilleryBulletType(2f, 25, "shell"){{
                    hitEffect = Fx.blastExplosion;
                    knockback = 0.8f;
                    lifetime = 80f;
                    width = height = 14f;
                    collidesTiles = false;
                    ammoMultiplier = 4f;
                    splashDamageRadius = 45f * 1.1f;
                    splashDamage = 60f;
                    backColor = Pal.missileYellowBack;
                    frontColor = Pal.missileYellow;

                    status = StatusEffects.blasted;
                }}
            );

            targetAir = false;
            size = 3;
            shoot.shots = 32;
            inaccuracy = 25f;
            reload = 80f;
            ammoEjectBack = 5f;
            ammoUseEffect = Fx.casing3Double;
            ammoPerShot = 2;
            velocityRnd = 0.7f;
            recoil = 6f;
            shake = 2f;
            range = 290f;
            minRange = 50f;
            coolant = consumeCoolant(0.3f);

            scaledHealth = 130;
            shootSound = Sounds.artillery;
        }};
        //fuse equivelent
                break1 = new ItemTurret("break"){{
                    localizedName = "Break";
            requirements(Category.turret, with(EarthItems.copper2, 225, Items.graphite, 225, EarthItems.steel, 100, Items.surgeAlloy, 25));

            reload = 30f;
            shake = 4f;
            range = 100f;
            recoil = 6f;

            shoot = new ShootSpread(6, 15f);

            shootCone = 50;
            size = 3;
            envEnabled |= Env.space;

            scaledHealth = 220;
            shootSound = Sounds.shotgun;
            coolant = consumeCoolant(0.3f);

            float brange = range + 10f;

            ammo(
                EarthItems.steel, new ShrapnelBulletType(){{
                    length = brange;
                    damage = 66f;
                    ammoMultiplier = 4f;
                    width = 17f;
                    toColor = Color.valueOf("92b0ad");
                    reloadMultiplier = 1.3f;
                }},
                Items.surgeAlloy, new ShrapnelBulletType(){{
                    length = brange;
                    damage = 135f;
                    ammoMultiplier = 5f;
                    toColor = Color.valueOf("f5ec42");
                    shootEffect = smokeEffect = Fx.thoriumShoot;
                }}
            );
        }};
        //cyclone equivelent
         hurricane = new ItemTurret("hurricane"){{
             localizedName = "Hurricane";
            requirements(Category.turret, with(EarthItems.copper2, 200, Items.titanium, 125, Items.surgeAlloy, 80, EarthItems.steel, 50));
            ammo(
                
                EarthItems.explosivemix, new FlakBulletType(4f, 10){{
                    shootEffect = Fx.shootBig;
                    ammoMultiplier = 5f;
                    splashDamage = 45f;
                    splashDamageRadius = 60f;
                    collidesGround = true;

                    status = StatusEffects.blasted;
                    statusDuration = 60f;
                }},
                Items.surgeAlloy, new FlakBulletType(4.5f, 5){{
                    ammoMultiplier = 5f;
                    splashDamage = 50f * 1.5f;
                    splashDamageRadius = 38f;
                    lightning = 2;
                    lightningLength = 7;
                    shootEffect = Fx.shootBig;
                    collidesGround = true;
                    explodeRange = 20f;
                }}
            );
            shootY = 8.75f;
            shoot = new ShootBarrel(){{
                barrels = new float[]{
                0f, 1f, 0f,
                3f, 0f, 0f,
                -3f, 0f, 0f,
                };
            }};
            shoot.shots = 2; 
            reload = 4f;
            range = 200f;
            size = 3;
            recoil = 3f;
            rotateSpeed = 10f;
            inaccuracy = 15f;
            shootCone = 30f;
            shootSound = Sounds.shootSnap;
            coolant = consumeCoolant(0.3f);

            scaledHealth = 145;
            limitRange();
        }};
        //foreshadow equivelent
                anticipate = new ItemTurret("anticipate"){{
                    localizedName = "Anticipate";
            float brange = range = 800f;
                    
            shoot.firstShotDelay = 125f;
                    
            requirements(Category.turret, with(EarthItems.copper2, 1000, EarthItems.lithium, 600, Items.surgeAlloy, 300, EarthItems.voltite, 200, Items.silicon, 600, EarthItems.steel, 500));
            ammo(
                EarthItems.voltite, new PointBulletType(){{
                    shootEffect = new Effect(24f, e -> {
                                         e.scaled(10f, b -> {
                                         color(Color.valueOf("96c4d9"), Color.valueOf("5fb6de"), b.fin());
                                         stroke(b.fout() * 3f + 0.2f);
                                         Lines.circle(b.x, b.y, b.fin() * 50f);
                                         });

                                          Color.valueOf("5fb6de");

                                        for(int i : Mathf.signs){
                                        Drawf.tri(e.x, e.y, 13f * e.fout(), 85f, e.rotation + 90f * i);
                                        Drawf.tri(e.x, e.y, 13f * e.fout(), 50f, e.rotation + 20f * i);
                                         }                           

                                         Drawf.light(e.x, e.y, 180f, Color.valueOf("5fb6de"), 0.9f * e.fout());
                                          });
                    hitEffect = new Effect(20f, 200f, e -> {
                                             color(Color.valueOf("5fb6de"));

                                                for(int i = 0; i < 2; i++){
                                                  color(i == 0 ? Color.valueOf("5fb6de") : Color.valueOf("79ccf2"));
//i give up with this indentation you just gotta deal w/ it
            float m = i == 0 ? 1f : 0.5f;

            for(int j = 0; j < 5; j++){
                float rot = e.rotation + Mathf.randomSeedRange(e.id + j, 50f);
                float w = 23f * e.fout() * m;
                Drawf.tri(e.x, e.y, w, (80f + Mathf.randomSeedRange(e.id + j, 40f)) * m, rot);
                Drawf.tri(e.x, e.y, w, 20f * m, rot + 180f);
            }
        }

        e.scaled(10f, c -> {
            color(Color.valueOf("79ccf2"));
            stroke(c.fout() * 2f + 0.2f);
            Lines.circle(e.x, e.y, c.fin() * 30f);
        });

        e.scaled(12f, c -> {
            color(Color.valueOf("5fb6de"));
            randLenVectors(e.id, 25, 5f + e.fin() * 80f, e.rotation, 60f, (x, y) -> {
                Fill.square(e.x + x, e.y + y, c.fout() * 3f, 45f);
            });
        });
    });
                    chargeEffect = new MultiEffect(Fx.lancerLaserCharge, Fx.lancerLaserChargeBegin, new ParticleEffect(){{
                                rotWithParent = true;
                                particles = 2;
                                colorFrom = Color.valueOf("c7fff9");
                                colorTo = Color.valueOf("02a6f2");
                                lifetime = 500f;
                                strokeFrom = 0f;
                                sizeFrom = 5f;
                                sizeTo = 0f;
                                offsetX = 0;
                                offsetY = 0;
                            }},
                                                   new ParticleEffect(){{
                                rotWithParent = true;
                                particles = 2;
                                colorFrom = Color.valueOf("80d0e0");
                                colorTo = Color.valueOf("8088e0");
                                lifetime = 500f;
                                strokeFrom = 0f;
                                sizeFrom = 5f;
                                sizeTo = 0f;
                                offsetX = -10;
                                offsetY = 0;
                            }},
                                                   new ParticleEffect(){{
                                rotWithParent = true;
                                particles = 2;
                                colorFrom = Color.valueOf("65a9d6");
                                colorTo = Color.valueOf("656dd6");
                                lifetime = 500f;
                                strokeFrom = 0f;
                                sizeFrom = 5f;
                                sizeTo = 0f;
                                offsetX = -20;
                                offsetY = 0;
                            }});
                    smokeEffect = Fx.smokeCloud;
                    trailEffect = new ParticleEffect(){{
                                particles = 2;
                                colorFrom = Color.valueOf("c7fff9");
                                colorTo = Color.valueOf("02a6f2");
                                lifetime = 100f;
                                strokeFrom = 4f;
                                sizeFrom = 5f;
                                sizeTo = 0f;
                            }};
                    despawnEffect = new Effect(15f, 100f, e -> {
        color(Color.valueOf("5fb6de"));
        stroke(e.fout() * 4f);
        Lines.circle(e.x, e.y, 4f + e.finpow() * 20f);

        for(int i = 0; i < 4; i++){
            Drawf.tri(e.x, e.y, 6f, 80f * e.fout(), i*90 + 45);
        }

        color();
        for(int i = 0; i < 4; i++){
            Drawf.tri(e.x, e.y, 3f, 30f * e.fout(), i*90 + 45);
        }

        Drawf.light(e.x, e.y, 150f, Color.valueOf("5fb6de"), 0.9f * e.fout());
    });
                    trailSpacing = 3f;
                    damage = 3550;
                    buildingDamageMultiplier = 0.75f;
                    speed = brange;
                    hitShake = 20f;
                    ammoMultiplier = 1f;
                }}
            );

            maxAmmo = 40;
            ammoPerShot = 5;
            rotateSpeed = 2f;
            reload = 400f;
            ammoUseEffect = Fx.casing3Double;
            moveWhileCharging = false;
            accurateDelay = false;
            recoil = 5f;
            cooldownTime = reload;
            shake = 4f;
            size = 4;
            shootCone = 2f;
            shootSound = Sounds.railgun;
            unitSort = UnitSorts.strongest;
            envEnabled |= Env.space;

            coolantMultiplier = 0.4f;
            scaledHealth = 150;

            coolant = consumeCoolant(1f);
            consumePower(10f);
        }};
        //spectre equivelent
        apparition = new ItemTurret("apparition"){{
            requirements(Category.turret, with(EarthItems.copper2, 900, Items.graphite, 300, Items.surgeAlloy, 500, EarthItems.steel, 175));
            ammo(
                Items.graphite, new BasicBulletType(7.5f, 50){{
                    hitSize = 4.8f;
                    width = 15f;
                    height = 21f;
                    shootEffect = Fx.shootBig;
                    ammoMultiplier = 4;
                    reloadMultiplier = 1.7f;
                    knockback = 0.3f;
                }},
                EarthItems.steel, new BasicBulletType(8f, 60){{
                    hitSize = 5;
                    width = 16f;
                    height = 23f;
                    shootEffect = Fx.shootBig;
                    pierceCap = 2;
                    pierceBuilding = true;
                    knockback = 0.7f;
                }}
            );
            reload = 60f;
            recoilTime = reload * 2f;
            coolantMultiplier = 0.5f;
            ammoUseEffect = Fx.casing3;
            range = 260f;
            inaccuracy = 3f;
            recoil = 3f;
            shoot = new ShootAlternate(8f);
            shoot.shots = 30;
            shoot.shotDelay = 1f;
            shake = 2f;
            size = 4;
            shootCone = 24f;
            shootSound = Sounds.shootBig;

            scaledHealth = 160;
            coolant = consumeCoolant(1f);

            limitRange();
        }};
        //meltdown equivelent
        cataclysm = new LaserTurret("cataclysm"){{
            localizedName = "Cataclysm";
            requirements(Category.turret, with(EarthItems.copper2, 1200, EarthItems.lead2, 350, Items.graphite, 300, Items.surgeAlloy, 325, Items.silicon, 225, EarthItems.steel, 275, EarthItems.aluminum, 300));
            shootEffect = Fx.shootBigSmoke2;
            shootCone = 40f;
            recoil = 4f;
            size = 4;
            shake = 2f;
            range = 295f;
            reload = 60f;
            firingMoveFract = 0.5f;
            shootDuration = 10f;
            shootSound = Sounds.laserbig;
            loopSound = Sounds.beam;
            loopSoundVolume = 2f;
            envEnabled |= Env.space;

            shootType = new ContinuousLaserBulletType(90){{
                length = 400f;
                hitEffect = Fx.hitMeltdown;
                hitColor = Pal.meltdownHit;
                status = StatusEffects.melting;
                drawSize = 420f;

                incendChance = 0.4f;
                incendSpread = 5f;
                incendAmount = 1;
                ammoMultiplier = 1f;
            }};

            scaledHealth = 200;
            coolant = consumeCoolant(0.5f);
            consumeLiquid(EarthLiquids.oxygen, 10f / 60f);
            consumePower(17f);
        }};
	    //cruse missile launcher, only targets ground, medium damage but high range
       /* divide = new ItemTurret("divide"){{
            localizedName = "Divide";
            requirements(Category.turret, with(Items.silicon, 450, Items.graphite, 400, EarthItems.steel, 500, EarthItems.iron, 300, EarthItems.lithium, 100, EarthItems.aluminum, 200));

            ammo(
            EarthItems.steel, new BasicBulletType(0f, 1){{
                shootEffect = Fx.shootBig;
                smokeEffect = Fx.shootSmokeMissile;
                ammoMultiplier = 1f;

                spawnUnit = new MissileUnitType("cruise-missile"){{
                    speed = 16f;
                    maxRange = 6f;
                    lifetime = 60f * 5.5f;
                    outlineColor = Pal.darkOutline;
                    engineColor = trailColor = Pal.redLight;
                    engineLayer = Layer.effect;
                    engineSize = 3.1f;
                    engineOffset = 10f;
                    rotateSpeed = 2f;
                    trailLength = 25;
                    missileAccelTime = 50f;
                    lowAltitude = true;
                    loopSound = Sounds.missileTrail;
                    loopSoundVolume = 0.6f;
                    deathSound = Sounds.largeExplosion;
                    targetAir = false;

                    fogRadius = 6f;

                    health = 70;

                    weapons.add(new Weapon(){{
                        shootCone = 360f;
                        mirror = false;
                        reload = 1f;
                        deathExplosionEffect = new MultiEffect(Fx.scatheExplosion, Fx.scatheLight);
                        shootOnDeath = true;
                        shake = 10f;
                        bullet = new ExplosionBulletType(150f, 300f){{
                            hitColor = Pal.redLight;
                            shootEffect = new MultiEffect( new ExplosionEffect(){{
                                lifetime = 50f;
                                sparks = 50;
				smokes = 25;
                            }}, Fx.scatheExplosion, Fx.scatheLight, new WaveEffect(){{
                                lifetime = 50f;
                                strokeFrom = 16f;
                                sizeTo = 300f;
                            }});

                            collidesAir = false;
                            buildingDamageMultiplier = 2f;
                            killShooter = true;

                            ammoMultiplier = 1f;
                            fragLifeMin = 0.1f;
                            fragBullets = 7;
                            fragBullet = new ArtilleryBulletType(3.4f, 32){{
                                buildingDamageMultiplier = 0.3f;
                                drag = 0.02f;
                                hitEffect = Fx.massiveExplosion;
                                despawnEffect = Fx.scatheSlash;
                                knockback = 0.8f;
                                lifetime = 23f;
                                width = height = 18f;
                                collidesTiles = false;
                                splashDamageRadius = 40f;
                                splashDamage = 80f;
                                backColor = trailColor = hitColor = Pal.redLight;
                                frontColor = Color.white;
                                smokeEffect = Fx.shootBigSmoke2;
                                despawnShake = 7f;
                                lightRadius = 30f;
                                lightColor = Pal.redLight;
                                lightOpacity = 0.5f;

                                trailLength = 20;
                                trailWidth = 3.5f;
                                trailEffect = Fx.none;
                            }};
                        }};
                    }});

                    abilities.add(new MoveEffectAbility(){{
                        effect = Fx.missileTrailSmoke;
                        rotation = 180f;
                        y = -9f;
                        color = Color.grays(0.6f).lerp(Pal.redLight, 0.5f).a(0.4f);
                        interval = 7f;
                    }});
                }};
            }}
            );

            recoil = 0.5f;

            fogRadiusMultiuplier = 0.4f;
            coolantMultiplier = 6f;
            shootSound = Sounds.missileLaunch;

            minWarmup = 0.94f;
            shootWarmupSpeed = 0.03f;
            targetAir = false;
            targetUnderBlocks = false;

            shake = 6f;
            ammoPerShot = 20;
            maxAmmo = 30;
            shootY = -1;
            outlineColor = Pal.darkOutline;
            size = 4;
            envEnabled |= Env.space;
            reload = 5600f;
            range = 10350;
            shootCone = 1f;
            scaledHealth = 220;
            rotateSpeed = 0.9f;

            coolant = consume(new ConsumeLiquid(Liquids.water, 15f / 60f));
            limitRange();
        }};*/
        //sorta like a scathe, but its a surface to air missile
        limit = new ItemTurret("limit"){{
            localizedName = "Limit";
            requirements(Category.turret, with(Items.silicon, 450, Items.graphite, 400, EarthItems.steel, 500, Items.surgeAlloy, 300));

            ammo(
            EarthItems.steel, new BasicBulletType(0f, 1){{
                shootEffect = Fx.shootBig;
                smokeEffect = Fx.shootSmokeMissile;
                ammoMultiplier = 1f;

                spawnUnit = new MissileUnitType("sam-missile"){{
                    speed = 20.6f;
                    maxRange = 12f;
                    lifetime = 60f * 5.5f;
                    outlineColor = Pal.darkOutline;
                    engineColor = trailColor = Pal.redLight;
                    engineLayer = Layer.effect;
                    engineSize = 3.1f;
                    engineOffset = 10f;
                    rotateSpeed = 25f;
                    trailLength = 28;
                    missileAccelTime = 50f;
                    lowAltitude = false;
                    loopSound = Sounds.missileTrail;
                    loopSoundVolume = 0.6f;
                    deathSound = Sounds.largeExplosion;
                    targetAir = true;
                    targetGround = false;

                    fogRadius = 6f;

                    health = 210;

                    weapons.add(new Weapon(){{
                        shootCone = 360f;
                        mirror = false;
                        reload = 1f;
                        deathExplosionEffect = Fx.massiveExplosion;
                        shootOnDeath = true;
                        shake = 10f;
                        bullet = new ExplosionBulletType(640f, 65f){{
                            status = StatusEffects.disarmed;
                            statusDuration = 10f;
                            hitColor = Pal.redLight;
                            shootEffect = new MultiEffect(Fx.massiveExplosion, Fx.scatheExplosion, Fx.scatheLight, new WaveEffect(){{
                                lifetime = 10f;
                                strokeFrom = 4f;
                                sizeTo = 130f;
                            }});

                            collidesAir = true;
                            buildingDamageMultiplier = 0.3f;

                            ammoMultiplier = 1f;
                            fragLifeMin = 0.1f;
                            fragBullets = 7;
                            fragBullet = new ArtilleryBulletType(3.4f, 32){{
                                buildingDamageMultiplier = 0.3f;
                                drag = 0.02f;
                                hitEffect = Fx.massiveExplosion;
                                despawnEffect = Fx.scatheSlash;
                                knockback = 0.8f;
                                lifetime = 23f;
                                width = height = 18f;
                                collidesTiles = false;
                                splashDamageRadius = 40f;
                                splashDamage = 80f;
                                backColor = trailColor = hitColor = Pal.redLight;
                                frontColor = Color.white;
                                smokeEffect = Fx.shootBigSmoke2;
                                despawnShake = 7f;
                                lightRadius = 30f;
                                lightColor = Pal.redLight;
                                lightOpacity = 0.5f;

                                trailLength = 20;
                                trailWidth = 3.5f;
                                trailEffect = Fx.none;
                            }};
                        }};
                    }});

                    abilities.add(new MoveEffectAbility(){{
                        effect = Fx.missileTrailSmoke;
                        rotation = 180f;
                        y = -9f;
                        color = Color.grays(0.6f).lerp(Pal.redLight, 0.5f).a(0.4f);
                        interval = 4f;
                    }});
                }};
            }}
            );

            
            recoil = 0.5f;

            fogRadiusMultiuplier = 0.4f;
            coolantMultiplier = 6f;
            shootSound = Sounds.missileLaunch;

            minWarmup = 0.94f;
            shootWarmupSpeed = 0.03f;
            targetAir = true;
            targetGround = false;
            targetUnderBlocks = false;

            shake = 6f;
            ammoPerShot = 20;
            maxAmmo = 30;
            shootY = -1;
            outlineColor = Pal.darkOutline;
            size = 4;
            envEnabled |= Env.space;
            reload = 500f;
            range = 2350;
            shootCone = 1f;
            scaledHealth = 220;
            rotateSpeed = 0.9f;

            coolant = consume(new ConsumeLiquid(Liquids.water, 15f / 60f));
            limitRange();
        }};
//nuclear missile launcher (you should get a limit to counter this) 
        aperture = new ItemTurret("aperture"){{
            localizedName = "Aperture";
            requirements(Category.turret, with(Items.silicon, 2450, Items.graphite, 1400, EarthItems.steel, 1500, EarthItems.iron, 2300, EarthItems.lithium, 1000, EarthItems.aluminum, 500));

            ammo(
            EarthItems.uranium, new BasicBulletType(0f, 1){{
                shootEffect = Fx.shootBig;
                smokeEffect = Fx.shootSmokeMissile;
                ammoMultiplier = 1f;

                spawnUnit = new MissileUnitType("Thermonuclear-missile"){{
                    speed = 6.5f;
                    maxRange = 6f;
                    lifetime = 60f * 5.5f;
                    outlineColor = Pal.darkOutline;
                    engineColor = trailColor = Pal.redLight;
                    engineLayer = Layer.effect;
                    engineSize = 3.1f;
                    engineOffset = 10f;
                    rotateSpeed = 0.1f;
                    trailLength = 18;
                    missileAccelTime = 50f;
                    lowAltitude = true;
                    loopSound = Sounds.missileTrail;
                    loopSoundVolume = 0.6f;
                    deathSound = Sounds.largeExplosion;
                    targetAir = false;

                    fogRadius = 6f;

                    health = 210;

                    weapons.add(new Weapon(){{
                        shootCone = 360f;
                        mirror = false;
                        reload = 1f;
                        deathExplosionEffect = new MultiEffect(new Effect(15f, 100f, e -> {
                                    color(Color.valueOf("858281"));
                                    stroke(e.fout() * 4f);
                                    Lines.circle(e.x, e.y, 4f + e.finpow() * 20f);

                                    for(int i = 0; i < 10; i++){
                                    Drawf.tri(e.x, e.y, 6f, 80f * e.fout(), i*90 + 45);
                                    }

                                    color();
                                    for(int i = 0; i < 4; i++){
                                    Drawf.tri(e.x, e.y, 3f, 30f * e.fout(), i*90 + 45);
                                    }

                                    Drawf.light(e.x, e.y, 150f, Color.valueOf("e66317"), 0.9f * e.fout());
                                    }), Fx.scatheLight);
                        shootOnDeath = true;
                        shake = 10f;
                        bullet = new ExplosionBulletType(15000f, 1650f){{
                            hitColor = Pal.redLight;
                            shootEffect = new MultiEffect(Fx.impactReactorExplosion, Fx.scatheExplosion, Fx.scatheLight, new WaveEffect(){{
                                lifetime = 25f;
                                strokeFrom = 16f;
                                sizeTo = 1630f;
                            }}, new Effect(250f, 160f, e -> {
        float circleRad = 600f;

        color(Color.valueOf("fff7b0"));
        Fill.circle(e.x, e.y, circleRad);
    }));

                            collidesAir = false;
                            buildingDamageMultiplier = 2f;
                            killShooter = true;

                            ammoMultiplier = 1f;
                            fragLifeMin = 0.1f;
                            fragBullets = 7;
                            fragBullet = new ArtilleryBulletType(3.4f, 32){{
                                buildingDamageMultiplier = 0.3f;
                                drag = 0.02f;
                                hitEffect = Fx.massiveExplosion;
                                despawnEffect = Fx.scatheSlash;
                                knockback = 0.8f;
                                lifetime = 23f;
                                width = height = 18f;
                                collidesTiles = false;
                                splashDamageRadius = 40f;
                                splashDamage = 80f;
                                backColor = trailColor = hitColor = Pal.redLight;
                                frontColor = Color.white;
                                smokeEffect = Fx.shootBigSmoke2;
                                despawnShake = 7f;
                                lightRadius = 30f;
                                lightColor = Pal.redLight;
                                lightOpacity = 0.5f;

                                trailLength = 20;
                                trailWidth = 3.5f;
                                trailEffect = Fx.none;
                            }};
                        }};
                    }});

                    abilities.add(new MoveEffectAbility(){{
                        effect = Fx.missileTrailSmoke;
                        rotation = 180f;
                        y = -9f;
                        color = Color.grays(0.6f).lerp(Pal.redLight, 0.5f).a(0.4f);
                        interval = 7f;
                    }});
                }};
            }}
            );

            recoil = 0.5f;

            fogRadiusMultiuplier = 0.4f;
            coolantMultiplier = 6f;
            shootSound = Sounds.missileLaunch;

            minWarmup = 0.94f;
            shootWarmupSpeed = 0.03f;
            targetAir = false;
            targetUnderBlocks = false;

            shake = 6f;
            ammoPerShot = 20;
            maxAmmo = 30;
            shootY = -1;
            outlineColor = Pal.darkOutline;
            size = 4;
            envEnabled |= Env.space;
            reload = 5600f;
            range = 10350;
            shootCone = 1f;
            scaledHealth = 220;
            rotateSpeed = 0.9f;

            coolant = consume(new ConsumeLiquid(Liquids.water, 15f / 60f));
            limitRange();
        }};
//crafting
        steelSmelter = new GenericCrafter("steel-smelter"){{
            localizedName = "Steel smelter";
            requirements(Category.crafting, with(EarthItems.iron, 65, EarthItems.copper2, 40, EarthItems.lead2, 60));
            outputItem = new ItemStack(EarthItems.steel, 3);
            craftTime = 60f;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;

            consumePower(1.5f);
            consumeItems(with(Items.coal, 2, EarthItems.iron, 5));

        }};
                bronzefurnace = new GenericCrafter("bronze-furnace"){{
            localizedName = "Bronze furnace";
            requirements(Category.crafting, with(EarthItems.iron, 95, EarthItems.copper2, 60, EarthItems.lead2, 80, EarthItems.steel, 25));
            outputItem = new ItemStack(EarthItems.bronze, 2);
            craftTime = 60f;
            size = 2;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;

            consumePower(1.5f);
            consumeItems(with(EarthItems.copper2, 3, EarthItems.tin, 1));

        }};
	                    boiler = new GenericCrafter("boiler"){{
            localizedName = "Boiler";
            requirements(Category.crafting, with(EarthItems.iron, 95, EarthItems.copper2, 60, EarthItems.lead2, 80, EarthItems.steel, 25, EarthItems.bronze, 50));
            outputLiquid = new LiquidStack(EarthLiquids.steam, 10f / 60f);
            craftTime = 1f;
            size = 2;
            hasPower = true;
            hasItems = false;
            hasLiquids = true;
            rotate = false;
            solid = true;

            consumePower(1f);
            consumeLiquid(Liquids.water, 10f / 60f);

        }};
	    	                    pressurizer = new GenericCrafter("pressurizer"){{
            localizedName = "Pressurizer";
            requirements(Category.crafting, with(EarthItems.iron, 195, EarthItems.copper2, 260, EarthItems.lead2, 180, EarthItems.steel, 325, EarthItems.bronze, 250));
            outputLiquid = new LiquidStack(EarthLiquids.highpressuresteam, 1f / 60f);
            craftTime = 1f;
            size = 2;
            hasPower = true;
            hasItems = false;
            hasLiquids = true;
            rotate = false;
            solid = true;

            consumePower(1f);
            consumeLiquid(EarthLiquids.steam, 5f / 60f);

        }};
                carbonsequestrator = new GenericCrafter("carbon-sequestrator"){{
                    localizedName = "Carbon sequestrator";
            requirements(Category.crafting, with(EarthItems.iron, 260, Items.graphite, 100, EarthItems.aluminum, 150));
            size = 3;
            hasLiquids = true;

            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidTile(EarthLiquids.carbondioxide, 4.1f), new DrawDefault(),
            new DrawParticles(){{
                color = Color.valueOf("d4f0ff");
                alpha = 0.6f;
                particleSize = 4f;
                particles = 10;
                particleRad = 12f;
                particleLife = 140f;
            }});

            researchCostMultiplier = 1.1f;
            liquidCapacity = 40f;
            consumePower(2f);
            ambientSound = Sounds.extractLoop;
            ambientSoundVolume = 0.06f;

            outputLiquid = new LiquidStack(EarthLiquids.carbondioxide, 4f / 60f);

      //      researchCost = with(Items.silicon, 2000, Items.oxide, 900, Items.beryllium, 2400);
        }};
                carboncatalyst = new GenericCrafter("carbon-catalyst"){{
                    localizedName = "Carbon catalyst";
            requirements(Category.crafting, with(Items.graphite, 150, EarthItems.iron, 180, EarthItems.lithium, 25, EarthItems.aluminum, 75));
            size = 3;

            researchCostMultiplier = 1.2f;
            craftTime = 20f;
            rotate = false;
            invertFlip = true;
            group = BlockGroup.liquids;

            liquidCapacity = 50f;

            consumeLiquid(EarthLiquids.carbondioxide, 10f / 60f);
            consumePower(1f);

            drawer = new DrawMulti(
                new DrawRegion("-bottom"),
                new DrawLiquidTile(EarthLiquids.carbondioxide, 2f),
                new DrawRegion(),
                new DrawLiquidOutputs(),
                new DrawGlowRegion(){{
                    alpha = 0.7f;
                    color = Color.valueOf("c4bdf3");
                    glowIntensity = 0.3f;
                    glowScale = 6f;
                }}
            );

            ambientSound = Sounds.electricHum;
            ambientSoundVolume = 0.08f;

            regionRotated1 = 3;
            outputLiquid = new LiquidStack(EarthLiquids.oxygen, 4f / 60f);
            outputItem = new ItemStack(EarthItems.carbon, 2);
        }};
                siliconblastfurnace = new GenericCrafter("Silicon-Blast-Furnace"){{
            requirements(Category.crafting, with(EarthItems.copper2, 40, EarthItems.lead2, 35, EarthItems.iron, 35, EarthItems.aluminum, 25));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.silicon, 2);
            craftTime = 30f;
            size = 2;
            hasPower = true;
            hasLiquids = false;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("ffef99")));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;

            consumeItems(with(EarthItems.carbon, 1, Items.sand, 2));
            consumePower(0.50f);
        }};
       
                phasefabricator = new GenericCrafter("phase-fabricator"){{
            requirements(Category.crafting, with(Items.silicon, 130, EarthItems.lead2, 120, EarthItems.steel, 75, Items.surgeAlloy, 25));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.phaseFabric, 2);
            craftTime = 110f;
            size = 2;
            hasPower = true;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawWeave(), new DrawDefault());
            envEnabled |= Env.space;

            ambientSound = Sounds.techloop;
            ambientSoundVolume = 0.02f;

            consumeItems(with(Items.surgeAlloy, 4, Items.sand, 10));
            consumePower(6f);
            itemCapacity = 20;
        }};
                surgeblastfurnace = new GenericCrafter("surge-blast-furnace"){{
            requirements(Category.crafting, with(Items.silicon, 80, EarthItems.lead2, 80, EarthItems.steel, 70, EarthItems.lithium, 50, EarthItems.aluminum, 75));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.surgeAlloy, 2);
            craftTime = 70f;
            size = 4;
            hasPower = true;
            itemCapacity = 20;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame());

            consumePower(4f);
            consumeItems(with(EarthItems.copper2, 3, EarthItems.lead2, 4, EarthItems.iron, 2, Items.silicon, 3, EarthItems.lithium, 5));
        }};
                        voltitesynthesizer = new GenericCrafter("voltite-synthesizer"){{
            requirements(Category.crafting, with(Items.silicon, 280, EarthItems.lead2, 280, EarthItems.steel, 270, EarthItems.lithium, 250, EarthItems.aluminum, 275, Items.surgeAlloy, 50));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(EarthItems.voltite, 2);
            craftTime = 70f;
            size = 6;
            hasPower = true;
            itemCapacity = 20;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame());

            consumePower(4f);
            consumeItems(with(Items.surgeAlloy, 3, EarthItems.lead2, 4, EarthItems.iron, 2, Items.silicon, 3, EarthItems.lithium, 5, Items.phaseFabric, 2));
        }};
                flamemixer = new GenericCrafter("flame-mixer"){{
            requirements(Category.crafting, with(EarthItems.copper2, 40, EarthItems.lead2, 35, EarthItems.iron, 35, EarthItems.aluminum, 25));
            craftEffect = Fx.smeltsmoke;
            outputLiquid = new LiquidStack(EarthLiquids.flammablemix, 2f);
            craftTime = 30f;
            size = 2;
            hasPower = true;
            hasLiquids = true;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("ffef99")));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;

            consumeLiquids(LiquidStack.with(EarthLiquids.oxygen, 20f / 60f, Liquids.hydrogen, 40f / 60f));
            consumePower(0.50f);
        }};
//walls
        leadWall = new Wall("lead-wall"){{
            localizedName = "Lead wall";
            health = 360;
            requirements(Category.defense, with(EarthItems.lead2, 6));
        }};

        leadWallLarge = new Wall("lead-wall-large"){{
            localizedName = "Large Lead wall";
            health = 1440;
            size = 2;
            requirements(Category.defense, with(EarthItems.lead2, 24));
        }};

       // stoneWall = new Wall("stone-wall"){{
       //     health = 380;
       //     requirements(Category.defense, with(EarthItems.stone, 6));
       // }};

      //  stoneWallLarge = new Wall("stone-wall-large"){{
       //     health = 1520;
       //     size = 2;
      //      requirements(Category.defense, with(EarthItems.stone, 24));
      //  }};

        ironWall = new Wall("iron-wall"){{
            localizedName = "Iron wall";
            health = 440;
            requirements(Category.defense, with(EarthItems.iron, 6));
        }};
        ironWallLarge = new Wall("iron-wall-large"){{
            localizedName = "Large Iron wall";
            health = 1760;
            size = 2;
            requirements(Category.defense, with(EarthItems.iron, 24));
        }};
//drills
        drillMechanical = new Drill("drill-mechanical"){{
            localizedName = "Mechanical drill";
            itemCapacity = 35;
            hasPower = false;
                        drillTime = 600;
          tier = 2;
            requirements(Category.production, with(EarthItems.copper2, 10, EarthItems.iron, 20));
            consumeLiquid(Liquids.water, 0.08f).boost();
        }};

        drillPneumatic = new Drill("drill-pneumatic"){{
            localizedName = "Steam drill";
            size = 2;
            itemCapacity = 50;
            drillTime = 300;
            tier = 3;
            requirements(Category.production, with(EarthItems.copper2, 15, EarthItems.iron, 30, EarthItems.steel, 10));
            consumeLiquid(Liquids.water, 0.08f).boost();
            consumeLiquid(EarthLiquids.steam, 0.08f);
        }};
	            drillBore = new Drill("drill-Bore"){{
            localizedName = "Steam bore drill";
            size = 3;
            itemCapacity = 75;
            drillTime = 200;
            tier = 4;
            requirements(Category.production, with(EarthItems.copper2, 55, EarthItems.iron, 75, EarthItems.steel, 30, EarthItems.bronze, 25, EarthItems.aluminum, 25));
            consumeLiquid(Liquids.water, 0.08f).boost();
	    liquidBoostIntensity = 1.1f;
            consumeLiquid(EarthLiquids.highpressuresteam, 0.08f);
        }};
	    	            drillExcavator = new Drill("drill-Excavator"){{
            localizedName = "Steam Excavator";
            size = 4;
            itemCapacity = 150;
            drillTime = 100;
            tier = 5;
            requirements(Category.production, with(EarthItems.copper2, 255, EarthItems.iron, 175, EarthItems.steel, 230, EarthItems.bronze, 325, EarthItems.aluminum, 225));
            consumeLiquid(Liquids.water, 0.08f).boost();
	    liquidBoostIntensity = 1.3f;
            consumeLiquid(EarthLiquids.highpressuresteam, 0.08f);
        }};
	    
     //      drillModernised = new Drill("drill-modernised"){{
     //       size = 3;
    //        itemCapacity = 50;
    //        hasPower = true;
    //        drillTime = 150;
    //        tier = 3;
    //        consumePower(5.6f);
    //        requirements(Category.production, with(Items.copper, 175, EarthItems.iron, 120, Items.silicon, 100, EarthItems.tin, 45, EarthItems.lithium, 60, EarthItems.steel, 60, EarthItems.voltite, 25));
    //    }};
//unit assembly
    //            groundassembler = new UnitAssembler("Ground-assembler"){{
   //         requirements(Category.units, with(Items.copper, 500, Items.lead, 250, EarthItems.iron, 350, Items.silicon, 150, EarthItems.steel, 250));
   //         regionSuffix = "-dark";
  //          size = 3;
//plans = (
    //            new AssemblerUnitPlan(EarthUnitTypes.LCLW, 30f, PayloadStack.list(EarthUnitTypes.lightchasis, 1,  EarthBlocks.lightweapons, 1))//,
        //    new AssemblerUnitPlan(EarthUnitTypes.LCMW, 30f, PayloadStack.list(EarthUnitTypes.mediumchasis, 1, EarthBlocks.mediumweapons, 1, EarthItems.iron, 50, EarthItems.steel, 25, Items.silicon, 50)),
        //    new AssemblerUnitPlan(EarthUnitTypes.LCHW, 40f, PayloadStack.list(EarthUnitTypes.heavychasis, 1,EarthBlocks.heavyweapons, 1, EarthItems.iron, 50, EarthItems.steel, 50, Items.silicon, 25)),
         //   new AssemblerUnitPlan(EarthUnitTypes.MCLW, 50f, PayloadStack.list(EarthUnitTypes.lightchasis, 1, EarthBlocks.lightweapons, 1, EarthItems.iron, 50, EarthItems.steel, 25, Items.silicon, 25)),
         //   new AssemblerUnitPlan(EarthUnitTypes.MCMW, 50f, PayloadStack.list(EarthUnitTypes.mediumchasis, 1,  EarthBlocks.mediumweapons, 1, EarthItems.iron, 50, EarthItems.steel, 25, Items.silicon, 50)),
         //   new AssemblerUnitPlan(EarthUnitTypes.MCHW, 60f, PayloadStack.list(EarthUnitTypes.heavychasis, 1, EarthBlocks.heavyweapons, 1, EarthItems.iron, 50, EarthItems.steel, 50, Items.silicon, 25)),
         //   new AssemblerUnitPlan(EarthUnitTypes.HCLW, 70f, PayloadStack.list(EarthUnitTypes.lightchasis, 1, EarthBlocks.lightweapons, 1, EarthItems.iron, 50, EarthItems.steel, 25, Items.silicon, 25)),
         //   new AssemblerUnitPlan(EarthUnitTypes.HCMW, 70f, PayloadStack.list(EarthUnitTypes.mediumchasis, 1,  EarthBlocks.mediumweapons, 1, EarthItems.iron, 50, EarthItems.steel, 25, Items.silicon, 50)),
          //  new AssemblerUnitPlan(EarthUnitTypes.HCHW, 80f, PayloadStack.list(EarthUnitTypes.heavychasis, 1, EarthBlocks.heavyweapons, 1, EarthItems.iron, 50, EarthItems.steel, 50, Items.silicon, 25))//,
                //armour
         //   new AssemblerUnitPlan(EarthUnitTypes.LCLWA, 40f, PayloadStack.list(EarthUnitTypes.lightchasis, 1,  EarthBlocks.lightweapons, 1, EarthItems.iron, 150, EarthItems.steel, 150, Items.silicon, 25)),
         //   new AssemblerUnitPlan(EarthUnitTypes.LCMWA, 40f, PayloadStack.list(EarthUnitTypes.mediumchasis, 1, EarthBlocks.mediumweapons, 1, EarthItems.iron, 150, EarthItems.steel, 150, Items.silicon, 50)),
         //   new AssemblerUnitPlan(EarthUnitTypes.LCHWA, 50f, PayloadStack.list(EarthUnitTypes.heavychasis, 1,EarthBlocks.heavyweapons, 1, EarthItems.iron, 150, EarthItems.steel, 175, Items.silicon, 25)),
         //   new AssemblerUnitPlan(EarthUnitTypes.MCLWA, 60f, PayloadStack.list(EarthUnitTypes.lightchasis, 1, EarthBlocks.lightweapons, 1, EarthItems.iron, 150, EarthItems.steel, 150, Items.silicon, 25)),
         //   new AssemblerUnitPlan(EarthUnitTypes.MCMWA, 60f, PayloadStack.list(EarthUnitTypes.mediumchasis, 1,  EarthBlocks.mediumweapons, 1, EarthItems.iron, 150, EarthItems.steel, 150, Items.silicon, 50)),
         //   new AssemblerUnitPlan(EarthUnitTypes.MCHWA, 70f, PayloadStack.list(EarthUnitTypes.heavychasis, 1, EarthBlocks.heavyweapons, 1, EarthItems.iron, 150, EarthItems.steel, 175, Items.silicon, 25)),
         //   new AssemblerUnitPlan(EarthUnitTypes.HCLWA, 80f, PayloadStack.list(EarthUnitTypes.lightchasis, 1, EarthBlocks.lightweapons, 1, EarthItems.iron, 150, EarthItems.steel, 150, Items.silicon, 25)),
        //    new AssemblerUnitPlan(EarthUnitTypes.HCMWA, 80f, PayloadStack.list(EarthUnitTypes.mediumchasis, 1,  EarthBlocks.mediumweapons, 1, EarthItems.iron, 150, EarthItems.steel, 150, Items.silicon, 50)),
         //   new AssemblerUnitPlan(EarthUnitTypes.HCHWA, 90f, PayloadStack.list(EarthUnitTypes.heavychasis, 1, EarthBlocks.heavyweapons, 1, EarthItems.iron, 150, EarthItems.steel, 175, Items.silicon, 25))
    //       );
       //     areaSize = 5;
      //      researchCostMultiplier = 0.4f;
     //       dronesCreated = 8;
     //       consumePower(3f);
    //   }};
        
        //s=steel, i=iron, si=silicon, g=graphite, l=lithium
        //light chasis = 10s 50i 25si 10g. medium chasis = 30s 100i 55si 25g. heavy chasis = 55s 150i 85si 40g.
        //light weapons = 15s 25i 5si 5g. medium weapons = 20s 40i 15si 15g 5l. heavy weapons = 35s 60i 20si 20g 10l
        //armour costs 20s 25i 10g
        //base cost is 10s 10i
               groundassembler = new UnitFactory("ground-fabricator"){{
           requirements(Category.units, with(Items.silicon, 100, EarthItems.copper2, 150, EarthItems.steel, 100, EarthItems.iron, 75));//, EarthItems.iron, 150, EarthItems.steel, 75));
            size = 3;
            localizedName = "Ground fabricator";
            plans = Seq.with(
            new UnitPlan(EarthUnitTypes.LCLW, 30f * 1, with(EarthItems.iron, 85, EarthItems.steel, 35, Items.silicon, 30, Items.graphite, 15)),
           new UnitPlan(EarthUnitTypes.LCMW, 30f, with(EarthItems.iron, 90, EarthItems.steel, 30, Items.silicon, 40, Items.graphite, 25, EarthItems.lithium, 5)),
          new UnitPlan(EarthUnitTypes.LCHW, 40f, with(EarthItems.iron, 110, EarthItems.steel, 45, Items.silicon, 45, Items.graphite, 30, EarthItems.lithium, 10)),
            new UnitPlan(EarthUnitTypes.MCLW, 50f, with(EarthItems.iron, 125, EarthItems.steel, 45, Items.silicon, 60, Items.graphite, 30)),
            new UnitPlan(EarthUnitTypes.MCMW, 50f, with(EarthItems.iron, 140, EarthItems.steel, 50, Items.silicon, 70, Items.graphite, 40, EarthItems.lithium, 5)),
            new UnitPlan(EarthUnitTypes.MCHW, 60f, with(EarthItems.iron, 160, EarthItems.steel, 65, Items.silicon, 75, Items.graphite, 45, EarthItems.lithium, 10)),
            new UnitPlan(EarthUnitTypes.HCLW, 70f, with(EarthItems.iron, 175, EarthItems.steel, 70, Items.silicon, 90, Items.graphite, 45)),
            new UnitPlan(EarthUnitTypes.HCMW, 70f, with(EarthItems.iron, 190, EarthItems.steel, 75, Items.silicon, 100, Items.graphite, 55, EarthItems.lithium, 5)),
            new UnitPlan(EarthUnitTypes.HCHW, 80f, with(EarthItems.iron, 210, EarthItems.steel, 100, Items.silicon, 105, Items.graphite, 60, EarthItems.lithium, 10)),
                //armour
            new UnitPlan(EarthUnitTypes.LCLWA, 40f, with(EarthItems.iron, 110, EarthItems.steel, 55, Items.silicon, 30, Items.graphite, 25)),
            new UnitPlan(EarthUnitTypes.LCMWA, 40f, with(EarthItems.iron, 115, EarthItems.steel, 50, Items.silicon, 40, Items.graphite, 35, EarthItems.lithium, 5)),
            new UnitPlan(EarthUnitTypes.LCHWA, 50f, with(EarthItems.iron, 135, EarthItems.steel, 65, Items.silicon, 45, Items.graphite, 40, EarthItems.lithium, 10)),
            new UnitPlan(EarthUnitTypes.MCLWA, 60f, with(EarthItems.iron, 150, EarthItems.steel, 65, Items.silicon, 60, Items.graphite, 40)),
            new UnitPlan(EarthUnitTypes.MCMWA, 60f, with(EarthItems.iron, 165, EarthItems.steel, 70, Items.silicon, 70, Items.graphite, 50, EarthItems.lithium, 5)),
            new UnitPlan(EarthUnitTypes.MCHWA, 70f, with(EarthItems.iron, 185, EarthItems.steel, 85, Items.silicon, 75, Items.graphite, 55, EarthItems.lithium, 10)),
            new UnitPlan(EarthUnitTypes.HCLWA, 80f, with(EarthItems.iron, 200, EarthItems.steel, 90, Items.silicon, 90, Items.graphite, 55)),
            new UnitPlan(EarthUnitTypes.HCMWA, 80f, with(EarthItems.iron, 215, EarthItems.steel, 95, Items.silicon, 100, Items.graphite, 65, EarthItems.lithium, 5)),
            new UnitPlan(EarthUnitTypes.HCHWA, 90f, with(EarthItems.iron, 235, EarthItems.steel, 120, Items.silicon, 105, Items.graphite, 70, EarthItems.lithium, 10))
          );
    //        researchCost = with(EarthItems.steel, 50, Items.graphite, 80, Items.silicon, 80);
          //  regionSuffix = "-dark";
            fogRadius = 3;
            consumePower(2f);
            consumeLiquid(EarthLiquids.oxygen, 9f / 60f);
        }};
        //weapon factory
        //    weaponfactory = new Constructor("weapon-factory"){{
     //       requirements(Category.units, with(Items.silicon, 100, EarthItems.iron, 150, EarthItems.steel, 80));
     //       regionSuffix = "-dark";
     //       hasPower = true;
    //        buildSpeed = 0.6f;
    //        consumePower(2f);
    //        size = 3;
    //        filter = Seq.with(EarthBlocks.lightweapons, EarthBlocks.mediumweapons, EarthBlocks.heavyweapons);
    //    }};
                //droneport
            droneport = new DroneCenter("droneport"){{
                localizedName = "Droneport";
            requirements(Category.units, with(Items.silicon, 100, EarthItems.iron, 150, EarthItems.steel, 80));
           // regionSuffix = "-dark";
            hasPower = true;
            unitsSpawned = 16;
            droneType = EarthUnitTypes.smallbuilderdrone;
            consumePower(2f);
            size = 2;
        }};
        // endgame turrets : ONLY the 5 Disaster Turrets specified in the trello!
      //  tarnation = new PowerTurret("tarnation"){{
      //      requirements(Category.turret, with(Items.lead, 6000, Items.thorium, 5500, Items.silicon, 3950, Items.plastanium, 1800, Items.surgeAlloy, 1024, MindyItems.bittrium, 128));
      //      range = 540f;
//
       //     shoot.firstShotDelay = 130f;
       //     recoil = 9f;
        //    reload = 290f;
       //     shake = 6f;
        //    shootEffect = MindyFx.tarnationShoot;
        //    smokeEffect = Fx.none;
       //     heatColor = Color.red;
      //      size = 6;
     //       health = 280 * size * size;
     //       targetAir = true;
    //        shootSound = Sounds.plasmadrop;
   //         rotateSpeed = 2f;
   //         unitSort = (u, x, y) -> -u.maxHealth;

   //         consumePower(60f);

     //       shootType = new ThickLightningBulletType(3048, Pal.lancerLaser){{
     //           buildingDamageMultiplier = 0.3f;

                //TODO: this only emits one tarnationLine effect, this should definitely be changed but I am cautious of changing effects without testing. -Anuke
     //           chargeEffect = new MultiEffect(MindyFx.tarnationCharge, MindyFx.tarnationLines);
     //       }};
     //   }};

        //hopeBringer = new MultiTurret("hopebringer"){{
         //   requirements(Category.turret, with(MindyItems.bittrium, 9999));//TODO
         //   size = 9;
         //   health = 9999;
         //   powerUse = 90f;
         //   range = 600f;

         //   patterns = new TurretPattern[]{Patterns.starBlazing, Patterns.starBlazing, Patterns.chaosBuster, Patterns.starBlazing};
       // }};
        hyperworldprocessor = new LogicBlock("hyper-world-processor"){{
            requirements(Category.logic, BuildVisibility.editorOnly, with());

            canOverdrive = false;
            targetable = false;
            instructionsPerTick = 64;
            forceDark = true;
            privileged = true;
            size = 1;
            maxInstructionsPerTick = 2500;
            range = Float.MAX_VALUE;
        }};

        hyperworldcell = new MemoryBlock("hyper-world-cell"){{
            requirements(Category.logic, BuildVisibility.editorOnly, with());
            
            targetable = false;
            privileged = true;
            memoryCapacity = 1028;
            forceDark = true;
        }};

        
    }
}
