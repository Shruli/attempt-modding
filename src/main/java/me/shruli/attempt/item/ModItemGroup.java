package me.shruli.attempt.item;

import me.shruli.attempt.AttemptMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SHRULI = FabricItemGroupBuilder.build(new Identifier("shruli", "shruli"),
            () -> new ItemStack(ModItems.ZETHICS_PROFILE_PICTURE)
    );
}
