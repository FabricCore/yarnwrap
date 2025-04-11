package yarnwrap.datafixer.fix;
public class IglooMetadataRemovalFix { public net.minecraft.datafixer.fix.IglooMetadataRemovalFix wrapperContained; public IglooMetadataRemovalFix(net.minecraft.datafixer.fix.IglooMetadataRemovalFix wrapperContained) { this.wrapperContained = wrapperContained; }

public IglooMetadataRemovalFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.IglooMetadataRemovalFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_49462(com.mojang.datafixers.Typed structureFeatureTyped) { return wrapperContained.method_49462(structureFeatureTyped); }
// public com.mojang.serialization.Dynamic removeMetadata(com.mojang.serialization.Dynamic structureFeatureDynamic) { return wrapperContained.removeMetadata(structureFeatureDynamic); }
// public com.mojang.serialization.Dynamic removeIgloos(com.mojang.serialization.Dynamic structureFeatureDynamic) { return wrapperContained.removeIgloos(structureFeatureDynamic); }
// public boolean isIgloo(com.mojang.serialization.Dynamic structureFeatureDynamic) { return wrapperContained.isIgloo(structureFeatureDynamic); }

}