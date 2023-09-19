package wtf.sikelio.sikore.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import wtf.sikelio.sikore.Sikore;

public class ModItems {
    public static final Item SIKOIN = registerItem("sikoin", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SIKOIN);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Sikore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Sikore.LOGGER.info("Registering Mod Items for " + Sikore.MOD_ID);
    }
}
