package gtd.goydaevkatools.NTMIntegration.Loaders;

import api.hbm.recipe.IRecipeRegisterListener;
import com.hbm.inventory.recipes.AssemblyMachineRecipes;
import gtd.goydaevkatools.CORE;
import gtd.goydaevkatools.NTMIntegration.VesselNTMRecipe;

import java.util.ArrayList;
import java.util.List;

public class RecipesLoader implements IRecipeRegisterListener {

    public static List<VesselNTMRecipe> recipeList = new ArrayList<>();
    boolean initiationDone = false;

    @Override
    public void onRecipeLoad(String recipeClassName) {
        if (recipeClassName.equals(AssemblyMachineRecipes.class.getSimpleName())){
            CORE.LOGGER.info("Starting load recipes...");
            LoadList();
            initiationDone = true;
            CORE.LOGGER.info("Recipe load done");
        }
    }
    void LoadList(){
        for (VesselNTMRecipe recipe : recipeList){
            AssemblyMachineRecipes.INSTANCE.register(recipe.getRecipe());
        }
    }
}
