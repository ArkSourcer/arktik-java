package arktik.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.OreBlock;
import mindustry.world.blocks.environment.TallBlock;
import mindustry.world.blocks.power.ImpactReactor;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.blocks.production.HeatCrafter;
import mindustry.world.draw.*;

import static arktik.content.ArItems.*;
import static mindustry.content.Items.*;
import static mindustry.type.ItemStack.with;

public class ArBlocks {
    public static Block

    //ores
    boehmiteOre,neodymiumOre,

    //floors y stones palos y piedras

    pecyte,pecyteCrystalChunk,

    //crafters
    steamBoiler, boehmiteCruxible,

    //power
    hidrogenReactor;

    public static void load() {

        //wallOres

        boehmiteOre = new OreBlock("boehmite-ore") {{
            itemDrop = boehmite;
            wallOre = true;

        }};

        neodymiumOre = new OreBlock("neodymium-ore") {{
            itemDrop = neodymium;
            wallOre = true;

        }};

        //floors cat 1

        pecyte = new Floor("pecyte-stone") {{
            //lightColor = Color.valueOf("a8dfed");
            //lightRadius = 11.0f;
            //emitLight = true;
        }};

        pecyteCrystalChunk = new TallBlock("pecyte-chunk") {{
            variants = 1;
           clipSize = 180f;
           //emitLight = true;
           //lightRadius = 11.0f;
           //lightColor = Color.valueOf("a8dfed");
            shadowAlpha = 0.6f;
            shadowOffset = -2.5f;
        }};

        //Blocks of Mineria o Produccion

        steamBoiler = new HeatCrafter("steam-boiler"){{
            size = 3;
            health = 350;
            maxEfficiency = 1;
            craftTime = 300;
            craftEffect = Fx.vapor;
            updateEffect = Fx.vapor;
            hasItems = true;
            itemCapacity = 20;
            hasLiquids = true;
            liquidCapacity = 100;
            heatRequirement = 3;
            overheatScale = 3;
            squareSprite = false;

            consumeLiquid(Liquids.water, 2.5f / 10f );

            requirements(Category.crafting, with(silicon, 60, graphite, 60, titanium, 50));
            outputItems = ItemStack.with(zinc, 5);

            drawer = new DrawMulti(
                    new DrawRegion("-liquid"),
                    new DrawLiquidTile(Liquids.water, 2f),
                    new DrawBubbles(Color.valueOf("7693e3")) {{
                        sides = 10;
                        recurrence = 3f;
                        spread = 6;
                        radius = 1.5f;
                        amount = 20;
                    }},
                    new DrawRegion("-top")



            );

        }};

        boehmiteCruxible = new GenericCrafter("boehmite-cruxible"){{
                size = 2;
                health = 400;
                itemCapacity = 125;
                hasItems = true;
                itemCapacity = 15;
                updateEffectChance = 0.2f;
                craftTime = 300;

                //unir bloques
            squareSprite = false;

            consumeItem(boehmite, 10);  consumePower(1f);

            requirements(Category.crafting, with(copper, 100, silicon, 50, zinc, 35));
            outputItems = ItemStack.with(aluminum, 4);

            drawer = new DrawMulti(
                     new DrawFlame(Color.valueOf("ffceb5")),
                     new DrawHeatRegion("-heat"),
                     new  DrawRegion("-top")
            );


        }};

        hidrogenReactor = new ImpactReactor("hidrogen-reactor"){


            {
            requirements(Category.power, with(graphite, 60, Items.silicon, 60, zinc, 50, neodymium, 30));
            size = 3;
            health = 1000;
            powerProduction = 6f;
            ambientSound = Sounds.beam;
            ambientSoundVolume = 0.07f;

            consumePower(2f);
            consumeLiquid(Liquids.hydrogen, 0.25f);
            hasLiquids = true;
        }};





    }

}
