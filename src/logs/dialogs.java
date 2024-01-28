package logs;

import arc.Core;
import arc.Events;
import arc.util.Log;
import arc.util.Time;
import mindustry.game.EventType;
import mindustry.ui.dialogs.BaseDialog;

public class dialogs {

    public static void load() {


            Log.info("Log Test GO.");

            //Cargar algunos eventos
            Events.on(EventType.ClientLoadEvent.class, e -> {
                //El dialog.cont para runnear el texto etc
                Time.runTask(15f, () -> {
                    BaseDialog dialog = new BaseDialog("Arktik Log");
                    dialog.cont.add("Eso no es zinc").row();

                    dialog.cont.add("v2").row();
                    //buscar una imagen ejemplo el zinc para ello el (Core.atlas.find("arktik-java-zinc")
                    dialog.cont.image(Core.atlas.find("arktik-java-zinc")).pad(20f).row();
                    dialog.cont.button("Cerrar", dialog::hide).size(100f, 50f);
                    dialog.show();
                });




            });
        }

    }
