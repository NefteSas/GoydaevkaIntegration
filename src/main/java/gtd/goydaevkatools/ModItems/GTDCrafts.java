package gtd.goydaevkatools.ModItems;

import com.hbm.inventory.RecipesCommon;
import com.hbm.items.ModItems;
import com.hbm.main.CraftingManager;
import cpw.mods.fml.common.registry.GameRegistry;
import gtd.goydaevkatools.VesselsComponents.TankComponentEnum;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.hbm.inventory.OreDictManager.*;

public class GTDCrafts {
    public static void InitializeCrafts(){
        CraftingManager.addRecipeAuto(new ItemStack(GTDITems.textolite_plate, 1),
            new Object[]{

                "XXX", "YYY", "XXX",

                ('X'), Blocks.glass,
                ('Y'), ANY_PLASTIC.dust()

            }
        );
        CraftingManager.addRecipeAuto(new ItemStack(GTDITems.textolite_plate, 4),
            new Object[]{

                "XXX", "YYY", "XXX",

                ('X'), ModItems.ingot_fiberglass,
                ('Y'), ANY_PLASTIC.dust()

            }
        );
        CraftingManager.addRecipeAuto(GTDITems.tankComponents.stackFromEnum(TankComponentEnum.RUSSIAN_ARMOR),
            new Object[]{
                "XXX", "YYY", "XXX",
                ('X'), STEEL.plateCast(),
                ('Y'), GTDITems.textolite_plate
            }
        );
        CraftingManager.addRecipeAuto(GTDITems.tankComponents.stackFromEnum(TankComponentEnum.FIRST_ERA),
            new Object[]{
                "#X#", "XYX", "#X#",
                ('X'), STEEL.plate(),
                ('Y'), ANY_HIGHEXPLOSIVE.ingot()
            }
        );
        CraftingManager.addRecipeAuto(GTDITems.tankComponents.stackFromEnum(TankComponentEnum.FIRST_ERA),
            new Object[]{
                "#X#", "XYX", "#X#",
                ('X'), STEEL.plate(),
                ('Y'), ANY_PLASTICEXPLOSIVE.ingot()
            }
        );
        CraftingManager.addRecipeAuto(GTDITems.tankComponents.stackFromEnum(TankComponentEnum.SECOND_ERA),
            new Object[]{
                "ZZZ", "YYY", "XXX",
                ('X'), STEEL.plate(),
                ('Y'), ANY_PLASTICEXPLOSIVE.ingot(),
                ('Z'), STEEL.plateCast()
            }
        );
        CraftingManager.addRecipeAuto(GTDITems.tankComponents.stackFromEnum(TankComponentEnum.SECOND_ERA),
            new Object[]{
                "ZZZ", "YYY", "XXX",
                ('X'), STEEL.plate(),
                ('Y'), ANY_HIGHEXPLOSIVE.ingot(),
                ('Z'), STEEL.plateCast()
            }
        );
        CraftingManager.addRecipeAuto(GTDITems.tankComponents.stackFromEnum(TankComponentEnum.NERA_ASSEMBLY),
            new Object[]{
                "XXX", "YYY", "XXX",
                ('X'), STEEL.plate(),
                ('Y'), ANY_RUBBER.ingot()
            }
        );
        CraftingManager.addRecipeAuto(new ItemStack(GTDITems.wheel, 1),
            new Object[]{
                "XXX", "XYX", "XXX",
                ('X'), ANY_RUBBER.ingot(),
                ('Y'), Items.iron_ingot
            }
        );
        CraftingManager.addRecipeAuto(GTDITems.tankComponents.stackFromEnum(TankComponentEnum.NATO_ARMOR),
            new Object[]{
                "XXX", "YYY", "XXX",
                ('X'), STEEL.plateCast(),
                ('Y'), GTDITems.tankComponents.stackFromEnum(TankComponentEnum.NERA_ASSEMBLY)
            }
        );
    }
}
