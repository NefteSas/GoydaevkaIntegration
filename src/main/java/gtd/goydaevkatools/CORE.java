package gtd.goydaevkatools;

import com.hbm.inventory.RecipesCommon;
import com.hbm.inventory.recipes.AssemblyMachineRecipes;
import com.hbm.inventory.recipes.loader.GenericRecipe;
import com.hbm.inventory.recipes.loader.GenericRecipes;
import com.hbm.inventory.recipes.loader.SerializableRecipe;
import com.hbm.items.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import gtd.goydaevkatools.hbm_connector.RecipesLoader;
import mcheli.tank.MCH_TankInfoManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.hbm.inventory.OreDictManager.*;
import static java.lang.System.in;

@Mod(modid = "gtd", name = "Goydaevka Tools", version = Tags.VERSION)
public class CORE {

    public static final Logger LOGGER = LogManager.getLogger("RFGExampleMod");

    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void init(FMLInitializationEvent ev) {
        LOGGER.info("Hello, RFG example mod!");




        //LOGGER.info(AssemblyMachineRecipes.INSTANCE.recipeOrderedList);

    }
    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void preInit(FMLPreInitializationEvent ev) {
        LOGGER.info("ADDED SOME SHIT");
        SerializableRecipe.additionalListeners.add(new RecipesLoader());
    }
}
