package idk.content;

import arc.graphics.*;
import arc.util.*;
import idk.planets.*;
import mindustry.maps.generators.PlanetGenerator;
import mindustry.game.*;
import mindustry.content.*;
import idk.content.*;
import mindustry.graphics.g3d.*;
import mindustry.type.*;

public class EarthPlanets{
    public static Planet earth, placeholdermoon;

    public static void load(){
        try{
          //placeholder name ig idk a good planet name
            earth = new Planet("earth?", Planets.sun, 1f, 2) {{
		    localizedName = "ohio";
		    	icon = "router";
			iconColor = Color.red;
		                cloudMeshLoader = () -> new MultiMesh(
                new HexSkyMesh(this, 2, 0.4f, 0.1f, 5, Color.valueOf("a3a3a3").a(0.75f), 2, 0.42f, 1f, 0.43f),
                new HexSkyMesh(this, 3, 0.3f, 0.08f, 5, Color.valueOf("5c5c5c").a(0.75f), 2, 0.42f, 1.2f, 0.45f),
		new HexSkyMesh(this, 1, 0.2f, 0.05f, 5, Color.valueOf("2b2b2b").a(0.75f), 2, 0.42f, 1.2f, 0.45f)
            );
                bloom = true;
			visible = true;
			accessible = true;
			hasAtmosphere = true;
			alwaysUnlocked = true;
                atmosphereColor = Color.gray.cpy();
                landCloudColor = Color.valueOf("5c5c5c").a(0.5f);
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
                defaultCore = EarthBlocks.fortress;
		    
		hiddenItems.addAll(mindustry.content.items()).removeAll(EarthItems.EarthItems);

            	unlockedOnLand.add(EarthBlocks.fortress);
                
            }};
		placeholdermoon = new Planet("placeholdermoon", EarthPlanets.earth, 0.25f, 1) {{
		    localizedName = "kansas";
		    	icon = "router";
			rotateTime = 1f;
			orbitRadius = 30f;
			iconColor = Color.blue;
                bloom = true;
			visible = true;
			accessible = true;
			hasAtmosphere = false;
			alwaysUnlocked = true;
                //atmosphereColor = Color.gray.cpy();
                //landCloudColor = Color.clear.cpy();
              //  atmosphereRadOut = 0.5f;
              //  atmosphereRadIn = 0.05f;
               // tidalLock = true;
                hasAtmosphere = false;
			orbitRadius = 5;
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
                 generator = new placeholdergen2();
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
        Planets.serpulo.hiddenItems.addAll(EarthItems.EarthItems).removeAll(Items.serpuloItems);
        Planets.erekir.hiddenItems.addAll(EarthItems.EarthItems).removeAll(Items.erekirItems);
    }
}
