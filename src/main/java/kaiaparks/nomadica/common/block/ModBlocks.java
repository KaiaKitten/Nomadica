package kaiaparks.nomadica.common.block;

import kaiaparks.nomadica.common.lib.LibBlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

import kaiaparks.nomadica.common.item.ModItems;
import static kaiaparks.nomadica.common.lib.LibFunc.register;

public class ModBlocks {

    public static Block pack = new BlockPack(Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD));

    public static void registerBlocks(RegistryEvent.Register<Block> evt) {
        IForgeRegistry<Block> r = evt.getRegistry();
        register(r, LibBlockNames.PACK , pack);
    }

    public static void registerItemBlocks(RegistryEvent.Register<Item> evt) {
        IForgeRegistry<Item> r = evt.getRegistry();
        Item.Properties props = ModItems.defaultBuilder();
        register(r, Registry.BLOCK.getKey(pack), new BlockItem(pack, props));
    }


}
