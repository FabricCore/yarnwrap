package yarnwrap.structure.pool;
public class SinglePoolElement { public net.minecraft.structure.pool.SinglePoolElement wrapperContained; public SinglePoolElement(net.minecraft.structure.pool.SinglePoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry processors() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.processors); }
// public void processors(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.processors = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry processors() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.structure.pool.SinglePoolElement.processors); }
// public static void processors(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.structure.pool.SinglePoolElement.processors = value.wrapperContained; }

// public com.mojang.datafixers.util.Either location() { return wrapperContained.location; }
// public void location(com.mojang.datafixers.util.Either value) { wrapperContained.location = value; }
// public static com.mojang.datafixers.util.Either location() { return net.minecraft.structure.pool.SinglePoolElement.location; }
// public static void location(com.mojang.datafixers.util.Either value, ) { net.minecraft.structure.pool.SinglePoolElement.location = value; }

// public com.mojang.serialization.Codec LOCATION_CODEC() { return wrapperContained.LOCATION_CODEC; }
// public void LOCATION_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LOCATION_CODEC = value; }
// public static com.mojang.serialization.Codec LOCATION_CODEC() { return net.minecraft.structure.pool.SinglePoolElement.LOCATION_CODEC; }
// public static void LOCATION_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.structure.pool.SinglePoolElement.LOCATION_CODEC = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.pool.SinglePoolElement.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.pool.SinglePoolElement.CODEC = value; }

// public java.util.Optional overrideLiquidSettings() { return wrapperContained.overrideLiquidSettings; }
// public void overrideLiquidSettings(java.util.Optional value) { wrapperContained.overrideLiquidSettings = value; }
// public static java.util.Optional overrideLiquidSettings() { return net.minecraft.structure.pool.SinglePoolElement.overrideLiquidSettings; }
// public static void overrideLiquidSettings(java.util.Optional value, ) { net.minecraft.structure.pool.SinglePoolElement.overrideLiquidSettings = value; }

// public java.util.Comparator JIGSAW_BLOCK_INFO_COMPARATOR() { return wrapperContained.JIGSAW_BLOCK_INFO_COMPARATOR; }
// public void JIGSAW_BLOCK_INFO_COMPARATOR(java.util.Comparator value) { wrapperContained.JIGSAW_BLOCK_INFO_COMPARATOR = value; }
// public static java.util.Comparator JIGSAW_BLOCK_INFO_COMPARATOR() { return net.minecraft.structure.pool.SinglePoolElement.JIGSAW_BLOCK_INFO_COMPARATOR; }
// public static void JIGSAW_BLOCK_INFO_COMPARATOR(java.util.Comparator value, ) { net.minecraft.structure.pool.SinglePoolElement.JIGSAW_BLOCK_INFO_COMPARATOR = value; }

// public SinglePoolElement(com.mojang.datafixers.util.Either location,yarnwrap.registry.entry.RegistryEntry processors,Object projection,java.util.Optional overrideLiquidSettings) { this.wrapperContained = new net.minecraft.structure.pool.SinglePoolElement(location,processors.wrapperContained,projection,overrideLiquidSettings); }
public java.util.List getDataStructureBlocks(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,boolean mirroredAndRotated) { return wrapperContained.getDataStructureBlocks(structureTemplateManager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,mirroredAndRotated); }
// public static java.util.List getDataStructureBlocks(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,boolean mirroredAndRotated, ) { return net.minecraft.structure.pool.SinglePoolElement.getDataStructureBlocks(structureTemplateManager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,mirroredAndRotated); }
// public yarnwrap.structure.StructurePlacementData createPlacementData(yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockBox box,yarnwrap.structure.StructureLiquidSettings liquidSettings,boolean keepJigsaws) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.createPlacementData(rotation.wrapperContained,box.wrapperContained,liquidSettings.wrapperContained,keepJigsaws)); }
// public static yarnwrap.structure.StructurePlacementData createPlacementData(yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockBox box,yarnwrap.structure.StructureLiquidSettings liquidSettings,boolean keepJigsaws, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.pool.SinglePoolElement.createPlacementData(rotation.wrapperContained,box.wrapperContained,liquidSettings.wrapperContained,keepJigsaws)); }
// public yarnwrap.structure.StructureTemplate getStructure(yarnwrap.structure.StructureTemplateManager structureTemplateManager) { return new yarnwrap.structure.StructureTemplate(wrapperContained.getStructure(structureTemplateManager.wrapperContained)); }
// public static yarnwrap.structure.StructureTemplate getStructure(yarnwrap.structure.StructureTemplateManager structureTemplateManager, ) { return new yarnwrap.structure.StructureTemplate(net.minecraft.structure.pool.SinglePoolElement.getStructure(structureTemplateManager.wrapperContained)); }
// public com.mojang.serialization.DataResult encodeLocation(com.mojang.datafixers.util.Either location,com.mojang.serialization.DynamicOps ops,java.lang.Object prefix) { return wrapperContained.encodeLocation(location,ops,prefix); }
// public static com.mojang.serialization.DataResult encodeLocation(com.mojang.datafixers.util.Either location,com.mojang.serialization.DynamicOps ops,java.lang.Object prefix, ) { return net.minecraft.structure.pool.SinglePoolElement.encodeLocation(location,ops,prefix); }
// public com.mojang.datafixers.kinds.App method_28878(Object instance) { return wrapperContained.method_28878(instance); }
// public static com.mojang.datafixers.kinds.App method_28878(Object instance, ) { return net.minecraft.structure.pool.SinglePoolElement.method_28878(instance); }
// public com.mojang.datafixers.util.Either method_28879(yarnwrap.structure.pool.SinglePoolElement pool) { return wrapperContained.method_28879(pool.wrapperContained); }
// public static com.mojang.datafixers.util.Either method_28879(yarnwrap.structure.pool.SinglePoolElement pool, ) { return net.minecraft.structure.pool.SinglePoolElement.method_28879(pool.wrapperContained); }
// public com.mojang.serialization.codecs.RecordCodecBuilder processorsGetter() { return wrapperContained.processorsGetter(); }
// public static com.mojang.serialization.codecs.RecordCodecBuilder processorsGetter() { return net.minecraft.structure.pool.SinglePoolElement.processorsGetter(); }
// public yarnwrap.registry.entry.RegistryEntry method_28881(yarnwrap.structure.pool.SinglePoolElement pool) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28881(pool.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_28881(yarnwrap.structure.pool.SinglePoolElement pool, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.structure.pool.SinglePoolElement.method_28881(pool.wrapperContained)); }
// public com.mojang.serialization.codecs.RecordCodecBuilder locationGetter() { return wrapperContained.locationGetter(); }
// public static com.mojang.serialization.codecs.RecordCodecBuilder locationGetter() { return net.minecraft.structure.pool.SinglePoolElement.locationGetter(); }
// public void sort(java.util.List blocks) { wrapperContained.sort(blocks); }
// public static void sort(java.util.List blocks, ) { net.minecraft.structure.pool.SinglePoolElement.sort(blocks); }
// public java.util.Optional method_61012(yarnwrap.structure.pool.SinglePoolElement pool) { return wrapperContained.method_61012(pool.wrapperContained); }
// public static java.util.Optional method_61012(yarnwrap.structure.pool.SinglePoolElement pool, ) { return net.minecraft.structure.pool.SinglePoolElement.method_61012(pool.wrapperContained); }
// public com.mojang.serialization.codecs.RecordCodecBuilder overrideLiquidSettingsGetter() { return wrapperContained.overrideLiquidSettingsGetter(); }
// public static com.mojang.serialization.codecs.RecordCodecBuilder overrideLiquidSettingsGetter() { return net.minecraft.structure.pool.SinglePoolElement.overrideLiquidSettingsGetter(); }
public yarnwrap.util.Identifier getIdOrThrow() { return new yarnwrap.util.Identifier(wrapperContained.getIdOrThrow()); }
// public static yarnwrap.util.Identifier getIdOrThrow() { return new yarnwrap.util.Identifier(net.minecraft.structure.pool.SinglePoolElement.getIdOrThrow()); }

}