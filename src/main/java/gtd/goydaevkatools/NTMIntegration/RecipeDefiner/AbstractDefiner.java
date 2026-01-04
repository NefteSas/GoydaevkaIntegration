package gtd.goydaevkatools.NTMIntegration.RecipeDefiner;

import gtd.goydaevkatools.CORE;
import gtd.goydaevkatools.NTMIntegration.Loaders.NTMRecipesLoader;
import gtd.goydaevkatools.NTMIntegration.VesselNTMRecipe;
import mcheli.aircraft.MCH_AircraftInfoManager;

public abstract class AbstractDefiner {

    abstract MCH_AircraftInfoManager GetOperatingManager();

    public void DefineRecipes(){
        CORE.LOGGER.info("DEFINING " + this.getClass().getSimpleName());
        AbstractDefineProcedure();
    }

    abstract void AbstractDefineProcedure();

    void DefineRecipe(VesselNTMRecipe recipe){
        if (GetOperatingManager().getMap().containsKey(recipe.getVesselID())){
            NTMRecipesLoader.recipeList.add(recipe);
        } else {
            CORE.LOGGER.error(recipe.getVesselID() + " WAS NOT FOUND IN " + GetOperatingManager().getClass().getSimpleName());
        }
    }
}
