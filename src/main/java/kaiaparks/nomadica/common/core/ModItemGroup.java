package kaiaparks.nomadica.common.core;

import kaiaparks.nomadica.common.item.ModItems;
import kaiaparks.nomadica.common.lib.LibMisc;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModItemGroup extends ItemGroup {

    public static final ModItemGroup INSTANCE = new ModItemGroup();

    public ModItemGroup() {
        super(LibMisc.MOD_ID);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.PUMPKIN);
    }
}
