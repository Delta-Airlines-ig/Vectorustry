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
    oreIron, oreAluminum, oreLithium, oreTin, oreUranium, oreGraphite,  //not done with uranium
    //walls
    leadWall, leadWallLarge, stoneWall, stoneWallLarge, ironWall, ironWallLarge, steelWall, steelWallLarge,
    //transport
    copperpipe, bronzepipe, ironconveyor, steelconveyor, allocator, allotor, interchange, span, surplussorter, shortagesorter, sorter, reversesorter, 
    //storage
    smalltank, largetank, smallsilo, largesilo, 
    //drills
    drillMechanical, drillPneumatic, drillBeam, drillExplosive, 
    //turrets
    solo, trio, converge, char1, pelt, splice, spear, volley, ridge, break1, hurricane, anticipate, apparition, cataclysm, limit, aperture, 
    //cores
    damagedshard, fortress, stronghold, bunker, unitcomputer,  
    //power
    voltitereactor, steamgenerator, turbinegenerator, nuclearreactor, fusionreactor,  
    //unit building
    groundassembler, airassembler, groundchasisassembler, 
    //drone port wip
    droneport, 
    //crafting
    steelSmelter, voltitesynthesizer, carboncatalyst, carbonsequestrator, siliconblastfurnace, surgeblastfurnace, phasefabricator, furnace, oxidationmixer, explosivespacker, boiler, pressurizer, flamemixer; 

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
          oreUranium = new OreBlock(EarthItems.uranium){{
            oreDefault = true;
            oreThreshold = 0.889f;
            oreScale = 25.580953f;
            variants = 2;
        }};
        //cores and stuff
        fortress = new CoreBlock("core-fortress"){{
            requirements(Category.effect, BuildVisibility.editorOnly, with(Items.copper, 1000, Items.lead, 800));
            alwaysUnlocked = true;

            isFirstTier = true;
            unitType = EarthUnitTypes.delta;
            health = 3100;
            itemCapacity = 8000;
            size = 3;

            unitCapModifier = 16;
        }};

        stronghold = new CoreBlock("core-stronghold"){{
            requirements(Category.effect, with(Items.copper, 3000, Items.lead, 5000, Items.silicon, 3000, EarthItems.iron, 5000));

            unitType = EarthUnitTypes.theta;
            health = 8500;
            itemCapacity = 16000;
            size = 4;
            thrusterLength = 44/4f;

            unitCapModifier = 24;
            researchCostMultiplier = 0.07f;
        }};

        bunker = new CoreBlock("core-bunker"){{
            requirements(Category.effect, with(Items.copper, 8000, Items.lead, 8000, Items.silicon, 5000, EarthItems.steel, 4000, EarthItems.lithium, 6000, EarthItems.aluminum, 5000, EarthItems.iron, 5000));

            unitType = EarthUnitTypes.zeta;
            health = 10000;
            itemCapacity = 32000;
            size = 5;
            thrusterLength = 60/4f;

            unitCapModifier = 32;
            researchCostMultiplier = 0.11f;
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
            requirements(Category.turret, with(Items.copper, 95, Items.lead, 55, EarthItems.iron, 50));
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
        //scortch equivelent
        char1 = new ContinuousLiquidTurret("char"){{
            requirements(Category.turret, with(EarthItems.steel, 20, Items.copper, 150, EarthItems.iron, 140, Items.lead, 200));

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
            requirements(Category.turret, with(Items.copper, 60, Items.graphite, 25, EarthItems.iron, 50));
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
            requirements(Category.turret, with(Items.copper, 75, Items.lead, 50, EarthItems.iron, 50, Items.silicon, 15));
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
            reload = 15f;
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
            requirements(Category.turret, with(Items.copper, 60, Items.lead, 70, Items.silicon, 80, EarthItems.steel, 30));
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
            requirements(Category.turret, with(Items.copper, 100, Items.graphite, 80, EarthItems.steel, 70, EarthItems.aluminum, 50));
            ammo(
                Items.copper,  new BasicBulletType(2.5f, 6){{
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
        //ripple equivelent
         ridge = new ItemTurret("ridge"){{
            requirements(Category.turret, with(Items.copper, 150, Items.graphite, 235, EarthItems.steel, 60, EarthItems.aluminum, 50));
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
            requirements(Category.turret, with(Items.copper, 225, Items.graphite, 225, EarthItems.steel, 100, Items.surgeAlloy, 25));

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
            requirements(Category.turret, with(Items.copper, 200, Items.titanium, 125, Items.surgeAlloy, 80, EarthItems.steel, 50));
            ammo(
                Items.metaglass, new FlakBulletType(4f, 3){{
                    ammoMultiplier = 2f;
                    shootEffect = Fx.shootSmall;
                    reloadMultiplier = 0.8f;
                    width = 6f;
                    height = 8f;
                    hitEffect = Fx.flakExplosion;
                    splashDamage = 45f;
                    splashDamageRadius = 25f;
                    fragBullet = new BasicBulletType(3f, 1, "bullet"){{
                        width = 5f;
                        height = 12f;
                        shrinkY = 1f;
                        lifetime = 20f;
                        backColor = Pal.gray;
                        frontColor = Color.white;
                        despawnEffect = Fx.none;
                    }};
                    fragBullets = 8;
                    explodeRange = 20f;
                    collidesGround = true;
                }},
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
            float brange = range = 800f;
                    
            shoot.firstShotDelay = 125f;
                    
            requirements(Category.turret, with(Items.copper, 1000, Items.metaglass, 600, Items.surgeAlloy, 300, EarthItems.voltite, 200, Items.silicon, 600, EarthItems.steel, 500));
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
            requirements(Category.turret, with(Items.copper, 900, Items.graphite, 300, Items.surgeAlloy, 500, EarthItems.steel, 175));
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
            requirements(Category.turret, with(Items.copper, 1200, Items.lead, 350, Items.graphite, 300, Items.surgeAlloy, 325, Items.silicon, 225, EarthItems.steel, 275, EarthItems.aluminum, 300));
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
        //sorta like a scathe, but its a surface to air missile
        limit = new ItemTurret("limit"){{
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
    });

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
            requirements(Category.crafting, with(EarthItems.iron, 260, Items.graphite, 100, EarthItems.aluminum, 150));
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
            requirements(Category.crafting, with(Items.copper, 40, Items.lead, 35, EarthItems.iron, 35, EarthItems.aluminum, 25));
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
            consumeItems(with(Items.copper, 3, Items.lead, 4, EarthItems.iron, 2, Items.silicon, 3, EarthItems.lithium, 5));
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
            consumeItems(with(Items.surgeAlloy, 3, Items.lead, 4, EarthItems.iron, 2, Items.silicon, 3, EarthItems.lithium, 5, Items.phaseFabric, 2));
        }};
                flamemixer = new GenericCrafter("flame-mixer"){{
            requirements(Category.crafting, with(Items.copper, 40, Items.lead, 35, EarthItems.iron, 35, EarthItems.aluminum, 25));
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
           requirements(Category.units, with(Items.silicon, 100, Items.copper, 150, EarthItems.steel, 100, EarthItems.iron, 75));//, EarthItems.iron, 150, EarthItems.steel, 75));
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
