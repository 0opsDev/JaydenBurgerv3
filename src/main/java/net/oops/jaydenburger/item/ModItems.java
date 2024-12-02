package net.oops.jaydenburger.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.oops.jaydenburger.JaydenBurger;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //invoke items here
    public static final Item CHEESE_BURGER = registerItem("cheese_burger", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(JaydenBurger.MOD_ID, name), item);
    }

    public static void registerModItem() {
        JaydenBurger.LOGGER.info("Registering Mod Item for " + JaydenBurger.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CHEESE_BURGER);
        });
    }
}
