package arktik.content;

import arc.func.*;
import arc.graphics.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import arktik.maps.planets.*;
import mindustry.content.Items;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.graphics.g3d.*;
import mindustry.graphics.g3d.PlanetGrid.*;
import mindustry.maps.planet.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;

public class ArPlanets {
    public static Planet
            Folux,
            Dephomos;


    public static void load() {
        Folux = new Planet("BigFu", null, 5f) {{
            bloom = true;
            accessible = true;

            meshLoader = () -> new SunMesh(
                    this, 4,
                    5, 0.3, 1.7, 1.2, 1,
                    1.1f,
                    Color.valueOf("c6e1f5"),
                    Color.valueOf("d6f6ff"),
                    Color.valueOf("f2f4f5"),
                    Color.valueOf("91daff"),
                    Color.valueOf("fafcfc"),
                    Color.valueOf("9abdf5")
            );
        }};

        Dephomos = new Planet("Dephomos", Folux, 1f, 2){{
            generator = new DephomosPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 10);
            cloudMeshLoader = () -> new MultiMesh(
                    new HexSkyMesh(this, 10, 0.15f, 0.15f, 6, Color.valueOf("c7d4ce").mul(0.9f).a(0.9f), 3, 0.50f, 1.0f, 0.39f),
                    new HexSkyMesh(this, 2, 0.5f, 0.18f, 6, Color.valueOf("bce2f5").a(0.75f), 2, 0.42f, 1f, 0.43f)
            );
            iconColor = Color.valueOf("96c6eb");
            atmosphereColor = Color.valueOf("96c6eb");
            atmosphereRadIn = 0.03f;
            atmosphereRadOut = 0.4f;
            startSector = 15;
            alwaysUnlocked = true;
            landCloudColor = Color.valueOf("96c6eb").a(0.5f);
            hiddenItems.addAll(Items.erekirItems).addAll(Items.serpuloItems);

            accessible = true;
            visible = true;

            };
        };


    }
}