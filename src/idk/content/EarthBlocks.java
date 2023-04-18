package idk.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.effect.*;
import mindustry.entities.pattern.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.*;

@SuppressWarnings("deprecation")
public class EarthBlocks{
    //environment
    public static Block Redsand, ExposedStone, ExposedStoneWall, RedishStoneWall, RedStonewall, RedStone, RedishStone,
    //ores
    oreIron, oreAluminum, oreLithium, oreTin,
    //walls
    leadWall, leadWallLarge, stoneWall, stoneWallLarge, ironWall, ironWallLarge,
    //drills
    drillMechanised, drillElectric, drillModernised,
    //turrets
    solo, trio, converge, splice, spear, volley, hurricane, cataclysm,  
    //power
    voltitereactor, turbinegenerator, 
    //crafting
    steelSmelter; 

    public static void load() {
        Redsand = new Floor("redsand"){{
            itemDrop = Items.sand; 
            playerUnmineable = true;
            variants = 0;
            albedo = 0.5f;
        }};
        ExposedStone = new Floor("exposed-stone"){{
            itemDrop = EarthItems.stone; 
            playerUnmineable = true;
            variants = 0;
            albedo = 0.5f;
        }};

        ExposedStoneWall = new StaticWall("exposed-stone-wall"){{
            variants = 2;
        }};
        RedishStoneWall = new StaticWall("redishstone-wall"){{
            variants = 0;
        }};
        RedStonewall = new StaticWall("redstone-wall"){{
            variants = 0;
        }};

        RedStone = new Floor("redstone"){{
            speedMultiplier = 1f;
            variants = 0;
            albedo = 0.5f;
        }};
        RedishStone = new Floor("redishstone"){{
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
        }};
        oreAluminum = new OreBlock(EarthItems.aluminum){{
            oreDefault = false;
            oreThreshold = 0.849f;
            oreScale = 15.580953f;
        }};
        oreLithium = new OreBlock(EarthItems.lithium){{
            oreDefault = false;
            oreThreshold = 0.869f;
            oreScale = 10.580953f;
        }};
        oreTin = new OreBlock(EarthItems.tin){{
            oreDefault = false;
            oreThreshold = 0.879f;
            oreScale = 9.580953f;
        }};
        //turrets
        solo = new ItemTurret("solo"){{
            requirements(Category.turret, with(Items.copper, 30, EarthItems.iron, 35));

            range = 130f; //must be set before ammo()
            ammo(Items.copper, new BasicBulletType(6f, 5f), EarthItems.iron, new BasicBulletType(5f, 6f));
            health = 100;
            size = 1;
            reload = 30f;
            inaccuracy = 1.5f;
            shootCone = 30f;
        }};
        trio = new ItemTurret("trio"){{
            requirements(Category.turret, with(Items.copper, 30, EarthItems.iron, 35, Items.silicon, 8));

            range = 130f; //must be set before ammo()
            ammo(
                    Items.copper, new BasicBulletType(9f, 7f),
                    EarthItems.iron, new BasicBulletType(7f, 9f)
            );
            health = 300;
            size = 1;
            reload = 10f;
            inaccuracy = 4f;
            shootCone = 30f;
        }};
//crafting
        steelSmelter = new GenericCrafter("steel-smelter"){{
            requirements(Category.crafting, with(EarthItems.iron, 65, Items.copper, 40, Items.lead, 60, EarthItems.stone, 50));
            outputItem(EarthItems.steel, 1);
            craftTime = 120f;
            size = 2;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;

            consumePower(1.5f);
            consumeItems[EarthItems.steel, 5, Items.coal, 2];

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
          tier = 1;
            requirements(Category.production, with(Items.copper, 30, EarthItems.iron, 20, EarthItems.stone, 10));
        }};

        drillElectric = new Drill("drill-electric"){{
            size = 2;
            itemCapacity = 50;
            mineSpeed = 3.5f;
            tier = 2;
            requirements(Category.production, with(Items.copper, 135, EarthItems.iron, 90, Items.silicon, 90, EarthItems.lithium, 45, EarthItems.tin, 15, EarthItems.steel, 30));
        }};
           drillModernised = new Drill("drill-modernised"){{
            size = 3;
            itemCapacity = 50;
            mineSpeed = 4.5f;
            hasPower = true;
            tier = 3;
            consumePower(5.6f);
            requirements(Category.production, with(Items.copper, 175, EarthItems.iron, 120, Items.silicon, 100, EarthItems.tin, 45, EarthItems.lithium, 60, Earthitems.steel, 60, EarthItems.voltite, 25));
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
