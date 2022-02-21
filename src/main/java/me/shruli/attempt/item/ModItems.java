package me.shruli.attempt.item;

import me.shruli.attempt.AttemptMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ZETHICS_PROFILE_PICTURE = registerItem("zethics_profile_picture",
            new Item(new FabricItemSettings().maxDamage(999).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(20).saturationModifier(0.9f).build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("shruli", name), item);
    }

    public static void registerModItems() {
        AttemptMod.LOGGER.info("Item registration happening right now like right now right now.");
    }

}
