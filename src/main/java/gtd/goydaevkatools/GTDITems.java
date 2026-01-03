package gtd.goydaevkatools;

import com.hbm.items.ItemEnumMulti;
import cpw.mods.fml.common.registry.GameRegistry;
import gtd.goydaevkatools.VesselsComponents.TankComponentEnum;
import net.minecraft.item.Item;

public class GTDITems {

    public static Item tankComponents;

    public static void InstntinateItems(){
        tankComponents = new ItemEnumMulti(TankComponentEnum.class, true, true).setUnlocalizedName("tank_component").setCreativeTab(CORE.gtdTab).setTextureName(CORE.MODID + ":tank_component");
    }
    public static void RegisterItems(){
        GameRegistry.registerItem(tankComponents, tankComponents.getUnlocalizedName());
    }
}
