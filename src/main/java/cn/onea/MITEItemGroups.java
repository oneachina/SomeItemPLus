package cn.onea;

import cn.onea.Item.Salad;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static cn.onea.MITEItems.SALAD;

public final class MITEItemGroups {
    public static final ItemGroup MiteFood = Registry.register(Registries.ITEM_GROUP, Identifier.of("mite", "MiteFood"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(SALAD))
            .displayName(Text.translatable("itemGroup.MITE.MiteFood"))
            .entries((context, entries) -> {
                entries.add(SALAD);
            })
            .build());

    public static void initialize() {
    }
}
