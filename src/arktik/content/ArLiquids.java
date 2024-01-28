package arktik.content;

import arc.graphics.Color;
import mindustry.type.Liquid;


public class ArLiquids {

    public static Liquid

    helium;

    public static void load() {

        helium = new Liquid("helium", Color.valueOf("85e6bd")) {{
            explosiveness = 0.0f;
            viscosity = 0.0f;
            temperature = -2;
        }};

    }
}
