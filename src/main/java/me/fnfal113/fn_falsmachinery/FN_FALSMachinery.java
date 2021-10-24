package me.fnfal113.fn_falsmachinery;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.plugin.java.JavaPlugin;

public final class FN_FALSMachinery extends JavaPlugin implements SlimefunAddon {

    private static FN_FALSMachinery instance;

    @Override
    public void onEnable() {
        setInstance(this);

        getLogger().info("************************************************************");
        getLogger().info("*          FN Machinery - Created by FN_FAL113             *");
        getLogger().info("*   Custom Slimefun Addon that adds Machines and Stuffs!   *");
        getLogger().info("*         pm me on discord if there are any issues         *");
        getLogger().info("*                       FN_FAL#7779                        *");
        getLogger().info("************************************************************");

        FnItemSetup.INSTANCE.init();


    }


    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return null;
    }

    private static void setInstance(FN_FALSMachinery ins) {
        instance = ins;
    }

    public static FN_FALSMachinery getInstance() {
        return instance;
    }

}
