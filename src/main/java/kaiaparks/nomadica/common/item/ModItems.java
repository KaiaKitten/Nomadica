package kaiaparks.nomadica.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

import kaiaparks.nomadica.common.core.ModItemGroup;

public class ModItems {
    public static void registerItems(RegistryEvent.Register<Item> evt) {
        IForgeRegistry<Item> r = evt.getRegistry();
    }

    public static Item.Properties defaultBuilder() {
        return new Item.Properties().group(ModItemGroup.INSTANCE);
    }
}
