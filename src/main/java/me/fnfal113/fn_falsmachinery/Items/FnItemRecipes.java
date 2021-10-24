package me.fnfal113.fn_falsmachinery.Items;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.fnfal113.fn_falsmachinery.FN_FALSMachinery;
import me.fnfal113.fn_falsmachinery.FnItems;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

public class FnItemRecipes {

    private static final SlimefunAddon plugin = FN_FALSMachinery.getInstance();


    public static void setup(){

        new UnplaceableBlock(FnItems.ITEMS, FnItems.MACHINE_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.BRONZE_INGOT, SlimefunItems.GOLD_4K, SlimefunItems.BRONZE_INGOT,
                SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 16), SlimefunItems.BATTERY, new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 16)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.COMPONENT_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.COPPER_INGOT, new ItemStack(Material.GOLD_INGOT, 3), SlimefunItems.COPPER_INGOT,
                SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD,
                new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 4), SlimefunItems.BATTERY, new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 4)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.MOTOR_SWITCH, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR, 3), SlimefunItems.ALUMINUM_BRASS_INGOT, new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR, 3),
                new ItemStack(Material.LEVER), new ItemStack(Material.REDSTONE, 8), new ItemStack(Material.LEVER),
                new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 6), SlimefunItems.BATTERY, new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 6)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.POWER_COMPONENT, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR, 8), new SlimefunItemStack(SlimefunItems.BATTERY, 2), new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR, 8),
                new ItemStack(Material.COPPER_INGOT, 4), SlimefunItems.POWER_CRYSTAL, new ItemStack(Material.COPPER_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 8), SlimefunItems.BATTERY, new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 8)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.GEAR_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR, 8), new SlimefunItemStack(SlimefunItems.CARGO_MOTOR, 4), new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR, 8),
                new ItemStack(Material.REDSTONE, 16), new SlimefunItemStack(SlimefunItems.CHAIN, 8), new ItemStack(Material.REDSTONE, 16),
                new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 16), new SlimefunItemStack(FnItems.MOTOR_SWITCH, 4), new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 16)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.THREAD_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.OAK_PLANKS, 4), new ItemStack(Material.STICK, 4), new ItemStack(Material.OAK_PLANKS, 4),
                new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 4), new ItemStack(Material.STICK, 4), new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 4),
                new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 4), new ItemStack(Material.STICK, 4), new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 4)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.COMPRESSOR_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.PISTON), new ItemStack(Material.NETHER_BRICKS, 8), new ItemStack(Material.PISTON),
                FnItems.THREAD_PART, FnItems.GEAR_PART, FnItems.THREAD_PART,
                new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 4), new ItemStack(Material.NETHER_BRICKS, 8), new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 4)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.CONDENSER_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.PISTON), FnItems.COMPONENT_PART, new ItemStack(Material.PISTON),
                FnItems.COMPRESSOR_PART, FnItems.GEAR_PART, FnItems.COMPRESSOR_PART,
                new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 12), FnItems.COMPONENT_PART, new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 12)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.RECYCLER_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.PISTON), FnItems.COMPONENT_PART, new ItemStack(Material.PISTON),
                FnItems.COMPRESSOR_PART, FnItems.GEAR_PART, FnItems.COMPRESSOR_PART,
                FnItems.CONDENSER_PART, FnItems.COMPONENT_PART, FnItems.CONDENSER_PART})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.DOWNGRADER_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.PISTON), FnItems.THREAD_PART, new ItemStack(Material.PISTON),
                FnItems.RECYCLER_PART, FnItems.GEAR_PART, FnItems.RECYCLER_PART,
                FnItems.CONDENSER_PART, FnItems.COMPRESSOR_PART, FnItems.CONDENSER_PART})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.FUNNEL_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 8), new ItemStack(Material.IRON_INGOT, 16), new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 8),
                FnItems.THREAD_PART, new ItemStack(Material.BARREL, 1), FnItems.THREAD_PART,
                new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 4), new ItemStack(Material.IRON_INGOT, 16), new SlimefunItemStack(SlimefunItems.COPPER_WIRE, 4)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.DIAMOND_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.COBALT_INGOT, 8), new ItemStack(Material.IRON_INGOT, 16), new SlimefunItemStack(SlimefunItems.COBALT_INGOT, 8),
                new ItemStack(Material.DIAMOND, 16), new ItemStack(Material.DIAMOND_BLOCK, 1), new ItemStack(Material.DIAMOND, 16),
                new SlimefunItemStack(SlimefunItems.BRONZE_INGOT, 8), new ItemStack(Material.IRON_INGOT, 16), new SlimefunItemStack(SlimefunItems.BRONZE_INGOT, 8)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.ALUMINUM_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.DURALUMIN_INGOT, 8), new ItemStack(Material.IRON_INGOT, 16), new SlimefunItemStack(SlimefunItems.DURALUMIN_INGOT, 8),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 4), new ItemStack(Material.IRON_INGOT, 16), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.BRONZE_INGOT, 8), new ItemStack(Material.IRON_INGOT, 16), new SlimefunItemStack(SlimefunItems.BRONZE_INGOT, 8)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.GOLD_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.GOLD_8K, 8), new ItemStack(Material.GOLD_NUGGET, 2), new SlimefunItemStack(SlimefunItems.GOLD_8K, 8),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 4), new ItemStack(Material.GOLD_BLOCK, 1), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.BRONZE_INGOT, 8), new ItemStack(Material.GOLD_NUGGET, 2), new SlimefunItemStack(SlimefunItems.BRONZE_INGOT, 8)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.BRASS_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 8), new ItemStack(Material.IRON_NUGGET, 2), new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 8),
                new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 4), new ItemStack(Material.COPPER_BLOCK, 1), new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.BRONZE_INGOT, 8), new ItemStack(Material.IRON_NUGGET, 2), new SlimefunItemStack(SlimefunItems.BRONZE_INGOT, 8)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.REINFORCED_CASING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.REINFORCED_PLATE, 2), new ItemStack(Material.COPPER_INGOT, 6), new SlimefunItemStack(SlimefunItems.REINFORCED_PLATE, 2),
                new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 4), new ItemStack(Material.IRON_BLOCK, 1), new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.BRONZE_INGOT, 8), new ItemStack(Material.COPPER_INGOT, 6), new SlimefunItemStack(SlimefunItems.BRONZE_INGOT, 8)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.BASIC_MACHINE_BLOCK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(FnItems.GEAR_PART, 2), new ItemStack(Material.IRON_BLOCK, 6), new SlimefunItemStack(FnItems.GEAR_PART, 2),
                new SlimefunItemStack(FnItems.BRASS_PLATING, 4), new SlimefunItemStack(FnItems.MACHINE_PART, 4), new SlimefunItemStack(FnItems.BRASS_PLATING, 4),
                new SlimefunItemStack(FnItems.COMPONENT_PART, 8), new ItemStack(Material.IRON_BLOCK, 6), new SlimefunItemStack(FnItems.COMPONENT_PART, 8)})
                .register(plugin);

        new UnplaceableBlock(FnItems.ITEMS, FnItems.HIGHTECH_MACHINE_BLOCK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new SlimefunItemStack(FnItems.GEAR_PART, 6), new SlimefunItemStack(FnItems.BASIC_MACHINE_BLOCK, 3), new SlimefunItemStack(FnItems.GEAR_PART, 6),
                new SlimefunItemStack(FnItems.REINFORCED_CASING, 12), new SlimefunItemStack(FnItems.MACHINE_PART, 16), new SlimefunItemStack(FnItems.BRASS_PLATING, 12),
                new SlimefunItemStack(FnItems.COMPONENT_PART, 16), new SlimefunItemStack(FnItems.BASIC_MACHINE_BLOCK, 3), new SlimefunItemStack(FnItems.COMPONENT_PART, 16)})
                .register(plugin);

    }


}
