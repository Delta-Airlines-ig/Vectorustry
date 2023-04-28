package idk.world.blocks.power;

import arc.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
//import mindustry.annotations.Annotations.*;
import mindustry.core.*;
import mindustry.entities.units.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.input.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.world.modules.*;

import static mindustry.Vars.*;

public class PowerLine extends PowerNode{
    protected static BuildPlan otherReq;
    protected static int returnInt = 0;
    protected final static ObjectSet<PowerGraph> graphs = new ObjectSet<>();
    /** The maximum range of all power nodes on the map */
    protected static float maxRange;

    public (value = "@-wire", fallback = "wire") TextureRegion laser;
    public (value = "@-wire-end", fallback = "wire-end") TextureRegion laserEnd;
    public float laserRange = 6;
    public int maxNodes = 3;
    public boolean autolink = true, drawRange = true;
    public float laserScale = 0.25f;
    public Color laserColor1 = Color.white;
    public Color laserColor2 = Pal.powerLight;

    public PowerNode(String name){
        super(name);
    }}
