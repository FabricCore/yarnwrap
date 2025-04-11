package yarnwrap.datafixer.fix;
public class StructureReferenceFix { public net.minecraft.datafixer.fix.StructureReferenceFix wrapperContained; public StructureReferenceFix(net.minecraft.datafixer.fix.StructureReferenceFix wrapperContained) { this.wrapperContained = wrapperContained; }

public StructureReferenceFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.StructureReferenceFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic updateReferences(com.mojang.serialization.Dynamic structureFeatureDynamic) { return wrapperContained.updateReferences(structureFeatureDynamic); }
// public com.mojang.datafixers.Typed method_23662(com.mojang.datafixers.Typed structureFeatureTyped) { return wrapperContained.method_23662(structureFeatureTyped); }
// public boolean method_23663(java.lang.Integer references) { return wrapperContained.method_23663(references); }
// public com.mojang.serialization.Dynamic method_23664(com.mojang.serialization.Dynamic referencesDynamic) { return wrapperContained.method_23664(referencesDynamic); }

}