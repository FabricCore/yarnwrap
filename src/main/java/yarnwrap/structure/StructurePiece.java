package yarnwrap.structure;
public class StructurePiece { public net.minecraft.structure.StructurePiece wrapperContained; public StructurePiece(net.minecraft.structure.StructurePiece wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.BlockMirror mirror() { return new yarnwrap.util.BlockMirror(wrapperContained.mirror); }
// public void mirror(yarnwrap.util.BlockMirror value) { wrapperContained.mirror = value.wrapperContained; }
// public static yarnwrap.util.BlockMirror mirror() { return new yarnwrap.util.BlockMirror(net.minecraft.structure.StructurePiece.mirror); }
// public static void mirror(yarnwrap.util.BlockMirror value, ) { net.minecraft.structure.StructurePiece.mirror = value.wrapperContained; }

// public java.util.Set BLOCKS_NEEDING_POST_PROCESSING() { return wrapperContained.BLOCKS_NEEDING_POST_PROCESSING; }
// public void BLOCKS_NEEDING_POST_PROCESSING(java.util.Set value) { wrapperContained.BLOCKS_NEEDING_POST_PROCESSING = value; }
// public static java.util.Set BLOCKS_NEEDING_POST_PROCESSING() { return net.minecraft.structure.StructurePiece.BLOCKS_NEEDING_POST_PROCESSING; }
// public static void BLOCKS_NEEDING_POST_PROCESSING(java.util.Set value, ) { net.minecraft.structure.StructurePiece.BLOCKS_NEEDING_POST_PROCESSING = value; }

// public yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(wrapperContained.facing); }
// public void facing(yarnwrap.util.math.Direction value) { wrapperContained.facing = value.wrapperContained; }
// public static yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(net.minecraft.structure.StructurePiece.facing); }
// public static void facing(yarnwrap.util.math.Direction value, ) { net.minecraft.structure.StructurePiece.facing = value.wrapperContained; }

// public yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.BlockRotation value) { wrapperContained.rotation = value.wrapperContained; }
// public static yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(net.minecraft.structure.StructurePiece.rotation); }
// public static void rotation(yarnwrap.util.BlockRotation value, ) { net.minecraft.structure.StructurePiece.rotation = value.wrapperContained; }

// public yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(wrapperContained.AIR); }
// public void AIR(yarnwrap.block.BlockState value) { wrapperContained.AIR = value.wrapperContained; }
// public static yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(net.minecraft.structure.StructurePiece.AIR); }
// public static void AIR(yarnwrap.block.BlockState value, ) { net.minecraft.structure.StructurePiece.AIR = value.wrapperContained; }

// public yarnwrap.util.math.BlockBox boundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.boundingBox); }
// public void boundingBox(yarnwrap.util.math.BlockBox value) { wrapperContained.boundingBox = value.wrapperContained; }
// public static yarnwrap.util.math.BlockBox boundingBox() { return new yarnwrap.util.math.BlockBox(net.minecraft.structure.StructurePiece.boundingBox); }
// public static void boundingBox(yarnwrap.util.math.BlockBox value, ) { net.minecraft.structure.StructurePiece.boundingBox = value.wrapperContained; }

// public int chainLength() { return wrapperContained.chainLength; }
// public void chainLength(int value) { wrapperContained.chainLength = value; }
// public static int chainLength() { return net.minecraft.structure.StructurePiece.chainLength; }
// public static void chainLength(int value, ) { net.minecraft.structure.StructurePiece.chainLength = value; }

// public yarnwrap.structure.StructurePieceType type() { return new yarnwrap.structure.StructurePieceType(wrapperContained.type); }
// public void type(yarnwrap.structure.StructurePieceType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.structure.StructurePieceType type() { return new yarnwrap.structure.StructurePieceType(net.minecraft.structure.StructurePiece.type); }
// public static void type(yarnwrap.structure.StructurePieceType value, ) { net.minecraft.structure.StructurePiece.type = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.structure.StructurePiece.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.structure.StructurePiece.LOGGER = value; }

// public StructurePiece(yarnwrap.structure.StructurePieceType type,int length,yarnwrap.util.math.BlockBox boundingBox) { this.wrapperContained = new net.minecraft.structure.StructurePiece(type.wrapperContained,length,boundingBox.wrapperContained); }
// public StructurePiece(yarnwrap.structure.StructurePieceType type,yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.structure.StructurePiece(type.wrapperContained,nbt.wrapperContained); }
// public boolean addChest(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox boundingBox,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.registry.RegistryKey lootTable) { return wrapperContained.addChest(world.wrapperContained,boundingBox.wrapperContained,random.wrapperContained,x,y,z,lootTable.wrapperContained); }
// public static boolean addChest(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox boundingBox,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.registry.RegistryKey lootTable, ) { return net.minecraft.structure.StructurePiece.addChest(world.wrapperContained,boundingBox.wrapperContained,random.wrapperContained,x,y,z,lootTable.wrapperContained); }
// public yarnwrap.block.BlockState orientateChest(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.orientateChest(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.block.BlockState orientateChest(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.structure.StructurePiece.orientateChest(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
// public void addBlock(yarnwrap.world.StructureWorldAccess world,yarnwrap.block.BlockState block,int x,int y,int z,yarnwrap.util.math.BlockBox box) { wrapperContained.addBlock(world.wrapperContained,block.wrapperContained,x,y,z,box.wrapperContained); }
// public static void addBlock(yarnwrap.world.StructureWorldAccess world,yarnwrap.block.BlockState block,int x,int y,int z,yarnwrap.util.math.BlockBox box, ) { net.minecraft.structure.StructurePiece.addBlock(world.wrapperContained,block.wrapperContained,x,y,z,box.wrapperContained); }
public void fillOpenings(yarnwrap.structure.StructurePiece start,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random) { wrapperContained.fillOpenings(start.wrapperContained,holder.wrapperContained,random.wrapperContained); }
// public static void fillOpenings(yarnwrap.structure.StructurePiece start,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random, ) { net.minecraft.structure.StructurePiece.fillOpenings(start.wrapperContained,holder.wrapperContained,random.wrapperContained); }
// public void fillHalfEllipsoid(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox bounds,int minX,int minY,int minZ,int maxX,int maxY,int maxZ,yarnwrap.block.BlockState block,boolean cantReplaceAir) { wrapperContained.fillHalfEllipsoid(world.wrapperContained,bounds.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,block.wrapperContained,cantReplaceAir); }
// public static void fillHalfEllipsoid(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox bounds,int minX,int minY,int minZ,int maxX,int maxY,int maxZ,yarnwrap.block.BlockState block,boolean cantReplaceAir, ) { net.minecraft.structure.StructurePiece.fillHalfEllipsoid(world.wrapperContained,bounds.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,block.wrapperContained,cantReplaceAir); }
// public boolean addChest(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockBox boundingBox,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.registry.RegistryKey lootTable,yarnwrap.block.BlockState block) { return wrapperContained.addChest(world.wrapperContained,boundingBox.wrapperContained,random.wrapperContained,pos.wrapperContained,lootTable.wrapperContained,block.wrapperContained); }
// public static boolean addChest(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockBox boundingBox,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.registry.RegistryKey lootTable,yarnwrap.block.BlockState block, ) { return net.minecraft.structure.StructurePiece.addChest(world.wrapperContained,boundingBox.wrapperContained,random.wrapperContained,pos.wrapperContained,lootTable.wrapperContained,block.wrapperContained); }
public void translate(int x,int y,int z) { wrapperContained.translate(x,y,z); }
// public static void translate(int x,int y,int z, ) { net.minecraft.structure.StructurePiece.translate(x,y,z); }
public int getChainLength() { return wrapperContained.getChainLength(); }
// public static int getChainLength() { return net.minecraft.structure.StructurePiece.getChainLength(); }
// public int applyYTransform(int y) { return wrapperContained.applyYTransform(y); }
// public static int applyYTransform(int y, ) { return net.minecraft.structure.StructurePiece.applyYTransform(y); }
public void setOrientation(yarnwrap.util.math.Direction orientation) { wrapperContained.setOrientation(orientation.wrapperContained); }
// public static void setOrientation(yarnwrap.util.math.Direction orientation, ) { net.minecraft.structure.StructurePiece.setOrientation(orientation.wrapperContained); }
// public int applyXTransform(int x,int z) { return wrapperContained.applyXTransform(x,z); }
// public static int applyXTransform(int x,int z, ) { return net.minecraft.structure.StructurePiece.applyXTransform(x,z); }
// public yarnwrap.block.BlockState getBlockAt(yarnwrap.world.BlockView world,int x,int y,int z,yarnwrap.util.math.BlockBox box) { return new yarnwrap.block.BlockState(wrapperContained.getBlockAt(world.wrapperContained,x,y,z,box.wrapperContained)); }
// public static yarnwrap.block.BlockState getBlockAt(yarnwrap.world.BlockView world,int x,int y,int z,yarnwrap.util.math.BlockBox box, ) { return new yarnwrap.block.BlockState(net.minecraft.structure.StructurePiece.getBlockAt(world.wrapperContained,x,y,z,box.wrapperContained)); }
// public boolean addDispenser(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox boundingBox,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.util.math.Direction facing,yarnwrap.registry.RegistryKey lootTable) { return wrapperContained.addDispenser(world.wrapperContained,boundingBox.wrapperContained,random.wrapperContained,x,y,z,facing.wrapperContained,lootTable.wrapperContained); }
// public static boolean addDispenser(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox boundingBox,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.util.math.Direction facing,yarnwrap.registry.RegistryKey lootTable, ) { return net.minecraft.structure.StructurePiece.addDispenser(world.wrapperContained,boundingBox.wrapperContained,random.wrapperContained,x,y,z,facing.wrapperContained,lootTable.wrapperContained); }
public void generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox chunkBox,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.util.math.BlockPos pivot) { wrapperContained.generate(world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,chunkBox.wrapperContained,chunkPos.wrapperContained,pivot.wrapperContained); }
// public static void generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox chunkBox,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.util.math.BlockPos pivot, ) { net.minecraft.structure.StructurePiece.generate(world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,chunkBox.wrapperContained,chunkPos.wrapperContained,pivot.wrapperContained); }
// public void fillWithOutlineUnderSeaLevel(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.random.Random random,float blockChance,int minX,int minY,int minZ,int maxX,int maxY,int maxZ,yarnwrap.block.BlockState outline,yarnwrap.block.BlockState inside,boolean cantReplaceAir,boolean stayBelowSeaLevel) { wrapperContained.fillWithOutlineUnderSeaLevel(world.wrapperContained,box.wrapperContained,random.wrapperContained,blockChance,minX,minY,minZ,maxX,maxY,maxZ,outline.wrapperContained,inside.wrapperContained,cantReplaceAir,stayBelowSeaLevel); }
// public static void fillWithOutlineUnderSeaLevel(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.random.Random random,float blockChance,int minX,int minY,int minZ,int maxX,int maxY,int maxZ,yarnwrap.block.BlockState outline,yarnwrap.block.BlockState inside,boolean cantReplaceAir,boolean stayBelowSeaLevel, ) { net.minecraft.structure.StructurePiece.fillWithOutlineUnderSeaLevel(world.wrapperContained,box.wrapperContained,random.wrapperContained,blockChance,minX,minY,minZ,maxX,maxY,maxZ,outline.wrapperContained,inside.wrapperContained,cantReplaceAir,stayBelowSeaLevel); }
public yarnwrap.util.math.Direction getFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getFacing()); }
// public static yarnwrap.util.math.Direction getFacing() { return new yarnwrap.util.math.Direction(net.minecraft.structure.StructurePiece.getFacing()); }
public yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.getBoundingBox()); }
// public static yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(net.minecraft.structure.StructurePiece.getBoundingBox()); }
// public void fillDownwards(yarnwrap.world.StructureWorldAccess world,yarnwrap.block.BlockState state,int x,int y,int z,yarnwrap.util.math.BlockBox box) { wrapperContained.fillDownwards(world.wrapperContained,state.wrapperContained,x,y,z,box.wrapperContained); }
// public static void fillDownwards(yarnwrap.world.StructureWorldAccess world,yarnwrap.block.BlockState state,int x,int y,int z,yarnwrap.util.math.BlockBox box, ) { net.minecraft.structure.StructurePiece.fillDownwards(world.wrapperContained,state.wrapperContained,x,y,z,box.wrapperContained); }
// public void fillWithOutline(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox box,int minX,int minY,int minZ,int maxX,int maxY,int maxZ,boolean cantReplaceAir,yarnwrap.util.math.random.Random random,Object randomizer) { wrapperContained.fillWithOutline(world.wrapperContained,box.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,cantReplaceAir,random.wrapperContained,randomizer); }
// public static void fillWithOutline(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox box,int minX,int minY,int minZ,int maxX,int maxY,int maxZ,boolean cantReplaceAir,yarnwrap.util.math.random.Random random,Object randomizer, ) { net.minecraft.structure.StructurePiece.fillWithOutline(world.wrapperContained,box.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,cantReplaceAir,random.wrapperContained,randomizer); }
// public boolean isUnderSeaLevel(yarnwrap.world.WorldView world,int x,int z,int y,yarnwrap.util.math.BlockBox box) { return wrapperContained.isUnderSeaLevel(world.wrapperContained,x,z,y,box.wrapperContained); }
// public static boolean isUnderSeaLevel(yarnwrap.world.WorldView world,int x,int z,int y,yarnwrap.util.math.BlockBox box, ) { return net.minecraft.structure.StructurePiece.isUnderSeaLevel(world.wrapperContained,x,z,y,box.wrapperContained); }
// public void fillWithOutline(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox box,int minX,int minY,int minZ,int maxX,int maxY,int maxZ,yarnwrap.block.BlockState outline,yarnwrap.block.BlockState inside,boolean cantReplaceAir) { wrapperContained.fillWithOutline(world.wrapperContained,box.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,outline.wrapperContained,inside.wrapperContained,cantReplaceAir); }
// public static void fillWithOutline(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox box,int minX,int minY,int minZ,int maxX,int maxY,int maxZ,yarnwrap.block.BlockState outline,yarnwrap.block.BlockState inside,boolean cantReplaceAir, ) { net.minecraft.structure.StructurePiece.fillWithOutline(world.wrapperContained,box.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,outline.wrapperContained,inside.wrapperContained,cantReplaceAir); }
// public int applyZTransform(int x,int z) { return wrapperContained.applyZTransform(x,z); }
// public static int applyZTransform(int x,int z, ) { return net.minecraft.structure.StructurePiece.applyZTransform(x,z); }
// public void fill(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox bounds,int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { wrapperContained.fill(world.wrapperContained,bounds.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ); }
// public static void fill(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox bounds,int minX,int minY,int minZ,int maxX,int maxY,int maxZ, ) { net.minecraft.structure.StructurePiece.fill(world.wrapperContained,bounds.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ); }
// public void writeNbt(yarnwrap.structure.StructureContext context,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeNbt(context.wrapperContained,nbt.wrapperContained); }
// public static void writeNbt(yarnwrap.structure.StructureContext context,yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.structure.StructurePiece.writeNbt(context.wrapperContained,nbt.wrapperContained); }
// public void addBlockWithRandomThreshold(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox bounds,yarnwrap.util.math.random.Random random,float threshold,int x,int y,int z,yarnwrap.block.BlockState state) { wrapperContained.addBlockWithRandomThreshold(world.wrapperContained,bounds.wrapperContained,random.wrapperContained,threshold,x,y,z,state.wrapperContained); }
// public static void addBlockWithRandomThreshold(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox bounds,yarnwrap.util.math.random.Random random,float threshold,int x,int y,int z,yarnwrap.block.BlockState state, ) { net.minecraft.structure.StructurePiece.addBlockWithRandomThreshold(world.wrapperContained,bounds.wrapperContained,random.wrapperContained,threshold,x,y,z,state.wrapperContained); }
public yarnwrap.nbt.NbtCompound toNbt(yarnwrap.structure.StructureContext context) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt(context.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound toNbt(yarnwrap.structure.StructureContext context, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.structure.StructurePiece.toNbt(context.wrapperContained)); }
public yarnwrap.structure.StructurePieceType getType() { return new yarnwrap.structure.StructurePieceType(wrapperContained.getType()); }
// public static yarnwrap.structure.StructurePieceType getType() { return new yarnwrap.structure.StructurePieceType(net.minecraft.structure.StructurePiece.getType()); }
public boolean intersectsChunk(yarnwrap.util.math.ChunkPos pos,int offset) { return wrapperContained.intersectsChunk(pos.wrapperContained,offset); }
// public static boolean intersectsChunk(yarnwrap.util.math.ChunkPos pos,int offset, ) { return net.minecraft.structure.StructurePiece.intersectsChunk(pos.wrapperContained,offset); }
public yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation()); }
// public static yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(net.minecraft.structure.StructurePiece.getRotation()); }
// public boolean canAddBlock(yarnwrap.world.WorldView world,int x,int y,int z,yarnwrap.util.math.BlockBox box) { return wrapperContained.canAddBlock(world.wrapperContained,x,y,z,box.wrapperContained); }
// public static boolean canAddBlock(yarnwrap.world.WorldView world,int x,int y,int z,yarnwrap.util.math.BlockBox box, ) { return net.minecraft.structure.StructurePiece.canAddBlock(world.wrapperContained,x,y,z,box.wrapperContained); }
// public Object offsetPos(int x,int y,int z) { return wrapperContained.offsetPos(x,y,z); }
// public static Object offsetPos(int x,int y,int z, ) { return net.minecraft.structure.StructurePiece.offsetPos(x,y,z); }
// public boolean canReplace(yarnwrap.block.BlockState state) { return wrapperContained.canReplace(state.wrapperContained); }
// public static boolean canReplace(yarnwrap.block.BlockState state, ) { return net.minecraft.structure.StructurePiece.canReplace(state.wrapperContained); }
// public yarnwrap.util.math.BlockBox createBox(int x,int y,int z,yarnwrap.util.math.Direction orientation,int width,int height,int depth) { return new yarnwrap.util.math.BlockBox(wrapperContained.createBox(x,y,z,orientation.wrapperContained,width,height,depth)); }
// public static yarnwrap.util.math.BlockBox createBox(int x,int y,int z,yarnwrap.util.math.Direction orientation,int width,int height,int depth, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.structure.StructurePiece.createBox(x,y,z,orientation.wrapperContained,width,height,depth)); }
// public void fillWithOutline(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.BlockBox fillBox,yarnwrap.block.BlockState outline,yarnwrap.block.BlockState inside,boolean cantReplaceAir) { wrapperContained.fillWithOutline(world.wrapperContained,box.wrapperContained,fillBox.wrapperContained,outline.wrapperContained,inside.wrapperContained,cantReplaceAir); }
// public static void fillWithOutline(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.BlockBox fillBox,yarnwrap.block.BlockState outline,yarnwrap.block.BlockState inside,boolean cantReplaceAir, ) { net.minecraft.structure.StructurePiece.fillWithOutline(world.wrapperContained,box.wrapperContained,fillBox.wrapperContained,outline.wrapperContained,inside.wrapperContained,cantReplaceAir); }
// public void fillWithOutline(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.BlockBox fillBox,boolean cantReplaceAir,yarnwrap.util.math.random.Random random,Object randomizer) { wrapperContained.fillWithOutline(world.wrapperContained,box.wrapperContained,fillBox.wrapperContained,cantReplaceAir,random.wrapperContained,randomizer); }
// public static void fillWithOutline(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.BlockBox fillBox,boolean cantReplaceAir,yarnwrap.util.math.random.Random random,Object randomizer, ) { net.minecraft.structure.StructurePiece.fillWithOutline(world.wrapperContained,box.wrapperContained,fillBox.wrapperContained,cantReplaceAir,random.wrapperContained,randomizer); }
// public yarnwrap.util.math.Direction getRandomHorizontalDirection(yarnwrap.util.math.random.Random random) { return new yarnwrap.util.math.Direction(wrapperContained.getRandomHorizontalDirection(random.wrapperContained)); }
// public static yarnwrap.util.math.Direction getRandomHorizontalDirection(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.util.math.Direction(net.minecraft.structure.StructurePiece.getRandomHorizontalDirection(random.wrapperContained)); }
public yarnwrap.util.math.BlockPos getCenter() { return new yarnwrap.util.math.BlockPos(wrapperContained.getCenter()); }
// public static yarnwrap.util.math.BlockPos getCenter() { return new yarnwrap.util.math.BlockPos(net.minecraft.structure.StructurePiece.getCenter()); }
// public java.lang.IllegalArgumentException method_35459(java.lang.String error) { return wrapperContained.method_35459(error); }
// public static java.lang.IllegalArgumentException method_35459(java.lang.String error, ) { return net.minecraft.structure.StructurePiece.method_35459(error); }
public yarnwrap.util.BlockMirror getMirror() { return new yarnwrap.util.BlockMirror(wrapperContained.getMirror()); }
// public static yarnwrap.util.BlockMirror getMirror() { return new yarnwrap.util.BlockMirror(net.minecraft.structure.StructurePiece.getMirror()); }
// public yarnwrap.structure.StructurePiece firstIntersecting(java.util.List pieces,yarnwrap.util.math.BlockBox box) { return new yarnwrap.structure.StructurePiece(wrapperContained.firstIntersecting(pieces,box.wrapperContained)); }
// public static yarnwrap.structure.StructurePiece firstIntersecting(java.util.List pieces,yarnwrap.util.math.BlockBox box, ) { return new yarnwrap.structure.StructurePiece(net.minecraft.structure.StructurePiece.firstIntersecting(pieces,box.wrapperContained)); }
// public yarnwrap.util.math.BlockBox boundingBox(java.util.stream.Stream pieces) { return new yarnwrap.util.math.BlockBox(wrapperContained.boundingBox(pieces)); }
// public static yarnwrap.util.math.BlockBox boundingBox(java.util.stream.Stream pieces, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.structure.StructurePiece.boundingBox(pieces)); }
public void setChainLength(int chainLength) { wrapperContained.setChainLength(chainLength); }
// public static void setChainLength(int chainLength, ) { net.minecraft.structure.StructurePiece.setChainLength(chainLength); }

}