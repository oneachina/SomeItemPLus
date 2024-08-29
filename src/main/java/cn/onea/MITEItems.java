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
    //FoodItem
    public static final Item SALAD = register(new Item(new Item.Settings().maxCount(4).food(Food)), "salad");
    public static final Item blueberries = register(new Item(new Item.Settings().maxCount(16).food(Food)), "blueberries");
    public static final Item bowl_water = register(new Item(new Item.Settings().maxCount(4).food(Food)), "bowl_water");
    public static final Item Porridge = register(new Item(new Item.Settings().maxCount(4).food(new FoodComponent.Builder().snack().nutrition(4).saturationModifier(4.0F).build())), "porridge");
    public static final Item bowl_milk = register(new Item(new Item.Settings().maxCount(4).food(Food)), "bowl_milk");
    public static final Item Coconut = register(new Item(new Item.Settings().maxCount(16).food(Food)), "coconut");
    public static final Item Ice_cream = register(new Item(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().snack().nutrition(4).saturationModifier(4.0F).build())), "ice_cream");
    public static final Item latiao = register(new Item(new Item.Settings().maxCount(16).food(Food)), "latiao");
    public static final Item Strawberry = register(new Item(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().snack().nutrition(2).saturationModifier(1.0F).build())), "strawberry");
    public static final Item Grape = register(new Item(new Item.Settings().maxCount(16).food(Food)), "grape");
    public static final Item duck_Cooked = register(new Item(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().nutrition(6).saturationModifier(6.0F).build())), "duck_cooked");
    public static final Item duck_Meat = register(new Item(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().nutrition(3).saturationModifier(3.0F).build())), "duck_meat");
    public static final Item Sun_Flower_Seed = register(new Item(new Item.Settings().maxCount(16).food(Food)), "sun_flower_seed");
    public static final Item Crab_Leg = register(new Item(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().snack().nutrition(3).saturationModifier(1.0F).build())), "crab_leg");
    public static final Item Crab_Meat = register(new Item(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().nutrition(3).saturationModifier(1.0F).build())), "crab_meat");
    public static final Item Belt = register(new Item(new Item.Settings().maxCount(16).food(Food)), "belt");
    public static final Item Sugar_Block = register(new Item(new Item.Settings().maxCount(16).food(Food)), "sugar_block");
    public static final Item Wild_Fruit = register(new Item(new Item.Settings().maxCount(16).food(Food)), "wild_fruit");
    public static final Item Fish_Ball = register(new Item(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().nutrition(6).saturationModifier(6.0F).build())), "fish_ball");
    //CombatItem



    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(MITE.MOD_ID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static void initialize() {
    }
}
