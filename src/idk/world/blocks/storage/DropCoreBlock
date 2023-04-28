package idk.world.blocks.storage;

import arc.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.scene.ui.layout.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
//import mindustry.annotations.Annotations.*;
import mindustry.content.*;
import mindustry.world.blocks.storage.*;
import mindustry.core.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.game.EventType.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.logic.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.world.modules.*;

import static idk.Vars.*;

public class DropCoreBlock extends CoreBlock{
    //hacky way to pass item modules between methods
    public DropCoreBlock(String name){
        super(name);

        priority = TargetPriority.core;
        flags = EnumSet.of(BlockFlag.core);
        unitCapModifier = 10;
        loopSound = Sounds.respawning;
        loopSoundVolume = 1f;

        //support everything
        replaceable = false;
        //TODO should AI ever rebuild this?
        //rebuildable = false;
    }

   // @Remote(called = Loc.server)

    public void drawLanding(CoreBuild build, float x, float y){
        float fout = renderer.getLandTime() / coreLandDuration;

        if(renderer.isLaunching()) fout = 1f - fout;

        float fin = 1f - fout;

        float scl = Scl.scl(4f) / renderer.getDisplayScale();
        float shake = 0f;
        float s = region.width * region.scl() * scl * 3.6f * Interp.pow2Out.apply(fout);
        float rotation = Interp.pow2In.apply(fout) * 135f;
        x += Mathf.range(shake);
        y += Mathf.range(shake);
        float thrustOpen = 0f;
        float thrusterFrame = fin >= thrustOpen ? 1f : fin / thrustOpen;
        float thrusterSize = Mathf.sample(thrusterSizes, fin);

        //when launching, thrusters stay out the entire time.
        if(renderer.isLaunching()){
            Interp i = Interp.pow2Out;
            thrusterFrame = i.apply(Mathf.clamp(fout*13f));
            thrusterSize = i.apply(Mathf.clamp(fout*9f));
        }

        Draw.color(Pal.lightTrail);
        //TODO spikier heat
        Draw.rect("circle-shadow", x, y, s, s);

        Draw.scl(scl);

        //draw thruster flame
        float strength = (1f + (size - 3)/2.5f) * scl * thrusterSize * (0.95f + Mathf.absin(2f, 0.1f));
        float offset = (size - 3) * 3f * scl;

        for(int i = 0; i < 4; i++){
            Tmp.v1.trns(i * 90 + rotation, 1f);

            Tmp.v1.setLength((size * tilesize/2f + 1f)*scl + strength*2f + offset);
            Draw.color(build.team.color);
            Fill.circle(Tmp.v1.x + x, Tmp.v1.y + y, 6f * strength);

            Tmp.v1.setLength((size * tilesize/2f + 1f)*scl + strength*0.5f + offset);
            Draw.color(Color.white);
            Fill.circle(Tmp.v1.x + x, Tmp.v1.y + y, 3.5f * strength);
        }

        drawLandingThrusters(x, y, rotation, thrusterFrame);

        Drawf.spinSprite(region, x, y, rotation);

        Draw.alpha(Interp.pow4In.apply(thrusterFrame));
        drawLandingThrusters(x, y, rotation, thrusterFrame);
        Draw.alpha(1f);

        if(teamRegions[build.team.id] == teamRegion) Draw.color(build.team.color);

        Drawf.spinSprite(teamRegions[build.team.id], x, y, rotation);

        Draw.color();
        Draw.scl();
        Draw.reset();
    }

    protected void drawLandingThrusters(float x, float y, float rotation, float frame){
        float length = thrusterLength * (frame - 1f) - 1f/4f;
        float alpha = Draw.getColor().a;

        //two passes for consistent lighting
        for(int j = 0; j < 2; j++){
            for(int i = 0; i < 4; i++){
                var reg = i >= 2 ? thruster2 : thruster1;
                float rot = (i * 90) + rotation % 90f;
                Tmp.v1.trns(rot, length * Draw.xscl);

                //second pass applies extra layer of shading
                if(j == 1){
                    Tmp.v1.rotate(-90f);
                    Draw.alpha((rotation % 90f) / 90f * alpha);
                    rot -= 90f;
                    Draw.rect(reg, x + Tmp.v1.x, y + Tmp.v1.y, rot);
                }else{
                    Draw.alpha(alpha);
                    Draw.rect(reg, x + Tmp.v1.x, y + Tmp.v1.y, rot);
                }
            }
        }
        Draw.alpha(1f);
    }

}
