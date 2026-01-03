package gtd.goydaevkatools.NTMIntegration.RecipeDefiner;

import com.hbm.inventory.RecipesCommon;
import com.hbm.items.ItemEnums;
import com.hbm.items.ModItems;
import com.hbm.items.weapon.sedna.factory.GunFactory;
import gtd.goydaevkatools.GTDITems;
import gtd.goydaevkatools.NTMIntegration.VESSEL_TYPE;
import gtd.goydaevkatools.NTMIntegration.VesselNTMRecipe;
import gtd.goydaevkatools.VesselsComponents.TankComponentEnum;
import mcheli.aircraft.MCH_AircraftInfoManager;
import mcheli.tank.MCH_TankInfoManager;
import net.minecraft.init.Items;

import static com.hbm.inventory.OreDictManager.COAL;
import static com.hbm.inventory.OreDictManager.STEEL;

public class TankDefiner extends AbstractDefiner{
    private static TankDefiner INSTANCE;

    public static TankDefiner getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new TankDefiner();
        }
        return INSTANCE;
    }

    @Override
    MCH_AircraftInfoManager GetOperatingManager() {
        return MCH_TankInfoManager.getInstance();
    }

    @Override
    void AbstractDefineProcedure() {
        DefineRecipe(new VesselNTMRecipe(
            "t90m",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 32),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 4, TankComponentEnum.RUSSIAN_ARMOR),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.SECOND_ERA),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
    }
}
