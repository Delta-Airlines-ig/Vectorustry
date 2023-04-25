package idk.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.func.Prov;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
//import mindustry.annotations;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.UnitType;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;


public class EarthUnitTypes{

//L = light, M = medium, H = heavy, C = chasis, W = weapon, A = armoured, ex: MCLWA = medium chasis, light weapon, armoured
//LW = normal cannon, MW = laser cannon, HW = guided missile launcher
//LCLW = machine gun, MCMW = better cannon, HCHW = dual missiles
//units are defined in the order below
//ground
    public static UnitType dagge, LCLW, LCLWA, MCLW, MCLWA, HCLW, HCLWA, LCMW, LCMWA, MCMW, MCMWA, HCMW, HCMWA, LCHW, LCHWA, MCHW, MCHWA, HCHW, HCHWA, lightchasis, mediumchasis, heavychasis,
	//air
	//L M H light medium and heavy, F = fighter(attacks air and can divebomb ground), B = bomber(only attacks ground and occasionally air with small weapons), S = support(a poly/mega/mono)
	LF, MF, HF, LB, MB, HB, LS, MS, HS, smallbuilderdrone,
	//core units
	delta, theta, zeta;
	//boss units coming soon?
		
	
public static void load() {
	dagge = new UnitType("dagge") {{
          constructor = MechUnit::create;
            speed = 0.5f;
            hitSize = 8f;
          health = 150;
            weapons.add(new Weapon("large-weapon") {{
               reload = 13f;
               x = 4f;
               y = 2f;
                top = false;
                //ejectEffect = Fx.casing1;
               bullet = new BasicBulletType(2.5f, 9) {{
                 width = 7f;
                    height = 9f;
                    lifetime = 60f;
	       	 }};
	    }});
    }};		      
	//light
	//done
	LCLW = new UnitType("LCLW"){{
		constructor = MechUnit::create;
		mechFrontSway = 0.55f;
           speed = 1f;
            hitSize = 8f;
           health = 250;
	    armor = 3;
            weapons.add(new Weapon("ut-machine-gun"){{
		    shootSound = Sounds.shootAlt;
		rotate = true;
		rotationLimit = 45;
                reload = 2f;
                x = 4f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(5f, 5){{
                  width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	LCLWA = new UnitType("LCLWA"){{
		constructor = MechUnit::create;
            speed = 0.95f;
            hitSize = 8f;
            health = 250;
	    armor = 6;
            weapons.add(new Weapon("ut-machine-gun"){{
		    shootSound = Sounds.shootAlt;
		rotate = true;
		    rotationLimit = 45;
                reload = 2f;
                x = 4f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(5f, 5){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	MCLW = new UnitType("MCLW"){{
		constructor = MechUnit::create;
            speed = 0.8f;
            hitSize = 8f;
            health = 600;
	    armor = 3;
            weapons.add(new Weapon("ut-cannon"){{
		    shootSound = Sounds.shootBig;
		    rotate = true;
		    rotationLimit = 45;
                reload = 30f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(7f, 25){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	MCLWA = new UnitType("MCLWA"){{
		constructor = MechUnit::create;
            speed = 0.75f;
            hitSize = 8f;
            health = 600;
	    armor = 6;
            weapons.add(new Weapon("ut-cannon"){{
		    shootSound = Sounds.shootBig;
		    rotate = true;
		    rotationLimit = 45;
                reload = 30f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(7f, 25){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	HCLW = new UnitType("HCLW"){{
		constructor = MechUnit::create;
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 3;
            weapons.add(new Weapon("ut-cannon"){{
		    shootSound = Sounds.shootBig;
		    rotate = true;
		    rotationLimit = 45;
                reload = 30f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
               bullet = new BasicBulletType(7f, 25){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};

	//done
	HCLWA = new UnitType("HCLWA"){{
		constructor = MechUnit::create;
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 6;
            weapons.add(new Weapon("ut-cannon"){{
		    shootSound = Sounds.shootBig;
		    rotate = true;
		    rotationLimit = 45;
                reload = 30f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(7f, 25){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//finish weapons for medium (effects and maybe some other things) and heavy (splash damage, effects, homing if needed, fancy double shot missiles), also add effects for light
	//medium
	//done
	LCMW = new UnitType("LCMW"){{
		constructor = MechUnit::create;
            speed = 1f;
            hitSize = 8f;
            health = 250;
	    armor = 3;
            weapons.add(new Weapon("ut-laser-cannon"){{
		    shootSound = Sounds.railgun;
		    rotate = true;
		    rotationLimit = 45;
                reload = 40f;
                x = 6f;
                y = 2f;
             top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBulletType(50f){{
	//		Color[32a852aa, 2cd45aff, 11f04eff];
                    width = 10f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	LCMWA = new UnitType("LCMWA"){{
		constructor = MechUnit::create;
            speed = 0.95f;
            hitSize = 8f;
            health = 250;
	    armor = 6;
            weapons.add(new Weapon("ut-laser-cannon"){{
		    shootSound = Sounds.railgun;
		    rotate = true;
		    rotationLimit = 45;
                reload = 40f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBulletType(50f){{
	//		Color[32a852aa, 2cd45aff, 11f04eff];
                    width = 10f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	MCMW = new UnitType("MCMW"){{
		constructor = MechUnit::create;
            speed = 0.8f;
            hitSize = 8f;
            health = 600;
	    armor = 3;
            weapons.add(new Weapon("ut-fast-laser-cannon"){{
		    shootSound = Sounds.shotgun;
		    rotate = true;
		    rotationLimit = 45;
                reload = 25f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
               bullet = new LaserBulletType(45f){{
	//	       Color[32a863aa, 29cc83ff, 17e398ff];
                    width = 7f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	MCMWA = new UnitType("MCMWA"){{
		constructor = MechUnit::create;
            speed = 0.75f;
            hitSize = 8f;
            health = 600;
	    armor = 6;
            weapons.add(new Weapon("ut-fast-laser-cannon"){{
		    shootSound = Sounds.shotgun;
		    rotate = true;
		    rotationLimit = 45;
                reload = 25f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBulletType(45f){{
	//		Color[32a863aa, 29cc83ff, 17e398ff];
                    width = 7f;
                    lifetime = 60f;
                }};
            }});
        }};
  	//done
	HCMW = new UnitType("HCMW"){{
		constructor = MechUnit::create;
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 3;
            weapons.add(new Weapon("ut-laser-cannon"){{
		    shootSound = Sounds.railgun;
		    rotate = true;
		    rotationLimit = 45;
                reload = 40f;
                x = 8f;
                y = 0f;
               top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBulletType(50f){{
	//		Color[32a852aa, 2cd45aff, 11f04eff];
			width = 10;
                    lifetime = 60f;
                }};
            }});
        }};
  	//done
	HCMWA = new UnitType("HCMWA"){{
		constructor = MechUnit::create;
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 6;
            weapons.add(new Weapon("ut-laser-cannon"){{
		    shootSound = Sounds.railgun;
		    rotate = true;
		    rotationLimit = 45;
                reload = 40f;
                x = 8f;
                y = 0f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBulletType(50f){{
		//	Color[32a852aa, 2cd45aff, 11f04eff];
			width = 10;
                    lifetime = 60f;
                }};
            }});
        }};
	//heavy
	//not done
	LCHW = new UnitType("LCHW"){{
		constructor = MechUnit::create;
            speed = 1f;
            hitSize = 8f;
            health = 250;
	    armor = 3;
            weapons.add(new Weapon("ut-guided-missiles"){{
		    shootSound = Sounds.missileLaunch;
		    rotate = true;
		    rotationLimit = 45;
                reload = 50f;
                x = 6f;
                y = 0f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(1f, 25){{
			drag = -0.02f;
		    trailChance = 1f;
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//not done
	LCHWA = new UnitType("LCHWA"){{
		constructor = MechUnit::create;
            speed = 1f;
            hitSize = 8f;
            health = 250;
	    armor = 6;
            weapons.add(new Weapon("ut-guided-missiles"){{
		    shootSound = Sounds.missileLaunch;
		    rotate = true;
		    rotationLimit = 45;
                reload = 50f;
                x = 6f;
                y = 0f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(1f, 25){{
			drag = -0.02f;
		    trailChance = 1f;
		    homingPower = 0.1f;
                    width = 7f;
                    height = 9f;
                   lifetime = 60f;
                }};
            }});
        }};
	//not done
	MCHW = new UnitType("MCHW"){{
		constructor = MechUnit::create;
            speed = 0.8f;
            hitSize = 8f;
            health = 600;
	    armor = 3;
            weapons.add(new Weapon("ut-guided-missiles"){{
		    shootSound = Sounds.missileLaunch;
		    rotate = true;
		    rotationLimit = 45;
                reload = 50f;
                x = 6f;
                y = 0f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(1f, 25){{
			drag = -0.05f;
		    trailChance = 1f;
		    homingPower = 0.4f;
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//not done
	MCHWA = new UnitType("MCHWA"){{
		constructor = MechUnit::create;
            speed = 0.8f;
            hitSize = 8f;
            health = 600;
	    armor = 6;
            weapons.add(new Weapon("ut-guided-missiles"){{
		    shootSound = Sounds.missileLaunch;
		    rotate = true;
		    rotationLimit = 45;
                reload = 50f;
                x = 6f;
                y = 0f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(1f, 25){{
			drag = -0.05f;
		    trailChance = 1f;
		    homingPower = 0.4f;
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//not done
	HCHW = new UnitType("HCHW"){{
		constructor = MechUnit::create;
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 3;
            weapons.add(new Weapon("ut-dual-guided-missiles"){{
	shootSound = Sounds.missileLaunch;
		    	shoot = new ShootHelix(){{
                shots = 2;
                shotDelay = 0f;
		mag = 5f;
		offset = 180f;
		scl = 1f;
            }};
		    rotate = true;
		    rotationLimit = 45;
                reload = 50f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(2f, 25){{
			drag = -0.05f;
		    trailChance = 1f;
		    homingPower = 0.4f;
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//not done
	HCHWA = new UnitType("HCHWA"){{
		constructor = MechUnit::create;
          speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 6;
            weapons.add(new Weapon("ut-dual-guided-missiles"){{
		    rotate = true;
		    rotationLimit = 45;
		    shootSound = Sounds.missileLaunch;
	shoot = new ShootPattern(){{
                shots = 2;
                shotDelay = 25f;
//		mag = 5f;
//		offset = 180f;
//		scl = 1f;
            }};
                reload = 50f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(1f, 25){{
			drag = -0.05f;
		    trailChance = 1f;
		    homingPower = 0.4f;
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
               }};
            }});
        }};
	//chasiss
		lightchasis = new UnitType("lightchasis"){{
		constructor = MechUnit::create;
            speed = 1f;
            hitSize = 8f;
            health = 250;
	    armor = 3;
        }};
	mediumchasis = new UnitType("mediumchasis"){{
		constructor = MechUnit::create;
            speed = 0.8f;
            hitSize = 8f;
            health = 600;
	    armor = 3;
        }};
	heavychasis = new UnitType("heavychasis"){{
		constructor = MechUnit::create;
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 3;
        }};
	//air
	//fighters
		//not done
	LF = new UnitType("LF"){{
		constructor = UnitEntity::create;
		circleTarget = true;
		targetGround = false;
		flying = true;
            speed = 2.5f;
            hitSize = 8f;
            health = 150;
	    armor = 3;
            weapons.add(new Weapon("ut-small-air-cannon"){{
	shootSound = Sounds.missileLaunch;
		    rotate = false;
                reload = 15f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(9f, 10){{
                    width = 3f;
                    height = 5f;
                    lifetime = 60f;
                }};
            }});
        }};
	
	MF = new UnitType("MF"){{
		constructor = UnitEntity::create;
		targetGround = false;
		circleTarget = true;
		flying = true;
            speed = 1.5f;
            hitSize = 8f;
            health = 350;
	    armor = 3;
            weapons.add(new Weapon("ut-small-air-cannon"){{
	shootSound = Sounds.missileLaunch;
		    rotate = false;
                reload = 15f;		
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(9f, 10){{
                    width = 3f;
                    height = 5f;
                    lifetime = 60f;
                }};
            }});
		weapons.add(new Weapon("ut-air-cannon"){{
	shootSound = Sounds.missileLaunch;
		    rotate = false;
                reload = 30f;		
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(9f, 30){{
                    width = 3f;
                    height = 5f;
                    lifetime = 60f;
                }};
            }});
        }};
	
		HF = new UnitType("HF"){{
		constructor = UnitEntity::create;
			targetGround = false;
			circleTarget = true;
		flying = true;
            speed = 1f;
            hitSize = 8f;
            health = 650;
	    armor = 3;
		weapons.add(new Weapon("ut-air-cannon"){{
	shootSound = Sounds.missileLaunch;
		    rotate = false;
                reload = 30f;		
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(9f, 30){{
                    width = 3f;
                    height = 5f;
                    lifetime = 60f;
                }};
            }});
	weapons.add(new Weapon("ut-small-missile-launcher"){{
		    rotate = true;
		    shootSound = Sounds.missileLaunch;
                reload = 15f;
                x = 6f;
                y = 2f;
                top = true;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(7f, 25){{
		    trailChance = 1f;
		    homingPower = 0.2f;
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
               }};
            }});
        }};
	//bombers
			LB = new UnitType("LB"){{
		constructor = UnitEntity::create;
			targetAir = false;
			circleTarget = true;
		flying = true;
            speed = 2f;
            hitSize = 8f;
            health = 250;
	    armor = 3;
		weapons.add(new Weapon(){{
	shootSound = Sounds.missileLaunch;
		    rotate = false;
                reload = 10f;		
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BombBulletType(40, 15){{
                    width = 3f;
                    height = 5f;
                    lifetime = 60f;
                }};
            }});
        }};
	
	MB = new UnitType("MB"){{
		constructor = UnitEntity::create;
			targetAir = true;
			circleTarget = true;
		flying = true;
            speed = 1.3f;
            hitSize = 8f;
            health = 650;
	    armor = 3;
		weapons.add(new Weapon(){{
	shootSound = Sounds.missileLaunch;
		    rotate = false;
                reload = 8f;		
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BombBulletType(40, 20){{
                    width = 3f;
                    height = 5f;
                    lifetime = 60f;
                }};
            }});
	weapons.add(new Weapon("ut-backgunner"){{
	shootSound = Sounds.missileLaunch;
		    rotate = true;
		rotationLimit = 90;
		baseRotation = 180;
                reload = 10f;		
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(9f, 10){{
                    width = 3f;
                    height = 5f;
                    lifetime = 60f;
                }};
            }});
        }};
		    	HB = new UnitType("HB"){{
		constructor = UnitEntity::create;
			targetAir = true;
			circleTarget = true;
		flying = true;
            speed = 0.9f;
            hitSize = 8f;
            health = 1050;
	    armor = 3;
		weapons.add(new Weapon(){{
	shootSound = Sounds.missileLaunch;
		    rotate = false;
                reload = 5f;		
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BombBulletType(60, 40){{
                    width = 3f;
                    height = 5f;
                    lifetime = 60f;
                }};
            }});
	weapons.add(new Weapon("ut-backgunner"){{
	shootSound = Sounds.missileLaunch;
		    rotate = true;
		rotationLimit = 90;
		baseRotation = 180;
                reload = 10f;		
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(9f, 10){{
                    width = 3f;
                    height = 5f;
                    lifetime = 60f;
                }};
            }});
        }};
		    //support air
	LS = new UnitType("LS"){{
		constructor = UnitEntity::create;
		defaultCommand = UnitCommand.rebuildCommand;
			targetAir = true;
		            lowAltitude = true;
		buildSpeed = 0.35f;
            speed = 3f;
            hitSize = 8f;
            health = 100;
	    armor = 3;
		
	    mineTier = 2;
            mineSpeed = 3.5f;
		
		abilities.add(new RepairFieldAbility(5f, 60f * 8, 50f));
		
        }};
		    	MS = new UnitType("MS"){{
		constructor = UnitEntity::create;
		defaultCommand = UnitCommand.rebuildCommand;
			targetAir = true;
		            lowAltitude = true;
		buildSpeed = 0.5f;
            speed = 2f;
            hitSize = 8f;
            health = 400;
	    armor = 3;
		
	    mineTier = 3;
            mineSpeed = 4f;
		
		abilities.add(new RepairFieldAbility(15f, 60f * 4, 50f));
		
				weapons.add(new Weapon("heal-weapon-mount"){{
                shootSound = Sounds.lasershoot;
                reload = 20f;
                x = 8f;
                y = -6f;
                rotate = true;
                bullet = new LaserBoltBulletType(5.2f, 10){{
                    lifetime = 35f;
                    healPercent = 5f;
                    collidesTeam = true;
                    backColor = Pal.heal;
                    frontColor = Color.white;
                }};
            }});
        }};
		    //finish
		    		    	HS = new UnitType("HS"){{
		constructor = UnitEntity::create;
		defaultCommand = UnitCommand.rebuildCommand;
			targetAir = true;
		            lowAltitude = true;
		buildSpeed = 0.5f;
            speed = 1f;
            hitSize = 8f;
            health = 600;
	    armor = 3;
		
	    mineTier = 3;
            mineSpeed = 4f;
		
		abilities.add(new RepairFieldAbility(15f, 60f * 4, 50f));
		
				weapons.add(new Weapon("heal-weapon-mount"){{
                shootSound = Sounds.lasershoot;
                reload = 20f;
                x = 8f;
                y = -6f;
                rotate = true;
                bullet = new LaserBoltBulletType(5.2f, 10){{
                    lifetime = 35f;
                    healPercent = 5f;
                    collidesTeam = true;
                    backColor = Pal.heal;
                    frontColor = Color.white;
                }};
            }});
        }};
	smallbuilderdrone = new UnitType("small construction drone"){{
		constructor = UnitEntity::create;
		defaultCommand = UnitCommand.rebuildCommand;
			targetAir = true;
		            lowAltitude = true;
		buildSpeed = 0.15f;
            speed = 2f;
            hitSize = 8f;
            health = 25;
	    armor = 0;
        }};
	//core units 
        float coreFleeRange = 1000f;

        delta = new ErekirUnitType("delta"){{
            coreUnitDock = true;
            controller = u -> new BuilderAI(true, coreFleeRange);
            isEnemy = false;
            envDisabled = 0;

            targetPriority = -2;
            lowAltitude = false;
            mineWalls = true;
            mineFloor = true;
            mineHardnessScaling = false;
            flying = true;
            mineSpeed = 6f;
            mineTier = 3;
            buildSpeed = 1.5f;
            drag = 0.08f;
            speed = 5.6f;
            rotateSpeed = 7f;
            accel = 0.09f;
            itemCapacity = 120;
            health = 300f;
            armor = 1f;
            hitSize = 9f;
            engineSize = 0;
            payloadCapacity = 2f * 2f * tilesize * tilesize;
            pickupUnits = false;
            vulnerableWithPayloads = true;

            fogRadius = 0f;
            targetable = false;
            hittable = false;

            setEnginesMirror(
            new UnitEngine(21 / 4f, 19 / 4f, 2.2f, 45f),
            new UnitEngine(23 / 4f, -22 / 4f, 2.2f, 315f)
            );

            weapons.add(new RepairBeamWeapon(){{
                widthSinMag = 0.11f;
                reload = 20f;
                x = 0f;
                y = 6.5f;
                rotate = false;
                shootY = 0f;
                beamWidth = 0.7f;
                repairSpeed = 3.5f;
                fractionRepairSpeed = 0.1f;
                aimDst = 0f;
                shootCone = 15f;
                mirror = false;

                targetUnits = false;
                targetBuildings = true;
                autoTarget = true;
                controllable = true;
                laserColor = Pal.accent;
                healColor = Pal.accent;

                bullet = new BulletType(){{
                    maxRange = 60f;
                }};
            }});
        }};

        theta = new ErekirUnitType("theta"){{
            coreUnitDock = true;
            controller = u -> new BuilderAI(true, coreFleeRange);
            isEnemy = false;
            envDisabled = 0;

            targetPriority = -2;
            lowAltitude = false;
            mineWalls = true;
            mineFloor = true;
            mineHardnessScaling = false;
            flying = true;
            mineSpeed = 8f;
            mineTier = 3;
            buildSpeed = 1.4f;
            drag = 0.08f;
            speed = 7f;
            rotateSpeed = 8f;
            accel = 0.09f;
            itemCapacity = 180;
            health = 500f;
            armor = 2f;
            hitSize = 11f;
            payloadCapacity = 2f * 2f * tilesize * tilesize;
            pickupUnits = false;
            vulnerableWithPayloads = true;

            fogRadius = 0f;
            targetable = false;
            hittable = false;

            engineOffset = 7.2f;
            engineSize = 3.1f;

            setEnginesMirror(
            new UnitEngine(25 / 4f, -1 / 4f, 2.4f, 300f)
            );

            weapons.add(new RepairBeamWeapon(){{
                widthSinMag = 0.11f;
                reload = 20f;
                x = 0f;
                y = 7.5f;
                rotate = false;
                shootY = 0f;
                beamWidth = 0.7f;
                aimDst = 0f;
                shootCone = 15f;
                mirror = false;

                repairSpeed = 3.9f;
                fractionRepairSpeed = 0.1f;

                targetUnits = false;
                targetBuildings = true;
                autoTarget = true;
                controllable = true;
                laserColor = Pal.accent;
                healColor = Pal.accent;

                bullet = new BulletType(){{
                    maxRange = 60f;
                }};
            }});

            drawBuildBeam = false;

            weapons.add(new BuildWeapon("build-weapon"){{
                rotate = true;
                rotateSpeed = 7f;
                x = 14/4f;
                y = 15/4f;
                layerOffset = -0.001f;
                shootY = 3f;
            }});
        }};

        emanate = new ErekirUnitType("emanate"){{
            coreUnitDock = true;
            controller = u -> new BuilderAI(true, coreFleeRange);
            isEnemy = false;
            envDisabled = 0;

            targetPriority = -2;
            lowAltitude = false;
            mineWalls = true;
            mineFloor = true;
            mineHardnessScaling = false;
            flying = true;
            mineSpeed = 9f;
            mineTier = 3;
            buildSpeed = 1.5f;
            drag = 0.08f;
            speed = 7.5f;
            rotateSpeed = 8f;
            accel = 0.08f;
            itemCapacity = 220;
            health = 700f;
            armor = 3f;
            hitSize = 12f;
            buildBeamOffset = 8f;
            payloadCapacity = 2f * 2f * tilesize * tilesize;
            pickupUnits = false;
            vulnerableWithPayloads = true;

            fogRadius = 0f;
            targetable = false;
            hittable = false;

            engineOffset = 7.5f;
            engineSize = 3.4f;

            setEnginesMirror(
            new UnitEngine(35 / 4f, -13 / 4f, 2.7f, 315f),
            new UnitEngine(28 / 4f, -35 / 4f, 2.7f, 315f)
            );

            weapons.add(new RepairBeamWeapon(){{
                widthSinMag = 0.11f;
                reload = 20f;
                x = 19f/4f;
                y = 19f/4f;
                rotate = false;
                shootY = 0f;
                beamWidth = 0.7f;
                aimDst = 0f;
                shootCone = 40f;
                mirror = true;

                repairSpeed = 3.6f / 2f;
                fractionRepairSpeed = 0.03f;

                targetUnits = false;
                targetBuildings = true;
                autoTarget = true;
                controllable = true;
                laserColor = Pal.accent;
                healColor = Pal.accent;

                bullet = new BulletType(){{
                    maxRange = 65f;
                }};
            }});
        }};

}
}
