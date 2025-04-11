package yarnwrap.world.gen;
public class StructureAccessor { public net.minecraft.world.gen.StructureAccessor wrapperContained; public StructureAccessor(net.minecraft.world.gen.StructureAccessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.WorldAccess world() { return new yarnwrap.world.WorldAccess(wrapperContained.world); }
// public void world(yarnwrap.world.WorldAccess value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.world.gen.GeneratorOptions options() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.options); }
// public void options(yarnwrap.world.gen.GeneratorOptions value) { wrapperContained.options = value.wrapperContained; }
// public yarnwrap.world.StructureLocator locator() { return new yarnwrap.world.StructureLocator(wrapperContained.locator); }
// public void locator(yarnwrap.world.StructureLocator value) { wrapperContained.locator = value.wrapperContained; }
public StructureAccessor(yarnwrap.world.WorldAccess world,yarnwrap.world.gen.GeneratorOptions options,yarnwrap.world.StructureLocator locator) { this.wrapperContained = new net.minecraft.world.gen.StructureAccessor(world.wrapperContained,options.wrapperContained,locator.wrapperContained); }
public void addStructureReference(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.world.gen.structure.Structure structure,long reference,yarnwrap.world.StructureHolder holder) { wrapperContained.addStructureReference(pos.wrapperContained,structure.wrapperContained,reference,holder.wrapperContained); }
public yarnwrap.structure.StructureStart getStructureStart(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.world.gen.structure.Structure structure,yarnwrap.world.StructureHolder holder) { return new yarnwrap.structure.StructureStart(wrapperContained.getStructureStart(pos.wrapperContained,structure.wrapperContained,holder.wrapperContained)); }
public void setStructureStart(yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.world.gen.structure.Structure structure,yarnwrap.structure.StructureStart structureStart,yarnwrap.world.StructureHolder holder) { wrapperContained.setStructureStart(pos.wrapperContained,structure.wrapperContained,structureStart.wrapperContained,holder.wrapperContained); }
public boolean shouldGenerateStructures() { return wrapperContained.shouldGenerateStructures(); }
public yarnwrap.structure.StructureStart getStructureAt(yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.structure.Structure structure) { return new yarnwrap.structure.StructureStart(wrapperContained.getStructureAt(pos.wrapperContained,structure.wrapperContained)); }
public yarnwrap.world.gen.StructureAccessor forRegion(yarnwrap.world.ChunkRegion region) { return new yarnwrap.world.gen.StructureAccessor(wrapperContained.forRegion(region.wrapperContained)); }
public boolean hasStructureReferences(yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasStructureReferences(pos.wrapperContained); }
public java.util.List getStructureStarts(yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.world.gen.structure.Structure structure) { return wrapperContained.getStructureStarts(sectionPos.wrapperContained,structure.wrapperContained); }
public yarnwrap.structure.StructureStart getStructureContaining(yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.structure.Structure structure) { return new yarnwrap.structure.StructureStart(wrapperContained.getStructureContaining(pos.wrapperContained,structure.wrapperContained)); }
public yarnwrap.world.StructurePresence getStructurePresence(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.gen.structure.Structure structure,yarnwrap.world.gen.chunk.placement.StructurePlacement placement,boolean skipReferencedStructures) { return new yarnwrap.world.StructurePresence(wrapperContained.getStructurePresence(chunkPos.wrapperContained,structure.wrapperContained,placement.wrapperContained,skipReferencedStructures)); }
public void incrementReferences(yarnwrap.structure.StructureStart structureStart) { wrapperContained.incrementReferences(structureStart.wrapperContained); }
public void acceptStructureStarts(yarnwrap.world.gen.structure.Structure structure,it.unimi.dsi.fastutil.longs.LongSet structureStartPositions,java.util.function.Consumer consumer) { wrapperContained.acceptStructureStarts(structure.wrapperContained,structureStartPositions,consumer); }
public boolean structureContains(yarnwrap.util.math.BlockPos pos,yarnwrap.structure.StructureStart structureStart) { return wrapperContained.structureContains(pos.wrapperContained,structureStart.wrapperContained); }
public yarnwrap.structure.StructureStart getStructureContaining(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.entry.RegistryEntryList structures) { return new yarnwrap.structure.StructureStart(wrapperContained.getStructureContaining(pos.wrapperContained,structures.wrapperContained)); }
public java.util.List getStructureStarts(yarnwrap.util.math.ChunkPos pos,java.util.function.Predicate predicate) { return wrapperContained.getStructureStarts(pos.wrapperContained,predicate); }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }
public java.util.Map getStructureReferences(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getStructureReferences(pos.wrapperContained); }
public yarnwrap.structure.StructureStart getStructureContaining(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate) { return new yarnwrap.structure.StructureStart(wrapperContained.getStructureContaining(pos.wrapperContained,predicate)); }
// public boolean method_41414(yarnwrap.registry.Registry structure) { return wrapperContained.method_41414(structure.wrapperContained); }
// public boolean method_57559(yarnwrap.registry.tag.TagKey structure) { return wrapperContained.method_57559(structure.wrapperContained); }
public yarnwrap.structure.StructureStart getStructureContaining(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.structure.StructureStart(wrapperContained.getStructureContaining(pos.wrapperContained,tag.wrapperContained)); }

}