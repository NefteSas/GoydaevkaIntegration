package gtd.goydaevkatools.ModItems;

import com.hbm.items.ItemEnumMulti;
import cpw.mods.fml.common.registry.GameRegistry;
import gtd.goydaevkatools.CORE;
import gtd.goydaevkatools.VesselsComponents.TankComponentEnum;
import net.minecraft.item.Item;

public class GTDITems {

    public static ItemEnumMulti tankComponents;
    public static Item textolite_plate;

    public static void InstntinateItems(){
        tankComponents = (ItemEnumMulti) new ItemEnumMulti(TankComponentEnum.class, true, true).setUnlocalizedName("tank_component").setCreativeTab(CORE.gtdTab).setTextureName(CORE.MODID + ":tank_component");
        textolite_plate = new Item().setUnlocalizedName("textolite_plate").setCreativeTab(CORE.gtdTab).setTextureName(CORE.MODID + ":textolite_plate");
    }
    public static void RegisterItems(){
        GameRegistry.registerItem(tankComponents, tankComponents.getUnlocalizedName());
        GameRegistry.registerItem(textolite_plate,textolite_plate.getUnlocalizedName());
    }
}
