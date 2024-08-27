package cn.onea;

import cn.onea.Item.Salad;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class MITEItems {
    private MITEItems() {}
    // 新物品的实例
    public static final Salad SALAD = register("salad", new Salad(new Item.Settings().maxCount(4)));

    public static <T extends Item> T register(String path, T item) {
        // 对于 1.21 之前的版本，请将 ''Identifier.of'' 替换为 ''new Identifier''
        return Registry.register(Registries.ITEM, Identifier.of("mite", path), item);
    }

    public static void initialize() {
    }
}
