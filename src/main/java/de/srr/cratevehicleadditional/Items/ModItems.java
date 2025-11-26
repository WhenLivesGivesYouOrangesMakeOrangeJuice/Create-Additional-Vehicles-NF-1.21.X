package de.srr.cratevehicleadditional.Items;

import de.srr.cratevehicleadditional.CreateVehicleAdditional;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems{

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateVehicleAdditional.MOD_ID);

    public static final DeferredItem<Item> CARBON = ITEMS.registerItem(
            "carbon",
            Item::new, // The factory that the properties will be passed into.
            new Item.Properties() // The properties to use.
    );
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}