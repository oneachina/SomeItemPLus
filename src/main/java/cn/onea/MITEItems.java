package cn.onea;

import cn.onea.Item.Food.Salad;
import cn.onea.Item.Combot.Wooden_Cudgel;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class MITEItems {
    private MITEItems() {}
    //FOODComponent
    public static final FoodComponent Food = new FoodComponent.Builder()
            .snack()
            .nutrition(2)
            .saturationModifier(2.0F)
            .build();
    //Item
    public static final Item SALAD = register(new Item(new Item.Settings().maxCount(4).food(Food)), "salad");
    public static final Item blueberries = register(new Item(new Item.Settings().maxCount(4).food(Food)), "blueberries");

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(MITE.MOD_ID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static void initialize() {
    }
}
