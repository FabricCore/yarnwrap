package yarnwrap.datafixer.fix;
public class ChunkStructuresTemplateRenameFix { public net.minecraft.datafixer.fix.ChunkStructuresTemplateRenameFix wrapperContained; public ChunkStructuresTemplateRenameFix(net.minecraft.datafixer.fix.ChunkStructuresTemplateRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableMap STRUCTURES() { return wrapperContained.STRUCTURES; }
// public void STRUCTURES(com.google.common.collect.ImmutableMap value) { wrapperContained.STRUCTURES = value; }
public ChunkStructuresTemplateRenameFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ChunkStructuresTemplateRenameFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic structureFeatureDynamic,com.mojang.serialization.Dynamic childDynamic) { return wrapperContained.fix(structureFeatureDynamic,childDynamic); }
// public com.mojang.datafixers.Typed method_49458(com.mojang.datafixers.Typed structureFeatureTyped) { return wrapperContained.method_49458(structureFeatureTyped); }
// public com.mojang.serialization.Dynamic fixChildren(com.mojang.serialization.Dynamic structureFeatureDynamic) { return wrapperContained.fixChildren(structureFeatureDynamic); }
// public com.mojang.serialization.Dynamic method_49460(com.mojang.serialization.Dynamic childrenDynamic) { return wrapperContained.method_49460(childrenDynamic); }
// public com.mojang.serialization.Dynamic method_49461(com.mojang.serialization.Dynamic childDynamic) { return wrapperContained.method_49461(childDynamic); }

}