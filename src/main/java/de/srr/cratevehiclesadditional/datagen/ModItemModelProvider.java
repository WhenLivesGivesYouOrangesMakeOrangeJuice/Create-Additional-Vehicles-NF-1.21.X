package de.srr.cratevehiclesadditional.datagen;

import de.srr.cratevehiclesadditional.CreateVehiclesAdditional;
import de.srr.cratevehiclesadditional.Items.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateVehiclesAdditional.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.CARBON.get());
        basicItem(ModItems.BUCKET_OF_ACRYLONITRILE.get());
        basicItem(ModItems.POLYACRYLONITRILE_POWDER.get());
        basicItem(ModItems.CARBON_ALLOY.get());
    }
}
