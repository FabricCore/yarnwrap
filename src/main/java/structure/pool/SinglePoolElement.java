package yarnwrap.structure.pool;
public class SinglePoolElement { public net.minecraft.structure.pool.SinglePoolElement wrapperContained; public SinglePoolElement(net.minecraft.structure.pool.SinglePoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry processors() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.processors); }
// public com.mojang.datafixers.util.Either location() { return wrapperContained.location; }
// public com.mojang.serialization.Codec LOCATION_CODEC() { return wrapperContained.LOCATION_CODEC; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.Optional overrideLiquidSettings() { return wrapperContained.overrideLiquidSettings; }
public java.util.List getDataStructureBlocks(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,boolean mirroredAndRotated) { return wrapperContained.getDataStructureBlocks(structureTemplateManager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,mirroredAndRotated); }
// public yarnwrap.structure.StructurePlacementData createPlacementData(yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockBox box,yarnwrap.structure.StructureLiquidSettings liquidSettings,boolean keepJigsaws) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.createPlacementData(rotation.wrapperContained,box.wrapperContained,liquidSettings.wrapperContained,keepJigsaws)); }
// public yarnwrap.structure.StructureTemplate getStructure(yarnwrap.structure.StructureTemplateManager structureTemplateManager) { return new yarnwrap.structure.StructureTemplate(wrapperContained.getStructure(structureTemplateManager.wrapperContained)); }
// public com.mojang.serialization.DataResult encodeLocation(com.mojang.datafixers.util.Either location,com.mojang.serialization.DynamicOps ops,java.lang.Object prefix) { return wrapperContained.encodeLocation(location,ops,prefix); }
// public com.mojang.serialization.codecs.RecordCodecBuilder processorsGetter() { return wrapperContained.processorsGetter(); }
// public com.mojang.serialization.codecs.RecordCodecBuilder locationGetter() { return wrapperContained.locationGetter(); }
// public void sort(java.util.List blocks) { wrapperContained.sort(blocks); }
// public com.mojang.serialization.codecs.RecordCodecBuilder overrideLiquidSettingsGetter() { return wrapperContained.overrideLiquidSettingsGetter(); }

}