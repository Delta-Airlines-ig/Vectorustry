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
//import mindustry.annotations.Annotations.*;
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
    public static UnitType dagge, LCLW, LCLWA, MCLW, MCLWA, HCLW, HCLWA, LCMW, LCMWA, MCMW, MCMWA, HCMW, HCMWA, LCHW, LCHWA, MCHW, MCHWA, HCHW, HCHWA, lightchasis, mediumchasis, heavychasis;
	
public static void load() {
  // add constructor = UnitEntity::create; to all units, also uncomment them
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
		    rotate = true;
		    rotationLimit = 45;
                reload = 40f;
                x = 4f;
                y = 2f;
             top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBulletType(50f){{
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
		    rotate = true;
		    rotationLimit = 45;
                reload = 40f;
                x = 4f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBulletType(50f){{
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
		    rotate = true;
		    rotationLimit = 45;
                reload = 25f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
               bullet = new LaserBulletType(45f){{
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
		    rotate = true;
		    rotationLimit = 45;
                reload = 25f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBulletType(45f){{
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
		    rotate = true;
		    rotationLimit = 45;
                reload = 40f;
                x = 6f;
                y = 2f;
               top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBulletType(50f){{
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
		    rotate = true;
		    rotationLimit = 45;
                reload = 40f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBulletType(50f){{
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
		    rotate = true;
		    rotationLimit = 45;
                reload = 50f;
                x = 4f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(5f, 25){{
		    trailChance = 1f;
                    width = 14f;
                    height = 18f;
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
		    rotate = true;
		    rotationLimit = 45;
                reload = 50f;
                x = 4f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(5f, 25){{
		    trailChance = 1f;
		    homingPower = 0.1f;
                    width = 14f;
                    height = 18f;
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
		    rotate = true;
		    rotationLimit = 45;
                reload = 50f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(7f, 25){{
		    trailChance = 1f;
		    homingPower = 0.1f;
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
		    rotate = true;
		    rotationLimit = 45;
                reload = 50f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(7f, 25){{
		    trailChance = 1f;
		    homingPower = 0.1f;
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
		    rotate = true;
		    rotationLimit = 45;
                reload = 50f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(7f, 25){{
		    trailChance = 1f;
		    homingPower = 0.1f;
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
		    shoot = new ShootAlternate(){{
                shots = 1;
                barrels = 2;
                spread = 3.5f;
                shotDelay = 25f;
            }};
                reload = 50f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new MissileBulletType(7f, 25){{
		    trailChance = 1f;
		    homingPower = 0.1f;
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
}
}
