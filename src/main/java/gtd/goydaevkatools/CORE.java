package gtd.goydaevkatools;

import com.hbm.inventory.recipes.loader.SerializableRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import gtd.goydaevkatools.NTMIntegration.Loaders.RecipesLoader;
import gtd.goydaevkatools.NTMIntegration.RecipeDefiner.TankDefiner;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

@Mod(modid = "gtd", name = "gtd", version = Tags.VERSION)
public class CORE {
    public static final String MODID = "gtd";

    public static final String MODNAME = "gtd";

    public static File CONFIGURATION_FOLDER;

    public static final Logger LOGGER = LogManager.getLogger("GTD");

    public static CreativeTabs gtdTab = new ModTab();

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent ev){

        CONFIGURATION_FOLDER = ev.getModConfigurationDirectory();
        GTDITems.InstntinateItems();
        GTDITems.RegisterItems();
    }

    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void init(FMLInitializationEvent ev) {
        LOGGER.info("Hello, RFG example mod!");

        TankDefiner.getINSTANCE().DefineRecipes();

    }
    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void preInit(FMLPreInitializationEvent ev) {
        LOGGER.info("ADDED SOME SHIT");
        SerializableRecipe.additionalListeners.add(new RecipesLoader());
    }
}
