package kaiaparks.nomadica.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import kaiaparks.nomadica.common.block.ModBlocks;
import kaiaparks.nomadica.common.lib.LibMisc;

@Mod(LibMisc.MOD_ID)
public class Nomadica {

    public static IEventBus MOD_EVENT_BUS;
    private static final Logger LOGGER = LogManager.getLogger();

    public Nomadica(){
        LOGGER.debug("Hello from Nomadica!");
        //Event Listeners
        MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
        MOD_EVENT_BUS.addGenericListener(Block.class, ModBlocks::registerBlocks);
        MOD_EVENT_BUS.addGenericListener(Item.class, ModBlocks::registerItemBlocks);
    }

}
