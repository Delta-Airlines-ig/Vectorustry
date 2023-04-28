package idk;

import arc.*;
import arc.util.*;
import idk.content.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.mod.Mods.*;
import mindustry.ui.dialogs.*;

public class IdkMod extends Mod{

    public IdkMod(){
        Log.info("Loading the funny ui thing");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("shit");
                dialog.cont.add("Ah shit").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("ut-GTA")).pad(20f).row();
                dialog.cont.button("Here we go again", dialog::hide).size(150f, 60f);
                dialog.show();
            });
        });
    }

//here?
    //@Override
    public void loadContent(){
        Log.info("Hopefully everything works.");
       EarthLiquids.load();
        Log.info("Liquids loaded.");
       EarthItems.load();
        Log.info("Items loaded.");
       EarthUnitTypes.load();
        Log.info("Units loaded.");
       EarthBlocks.load();
        Log.info("Blocks loaded.");
        EarthPlanets.load();
        Log.info("Planets loaded.");
        
        EarthSectors.load();
        Log.info("Sectors loaded.");
       EarthTechtree.load();
        Log.info("Techtree for earth(?) loaded.");
        Log.info("Everything is loaded.");
    }
}
//i have no clue what im doing i just stole this from some other mods
  //  @Override
  //  public void loadContent(){
      //  EarthLiquids.load();
   //     EarthItems.load();
   //     EarthBlocks.load();
   //     EarthPlanets.load();
     //   EarthSectors.load();
     //   EarthTechTree.load();
        
   // }
//}

