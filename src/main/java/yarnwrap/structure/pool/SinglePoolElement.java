package yarnwrap.structure.pool;
public class SinglePoolElement { public net.minecraft.structure.pool.SinglePoolElement wrapperContained; public SinglePoolElement(net.minecraft.structure.pool.SinglePoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry processors() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.processors); }
// public void processors(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.processors = value.wrapperContained; }
// public com.mojang.datafixers.util.Either location() { return wrapperContained.location; }
// public void location(com.mojang.datafixers.util.Either value) { wrapperContained.location = value; }
// public com.mojang.serialization.Codec LOCATION_CODEC() { return wrapperContained.LOCATION_CODEC; }
// public void LOCATION_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LOCATION_CODEC = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.Optional overrideLiquidSettings() { return wrapperContained.overrideLiquidSettings; }
// public void overrideLiquidSettings(java.util.Optional value) { wrapperContained.overrideLiquidSettings = value; }
// public SinglePoolElement(com.mojang.datafixers.util.Either location,yarnwrap.registry.entry.RegistryEntry processors,Object projection,java.util.Optional overrideLiquidSettings) { this.wrapperContained = new net.minecraft.structure.pool.SinglePoolElement(location,processors.wrapperContained,projection,overrideLiquidSettings); }
public java.util.List getDataStructureBlocks(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,boolean mirroredAndRotated) { return wrapperContained.getDataStructureBlocks(structureTemplateManager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,mirroredAndRotated); }
// public yarnwrap.structure.StructurePlacementData createPlacementData(yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockBox box,yarnwrap.structure.StructureLiquidSettings liquidSettings,boolean keepJigsaws) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.createPlacementData(rotation.wrapperContained,box.wrapperContained,liquidSettings.wrapperContained,keepJigsaws)); }
// public yarnwrap.structure.StructureTemplate getStructure(yarnwrap.structure.StructureTemplateManager structureTemplateManager) { return new yarnwrap.structure.StructureTemplate(wrapperContained.getStructure(structureTemplateManager.wrapperContained)); }
// public com.mojang.serialization.DataResult encodeLocation(com.mojang.datafixers.util.Either location,com.mojang.serialization.DynamicOps ops,java.lang.Object prefix) { return wrapperContained.encodeLocation(location,ops,prefix); }
// public com.mojang.datafixers.kinds.App method_28878(Object instance) { return wrapperContained.method_28878(instance); }
// public com.mojang.datafixers.util.Either method_28879(yarnwrap.structure.pool.SinglePoolElement pool) { return wrapperContained.method_28879(pool.wrapperContained); }
// public com.mojang.serialization.codecs.RecordCodecBuilder processorsGetter() { return wrapperContained.processorsGetter(); }
// public yarnwrap.registry.entry.RegistryEntry method_28881(yarnwrap.structure.pool.SinglePoolElement pool) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28881(pool.wrapperContained)); }
// public com.mojang.serialization.codecs.RecordCodecBuilder locationGetter() { return wrapperContained.locationGetter(); }
// public int method_54781(Object block) { return wrapperContained.method_54781(block); }
// public void sort(java.util.List blocks) { wrapperContained.sort(blocks); }
// public java.lang.Integer method_54783(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.method_54783(nbt.wrapperContained); }
// public java.util.Optional method_61012(yarnwrap.structure.pool.SinglePoolElement pool) { return wrapperContained.method_61012(pool.wrapperContained); }
// public com.mojang.serialization.codecs.RecordCodecBuilder overrideLiquidSettingsGetter() { return wrapperContained.overrideLiquidSettingsGetter(); }

}