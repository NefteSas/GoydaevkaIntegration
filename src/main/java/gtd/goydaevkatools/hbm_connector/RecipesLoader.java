package gtd.goydaevkatools.hbm_connector;

import api.hbm.recipe.IRecipeRegisterListener;
import com.hbm.inventory.RecipesCommon;
import com.hbm.inventory.recipes.AssemblyMachineRecipes;
import com.hbm.inventory.recipes.loader.GenericRecipe;
import com.hbm.items.ModItems;
import gtd.goydaevkatools.CORE;
import mcheli.tank.MCH_TankInfoManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.hbm.inventory.OreDictManager.COAL;

public class RecipesLoader implements IRecipeRegisterListener {

    @Override
    public void onRecipeLoad(String recipeClassName) {
        if (recipeClassName.equals(AssemblyMachineRecipes.class.getSimpleName().toString())){
            CORE.LOGGER.info("GOAL");
            ItemStack t90Craft = new ItemStack(MCH_TankInfoManager.get(("t90m")).getItem(),1);
            CORE.LOGGER.info(t90Craft.getDisplayName());
            AssemblyMachineRecipes.INSTANCE.register(new GenericRecipe("ass.t90").setup(50, 100).outputItems(t90Craft)
                .inputItems(new RecipesCommon.OreDictStack(COAL.dust(), 4), new RecipesCommon.ComparableStack(Items.string, 2), new RecipesCommon.ComparableStack(Items.paper, 1)));
        }
    }
}
