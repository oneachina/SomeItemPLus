package cn.onea;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static cn.onea.MITEItems.*;

public final class MITEItemGroups {
    public static final ItemGroup MiteFood = Registry.register(Registries.ITEM_GROUP, Identifier.of("mite", "mitefood"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(SALAD))
            .displayName(Text.translatable("MiteFood"))
            .entries((context, entries) -> {
                entries.add(SALAD);
                entries.add(blueberries);
                entries.add(bowl_water);
                entries.add(Porridge);
                entries.add(bowl_milk);
                entries.add(Coconut);
                entries.add(Ice_cream);
                entries.add(latiao);
                entries.add(Strawberry);
                entries.add(Grape);
                entries.add(Duck_Cooked);
                entries.add(Duck_Meat);
                entries.add();
                entries.add();
                entries.add();

            })
            .build());
    public static void initialize() {
    }
}
