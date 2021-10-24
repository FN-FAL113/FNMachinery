package me.fnfal113.fn_falsmachinery;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.fnfal113.fn_falsmachinery.Items.FnItemRecipes;
import me.fnfal113.fn_falsmachinery.Machines.*;

public final class FnItemSetup {

    public static final FnItemSetup INSTANCE = new FnItemSetup();
    private final SlimefunAddon plugin = FN_FALSMachinery.getInstance();
    private boolean initialised;

    private FnItemSetup() {
    }

    public void init() {
        if (initialised) {
            return;
        }

        initialised = true;

        registerTransformers();
        registerCompressors();
        registerCondensers();
        registerRecyclers();
        registerDowngrader();
        registerRecipeItems();
    }


    private void registerTransformers() {

        ElectricTransformer.setup();

    }

    private void registerCompressors() {

        ElectricCompressor.setup();

    }

    private void registerCondensers() {

        ElectricIngotCondenser.setup();

    }

    private void registerRecyclers() {

        ElectricRecycler.setup();

    }

    private void registerDowngrader() {

        ElectricMachineDowngrader.setup();

    }

    private void registerRecipeItems() {

        FnItemRecipes.setup();
    }



}
