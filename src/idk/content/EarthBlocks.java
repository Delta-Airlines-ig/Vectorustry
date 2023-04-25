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

import static idk.content.EarthUnitTypes.*;
import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

@SuppressWarnings("deprecation")
public class EarthBlocks{
    //environment
    public static Block Redsand, ExposedStone, ExposedStoneWall, RedishStoneWall, RedStonewall, RedStone, RedishStone,
    //ores
    oreIron, oreAluminum, oreLithium, oreTin, oreUranium, oreGraphite,  //not done with uranium
    //walls
    leadWall, leadWallLarge, stoneWall, stoneWallLarge, ironWall, ironWallLarge, steelWall, steelWallLarge, 
    //drills
    drillMechanical, drillPneumatic, drillBeam, drillExplosive, 
    //turrets
    solo, trio, converge, char1, pelt, splice, spear, volley, ridge, break1, hurricane, anticipate, apparition, cataclysm, limit, 
    //cores
    damagedshard, fortress, stronghold, bunker, unitcomputer,  
    //power
    voltitereactor, steamgenerator, turbinegenerator, 
    //unit building
    groundassembler, airassembler, groundchasisassembler, 
    //drone port wip
    droneport, 
    //crafting
    steelSmelter, voltitesynthesizer, carboncatalyst, carbonsequestrator, siliconblastfurnace, surgeblastfurnace, phasefabricator, furnace, oxidationmixer, explosivespacker, boiler, pressurizer; 

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
        //turrets
        solo = new ItemTurret("solo"){{
            requirements(Category.turret, with(Items.copper, 10, EarthItems.iron, 25));
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
            range = 100;
        }};
        trio = new ItemTurret("trio"){{
            requirements(Category.turret, with(Items.copper, 30, EarthItems.iron, 35));
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
            range = 150;
        }};
        //scatter equivelent
         converge = new ItemTurret("converge"){{
            requirements(Category.turret, with(Items.copper, 85, Items.lead, 45));
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
                }},
                Items.metaglass, new FlakBulletType(4f, 3){{
                    lifetime = 60f;
                    ammoMultiplier = 5f;
                    shootEffect = Fx.shootSmall;
                    reloadMultiplier = 0.8f;
                    width = 6f;
                    height = 8f;
                    hitEffect = Fx.flakExplosion;
                    splashDamage = 30f * 1.5f;
                    splashDamageRadius = 20f;
                    fragBullets = 6;
                    fragBullet = new BasicBulletType(3f, 5){{
                        width = 5f;
                        height = 12f;
                        shrinkY = 1f;
                        lifetime = 20f;
                        backColor = Pal.gray;
                        frontColor = Color.white;
                        despawnEffect = Fx.none;
                        collidesGround = false;
                    }};
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
//crafting
        steelSmelter = new GenericCrafter("steel-smelter"){{
            requirements(Category.crafting, with(EarthItems.iron, 65, Items.copper, 40, Items.lead, 60));
            outputItem = new ItemStack(EarthItems.steel, 3);
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
                carbonsequestrator = new GenericCrafter("carbon-sequestrator"){{
            requirements(Category.crafting, with(EarthItems.iron, 260, Items.graphite, 100, EarthItems.aluminium, 150));
            size = 3;
            hasLiquids = true;

            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidTile(EarthLiquids.carbondioxide, 4.1f), new DrawDefault(), new DrawHeatInput(),
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
            requirements(Category.crafting, with(Items.graphite, 150, EarthItems.iron, 180, EarthItems.lithium, 25, EarthItems.aluminum, 75));
            size = 3;

            researchCostMultiplier = 1.2f;
            craftTime = 10f;
            rotate = false;
            invertFlip = true;
            group = BlockGroup.liquids;

            liquidCapacity = 50f;

            consumeLiquid(EarthLiquids.carbondioxide, 10f / 60f);
            consumePower(1f);

            drawer = new DrawMulti(
                new DrawRegion("-bottom"),
                new DrawLiquidTile(EarthLiquids.carbondioxide, 2f),
                new DrawBubbles(Color.valueOf("7693e3")){{
                    sides = 10;
                    recurrence = 3f;
                    spread = 6;
                    radius = 1.5f;
                    amount = 20;
                }},
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
            requirements(Category.crafting, with(Items.copper, 40, Items.lead, 35, EarthItem.iron, 35, EarthItem.aluminum, 25));
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
        furnace = new GenericCrafter("furnace"){{
            requirements(Category.crafting, with(Items.copper, 60, Items.graphite, 60, Items.lead, 40, EarthItems.iron, 50));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.metaglass, 1);
            craftTime = 20f;
            size = 2;
            hasPower = hasItems = true;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("ffc099")));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;

            consumeItems(with(Items.lead, 1, Items.sand, 1));
            consumePower(0.60f);
        }};
                phasefabricator = new GenericCrafter("phase-fabricator"){{
            requirements(Category.crafting, with(Items.silicon, 130, Items.lead, 120, EarthItems.steel, 75, Items.surgeAlloy, 25));
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
            requirements(Category.crafting, with(Items.silicon, 80, Items.lead, 80, EarthItems.steel, 70, Items.metaglass, 50, EarthItems.aluminum, 75));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.surgeAlloy, 2);
            craftTime = 70f;
            size = 4;
            hasPower = true;
            itemCapacity = 20;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame());

            consumePower(4f);
            consumeItems(with(Items.copper, 3, Items.lead, 4, EarthItems.iron, 2, Items.silicon, 3, Earthitems.lithium, 5));
        }};
                        voltitesynthesizer = new GenericCrafter("voltite-synthesizer"){{
            requirements(Category.crafting, with(Items.silicon, 280, Items.lead, 280, EarthItems.steel, 270, Items.metaglass, 250, EarthItems.aluminum, 275, Items.surgeAlloy, 50));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(EarthItems.voltite, 2);
            craftTime = 70f;
            size = 6;
            hasPower = true;
            itemCapacity = 20;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame());

            consumePower(4f);
            consumeItems(with(Items.surgeAlloy, 3, Items.lead, 4, EarthItems.iron, 2, Items.silicon, 3, Earthitems.lithium, 5, Items.phaseFabric, 2));
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
            health = 440;
            requirements(Category.defense, with(EarthItems.iron, 6));
        }};
        ironWallLarge = new Wall("iron-wall-large"){{
            health = 1760;
            size = 2;
            requirements(Category.defense, with(EarthItems.iron, 24));
        }};
//drills
        drillMechanical = new Drill("drill-mechanical"){{
            itemCapacity = 35;
            hasPower = false;
                        drillTime = 500;
          tier = 1;
            requirements(Category.production, with(Items.copper, 10, EarthItems.iron, 20));
            consumeLiquid(Liquids.water, 0.08f).boost();
        }};

        drillPneumatic = new Drill("drill-pneumatic"){{
            size = 2;
            itemCapacity = 50;
            drillTime = 300;
            tier = 2;
            requirements(Category.production, with(Items.copper, 15, EarthItems.iron, 30, EarthItems.steel, 10));
            consumeLiquid(Liquids.water, 0.08f).boost();
            consumeLiquid(EarthLiquids.steam, 0.08f);
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
           requirements(Category.units, with(Items.silicon, 100, Items.copper, 150, EarthItems.steel, 100, EarthItem.iron, 75));//, EarthItems.iron, 150, EarthItems.steel, 75));
            size = 3;
            localizedName = "ground-fabricator";
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

   
    }
}
