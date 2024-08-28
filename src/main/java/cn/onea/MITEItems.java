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
    public static final Wooden_Cudgel INSTANCE = new Wooden_Cudgel();
    private MITEItems() {}
    //FOODComponent
    public static final FoodComponent SALAD_FOOD = new FoodComponent.Builder()
            .snack()
            .nutrition(2)
            .saturationModifier(2.0F)
            .build();
    //Item
    public static final Item WOODEN_CUDGEL = register(new SwordItem(INSTANCE, new Item.Settings()), "Wooden_Cudgel");
    public static final Item SALAD = register(new Item(new Item.Settings().maxCount(4).food(SALAD_FOOD)), "salad");
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(MITE.MOD_ID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static void initialize() {
    }
}
