package yarnwrap.datafixer.fix;
public class RedstoneConnectionsFix { public net.minecraft.datafixer.fix.RedstoneConnectionsFix wrapperContained; public RedstoneConnectionsFix(net.minecraft.datafixer.fix.RedstoneConnectionsFix wrapperContained) { this.wrapperContained = wrapperContained; }

public RedstoneConnectionsFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.RedstoneConnectionsFix(outputSchema); }
// public com.mojang.serialization.Dynamic updateBlockState(com.mojang.serialization.Dynamic blockStateDynamic) { return wrapperContained.updateBlockState(blockStateDynamic); }
// public com.mojang.datafixers.Typed method_27779(com.mojang.datafixers.Typed blockStateTyped) { return wrapperContained.method_27779(blockStateTyped); }
// public boolean hasObsoleteValue(java.lang.String value) { return wrapperContained.hasObsoleteValue(value); }
// public com.mojang.serialization.Dynamic method_28249(java.lang.String southDynamic) { return wrapperContained.method_28249(southDynamic); }
// public com.mojang.serialization.Dynamic method_28250(com.mojang.serialization.Dynamic propertiesDynamic) { return wrapperContained.method_28250(propertiesDynamic); }
// public com.mojang.serialization.Dynamic method_28251(java.lang.String northDynamic) { return wrapperContained.method_28251(northDynamic); }
// public com.mojang.serialization.Dynamic method_28252(java.lang.String westDynamic) { return wrapperContained.method_28252(westDynamic); }
// public com.mojang.serialization.Dynamic method_28253(java.lang.String eastDynamic) { return wrapperContained.method_28253(eastDynamic); }

}