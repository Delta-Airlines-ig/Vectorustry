/*package idk.content;

import arc.graphics.Blending;
import arc.graphics.g2d.Draw;
import arc.util.Time;
import mindustry.gen.Sounds;
import mindustry.gen.WeatherState;
import mindustry.graphics.Pal;
import mindustry.type.Weather;
import mindustry.type.weather.ParticleWeather;
import mindustry.world.meta.Attribute;
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

import static arc.graphics.g2d.Draw.rect;
import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;

public class EarthWeather{
	public static Weather
			dustStorm, smoke, lightning;
	public static void load(){
    
		
		dustStorm = new ParticleWeather("dustStorm"){{
			duration = 0.5f * Time.toMinutes;
			noiseLayers = 4;
			noiseLayerAlphaM = 0.7f;
			noiseLayerSpeedM = 2f;
			noiseLayerSclM = 0.6f;
			density = 100;
			baseSpeed = 0.5f;
      			force = 2;
			noiseColor = Color.valueOf("a87932");
			color = Color.valueOf("a87932");
			noiseScale = 1100f;
			noisePath = "fog";
			drawParticles = true;
			drawNoise = true;
			useWindVector = true;
			xspeed = 1f;
			yspeed = 1f;
			
			statusAir = statusGround = true;
			status = EarthStatus.dusty;
			statusDuration = 60f;
			attrs.set(Attribute.light, -0.8f);
			opacityMultiplier = 0.7f;
		}};
    
  }
}
*/
