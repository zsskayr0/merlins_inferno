package com.zsskayr0.merlins_inferno.item;

import com.zsskayr0.merlins_inferno.Merlins_Inferno;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Merlins_Inferno.MOD_ID);

    public static final RegistryObject<Item> TITANIUMBAR = ITEMS.register( "titanium_bar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEMONITEBAR = ITEMS.register( "demonite_bar",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
