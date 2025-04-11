package yarnwrap.datafixer.fix;
public class PlayerUuidFix { public net.minecraft.datafixer.fix.PlayerUuidFix wrapperContained; public PlayerUuidFix(net.minecraft.datafixer.fix.PlayerUuidFix wrapperContained) { this.wrapperContained = wrapperContained; }

public PlayerUuidFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.PlayerUuidFix(outputSchema); }
// public com.mojang.datafixers.Typed method_26070(com.mojang.datafixers.Typed playerTyped) { return wrapperContained.method_26070(playerTyped); }
// public com.mojang.datafixers.Typed method_26072(com.mojang.datafixers.Typed rootVehicleTyped) { return wrapperContained.method_26072(rootVehicleTyped); }
// public com.mojang.serialization.Dynamic method_28240(com.mojang.serialization.Dynamic playerDynamic) { return wrapperContained.method_28240(playerDynamic); }
// public com.mojang.serialization.Dynamic method_28241(com.mojang.serialization.Dynamic rootVehicleDynamic) { return wrapperContained.method_28241(rootVehicleDynamic); }

}