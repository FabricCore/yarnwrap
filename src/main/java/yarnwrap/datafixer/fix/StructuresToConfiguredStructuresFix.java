package yarnwrap.datafixer.fix;
public class StructuresToConfiguredStructuresFix { public net.minecraft.datafixer.fix.StructuresToConfiguredStructuresFix wrapperContained; public StructuresToConfiguredStructuresFix(net.minecraft.datafixer.fix.StructuresToConfiguredStructuresFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map STRUCTURE_TO_CONFIGURED_STRUCTURES_MAPPING() { return wrapperContained.STRUCTURE_TO_CONFIGURED_STRUCTURES_MAPPING; }
// public void STRUCTURE_TO_CONFIGURED_STRUCTURES_MAPPING(java.util.Map value) { wrapperContained.STRUCTURE_TO_CONFIGURED_STRUCTURES_MAPPING = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public StructuresToConfiguredStructuresFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.StructuresToConfiguredStructuresFix(outputSchema); }
// public void method_41009(Object sectionDynamic) { wrapperContained.method_41009(sectionDynamic); }
// public com.mojang.serialization.Dynamic fixChunk(com.mojang.serialization.Dynamic chunkDynamic) { return wrapperContained.fixChunk(chunkDynamic); }
// public java.util.Optional getBiomeRepresentativeStructure(com.mojang.serialization.Dynamic chunkDynamic,Object mappingForStructure) { return wrapperContained.getBiomeRepresentativeStructure(chunkDynamic,mappingForStructure); }
// public com.mojang.serialization.Dynamic fixStructureStarts(com.mojang.serialization.Dynamic startsDynamic,com.mojang.serialization.Dynamic chunkDynamic) { return wrapperContained.fixStructureStarts(startsDynamic,chunkDynamic); }
// public void method_41017(Object biomePaletteDynamic) { wrapperContained.method_41017(biomePaletteDynamic); }
// public com.mojang.serialization.Dynamic fixStructureReferences(com.mojang.serialization.Dynamic referencesDynamic,com.mojang.serialization.Dynamic chunkDynamic) { return wrapperContained.fixStructureReferences(referencesDynamic,chunkDynamic); }
// public com.mojang.serialization.Dynamic mapStructureToConfiguredStructure(com.mojang.serialization.Dynamic structureIdDynamic,com.mojang.serialization.Dynamic chunkDynamic) { return wrapperContained.mapStructureToConfiguredStructure(structureIdDynamic,chunkDynamic); }
// public com.mojang.serialization.Dynamic method_41023(com.mojang.serialization.Dynamic structuresDynamic) { return wrapperContained.method_41023(structuresDynamic); }
// public com.mojang.serialization.Dynamic method_41024(com.mojang.serialization.Dynamic referencesDynamic) { return wrapperContained.method_41024(referencesDynamic); }
// public com.mojang.serialization.Dynamic method_41025(com.mojang.serialization.Dynamic startsDynamic) { return wrapperContained.method_41025(startsDynamic); }
// public com.mojang.serialization.Dynamic method_59519(com.mojang.serialization.Dynamic configuredStructureId,com.mojang.serialization.Dynamic referenceDynamic) { return wrapperContained.method_59519(configuredStructureId,referenceDynamic); }
// public void method_59520(com.mojang.serialization.Dynamic structureId,java.util.HashMap referenceDynamic) { wrapperContained.method_59520(structureId,referenceDynamic); }
// public com.mojang.serialization.Dynamic method_59521(com.mojang.serialization.Dynamic configuredStructureId) { return wrapperContained.method_59521(configuredStructureId); }
// public void method_59522(com.mojang.serialization.Dynamic structureId,java.util.HashMap startDynamic) { wrapperContained.method_59522(structureId,startDynamic); }

}