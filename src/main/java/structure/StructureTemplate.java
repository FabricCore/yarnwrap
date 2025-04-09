package yarnwrap.structure;
public class StructureTemplate { public net.minecraft.structure.StructureTemplate wrapperContained; public StructureTemplate(net.minecraft.structure.StructureTemplate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List blockInfoLists() { return wrapperContained.blockInfoLists; }
// public yarnwrap.util.math.Vec3i size() { return new yarnwrap.util.math.Vec3i(wrapperContained.size); }
// public java.lang.String author() { return wrapperContained.author; }
// public java.util.List entities() { return wrapperContained.entities; }
public java.lang.String PALETTE_KEY() { return wrapperContained.PALETTE_KEY; }
public java.lang.String PALETTES_KEY() { return wrapperContained.PALETTES_KEY; }
public java.lang.String ENTITIES_KEY() { return wrapperContained.ENTITIES_KEY; }
public java.lang.String BLOCKS_KEY() { return wrapperContained.BLOCKS_KEY; }
public java.lang.String BLOCKS_POS_KEY() { return wrapperContained.BLOCKS_POS_KEY; }
public java.lang.String BLOCKS_STATE_KEY() { return wrapperContained.BLOCKS_STATE_KEY; }
public java.lang.String BLOCKS_NBT_KEY() { return wrapperContained.BLOCKS_NBT_KEY; }
public java.lang.String ENTITIES_POS_KEY() { return wrapperContained.ENTITIES_POS_KEY; }
public java.lang.String ENTITIES_BLOCK_POS_KEY() { return wrapperContained.ENTITIES_BLOCK_POS_KEY; }
public java.lang.String ENTITIES_NBT_KEY() { return wrapperContained.ENTITIES_NBT_KEY; }
public java.lang.String SIZE_KEY() { return wrapperContained.SIZE_KEY; }
public yarnwrap.util.math.Vec3i getSize() { return new yarnwrap.util.math.Vec3i(wrapperContained.getSize()); }
public void setAuthor(java.lang.String author) { wrapperContained.setAuthor(author); }
public yarnwrap.util.math.BlockPos applyTransformedOffset(yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockMirror mirror,yarnwrap.util.BlockRotation rotation,int offsetX,int offsetZ) { return new yarnwrap.util.math.BlockPos(wrapperContained.applyTransformedOffset(pos.wrapperContained,mirror.wrapperContained,rotation.wrapperContained,offsetX,offsetZ)); }
// public void addEntitiesFromWorld(yarnwrap.world.World world,yarnwrap.util.math.BlockPos firstCorner,yarnwrap.util.math.BlockPos secondCorner) { wrapperContained.addEntitiesFromWorld(world.wrapperContained,firstCorner.wrapperContained,secondCorner.wrapperContained); }
public it.unimi.dsi.fastutil.objects.ObjectArrayList getInfosForBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.structure.StructurePlacementData placementData,yarnwrap.block.Block block,boolean transformed) { return wrapperContained.getInfosForBlock(pos.wrapperContained,placementData.wrapperContained,block.wrapperContained,transformed); }
public yarnwrap.util.math.Vec3i getRotatedSize(yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.math.Vec3i(wrapperContained.getRotatedSize(rotation.wrapperContained)); }
public yarnwrap.util.math.BlockPos offsetByTransformedSize(yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockMirror mirror,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.math.BlockPos(wrapperContained.offsetByTransformedSize(pos.wrapperContained,mirror.wrapperContained,rotation.wrapperContained)); }
public yarnwrap.util.math.BlockPos transformAround(yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockMirror mirror,yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockPos pivot) { return new yarnwrap.util.math.BlockPos(wrapperContained.transformAround(pos.wrapperContained,mirror.wrapperContained,rotation.wrapperContained,pivot.wrapperContained)); }
// public yarnwrap.nbt.NbtList createNbtIntList(int ints) { return new yarnwrap.nbt.NbtList(wrapperContained.createNbtIntList(ints)); }
public yarnwrap.util.math.BlockPos transform(yarnwrap.structure.StructurePlacementData placementData,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.transform(placementData.wrapperContained,pos.wrapperContained)); }
public boolean place(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos pivot,yarnwrap.structure.StructurePlacementData placementData,yarnwrap.util.math.random.Random random,int flags) { return wrapperContained.place(world.wrapperContained,pos.wrapperContained,pivot.wrapperContained,placementData.wrapperContained,random.wrapperContained,flags); }
public void saveFromWorld(yarnwrap.world.World world,yarnwrap.util.math.BlockPos start,yarnwrap.util.math.Vec3i dimensions,boolean includeEntities,yarnwrap.block.Block ignoredBlock) { wrapperContained.saveFromWorld(world.wrapperContained,start.wrapperContained,dimensions.wrapperContained,includeEntities,ignoredBlock.wrapperContained); }
public yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeNbt(nbt.wrapperContained)); }
public yarnwrap.util.math.Vec3d transformAround(yarnwrap.util.math.Vec3d point,yarnwrap.util.BlockMirror mirror,yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockPos pivot) { return new yarnwrap.util.math.Vec3d(wrapperContained.transformAround(point.wrapperContained,mirror.wrapperContained,rotation.wrapperContained,pivot.wrapperContained)); }
// public void loadPalettedBlockInfo(yarnwrap.registry.RegistryEntryLookup blockLookup,yarnwrap.nbt.NbtList palette,yarnwrap.nbt.NbtList blocks) { wrapperContained.loadPalettedBlockInfo(blockLookup.wrapperContained,palette.wrapperContained,blocks.wrapperContained); }
// public void spawnEntities(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockMirror mirror,yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockPos pivot,yarnwrap.util.math.BlockBox area,boolean initializeMobs) { wrapperContained.spawnEntities(world.wrapperContained,pos.wrapperContained,mirror.wrapperContained,rotation.wrapperContained,pivot.wrapperContained,area.wrapperContained,initializeMobs); }
public yarnwrap.util.math.BlockPos transformBox(yarnwrap.structure.StructurePlacementData placementData1,yarnwrap.util.math.BlockPos pos1,yarnwrap.structure.StructurePlacementData placementData2,yarnwrap.util.math.BlockPos pos2) { return new yarnwrap.util.math.BlockPos(wrapperContained.transformBox(placementData1.wrapperContained,pos1.wrapperContained,placementData2.wrapperContained,pos2.wrapperContained)); }
public java.lang.String getAuthor() { return wrapperContained.getAuthor(); }
public void readNbt(yarnwrap.registry.RegistryEntryLookup blockLookup,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(blockLookup.wrapperContained,nbt.wrapperContained); }
// public yarnwrap.nbt.NbtList createNbtDoubleList(double doubles) { return new yarnwrap.nbt.NbtList(wrapperContained.createNbtDoubleList(doubles)); }
public yarnwrap.util.math.BlockBox calculateBoundingBox(yarnwrap.structure.StructurePlacementData placementData,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockBox(wrapperContained.calculateBoundingBox(placementData.wrapperContained,pos.wrapperContained)); }
public java.util.List getInfosForBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.structure.StructurePlacementData placementData,yarnwrap.block.Block block) { return wrapperContained.getInfosForBlock(pos.wrapperContained,placementData.wrapperContained,block.wrapperContained); }
public java.util.List process(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos pivot,yarnwrap.structure.StructurePlacementData placementData,java.util.List infos) { return wrapperContained.process(world.wrapperContained,pos.wrapperContained,pivot.wrapperContained,placementData.wrapperContained,infos); }
// public java.util.Optional getEntity(yarnwrap.world.ServerWorldAccess world,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.getEntity(world.wrapperContained,nbt.wrapperContained); }
public void updateCorner(yarnwrap.world.WorldAccess world,int flags,yarnwrap.util.shape.VoxelSet set,int startX,int startY,int startZ) { wrapperContained.updateCorner(world.wrapperContained,flags,set.wrapperContained,startX,startY,startZ); }
public yarnwrap.util.math.BlockBox calculateBoundingBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockPos pivot,yarnwrap.util.BlockMirror mirror) { return new yarnwrap.util.math.BlockBox(wrapperContained.calculateBoundingBox(pos.wrapperContained,rotation.wrapperContained,pivot.wrapperContained,mirror.wrapperContained)); }
// public void categorize(Object blockInfo,java.util.List fullBlocks,java.util.List blocksWithNbt,java.util.List otherBlocks) { wrapperContained.categorize(blockInfo,fullBlocks,blocksWithNbt,otherBlocks); }
// public java.util.List combineSorted(java.util.List fullBlocks,java.util.List blocksWithNbt,java.util.List otherBlocks) { return wrapperContained.combineSorted(fullBlocks,blocksWithNbt,otherBlocks); }
// public yarnwrap.util.math.BlockBox createBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockPos pivot,yarnwrap.util.BlockMirror mirror,yarnwrap.util.math.Vec3i dimensions) { return new yarnwrap.util.math.BlockBox(wrapperContained.createBox(pos.wrapperContained,rotation.wrapperContained,pivot.wrapperContained,mirror.wrapperContained,dimensions.wrapperContained)); }
public void updateCorner(yarnwrap.world.WorldAccess world,int flags,yarnwrap.util.shape.VoxelSet set,yarnwrap.util.math.BlockPos startPos) { wrapperContained.updateCorner(world.wrapperContained,flags,set.wrapperContained,startPos.wrapperContained); }

}