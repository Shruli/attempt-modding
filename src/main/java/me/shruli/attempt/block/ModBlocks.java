package me.shruli.attempt.block;

import me.shruli.attempt.AttemptMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ZETHICS_BLOCK = foodEffBlock("zethics_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(0.5f).requiresTool()),
            ItemGroup.FOOD,
            1,
            StatusEffects.INSTANT_DAMAGE
    );

    // registers the item for the regular block
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier("shruli", name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    // registers a regular block
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier("shruli", name), block);
    }

    // registers the item for the block that can be eaten
    private static Item foodBlockItem(String name, Block block, ItemGroup group, int hunger) {
        return Registry.register(Registry.ITEM, new Identifier("shruli", name),
                new BlockItem(block, new FabricItemSettings().group(group).food(new FoodComponent.Builder().hunger(hunger).saturationModifier(0.9f).build())));
    }

    // registers a block that can be eaten
    private static Block foodBlock(String name, Block block, ItemGroup group, int hunger) {
        foodBlockItem(name, block, group, hunger);
        return Registry.register(Registry.BLOCK, new Identifier("shruli", name), block);
    }

    // registers a block that can be eaten and give certain effects when eaten
    private static Block foodEffBlock(String name, Block block, ItemGroup group, int hunger, StatusEffect effect) {
        foodEffBlockItem(name, block, group, hunger, effect);
        return Registry.register(Registry.BLOCK, new Identifier("shruli", name), block);
    }

    // registers the item for the food effect block
    private static Item foodEffBlockItem(String name, Block block, ItemGroup group, int hunger, StatusEffect effect) {
        return Registry.register(Registry.ITEM, new Identifier("shruli", name),
                new BlockItem(block, new FabricItemSettings().group(group).food(new FoodComponent.Builder().hunger(hunger).saturationModifier(0.9f).statusEffect(
                                new StatusEffectInstance(effect, 5, 10), 1.0F)
                        .build())));
    }

    public static void registerModBlocks() {
        AttemptMod.LOGGER.info("Initializing the blocks included in the mod...");
    }

}
