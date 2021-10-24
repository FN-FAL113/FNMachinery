package me.fnfal113.fn_falsmachinery;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class FnItems {

    public static final NestedItemGroup FN_MACHINERY = new NestedItemGroup(
            new NamespacedKey(FN_FALSMachinery.getInstance(), "FN_MACHINERY"), new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
            "59358703ab7727df3324336969e81d6f92b7aa79edb966c0be91ab161bad1f01")),
            "&eFN_FAL113's Machinery") );

    public static final SubItemGroup MACHINES = new SubItemGroup(new NamespacedKey(FN_FALSMachinery.getInstance(), "MACHINERY"), FN_MACHINERY, new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
            "4a7d54ca45a398c364cebbffb5390ce5e0345e0c7bc5e863acabf57d1342c4bd")), "Machines"));
    public static final SubItemGroup ITEMS = new SubItemGroup(new NamespacedKey(FN_FALSMachinery.getInstance(), "MACHINERY_ITEMS"), FN_MACHINERY, new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
            "8245a1c3e8d7c3d59d05e3634b04af4cbf8d11b70e2a40e2e6364386db49e737")), "Items"));

    public static final ItemGroup FN_MACHINERIES = new ItemGroup(
            new NamespacedKey(FN_FALSMachinery.getInstance(), "FN_MACHINERIES"), new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
            "59358703ab7727df3324336969e81d6f92b7aa79edb966c0be91ab161bad1f01")),
            "&eFN_FAL113's Machinery") );



    public static final SlimefunItemStack FN_FAL_TRANSFORMER_1 =
            new SlimefunItemStack("FN_FAL_TRANSFORMER_1",
                    Material.BLUE_GLAZED_TERRACOTTA, "&dFN Electric Transformer I",
                    "", "&eA machinery that can transform various items",
                    "&eto other forms",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(1),
                    LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_TRANSFORMER_2 =
            new SlimefunItemStack("FN_FAL_TRANSFORMER_2",
                    Material.BLUE_GLAZED_TERRACOTTA, "&dFN Electric Transformer II",
                    "", "&eA machinery that can transform various items",
                    "&eto other forms",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(2),
                    LoreBuilder.powerPerSecond(384));

    public static final SlimefunItemStack FN_FAL_TRANSFORMER_3 =
            new SlimefunItemStack("FN_FAL_TRANSFORMER_3",
                    Material.BLUE_GLAZED_TERRACOTTA, "&dFN Electric Transformer III",
                    "", "&eA machinery that can transform various items",
                    "&eto other forms",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(4),
                    LoreBuilder.powerPerSecond(768));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_1 =
            new SlimefunItemStack("FN_FAL_COMPRESSOR_1",
                    Material.GREEN_GLAZED_TERRACOTTA, "&dFN Electric Compressor I",
                    "", "&eA machinery that can compress items to",
                    "&eform a biological item",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(1),
                    LoreBuilder.powerPerSecond(128));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_2 =
            new SlimefunItemStack("FN_FAL_COMPRESSOR_2",
                    Material.GREEN_GLAZED_TERRACOTTA, "&dFN Electric Compressor II",
                    "", "&eA machinery that can compress items to",
                    "&eform a biological item",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(2),
                    LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_3 =
            new SlimefunItemStack("FN_FAL_COMPRESSOR_3",
                    Material.GREEN_GLAZED_TERRACOTTA, "&dFN Electric Compressor III",
                    "", "&eA machinery that can compress items to",
                    "&eform a biological item",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(4),
                    LoreBuilder.powerPerSecond(512));

    public static final SlimefunItemStack FN_FAL_CONDENSER_1 =
            new SlimefunItemStack("FN_FAL_CONDENSER_1",
                    Material.YELLOW_STAINED_GLASS, "&dFN Electric Ingot Condenser I",
                    "", "&eA machinery that can condense two ingots or items to",
                    "&eone biological ingot",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(1),
                    LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_CONDENSER_2 =
            new SlimefunItemStack("FN_FAL_CONDENSER_2",
                    Material.YELLOW_STAINED_GLASS, "&dFN Electric Ingot Condenser II",
                    "", "&eA machinery that can condense two ingots or items to",
                    "&eone biological ingot",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(2),
                    LoreBuilder.powerPerSecond(384));

    public static final SlimefunItemStack FN_FAL_CONDENSER_3 =
            new SlimefunItemStack("FN_FAL_CONDENSER_3",
                    Material.YELLOW_STAINED_GLASS, "&dFN Electric Ingot Condenser III",
                    "", "&eA machinery that can condense two ingots or items to",
                    "&eone biological ingot",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(4),
                    LoreBuilder.powerPerSecond(768));

    public static final SlimefunItemStack FN_FAL_RECYCLER_1 =
            new SlimefunItemStack("FN_FAL_RECYCLER_1",
                    Material.PURPLE_STAINED_GLASS, "&dFN Electric Recycler I",
                    "", "&eA machinery that can recycle items to that of",
                    "&ein lower form",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(1),
                    LoreBuilder.powerPerSecond(168));

    public static final SlimefunItemStack FN_FAL_RECYCLER_2 =
            new SlimefunItemStack("FN_FAL_RECYCLER_2",
                    Material.PURPLE_STAINED_GLASS, "&dFN Electric Recycler II",
                    "", "&eA machinery that can recycle items to that of",
                    "&ein lower form",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(2),
                    LoreBuilder.powerPerSecond(336));

    public static final SlimefunItemStack FN_FAL_RECYCLER_3 =
            new SlimefunItemStack("FN_FAL_RECYCLER_3",
                    Material.PURPLE_STAINED_GLASS, "&dElectric Recycler III",
                    "", "&eA machinery that can recycle items to that of",
                    "&ein lower form",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(2),
                    LoreBuilder.powerPerSecond(672));

    public static final SlimefunItemStack FN_FAL_DOWNGRADER =
            new SlimefunItemStack("FN_FAL_DOWNGRADER",
                    Material.WHITE_GLAZED_TERRACOTTA, "&dElectric Machine Downgrader",
                    "", "&eA machinery that can downgrade SF machines",
                    "&eGreat machine for mistakenly crafted tier machines",
                    "" ,
                    "&d&oFN Machinery",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.speed(4),
                    LoreBuilder.powerPerSecond(1500));

    public static final SlimefunItemStack MACHINE_PART =
            new SlimefunItemStack("FN_MACHINERY_MACHINE_PART",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0")),
                    "&dMachine Part",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack COMPONENT_PART =
            new SlimefunItemStack("FN_MACHINERY_COMPONENT_PART",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("74657e89167b17ed581e87ce4215ce8d47145ab34038202d5ccefb0a9bd0d8f4")),
                    "&dComponent Part",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack MOTOR_SWITCH =
            new SlimefunItemStack("FN_MACHINERY_MOTOR_SWITCH",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("48748ce96cedbfecaa463966d8fb1ac83c408feea89bd60d76d6024d3befe")),
                    "&dMotor Switch",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack POWER_COMPONENT =
            new SlimefunItemStack("FN_MACHINERY_POWER_COMPONENT",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("25ba8456e92f0790222c19c06f61180a195af1008569ed352b93a3c6d9ec7a98")),
                    "&dPower Component",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack GEAR_PART =
            new SlimefunItemStack("FN_MACHINERY_GEAR_PART",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("faf0c95ceba34c7fe6d33404feb87b4184ccce143978622c1647feaed2b63274")),
                    "&dGear Part",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack THREAD_PART =
            new SlimefunItemStack("FN_MACHINERY_THREAD_PART",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("87ec65d6649ac1bf7b282575cef299f8601e51d8418d6e546e4fc71b218f7")),
                    "&dThread Part",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack COMPRESSOR_PART =
            new SlimefunItemStack("FN_MACHINERY_COMPRESSOR_PART",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("e48337f7ede15c3b2f8dc6a63bd92874cdf74ec862b4118c7e35559ce8b4d")),
                    "&dCompressor Part",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack CONDENSER_PART =
            new SlimefunItemStack("FN_MACHINERY_CONDENSER_PART",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("63be652b2e1b93ed8e93b427de455d446582e6c8d929f8fc96ac488a8f7f53")),
                    "&dCondenser Part",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack RECYCLER_PART =
            new SlimefunItemStack("FN_MACHINERY_RECYCLER_PART",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("4817fc8e16b8e994efb908b71acd1d1352ca5aefa09fecc9339ebea450d83fb8")),
                    "&dRecycler Part",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack DOWNGRADER_PART =
            new SlimefunItemStack("FN_MACHINERY_DOWNGRADER_PART",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("a44c5ce2eb643f8671c667e8802c9317ad8cc6af680d4ef671d8c0c63277900a")),
                    "&dDowngrader Part",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack FUNNEL_PART =
            new SlimefunItemStack("FN_MACHINERY_FUNNEL_PART",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("bb2abd66939f4cb7257a88cf52fbc6fdceec1433ec2a6ef16d62e34f6238781")),
                    "&dFunnel Part",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack DIAMOND_PLATING =
            new SlimefunItemStack("FN_MACHINERY_DIAMOND_PLATING",
                    Material.LIGHT_BLUE_CARPET,
                    "&dDiamond Plating",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack ALUMINUM_PLATING =
            new SlimefunItemStack("FN_MACHINERY_ALUMINUM_PLATING",
                    Material.WHITE_CARPET,
                    "&dAluminum Plating",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack GOLD_PLATING =
            new SlimefunItemStack("FN_MACHINERY_GOLD_PLATING",
                    Material.YELLOW_CARPET,
                    "&dGold Plating",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack BRASS_PLATING =
            new SlimefunItemStack("FN_MACHINERY_BRASS_PLATING",
                    Material.BROWN_CARPET,
                    "&dBrass Plating",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack REINFORCED_CASING =
            new SlimefunItemStack("FN_MACHINERY_REINFORCED_CASING",
                    Material.LIGHT_GRAY_CARPET,
                    "&dReinforced Casing",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack BASIC_MACHINE_BLOCK =
            new SlimefunItemStack("FN_MACHINERY_BASIC_MACHINE_BLOCK",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("883dd0f90df05fe6a09aaccaf54bc043e455e1c865bda1fd272e3f47fb9bb910")),
                    "&dBasic Machine Block",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");

    public static final SlimefunItemStack HIGHTECH_MACHINE_BLOCK =
            new SlimefunItemStack("FN_MACHINERY_HIGHTECH_MACHINE_BLOCK",
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("5a7b3b16e5d0c4cfd21c4eb9133e969aad7cc7303ccdf317512e26a4879b51")),
                    "&dHigh Tech Machine Block",
                    "&fEssential Part for FN Machinery",
                    "",
                    "&d&oFN Machinery Items");



}
