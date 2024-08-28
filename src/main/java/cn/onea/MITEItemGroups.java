package cn.onea;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static cn.onea.MITEItems.SALAD;
import static cn.onea.MITEItems.WOODEN_CUDGEL;

public final class MITEItemGroups {
    public static final ItemGroup MiteFood = Registry.register(Registries.ITEM_GROUP, Identifier.of("mite", "mitefood"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(SALAD))
            .displayName(Text.translatable("MiteFood"))
            .entries((context, entries) -> {
                entries.add(SALAD);
            })
            .build());
    public static final ItemGroup MiteCombot = Registry.register(Registries.ITEM_GROUP, Identifier.of("mite", "mitecombot"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(WOODEN_CUDGEL))
            .displayName(Text.translatable("MiteComBot"))
            .entries((context, entries) -> {
                entries.add(WOODEN_CUDGEL);
            })
            .build());
    public static void initialize() {
    }
}
