package idk;

import arc.*;
import arc.util.*;
import idk.content.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class IdkMod extends Mod{

    public IdkMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("shit");
                dialog.cont.add("Ah shit").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("example-java-mod-GTA")).pad(20f).row();
                dialog.cont.button("Here we go again", dialog::hide).size(150f, 60f);
                dialog.show();
            });
        });
    }

//here?
    @Override
    public void loadContent(){
        Log.info("Loading some content i totally made myself.");
              //  EarthLiquids.load();
       //EarthItems.load();
       // EarthBlocks.load();
      //  EarthPlanets.load();
     //   EarthSectors.load();
     //   EarthTechTree.load();
        
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

