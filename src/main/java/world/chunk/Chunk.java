package yarnwrap.world.chunk;
public class Chunk { public net.minecraft.world.chunk.Chunk wrapperContained; public Chunk(net.minecraft.world.chunk.Chunk wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.shorts.ShortList[] postProcessingLists() { return wrapperContained.postProcessingLists; }
// public boolean needsSaving() { return wrapperContained.needsSaving; }
// public yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.pos); }
// public yarnwrap.world.gen.chunk.ChunkNoiseSampler chunkNoiseSampler() { return new yarnwrap.world.gen.chunk.ChunkNoiseSampler(wrapperContained.chunkNoiseSampler); }
// public yarnwrap.world.chunk.UpgradeData upgradeData() { return new yarnwrap.world.chunk.UpgradeData(wrapperContained.upgradeData); }
// public java.util.Map heightmaps() { return wrapperContained.heightmaps; }
// public java.util.Map blockEntityNbts() { return wrapperContained.blockEntityNbts; }
// public java.util.Map blockEntities() { return wrapperContained.blockEntities; }
// public yarnwrap.world.HeightLimitView heightLimitView() { return new yarnwrap.world.HeightLimitView(wrapperContained.heightLimitView); }
// public net.minecraft.world.chunk.ChunkSection[] sectionArray() { return wrapperContained.sectionArray; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public boolean lightOn() { return wrapperContained.lightOn; }
// public long inhabitedTime() { return wrapperContained.inhabitedTime; }
// public java.util.Map structureStarts() { return wrapperContained.structureStarts; }
// public java.util.Map structureReferences() { return wrapperContained.structureReferences; }
// public yarnwrap.world.gen.chunk.BlendingData blendingData() { return new yarnwrap.world.gen.chunk.BlendingData(wrapperContained.blendingData); }
// public it.unimi.dsi.fastutil.longs.LongSet EMPTY_STRUCTURE_REFERENCES() { return wrapperContained.EMPTY_STRUCTURE_REFERENCES; }
// public yarnwrap.world.biome.GenerationSettings generationSettings() { return new yarnwrap.world.biome.GenerationSettings(wrapperContained.generationSettings); }
public int MISSING_SECTION() { return wrapperContained.MISSING_SECTION; }
// public yarnwrap.world.chunk.light.ChunkSkyLight chunkSkyLight() { return new yarnwrap.world.chunk.light.ChunkSkyLight(wrapperContained.chunkSkyLight); }
public void addEntity(yarnwrap.entity.Entity entity) { wrapperContained.addEntity(entity.wrapperContained); }
public yarnwrap.world.chunk.UpgradeData getUpgradeData() { return new yarnwrap.world.chunk.UpgradeData(wrapperContained.getUpgradeData()); }
public yarnwrap.util.math.ChunkPos getPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getPos()); }
// public int sampleHeightmap(Object type,int x,int z) { return wrapperContained.sampleHeightmap(type,x,z); }
public net.minecraft.world.chunk.ChunkSection[] getSectionArray() { return wrapperContained.getSectionArray(); }
public void setBlockEntity(yarnwrap.block.entity.BlockEntity blockEntity) { wrapperContained.setBlockEntity(blockEntity.wrapperContained); }
public void setNeedsSaving(boolean needsSaving) { wrapperContained.setNeedsSaving(needsSaving); }
public yarnwrap.world.chunk.ChunkStatus getStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getStatus()); }
public yarnwrap.block.BlockState setBlockState(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean moved) { return new yarnwrap.block.BlockState(wrapperContained.setBlockState(pos.wrapperContained,state.wrapperContained,moved)); }
public java.util.Collection getHeightmaps() { return wrapperContained.getHeightmaps(); }
public it.unimi.dsi.fastutil.shorts.ShortList[] getPostProcessingLists() { return wrapperContained.getPostProcessingLists(); }
public yarnwrap.world.tick.BasicTickScheduler getBlockTickScheduler() { return new yarnwrap.world.tick.BasicTickScheduler(wrapperContained.getBlockTickScheduler()); }
public yarnwrap.world.tick.BasicTickScheduler getFluidTickScheduler() { return new yarnwrap.world.tick.BasicTickScheduler(wrapperContained.getFluidTickScheduler()); }
public java.util.Map getStructureStarts() { return wrapperContained.getStructureStarts(); }
public void setLightOn(boolean lightOn) { wrapperContained.setLightOn(lightOn); }
public java.util.Set getBlockEntityPositions() { return wrapperContained.getBlockEntityPositions(); }
public yarnwrap.nbt.NbtCompound getBlockEntityNbt(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getBlockEntityNbt(pos.wrapperContained)); }
public it.unimi.dsi.fastutil.shorts.ShortList getList(it.unimi.dsi.fastutil.shorts.ShortList[] lists,int index) { return wrapperContained.getList(lists,index); }
public void setInhabitedTime(long inhabitedTime) { wrapperContained.setInhabitedTime(inhabitedTime); }
public void markBlockForPostProcessing(short packedPos,int index) { wrapperContained.markBlockForPostProcessing(packedPos,index); }
// public int getHighestNonEmptySectionYOffset() { return wrapperContained.getHighestNonEmptySectionYOffset(); }
// public yarnwrap.world.Heightmap getHeightmap(Object type) { return new yarnwrap.world.Heightmap(wrapperContained.getHeightmap(type)); }
public long getInhabitedTime() { return wrapperContained.getInhabitedTime(); }
public void setStructureStarts(java.util.Map structureStarts) { wrapperContained.setStructureStarts(structureStarts); }
// public void setHeightmap(Object type,long heightmap) { wrapperContained.setHeightmap(type,heightmap); }
public boolean isLightOn() { return wrapperContained.isLightOn(); }
public void markBlockForPostProcessing(yarnwrap.util.math.BlockPos pos) { wrapperContained.markBlockForPostProcessing(pos.wrapperContained); }
public int getHighestNonEmptySection() { return wrapperContained.getHighestNonEmptySection(); }
public void removeBlockEntity(yarnwrap.util.math.BlockPos pos) { wrapperContained.removeBlockEntity(pos.wrapperContained); }
public void addPendingBlockEntityNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.addPendingBlockEntityNbt(nbt.wrapperContained); }
// public boolean needsSaving() { return wrapperContained.needsSaving(); }
public boolean areSectionsEmptyBetween(int lowerHeight,int upperHeight) { return wrapperContained.areSectionsEmptyBetween(lowerHeight,upperHeight); }
// public yarnwrap.nbt.NbtCompound getPackedBlockEntityNbt(yarnwrap.util.math.BlockPos pos,Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getPackedBlockEntityNbt(pos.wrapperContained,registryLookup)); }
public yarnwrap.world.event.listener.GameEventDispatcher getGameEventDispatcher(int ySectionCoord) { return new yarnwrap.world.event.listener.GameEventDispatcher(wrapperContained.getGameEventDispatcher(ySectionCoord)); }
public yarnwrap.world.gen.chunk.ChunkNoiseSampler getOrCreateChunkNoiseSampler(java.util.function.Function chunkNoiseSamplerCreator) { return new yarnwrap.world.gen.chunk.ChunkNoiseSampler(wrapperContained.getOrCreateChunkNoiseSampler(chunkNoiseSamplerCreator)); }
// public void fillSectionArray(yarnwrap.registry.Registry biomeRegistry,net.minecraft.world.chunk.ChunkSection[] sectionArray) { wrapperContained.fillSectionArray(biomeRegistry.wrapperContained,sectionArray); }
// public void populateBiomes(yarnwrap.world.biome.source.BiomeSupplier biomeSupplier,Object sampler) { wrapperContained.populateBiomes(biomeSupplier.wrapperContained,sampler); }
public yarnwrap.world.chunk.ChunkSection getSection(int yIndex) { return new yarnwrap.world.chunk.ChunkSection(wrapperContained.getSection(yIndex)); }
public void increaseInhabitedTime(long delta) { wrapperContained.increaseInhabitedTime(delta); }
public boolean hasStructureReferences() { return wrapperContained.hasStructureReferences(); }
public void setBlendingData(yarnwrap.world.gen.chunk.BlendingData blendingData) { wrapperContained.setBlendingData(blendingData.wrapperContained); }
// public boolean hasHeightmap(Object type) { return wrapperContained.hasHeightmap(type); }
public Object getTickSchedulers() { return wrapperContained.getTickSchedulers(); }
public boolean usesOldNoise() { return wrapperContained.usesOldNoise(); }
public yarnwrap.world.gen.chunk.BlendingData getBlendingData() { return new yarnwrap.world.gen.chunk.BlendingData(wrapperContained.getBlendingData()); }
public yarnwrap.world.chunk.BelowZeroRetrogen getBelowZeroRetrogen() { return new yarnwrap.world.chunk.BelowZeroRetrogen(wrapperContained.getBelowZeroRetrogen()); }
public yarnwrap.world.HeightLimitView getHeightLimitView() { return new yarnwrap.world.HeightLimitView(wrapperContained.getHeightLimitView()); }
public boolean hasBelowZeroRetrogen() { return wrapperContained.hasBelowZeroRetrogen(); }
public yarnwrap.world.biome.GenerationSettings getOrCreateGenerationSettings(java.util.function.Supplier generationSettingsCreator) { return new yarnwrap.world.biome.GenerationSettings(wrapperContained.getOrCreateGenerationSettings(generationSettingsCreator)); }
public void refreshSurfaceY() { wrapperContained.refreshSurfaceY(); }
public void forEachBlockMatchingPredicate(java.util.function.Predicate predicate,java.util.function.BiConsumer consumer) { wrapperContained.forEachBlockMatchingPredicate(predicate,consumer); }
public yarnwrap.world.chunk.ChunkStatus getMaxStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getMaxStatus()); }
public boolean isSectionEmpty(int sectionCoord) { return wrapperContained.isSectionEmpty(sectionCoord); }

}