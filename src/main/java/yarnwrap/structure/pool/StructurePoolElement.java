package yarnwrap.structure.pool;
public class StructurePoolElement { public net.minecraft.structure.pool.StructurePoolElement wrapperContained; public StructurePoolElement(net.minecraft.structure.pool.StructurePoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object projection() { return wrapperContained.projection; }
// // public void projection(Object value) { wrapperContained.projection = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.registry.entry.RegistryEntry EMPTY_PROCESSORS() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.EMPTY_PROCESSORS); }
// public void EMPTY_PROCESSORS(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.EMPTY_PROCESSORS = value.wrapperContained; }
public yarnwrap.util.math.Vec3i getStart(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.math.Vec3i(wrapperContained.getStart(structureTemplateManager.wrapperContained,rotation.wrapperContained)); }
// public yarnwrap.structure.pool.StructurePoolElement setProjection(Object projection) { return new yarnwrap.structure.pool.StructurePoolElement(wrapperContained.setProjection(projection)); }
public Object getProjection() { return wrapperContained.getProjection(); }
public boolean generate(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos pivot,yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.random.Random random,yarnwrap.structure.StructureLiquidSettings liquidSettings,boolean keepJigsaws) { return wrapperContained.generate(structureTemplateManager.wrapperContained,world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,pos.wrapperContained,pivot.wrapperContained,rotation.wrapperContained,box.wrapperContained,random.wrapperContained,liquidSettings.wrapperContained,keepJigsaws); }
public java.util.List getStructureBlockInfos(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.random.Random random) { return wrapperContained.getStructureBlockInfos(structureTemplateManager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,random.wrapperContained); }
public yarnwrap.util.math.BlockBox getBoundingBox(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.math.BlockBox(wrapperContained.getBoundingBox(structureTemplateManager.wrapperContained,pos.wrapperContained,rotation.wrapperContained)); }
public yarnwrap.structure.pool.StructurePoolElementType getType() { return new yarnwrap.structure.pool.StructurePoolElementType(wrapperContained.getType()); }
public int getGroundLevelDelta() { return wrapperContained.getGroundLevelDelta(); }
// public com.mojang.serialization.codecs.RecordCodecBuilder projectionGetter() { return wrapperContained.projectionGetter(); }
public java.util.function.Function ofFeature(yarnwrap.registry.entry.RegistryEntry placedFeatureEntry) { return wrapperContained.ofFeature(placedFeatureEntry.wrapperContained); }
public java.util.function.Function ofLegacySingle(java.lang.String id) { return wrapperContained.ofLegacySingle(id); }
public java.util.function.Function ofProcessedLegacySingle(java.lang.String id,yarnwrap.registry.entry.RegistryEntry processorListEntry) { return wrapperContained.ofProcessedLegacySingle(id,processorListEntry.wrapperContained); }
public java.util.function.Function ofList(java.util.List elementGetters) { return wrapperContained.ofList(elementGetters); }
public java.util.function.Function ofSingle(java.lang.String id) { return wrapperContained.ofSingle(id); }
public java.util.function.Function ofProcessedSingle(java.lang.String id,yarnwrap.registry.entry.RegistryEntry processorListEntry) { return wrapperContained.ofProcessedSingle(id,processorListEntry.wrapperContained); }
public java.util.function.Function ofEmpty() { return wrapperContained.ofEmpty(); }
public java.util.function.Function ofSingle(java.lang.String id,yarnwrap.structure.StructureLiquidSettings liquidSettings) { return wrapperContained.ofSingle(id,liquidSettings.wrapperContained); }
public java.util.function.Function ofProcessedSingle(java.lang.String id,yarnwrap.registry.entry.RegistryEntry processorListEntry,yarnwrap.structure.StructureLiquidSettings liquidSettings) { return wrapperContained.ofProcessedSingle(id,processorListEntry.wrapperContained,liquidSettings.wrapperContained); }

}