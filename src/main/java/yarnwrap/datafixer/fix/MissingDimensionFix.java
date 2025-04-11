package yarnwrap.datafixer.fix;
public class MissingDimensionFix { public net.minecraft.datafixer.fix.MissingDimensionFix wrapperContained; public MissingDimensionFix(net.minecraft.datafixer.fix.MissingDimensionFix wrapperContained) { this.wrapperContained = wrapperContained; }

public MissingDimensionFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.MissingDimensionFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_29909(com.mojang.datafixers.FieldFinder worldGenSettingsTyped) { return wrapperContained.method_29909(worldGenSettingsTyped); }
// public com.mojang.datafixers.Typed method_29910(com.mojang.datafixers.OpticFinder dimensionsTyped) { return wrapperContained.method_29910(dimensionsTyped); }
// public com.mojang.datafixers.Typed method_29911(com.mojang.datafixers.Typed dimensionsListTyped) { return wrapperContained.method_29911(dimensionsListTyped); }
// public com.mojang.serialization.Dynamic method_29912(com.mojang.serialization.Dynamic worldGenSettingsDynamic) { return wrapperContained.method_29912(worldGenSettingsDynamic); }
// public com.mojang.datafixers.types.Type extract1(java.lang.String field,com.mojang.datafixers.types.Type type) { return wrapperContained.extract1(field,type); }
// public com.mojang.datafixers.types.Type extract2Opt(java.lang.String field1,com.mojang.datafixers.types.Type type1,java.lang.String field2,com.mojang.datafixers.types.Type type2) { return wrapperContained.extract2Opt(field1,type1,field2,type2); }
// public com.mojang.datafixers.types.Type extract1Opt(java.lang.String field,com.mojang.datafixers.types.Type type) { return wrapperContained.extract1Opt(field,type); }
// public com.mojang.datafixers.types.Type flatGeneratorType() { return wrapperContained.flatGeneratorType(); }

}