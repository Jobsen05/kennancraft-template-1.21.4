package net.jobsen.kennancraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jobsen.kennancraft.KennanCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static  final Item CHICKEN_STRIP = registerItem("chicken_strip", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KennanCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        KennanCraft.LOGGER.info("Registering Mod Items for " + KennanCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
          fabricItemGroupEntries.add(CHICKEN_STRIP);
        });
    }


}
