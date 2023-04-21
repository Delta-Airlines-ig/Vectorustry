package idk.content;


import arc.graphics.*;
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

import static mindustry.type.ItemStack.*;

@SuppressWarnings("deprecation")
public class EarthBlocks{
    //environment
    public static Block Redsand, ExposedStone, ExposedStoneWall, RedishStoneWall, RedStonewall, RedStone, RedishStone,
    //ores
    oreIron, oreAluminum, oreLithium, oreTin, oreUranium, //not done with uranium
    //walls
    leadWall, leadWallLarge, stoneWall, stoneWallLarge, ironWall, ironWallLarge,
    //drills
    drillMechanised, drillElectric, drillModernised,
    //turrets
    solo, trio, converge, splice, spear, volley, hurricane, cataclysm, 
    //cores
    damagedshard, fortress, stronghold, bunker, 
    //power
    voltitereactor, turbinegenerator, 
    //unit building
    groundassembler, airassembler, groundchasisassembler, weaponfactory, 
    //weapons (not shown anywhere)
    lightweapons, mediumweapons, heavyweapons, 
    //crafting
    steelSmelter; 

    public static void load() {
        Redsand = new Floor("redsand"){{
            localizedName = "redsand";
            itemDrop = Items.sand; 
            playerUnmineable = true;
            variants = 0;
            albedo = 0.5f;
        }};
        ExposedStone = new Floor("exposed-stone"){{
            itemDrop = EarthItems.stone; 
            localizedName = "exposed-stone";
            wall = ExposedStoneWall;
            playerUnmineable = true;
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
            oreDefault = false;
            oreThreshold = 0.841f;
            oreScale = 25.580953f;
            variants = 2;
        }};
        oreAluminum = new OreBlock(EarthItems.aluminum){{
            oreDefault = false;
            oreThreshold = 0.849f;
            oreScale = 15.580953f;
            variants = 2;
        }};
        oreLithium = new OreBlock(EarthItems.lithium){{
            oreDefault = false;
            oreThreshold = 0.869f;
            oreScale = 10.580953f;
            variants = 2;
        }};
        oreTin = new OreBlock(EarthItems.tin){{
            oreDefault = false;
            oreThreshold = 0.879f;
            oreScale = 9.580953f;
            variants = 2;
        }};
        //turrets
        solo = new ItemTurret("solo"){{
            requirements(Category.turret, with(Items.copper, 30, EarthItems.iron, 35));
            ammo(
                Items.copper,  new BasicBulletType(6f, 5){{
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
        }};
        trio = new ItemTurret("trio"){{
            requirements(Category.turret, with(Items.copper, 30, EarthItems.iron, 35, Items.silicon, 8));
                        ammo(
                Items.copper,  new BasicBulletType(9f, 7){{
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
                shotDelay = 5f;
            }};
            health = 300;
            size = 2;
            reload = 30f;
            inaccuracy = 4f;
            shootCone = 30f;
        }};
//crafting
        steelSmelter = new GenericCrafter("steel-smelter"){{
            requirements(Category.crafting, with(EarthItems.iron, 65, Items.copper, 40, Items.lead, 60, EarthItems.stone, 50));
            outputItem = new ItemStack(EarthItems.steel, 1);
            craftTime = 120f;
            size = 2;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;

            consumePower(1.5f);
            consumeItems(with(Items.coal, 2, EarthItems.iron, 5));

        }};
//walls
        leadWall = new Wall("lead-wall"){{
            health = 360;
            requirements(Category.defense, with(Items.lead, 6));
        }};

        leadWallLarge = new Wall("lead-wall-large"){{
            health = 1440;
            size = 2;
            requirements(Category.defense, with(Items.lead, 24));
        }};

        stoneWall = new Wall("stone-wall"){{
            health = 380;
            requirements(Category.defense, with(EarthItems.stone, 6));
        }};

        stoneWallLarge = new Wall("stone-wall-large"){{
            health = 1520;
            size = 2;
            requirements(Category.defense, with(EarthItems.stone, 24));
        }};

        ironWall = new Wall("iron-wall"){{
            health = 440;
            requirements(Category.defense, with(EarthItems.iron, 6));
        }};
        ironWallLarge = new Wall("iron-wall-large"){{
            health = 1760;
            size = 2;
            requirements(Category.defense, with(EarthItems.iron, 24));
        }};
//drills
        drillMechanised = new Drill("drill-mechanised"){{
            itemCapacity = 25;
            hasPower = false;
                        drillTime = 500;
          tier = 1;
            requirements(Category.production, with(Items.copper, 30, EarthItems.iron, 20, EarthItems.stone, 10));
        }};

        drillElectric = new Drill("drill-electric"){{
            size = 2;
            itemCapacity = 50;
            drillTime = 300;
            tier = 2;
            requirements(Category.production, with(Items.copper, 135, EarthItems.iron, 90, Items.silicon, 90, EarthItems.lithium, 45, EarthItems.tin, 15, EarthItems.steel, 30));
        }};
           drillModernised = new Drill("drill-modernised"){{
            size = 3;
            itemCapacity = 50;
            hasPower = true;
            drillTime = 150;
            tier = 3;
            consumePower(5.6f);
            requirements(Category.production, with(Items.copper, 175, EarthItems.iron, 120, Items.silicon, 100, EarthItems.tin, 45, EarthItems.lithium, 60, EarthItems.steel, 60, EarthItems.voltite, 25));
        }};
//unit assembly
                groundassembler = new UnitAssembler("Ground-assembler"){{
            requirements(Category.units, with(Items.copper, 500, Items.lead, 250, EarthItems.iron, 350, Items.silicon, 150, EarthItems.steel, 250));
            regionSuffix = "-dark";
            size = 3;
            plans(
            new AssemblerUnitPlan(EarthUnitTypes.LCLW, 30f, PayloadStack.list(EarthUnitTypes.lightchasis, 1,  EarthBlocks.lightweapons, 1, EarthItems.iron, 50, EarthItems.steel, 25, Items.silicon, 25)),
            new AssemblerUnitPlan(EarthUnitTypes.LCMW, 30f, PayloadStack.list(EarthUnitTypes.mediumchasis, 1, EarthBlocks.mediumweapons, 1, EarthItems.iron, 50, EarthItems.steel, 25, Items.silicon, 50)),
            new AssemblerUnitPlan(EarthUnitTypes.LCHW, 40f, PayloadStack.list(EarthUnitTypes.heavychasis, 1,EarthBlocks.heavyweapons, 1, EarthItems.iron, 50, EarthItems.steel, 50, Items.silicon, 25)),
            new AssemblerUnitPlan(EarthUnitTypes.MCLW, 50f, PayloadStack.list(EarthUnitTypes.lightchasis, 1, EarthBlocks.lightweapons, 1, EarthItems.iron, 50, EarthItems.steel, 25, Items.silicon, 25)),
            new AssemblerUnitPlan(EarthUnitTypes.MCMW, 50f, PayloadStack.list(EarthUnitTypes.mediumchasis, 1,  EarthBlocks.mediumweapons, 1, EarthItems.iron, 50, EarthItems.steel, 25, Items.silicon, 50)),
            new AssemblerUnitPlan(EarthUnitTypes.MCHW, 60f, PayloadStack.list(EarthUnitTypes.heavychasis, 1, EarthBlocks.heavyweapons, 1, EarthItems.iron, 50, EarthItems.steel, 50, Items.silicon, 25)),
            new AssemblerUnitPlan(EarthUnitTypes.HCLW, 70f, PayloadStack.list(EarthUnitTypes.lightchasis, 1, EarthBlocks.lightweapons, 1, EarthItems.iron, 50, EarthItems.steel, 25, Items.silicon, 25)),
            new AssemblerUnitPlan(EarthUnitTypes.HCMW, 70f, PayloadStack.list(EarthUnitTypes.mediumchasis, 1,  EarthBlocks.mediumweapons, 1, EarthItems.iron, 50, EarthItems.steel, 25, Items.silicon, 50)),
            new AssemblerUnitPlan(EarthUnitTypes.HCHW, 80f, PayloadStack.list(EarthUnitTypes.heavychasis, 1, EarthBlocks.heavyweapons, 1, EarthItems.iron, 50, EarthItems.steel, 50, Items.silicon, 25))//,
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
            );
            areaSize = 5;
            researchCostMultiplier = 0.4f;
            dronesCreated = 8;
            consumePower(3f);
        }};
                groundchasisassembler = new UnitFactory("ground-chasis-fabricator"){{
            requirements(Category.units, with(Items.silicon, 100, Items.copper, 150, EarthItems.iron, 150, EarthItems.steel, 75));
            size = 3;
            plans.add(
            new UnitPlan(EarthUnitTypes.lightchasis, 40f, with(Items.copper, 40, Items.silicon, 20, EarthItems.iron, 50)),
            new UnitPlan(EarthUnitTypes.mediumchasis, 60f, with(Items.copper, 50, Items.silicon, 30, EarthItems.iron, 100)),
            new UnitPlan(EarthUnitTypes.mediumchasis, 80f, with(Items.copper, 60, Items.silicon, 35, EarthItems.iron, 125, EarthItems.steel, 25))
            );
            researchCost = with(EarthItems.steel, 50, Items.graphite, 80, Items.silicon, 80);
            regionSuffix = "-dark";
            //fogRadius = 3;
            consumePower(2f);
        }};
        //weapon factory
            weaponfactory = new Constructor("weapon-factory"){{
            requirements(Category.units, with(Items.silicon, 100, EarthItems.iron, 150, EarthItems.steel, 80));
            regionSuffix = "-dark";
            hasPower = true;
            buildSpeed = 0.6f;
            consumePower(2f);
            size = 3;
            filter = Seq.with(EarthBlocks.lightweapons, EarthBlocks.mediumweapons, EarthBlocks.heavyweapons);
        }};
        //weapons
                lightweapons = new Wall("lightweapons"){{
            health = 1;
            requirements(Category.defense, BuildVisibility.sandboxOnly, with(EarthItems.iron, 50, EarthItems.steel, 25));
        }};
                mediumweapons = new Wall("mediumweapons"){{
            health = 1;
            requirements(Category.defense, BuildVisibility.sandboxOnly, with(EarthItems.iron, 75, EarthItems.steel, 40, Items.silicon, 25, Items.metaglass, 5));
        }};
                heavyweapons = new Wall("heavyweapons"){{
            health = 1;
            requirements(Category.defense, BuildVisibility.sandboxOnly, with(EarthItems.iron, 175, EarthItems.steel, 100, Items.silicon, 30));
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

   
    }
}
