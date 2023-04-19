package idk.content;
import idk.content.*;
import mindustry.type.SectorPreset;

public class Earthsectors{
	public static SectorPreset Reentry;
	
	public static void load(){
		Reentry = new SectorPreset("Reentry", EarthPlanets.earth, 1){{
			captureWave = 40;
			difficulty = 5;
			
			alwaysUnlocked = true;
			
			//rules = r -> {
			//	r.winWave = captureWave;
			//};
		}};
		
		
	}
}
