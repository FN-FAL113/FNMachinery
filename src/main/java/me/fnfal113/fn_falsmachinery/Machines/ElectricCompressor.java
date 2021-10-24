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

public class ElectricCompressor extends AContainer implements RecipeDisplayItem {

    private static final SlimefunAddon plugin = FN_FALSMachinery.getInstance();

    public ElectricCompressor(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 4);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(new ItemStack(Material.AIR));
            displayRecipes.add(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "682ad1b9cb4dd21259c0d75aa315ff389c3cef752be3949338164bac84a96e")));
            displayRecipes.add(new ItemStack(Material.AIR));
            displayRecipes.add(recipe.getOutput()[0]);
            displayRecipes.add(new ItemStack(Material.AIR));
            displayRecipes.add(new ItemStack(Material.AIR));
            displayRecipes.add(new ItemStack(Material.AIR));
            displayRecipes.add(new ItemStack(Material.AIR));
            displayRecipes.add(new ItemStack(Material.AIR));
        }

        return displayRecipes;
    }

    @Override
    protected void registerDefaultRecipes() {
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 2)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.REINFORCED_PLATE, 2)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 2)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.STEEL_PLATE, 3)});
        registerRecipe(16, new ItemStack[]{new ItemStack(Material.COAL_BLOCK, 4)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBON, 12)});
        registerRecipe(16, new ItemStack[]{new ItemStack(Material.COAL, 4)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.CARBON, 1)});
        registerRecipe(16, new ItemStack[]{new ItemStack(Material.CHARCOAL, 2)},
                new ItemStack[]{new ItemStack(Material.COAL, 1)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.SMALL_URANIUM, 2)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.URANIUM, 1)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.URANIUM, 64)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.NEPTUNIUM, 1)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 4)},
                new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.SALT, 6)});

    }

    public static void setup(){
        new ElectricCompressor(FnItems.MACHINES, FnItems.FN_FAL_COMPRESSOR_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                FnItems.COMPRESSOR_PART, FnItems.THREAD_PART, FnItems.MOTOR_SWITCH,
                FnItems.GEAR_PART, FnItems.BASIC_MACHINE_BLOCK, FnItems.GEAR_PART,
                FnItems.CONDENSER_PART, FnItems.ALUMINUM_PLATING, FnItems.POWER_COMPONENT
        }).setCapacity(1536).setEnergyConsumption(64).setProcessingSpeed(1).register(plugin);

        new ElectricCompressor(FnItems.MACHINES, FnItems.FN_FAL_COMPRESSOR_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(FnItems.COMPRESSOR_PART, 3), new SlimefunItemStack(FnItems.THREAD_PART, 8), new SlimefunItemStack(FnItems.MOTOR_SWITCH, 3),
                new SlimefunItemStack(FnItems.GEAR_PART, 8), FnItems.BASIC_MACHINE_BLOCK, new SlimefunItemStack(FnItems.GEAR_PART, 8),
                new SlimefunItemStack(FnItems.CONDENSER_PART, 4), new SlimefunItemStack(FnItems.DIAMOND_PLATING, 7), new SlimefunItemStack(FnItems.POWER_COMPONENT, 4)
        }).setCapacity(1536).setEnergyConsumption(128).setProcessingSpeed(2).register(plugin);

        new ElectricCompressor(FnItems.MACHINES, FnItems.FN_FAL_COMPRESSOR_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(FnItems.COMPRESSOR_PART, 6), new SlimefunItemStack(FnItems.COMPONENT_PART, 8), new SlimefunItemStack(FnItems.MOTOR_SWITCH, 6),
                new SlimefunItemStack(FnItems.GEAR_PART, 16), FnItems.HIGHTECH_MACHINE_BLOCK, new SlimefunItemStack(FnItems.GEAR_PART, 16),
                new SlimefunItemStack(FnItems.CONDENSER_PART, 8), new SlimefunItemStack(FnItems.REINFORCED_CASING, 12), new SlimefunItemStack(FnItems.POWER_COMPONENT, 8)
        }).setCapacity(1536).setEnergyConsumption(256).setProcessingSpeed(4).register(plugin);



    }


    @Override
    public String getMachineIdentifier() {
        return "ELECTRIC_COMPRESSOR";
    }

    @Override
    public ItemStack getProgressBar() {
        return new SlimefunItemStack(FnItems.COMPRESSOR_PART, 1);
    }
}
