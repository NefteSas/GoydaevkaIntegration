package gtd.goydaevkatools.NTMIntegration.Loaders;

import api.hbm.recipe.IRecipeRegisterListener;
import com.hbm.inventory.OreDictManager;
import com.hbm.inventory.RecipesCommon;
import com.hbm.inventory.material.Mats;
import com.hbm.inventory.recipes.AssemblyMachineRecipes;
import com.hbm.inventory.recipes.PressRecipes;
import com.hbm.items.ItemEnums;
import com.hbm.items.ModItems;
import com.hbm.items.machine.ItemStamp;
import gtd.goydaevkatools.CORE;
import gtd.goydaevkatools.ModItems.GTDITems;
import gtd.goydaevkatools.NTMIntegration.VesselNTMRecipe;
import gtd.goydaevkatools.VesselsComponents.TankComponentEnum;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

import static com.hbm.inventory.OreDictManager.IRON;
import static com.hbm.inventory.OreDictManager.STEEL;

public class NTMRecipesLoader implements IRecipeRegisterListener {

    public static List<VesselNTMRecipe> recipeList = new ArrayList<>();
    boolean initiationDone = false;

    @Override
    public void onRecipeLoad(String recipeClassName) {
        CORE.LOGGER.info("Starting load recipes...");
        if (recipeClassName.equals(AssemblyMachineRecipes.class.getSimpleName())){
            CORE.LOGGER.info("ADDING ASSEMBLY RECIPES");
            LoadList();
        }
        if (recipeClassName.equals(PressRecipes.class.getSimpleName())){
            CORE.LOGGER.info("ADDING PRESS RECIPES");
            PressRecipes.makeRecipe(ItemStamp.StampType.FLAT, new RecipesCommon.OreDictStack(STEEL.plateWelded()) , OreDictManager.DictFrame.fromOne(GTDITems.tankComponents, TankComponentEnum.ROLLER));
        }
        CORE.LOGGER.info("Recipe load done");
        initiationDone = true;
    }
    void LoadList(){
        for (VesselNTMRecipe recipe : recipeList){
            AssemblyMachineRecipes.INSTANCE.register(recipe.getRecipe());
        }
    }
}
