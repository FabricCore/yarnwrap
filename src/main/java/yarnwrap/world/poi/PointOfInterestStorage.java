package yarnwrap.world.poi;
public class PointOfInterestStorage { public net.minecraft.world.poi.PointOfInterestStorage wrapperContained; public PointOfInterestStorage(net.minecraft.world.poi.PointOfInterestStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object pointOfInterestDistanceTracker() { return wrapperContained.pointOfInterestDistanceTracker; }
// // public void pointOfInterestDistanceTracker(Object value) { wrapperContained.pointOfInterestDistanceTracker = value; }
// public it.unimi.dsi.fastutil.longs.LongSet preloadedChunks() { return wrapperContained.preloadedChunks; }
// public void preloadedChunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.preloadedChunks = value; }
public void remove(yarnwrap.util.math.BlockPos pos) { wrapperContained.remove(pos.wrapperContained); }
public void add(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.entry.RegistryEntry type) { wrapperContained.add(pos.wrapperContained,type.wrapperContained); }
public boolean test(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate) { return wrapperContained.test(pos.wrapperContained,predicate); }
public int getDistanceFromNearestOccupied(yarnwrap.util.math.ChunkSectionPos pos) { return wrapperContained.getDistanceFromNearestOccupied(pos.wrapperContained); }
// public java.util.stream.Stream getInChunk(java.util.function.Predicate typePredicate,yarnwrap.util.math.ChunkPos chunkPos,Object occupationStatus) { return wrapperContained.getInChunk(typePredicate,chunkPos.wrapperContained,occupationStatus); }
// public java.util.stream.Stream getInCircle(java.util.function.Predicate typePredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getInCircle(typePredicate,pos.wrapperContained,radius,occupationStatus); }
// public java.util.Optional getPosition(java.util.function.Predicate typePredicate,java.util.function.BiPredicate pos,yarnwrap.util.math.BlockPos radius) { return wrapperContained.getPosition(typePredicate,pos,radius.wrapperContained); }
// public java.util.Optional getPosition(java.util.function.Predicate typePredicate,java.util.function.Predicate posPredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getPosition(typePredicate,posPredicate,pos.wrapperContained,radius,occupationStatus); }
public boolean releaseTicket(yarnwrap.util.math.BlockPos pos) { return wrapperContained.releaseTicket(pos.wrapperContained); }
public java.util.Optional getType(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getType(pos.wrapperContained); }
// public boolean isOccupied(long pos) { return wrapperContained.isOccupied(pos); }
public void initForPalette(yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.world.chunk.ChunkSection chunkSection) { wrapperContained.initForPalette(sectionPos.wrapperContained,chunkSection.wrapperContained); }
// public java.util.Optional getPosition(java.util.function.Predicate typePredicate,java.util.function.Predicate positionPredicate,Object occupationStatus,yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.util.math.random.Random random) { return wrapperContained.getPosition(typePredicate,positionPredicate,occupationStatus,pos.wrapperContained,radius,random.wrapperContained); }
// public java.util.Optional getNearestPosition(java.util.function.Predicate typePredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getNearestPosition(typePredicate,pos.wrapperContained,radius,occupationStatus); }
// public long count(java.util.function.Predicate typePredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.count(typePredicate,pos.wrapperContained,radius,occupationStatus); }
// public boolean shouldScan(yarnwrap.world.chunk.ChunkSection chunkSection) { return wrapperContained.shouldScan(chunkSection.wrapperContained); }
// public void scanAndPopulate(yarnwrap.world.chunk.ChunkSection chunkSection,yarnwrap.util.math.ChunkSectionPos sectionPos,java.util.function.BiConsumer populator) { wrapperContained.scanAndPopulate(chunkSection.wrapperContained,sectionPos.wrapperContained,populator); }
// public java.util.stream.Stream getPositions(java.util.function.Predicate typePredicate,java.util.function.Predicate posPredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getPositions(typePredicate,posPredicate,pos.wrapperContained,radius,occupationStatus); }
// public java.util.stream.Stream getInSquare(java.util.function.Predicate typePredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getInSquare(typePredicate,pos.wrapperContained,radius,occupationStatus); }
public void preloadChunks(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,int radius) { wrapperContained.preloadChunks(world.wrapperContained,pos.wrapperContained,radius); }
public boolean hasTypeAt(yarnwrap.registry.RegistryKey type,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasTypeAt(type.wrapperContained,pos.wrapperContained); }
// public java.util.stream.Stream getSortedTypesAndPositions(java.util.function.Predicate typePredicate,java.util.function.Predicate posPredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getSortedTypesAndPositions(typePredicate,posPredicate,pos.wrapperContained,radius,occupationStatus); }
// public java.util.Optional getNearestPosition(java.util.function.Predicate typePredicate,java.util.function.Predicate posPredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getNearestPosition(typePredicate,posPredicate,pos.wrapperContained,radius,occupationStatus); }
public int getFreeTickets(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getFreeTickets(pos.wrapperContained); }
// public java.util.stream.Stream getTypesAndPositions(java.util.function.Predicate typePredicate,java.util.function.Predicate posPredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getTypesAndPositions(typePredicate,posPredicate,pos.wrapperContained,radius,occupationStatus); }
// public java.util.Optional getNearestTypeAndPosition(java.util.function.Predicate typePredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getNearestTypeAndPosition(typePredicate,pos.wrapperContained,radius,occupationStatus); }

}