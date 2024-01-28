package arktik.content;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.type.Item;

public class ArItems {
    public static Item
            zinc, boehmite, neodymium, aluminum;
    public static final Seq<Item> ArItems = new Seq<>();

    public static void load() {
        zinc = new Item("zinc", Color.valueOf("c5c7c9")) {{
            explosiveness = 0.1f;
            hardness = 1;
            cost = 1.0f;
            alwaysUnlocked = true;
        }};

        boehmite  = new Item("boehmite", Color.valueOf("ea8878")) {{
            hardness = 2;
            cost = 1.0f;
            alwaysUnlocked = true;
        }};

        neodymium = new Item("neodymium", Color.valueOf("7c7c7d")) {{
            charge = 2;
            hardness = 2;
            cost = 1.0f;
            alwaysUnlocked = true;
        }};

        aluminum = new Item("aluminum", Color.valueOf("aeb4c4")) {{
            charge = 0.4f;
            hardness = 4;
            cost = 1.0f;
            alwaysUnlocked = true;
        }};

        ArItems.addAll(
                zinc, boehmite, neodymium, aluminum
        );

    }
}