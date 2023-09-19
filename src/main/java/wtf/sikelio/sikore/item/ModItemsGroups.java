package wtf.sikelio.sikore.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import wtf.sikelio.sikore.Sikore;
import wtf.sikelio.sikore.block.ModBlocks;

public class ModItemsGroups {
    public static final ItemGroup SIKORE_GROUP = Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(Sikore.MOD_ID, "sikore"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sikore"))
            .icon(() -> new ItemStack(ModItems.SIKOIN)).entries((displayContext, entries) -> {
                // ITEMS
                entries.add(ModItems.SIKOIN);

                // BLOCKS
                entries.add(ModBlocks.SIKOIN_BLOCK);
                entries.add(ModBlocks.SIKOIN_ORE);
            }).build()
    );

    public static void registerItemGroups() {
        Sikore.LOGGER.info("Registering Item Groups for " + Sikore.MOD_ID);
    }
}
