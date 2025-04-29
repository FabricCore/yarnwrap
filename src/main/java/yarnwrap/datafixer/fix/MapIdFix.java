package yarnwrap.datafixer.fix;
public class MapIdFix { public net.minecraft.datafixer.fix.MapIdFix wrapperContained; public MapIdFix(net.minecraft.datafixer.fix.MapIdFix wrapperContained) { this.wrapperContained = wrapperContained; }

public MapIdFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.MapIdFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_17828(com.mojang.datafixers.Typed mapDatTyped) { return wrapperContained.method_17828(mapDatTyped); }
// public static com.mojang.datafixers.Typed method_17828(com.mojang.datafixers.Typed mapDatTyped, ) { return net.minecraft.datafixer.fix.MapIdFix.method_17828(mapDatTyped); }
// public com.mojang.serialization.Dynamic method_28222(com.mojang.serialization.Dynamic mapDatDynamic) { return wrapperContained.method_28222(mapDatDynamic); }
// public static com.mojang.serialization.Dynamic method_28222(com.mojang.serialization.Dynamic mapDatDynamic, ) { return net.minecraft.datafixer.fix.MapIdFix.method_28222(mapDatDynamic); }

}