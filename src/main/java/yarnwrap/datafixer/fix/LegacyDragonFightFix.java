package yarnwrap.datafixer.fix;
public class LegacyDragonFightFix { public net.minecraft.datafixer.fix.LegacyDragonFightFix wrapperContained; public LegacyDragonFightFix(net.minecraft.datafixer.fix.LegacyDragonFightFix wrapperContained) { this.wrapperContained = wrapperContained; }

public LegacyDragonFightFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.LegacyDragonFightFix(outputSchema); }
// public com.mojang.datafixers.Typed method_52227(com.mojang.datafixers.Typed typed) { return wrapperContained.method_52227(typed); }
// public static com.mojang.datafixers.Typed method_52227(com.mojang.datafixers.Typed typed, ) { return net.minecraft.datafixer.fix.LegacyDragonFightFix.method_52227(typed); }
// public com.mojang.serialization.Dynamic method_52228(com.mojang.serialization.Dynamic levelData) { return wrapperContained.method_52228(levelData); }
// public static com.mojang.serialization.Dynamic method_52228(com.mojang.serialization.Dynamic levelData, ) { return net.minecraft.datafixer.fix.LegacyDragonFightFix.method_52228(levelData); }
// public com.mojang.serialization.Dynamic updateExitPortalLocation(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.updateExitPortalLocation(dynamic); }
// public static com.mojang.serialization.Dynamic updateExitPortalLocation(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.LegacyDragonFightFix.updateExitPortalLocation(dynamic); }

}