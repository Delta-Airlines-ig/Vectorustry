package idk.content;

import arc.graphics.*;
import arc.util.*;
import idk.planets.*;
import mindustry.maps.generators.PlanetGenerator;
import mindustry.game.*;
import mindustry.content.*;
import mindustry.graphics.g3d.*;
import mindustry.type.*;

public class EarthPlanets{
    public static Planet earth;

    public static void load(){
        try{
          //placeholder name ig idk a good planet name
            earth = new Planet("earth?", Planets.sun, 1f, 2) {{
		    name = "??";
		    discription = "glhf";
                bloom = true;
			visible = true;
			accessible = true;
			hasAtmosphere = true;
			alwaysUnlocked = true;
                //atmosphereColor = Color.gray.cpy();
                //landCloudColor = Color.clear.cpy();
              //  atmosphereRadOut = 0.5f;
              //  atmosphereRadIn = 0.05f;
               // tidalLock = true;
               // hasAtmosphere = true;
              //  generator = new idkGenerator();
                //placeholder
                ruleSetter = r -> {
				r.hideBannedBlocks = true;
				r.waveTeam = Team.crux;
				r.placeRangeCheck = false;
				r.showSpawns = true;
				r.waveSpacing = 15 * Time.toSeconds;
				r.initialWaveSpacing = 150f * Time.toMinutes;
				if(r.sector.preset == null)r.winWave = 150;
				r.coreDestroyClear = true;
				
				Rules.TeamRule teamRule = r.teams.get(r.defaultTeam);
				teamRule.rtsAi = true;
				teamRule.unitBuildSpeedMultiplier = 10f;
				teamRule.blockDamageMultiplier = 2f;
				teamRule.buildSpeedMultiplier = 3f;
				teamRule.blockHealthMultiplier = 1.75f;
				
				teamRule = r.teams.get(r.waveTeam);
				teamRule.infiniteAmmo = teamRule.infiniteResources = true;
			};
                 generator = new placeholdergen();
                meshLoader = () -> new HexMesh(this, 4);
                startSector = 1;
                sectorSeed = -1;
                //defaultCore = fortress;
                defaultCore = Blocks.coreShard;
                
            }};
        }
        catch(Exception e){
            Log.info("the planet broke??");
            Log.err(e);
        }

    }
}
