package me.fnfal113.fn_falsmachinery.Machines;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import me.fnfal113.fn_falsmachinery.FN_FALSMachinery;
import me.fnfal113.fn_falsmachinery.FnItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ElectricRecycler extends AContainer implements RecipeDisplayItem {

    private static final SlimefunAddon plugin = FN_FALSMachinery.getInstance();

    public ElectricRecycler(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 4);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[0]);
        }

        return displayRecipes;
    }

    @Override
    protected void registerDefaultRecipes() {
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.URANIUM, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.SMALL_URANIUM, 4)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.NEPTUNIUM, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.URANIUM, 48)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.BOOSTED_URANIUM, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.NEPTUNIUM, 2)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_24K, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_22K, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_22K, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_20K, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_20K, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_18K, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_18K, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_16K, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_16K, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_14K, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_14K, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_12K, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_12K, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_10K, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_10K, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_8K, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_8K, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_6K, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_6K, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_4K, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_4K, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_DUST, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_3, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_2, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2, 1)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 1)});

    }

    public static void setup(){
        new ElectricRecycler(FnItems.MACHINES, FnItems.FN_FAL_RECYCLER_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                FnItems.FUNNEL_PART, FnItems.RECYCLER_PART, FnItems.COMPRESSOR_PART,
                FnItems.THREAD_PART, FnItems.BASIC_MACHINE_BLOCK, FnItems.POWER_COMPONENT,
                FnItems.CONDENSER_PART, FnItems.BRASS_PLATING, FnItems.MOTOR_SWITCH
        }).setCapacity(1536).setEnergyConsumption(84).setProcessingSpeed(1).register(plugin);

        new ElectricRecycler(FnItems.MACHINES, FnItems.FN_FAL_RECYCLER_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(FnItems.FUNNEL_PART, 2), new SlimefunItemStack(FnItems.RECYCLER_PART, 3), new SlimefunItemStack(FnItems.COMPRESSOR_PART, 2),
                new SlimefunItemStack(FnItems.THREAD_PART, 8), FnItems.BASIC_MACHINE_BLOCK, new SlimefunItemStack(FnItems.POWER_COMPONENT, 8),
                new SlimefunItemStack(FnItems.CONDENSER_PART, 2), new SlimefunItemStack(FnItems.ALUMINUM_PLATING, 3), new SlimefunItemStack(FnItems.MOTOR_SWITCH, 2)
        }).setCapacity(1536).setEnergyConsumption(168).setProcessingSpeed(2).register(plugin);

        new ElectricRecycler(FnItems.MACHINES, FnItems.FN_FAL_RECYCLER_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(FnItems.FUNNEL_PART, 4), new SlimefunItemStack(FnItems.COMPONENT_PART, 8), new SlimefunItemStack(FnItems.COMPRESSOR_PART, 4),
                new SlimefunItemStack(FnItems.GEAR_PART, 16), FnItems.HIGHTECH_MACHINE_BLOCK, new SlimefunItemStack(FnItems.POWER_COMPONENT, 16),
                new SlimefunItemStack(FnItems.CONDENSER_PART, 6), new SlimefunItemStack(FnItems.REINFORCED_CASING, 7), new SlimefunItemStack(FnItems.MOTOR_SWITCH, 6)
        }).setCapacity(1536).setEnergyConsumption(336).setProcessingSpeed(4).register(plugin);



    }


    @Override
    public String getMachineIdentifier() {
        return "ELECTRIC_RECYCLER";
    }

    @Override
    public ItemStack getProgressBar() {
        return new SlimefunItemStack(FnItems.RECYCLER_PART, 1);
    }
}
