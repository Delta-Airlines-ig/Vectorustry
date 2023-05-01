/*package idk.content;

import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Lines;
import arc.math.Interp;
import arc.math.Mathf;
import arc.util.Time;
import arc.util.Tmp;
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
import mindustry.Vars;
import mindustry.entities.Effect;
import mindustry.entities.effect.MultiEffect;
import mindustry.gen.Unit;
import mindustry.graphics.Layer;
import mindustry.graphics.Pal;
import mindustry.type.StatusEffect;

import static arc.graphics.g2d.Draw.rect;
import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;

public class EarthStatus{
    public static StatusEffect
            dusty;
    
    public static void load(){
      dusty = new StatusEffect("Dusty"){{
            outline = true;
            color = Color.valueOf("9e6c20");
            speedMultiplier = 0.5f;
            effect =  new ParticleEffect(){{
                                rotWithParent = true;
                                particles = 5;
                                colorFrom = Color.valueOf("9e6c20");
                                colorTo = Color.valueOf("a8844d");
                                lifetime = 60f;
                                strokeFrom = 0f;
                                sizeFrom = 5f;
                                sizeTo = 0f;
                                offsetX = 0;
                                offsetY = 0;
                            }};
            
            permanent = false;
            hideDetails = false;
            show = true;
        }};
    }
}
