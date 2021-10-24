package me.fnfal113.fn_falsmachinery.Machines;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.fnfal113.fn_falsmachinery.FN_FALSMachinery;
import me.fnfal113.fn_falsmachinery.FnItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ElectricMachineDowngrader extends AContainer implements RecipeDisplayItem {

    private static final SlimefunAddon plugin = FN_FALSMachinery.getInstance();

    public ElectricMachineDowngrader(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
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
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_GOLD_PAN_3, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_GOLD_PAN_2, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_GOLD_PAN_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_GOLD_PAN, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_SMELTERY_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_SMELTERY, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_INGOT_FACTORY_3, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_INGOT_FACTORY_2, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_INGOT_FACTORY_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_INGOT_FACTORY, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_DUST_WASHER_3, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_DUST_WASHER_2, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_DUST_WASHER_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_DUST_WASHER, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_ORE_GRINDER_3, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_ORE_GRINDER_2, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_ORE_GRINDER_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_ORE_GRINDER, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_FURNACE_3, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_FURNACE_2, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_FURNACE_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_FURNACE, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.HEATED_PRESSURE_CHAMBER_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.HEATED_PRESSURE_CHAMBER, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIFIED_CRUCIBLE_3, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIFIED_CRUCIBLE_2, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIFIED_CRUCIBLE_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIFIED_CRUCIBLE, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBON_PRESS_3, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBON_PRESS_2, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBON_PRESS_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBON_PRESS, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.FREEZER_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.FREEZER, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.FOOD_FABRICATOR_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.FOOD_FABRICATOR, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.LAVA_GENERATOR_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.LAVA_GENERATOR, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.COAL_GENERATOR_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.COAL_GENERATOR, 1)});
        registerRecipe(20, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_PRESS_2, 1)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.ELECTRIC_PRESS, 1)});

    }

    public static void setup(){
        new ElectricMachineDowngrader(FnItems.MACHINES, FnItems.FN_FAL_DOWNGRADER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                FnItems.COMPRESSOR_PART, FnItems.DOWNGRADER_PART, FnItems.COMPRESSOR_PART,
                FnItems.GEAR_PART, FnItems.HIGHTECH_MACHINE_BLOCK, FnItems.POWER_COMPONENT,
                FnItems.CONDENSER_PART, FnItems.REINFORCED_CASING, FnItems.MOTOR_SWITCH
        }).setCapacity(4024).setEnergyConsumption(750).setProcessingSpeed(2).register(plugin);
    }


    @Override
    public String getMachineIdentifier() {
        return "ELECTRIC_MACHINE_DOWNGRADER";
    }

    @Override
    public ItemStack getProgressBar() {
        return new SlimefunItemStack(FnItems.DOWNGRADER_PART, 1);
    }
}
