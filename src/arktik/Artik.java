package arktik;


import arktik.content.*;
import logs.*;
import mindustry.mod.Mod;


public class Artik extends Mod{

    public Artik(){
    }

    @Override
    public void loadContent(){


        //Lo guardare en Honor a la pendejada de no poner .load al final y como recordatorio.
        ArLiquids.load();
        ArItems.load();

        ArBlocks.load();
        ArPlanets.load();

        dialogs.load();

    }
}