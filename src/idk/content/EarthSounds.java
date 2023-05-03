package idk.content;

import arc.*;
import arc.assets.*;
import arc.assets.loaders.*;
import arc.audio.*;
import mindustry.*;

public class EarthSounds {
    public static Sound RadioAmbent, RadioPlace, NukeLaunch, NukeHit;
    public static final String[] soundFiles = {"RadioAmbent", "RadioPlace", "NukeLaunch", "NukeHit"};
    private static int num = 0;

    public static void load() {
        num = 0;
        RadioAmbent = l();
        RadioPlace = l();
        NukeLaunch = l();
        NukeHit = l();
    }
    protected static Sound l() {
        return loadSound(soundFiles[num++]);
    }

//totally not stolen from betamindy
    protected static Sound loadSound(String soundName) {
        if(!Vars.headless) {
            String name = "sounds/" + soundName;
            String path = name + ".ogg";

            Sound sound = new Sound();

            AssetDescriptor<?> desc = Core.assets.load(path, Sound.class, new SoundLoader.SoundParameter(sound));
            desc.errored = Throwable::printStackTrace;

            return sound;
        } else {
            return new Sound();
        }
    }
}
