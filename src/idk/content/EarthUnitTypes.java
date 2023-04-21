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
    public static UnitType dagge, LCLW, LCLWA, MCLW, MCLWA, HCLW, HCLWA, LCMW, LCMWA, MCMW, MCMWA, HCMW, HCMWA, LCHW, LCHWA, MCHW, MCHWA, HCHW, HCHWA;
	
public static void load() {
  // add constructor = UnitEntity::create; to all units, also uncomment them
	dagge = new UnitType("dagge") {{
          constructor = UnitEntity::create;
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
		type = mech;
		constructor = UnitEntity::create;
           speed = 1f;
            hitSize = 8f;
           health = 250;
	    armor = 3;
            weapons.add(new Weapon("machine-gun"){{
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
		constructor = UnitEntity::create;
            speed = 0.95f;
            hitSize = 8f;
            health = 250;
	    armor = 6;
            weapons.add(new Weapon("machine-gun"){{
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
		constructor = UnitEntity::create;
            speed = 0.8f;
            hitSize = 8f;
            health = 600;
	    armor = 3;
            weapons.add(new Weapon("cannon"){{
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
		constructor = UnitEntity::create;
            speed = 0.75f;
            hitSize = 8f;
            health = 600;
	    armor = 6;
            weapons.add(new Weapon("cannon"){{
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
		constructor = UnitEntity::create;
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 3;
            weapons.add(new Weapon("cannon"){{
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
		constructor = UnitEntity::create;
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 6;
            weapons.add(new Weapon("cannon"){{
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
		constructor = UnitEntity::create;
            speed = 1f;
            hitSize = 8f;
            health = 250;
	    armor = 3;
            weapons.add(new Weapon("laser-cannon"){{
                reload = 40f;
                x = 4f;
                y = 2f;
             top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBoltBulletType(5f, 50){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	LCMWA = new UnitType("LCMWA"){{
		constructor = UnitEntity::create;
            speed = 0.95f;
            hitSize = 8f;
            health = 250;
	    armor = 6;
            weapons.add(new Weapon("laser-cannon"){{
                reload = 40f;
                x = 4f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBoltBulletType(5f, 50){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	MCMW = new UnitType("MCMW"){{
		constructor = UnitEntity::create;
            speed = 0.8f;
            hitSize = 8f;
            health = 600;
	    armor = 3;
            weapons.add(new Weapon("fast-laser-cannon"){{
                reload = 25f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
               bullet = new LaserBoltBulletType(5f, 45){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//done
	MCMWA = new UnitType("MCMWA"){{
		constructor = UnitEntity::create;
            speed = 0.75f;
            hitSize = 8f;
            health = 600;
	    armor = 6;
            weapons.add(new Weapon("fast-laser-cannon"){{
                reload = 25f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBoltBulletType(5f, 45){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
  	//done
	HCMW = new UnitType("HCMW"){{
		constructor = UnitEntity::create;
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 3;
            weapons.add(new Weapon("laser-cannon"){{
                reload = 40f;
                x = 6f;
                y = 2f;
               top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBoltBulletType(5f, 50){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
  	//done
	HCMWA = new UnitType("HCMWA"){{
		constructor = UnitEntity::create;
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 6;
            weapons.add(new Weapon("laser-cannon"){{
                reload = 40f;
                x = 6f;
                y = 2f;
                top = false;
               // ejectEffect = Fx.casing1;
                bullet = new LaserBoltBulletType(5f, 50){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
	//heavy
	//not done
	LCHW = new UnitType("LCHW"){{
		constructor = UnitEntity::create;
            speed = 1f;
            hitSize = 8f;
            health = 250;
	    armor = 3;
            weapons.add(new Weapon("guided-missiles"){{
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
		constructor = UnitEntity::create;
            speed = 1f;
            hitSize = 8f;
            health = 250;
	    armor = 6;
            weapons.add(new Weapon("guided-missiles"){{
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
		constructor = UnitEntity::create;
            speed = 0.8f;
            hitSize = 8f;
            health = 600;
	    armor = 3;
            weapons.add(new Weapon("guided-missiles"){{
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
		constructor = UnitEntity::create;
            speed = 0.8f;
            hitSize = 8f;
            health = 600;
	    armor = 6;
            weapons.add(new Weapon("guided-missiles"){{
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
		constructor = UnitEntity::create;
            speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 3;
            weapons.add(new Weapon("dual-guided-missiles"){{
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
		constructor = UnitEntity::create;
          speed = 0.4f;
            hitSize = 8f;
            health = 1000;
	    armor = 6;
            weapons.add(new Weapon("dual-guided-missiles"){{
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
}
}
