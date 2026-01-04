package gtd.goydaevkatools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static gtd.goydaevkatools.ModItems.GTDITems.tankComponents;

public class ModTab extends CreativeTabs {
    public ModTab() {
        super(CORE.MODNAME);
    }

    @Override
    public Item getTabIconItem() {
        return tankComponents;
    }
}
