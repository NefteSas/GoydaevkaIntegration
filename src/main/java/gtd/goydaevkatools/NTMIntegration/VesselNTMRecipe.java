package gtd.goydaevkatools.NTMIntegration;

import com.hbm.inventory.RecipesCommon;
import com.hbm.inventory.recipes.loader.GenericRecipe;
import gtd.goydaevkatools.CORE;
import mcheli.plane.MCP_PlaneInfoManager;
import mcheli.tank.MCH_TankInfoManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class VesselNTMRecipe {
    private String vesselID;

    public String getVesselID(){
        return vesselID;
    }
    private GenericRecipe recipe;

    public GenericRecipe getRecipe(){
        return recipe;
    }

    public VesselNTMRecipe(String name,VESSEL_TYPE veselType, int power, int duration, RecipesCommon.AStack... input){
        Item vesselItem = null;
        try {
            switch (veselType) {
                case AIRCRAFT:
                    vesselItem = MCP_PlaneInfoManager.get(name).getItem();
                    break;
                case TANK:
                    vesselItem = MCH_TankInfoManager.get(name).getItem();
                    break;
                default:
                    CORE.LOGGER.error("VESSEL TYPE WAS NOT FOUND");
                    return;
            }
        } catch (NullPointerException e){

            CORE.LOGGER.error("Vessel with name " + name + " was not found!");
        }


        this.recipe = new GenericRecipe("ass." + name)
            .setup(duration, power)
            .outputItems(new ItemStack(vesselItem,1))
            .inputItems(input);

        this.vesselID = name;
    }
}
