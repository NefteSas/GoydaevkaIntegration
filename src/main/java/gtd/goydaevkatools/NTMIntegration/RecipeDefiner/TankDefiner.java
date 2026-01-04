package gtd.goydaevkatools.NTMIntegration.RecipeDefiner;

import com.hbm.blocks.ModBlocks;
import com.hbm.inventory.RecipesCommon;
import com.hbm.items.ModItems;
import com.hbm.items.weapon.sedna.factory.GunFactory;
import gtd.goydaevkatools.ModItems.GTDITems;
import gtd.goydaevkatools.NTMIntegration.VESSEL_TYPE;
import gtd.goydaevkatools.NTMIntegration.VesselNTMRecipe;
import gtd.goydaevkatools.VesselsComponents.TankComponentEnum;
import mcheli.aircraft.MCH_AircraftInfoManager;
import mcheli.tank.MCH_TankInfoManager;
import net.minecraft.item.Item;

import static com.hbm.inventory.OreDictManager.AL;
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
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 16),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 4, TankComponentEnum.RUSSIAN_ARMOR),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.SECOND_ERA),
            new RecipesCommon.ComparableStack(ModItems.motor, 16),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "m1a2",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 24),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.NATO_ARMOR),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 4, TankComponentEnum.FIRST_ERA),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 6,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "embt",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 24),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.NATO_ARMOR),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 4, TankComponentEnum.FIRST_ERA),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 6,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "2s38",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(AL.plateCast(), 8),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "m2a3",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 8),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "puma",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 8),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.FIRST_ERA)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "vt4a1",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 16),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModItems.motor, 16),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.SECOND_ERA),
        new RecipesCommon.ComparableStack(GTDITems.tankComponents, 4, TankComponentEnum.NATO_ARMOR)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "ebrc",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(AL.plateCast(), 8),
            new RecipesCommon.ComparableStack(GTDITems.wheel,8),
            new RecipesCommon.ComparableStack(ModItems.motor, 6),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "zbd04a",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 4),
            new RecipesCommon.OreDictStack(AL.plateCast(), 6),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        Item T90 = MCH_TankInfoManager.get("t90m").getItem();
        DefineRecipe(new VesselNTMRecipe(
            "tos1m",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.ComparableStack(T90, 1),
            new RecipesCommon.ComparableStack(ModBlocks.turret_himars,1)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "zbl08",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 8),
            new RecipesCommon.ComparableStack(GTDITems.wheel,8),
            new RecipesCommon.ComparableStack(ModItems.motor, 6),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "2k22",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 4),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModBlocks.machine_radar,1),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        //2S38
        //AL CAST PLATES
        //M2A3 STEEL CAST PLATES
        //PUMA FIRST ERA + STEEL CAST
        //VT4A1 SECOND ERA + NERA
        //ZBD04A STEEL + AL
        //EBRC AL PLATES + WHEELS
        //EMBT M2A3 COPY
    }
}
