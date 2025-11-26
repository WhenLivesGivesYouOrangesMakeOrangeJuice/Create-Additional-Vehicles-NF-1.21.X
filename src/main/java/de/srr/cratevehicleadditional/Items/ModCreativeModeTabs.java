package de.srr.cratevehicleadditional.Items;

import de.srr.cratevehicleadditional.Blocks.ModBlocks;
import de.srr.cratevehicleadditional.CreateVehicleAdditional;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateVehicleAdditional.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("mod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CARBON.get()))
                    .title(Component.translatable("creativetab.createvehicleadditional.modItems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CARBON);
                        output.accept(ModBlocks.BLOCK_OF_CARBON);
                        output.accept(ModBlocks.TEMPERATURE_OVEN);
                        output.accept(ModItems.BUCKET_OF_ACRYLONITRILE);
                    }).build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}