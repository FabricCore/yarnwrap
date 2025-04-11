package yarnwrap.world.poi;
public class PointOfInterestStorage { public net.minecraft.world.poi.PointOfInterestStorage wrapperContained; public PointOfInterestStorage(net.minecraft.world.poi.PointOfInterestStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object pointOfInterestDistanceTracker() { return wrapperContained.pointOfInterestDistanceTracker; }
// // public void pointOfInterestDistanceTracker(Object value) { wrapperContained.pointOfInterestDistanceTracker = value; }
// public it.unimi.dsi.fastutil.longs.LongSet preloadedChunks() { return wrapperContained.preloadedChunks; }
// public void preloadedChunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.preloadedChunks = value; }
public PointOfInterestStorage(yarnwrap.world.storage.StorageKey storageKey,java.nio.file.Path directory,com.mojang.datafixers.DataFixer dataFixer,boolean dsync,yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.server.world.ChunkErrorHandler errorHandler,yarnwrap.world.HeightLimitView world) { this.wrapperContained = new net.minecraft.world.poi.PointOfInterestStorage(storageKey.wrapperContained,directory,dataFixer,dsync,registryManager.wrapperContained,errorHandler.wrapperContained,world.wrapperContained); }
public void remove(yarnwrap.util.math.BlockPos pos) { wrapperContained.remove(pos.wrapperContained); }
// public boolean method_19113(yarnwrap.util.math.BlockPos poi) { return wrapperContained.method_19113(poi.wrapperContained); }
public void add(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.entry.RegistryEntry type) { wrapperContained.add(pos.wrapperContained,type.wrapperContained); }
public boolean test(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate) { return wrapperContained.test(pos.wrapperContained,predicate); }
// public java.lang.Boolean method_19117(yarnwrap.util.math.BlockPos poiSet) { return wrapperContained.method_19117(poiSet.wrapperContained); }
public int getDistanceFromNearestOccupied(yarnwrap.util.math.ChunkSectionPos pos) { return wrapperContained.getDistanceFromNearestOccupied(pos.wrapperContained); }
// public java.util.stream.Stream method_19121(java.util.function.Predicate chunkPos) { return wrapperContained.method_19121(chunkPos); }
// public java.util.stream.Stream getInChunk(java.util.function.Predicate typePredicate,yarnwrap.util.math.ChunkPos chunkPos,Object occupationStatus) { return wrapperContained.getInChunk(typePredicate,chunkPos.wrapperContained,occupationStatus); }
// public java.util.stream.Stream getInCircle(java.util.function.Predicate typePredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getInCircle(typePredicate,pos.wrapperContained,radius,occupationStatus); }
// public java.util.Optional getPosition(java.util.function.Predicate typePredicate,java.util.function.BiPredicate pos,yarnwrap.util.math.BlockPos radius) { return wrapperContained.getPosition(typePredicate,pos,radius.wrapperContained); }
// public java.util.Optional getPosition(java.util.function.Predicate typePredicate,java.util.function.Predicate posPredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getPosition(typePredicate,posPredicate,pos.wrapperContained,radius,occupationStatus); }
// public yarnwrap.util.math.BlockPos method_19128(yarnwrap.world.poi.PointOfInterest poi) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_19128(poi.wrapperContained)); }
public boolean releaseTicket(yarnwrap.util.math.BlockPos pos) { return wrapperContained.releaseTicket(pos.wrapperContained); }
// public boolean method_19130(java.util.function.BiPredicate poi) { return wrapperContained.method_19130(poi); }
public java.util.Optional getType(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getType(pos.wrapperContained); }
// public boolean isOccupied(long pos) { return wrapperContained.isOccupied(pos); }
public void initForPalette(yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.world.chunk.ChunkSection chunkSection) { wrapperContained.initForPalette(sectionPos.wrapperContained,chunkSection.wrapperContained); }
// public void method_19511(yarnwrap.world.chunk.ChunkSection pos) { wrapperContained.method_19511(pos.wrapperContained); }
// public void method_19512(java.util.function.BiConsumer poiType) { wrapperContained.method_19512(poiType); }
// public boolean method_20004(java.util.function.Predicate poi) { return wrapperContained.method_20004(poi); }
// public java.util.Optional getPosition(java.util.function.Predicate typePredicate,java.util.function.Predicate positionPredicate,Object occupationStatus,yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.util.math.random.Random random) { return wrapperContained.getPosition(typePredicate,positionPredicate,occupationStatus,pos.wrapperContained,radius,random.wrapperContained); }
// public java.util.Optional getNearestPosition(java.util.function.Predicate typePredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getNearestPosition(typePredicate,pos.wrapperContained,radius,occupationStatus); }
// public long count(java.util.function.Predicate typePredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.count(typePredicate,pos.wrapperContained,radius,occupationStatus); }
// public boolean shouldScan(yarnwrap.world.chunk.ChunkSection chunkSection) { return wrapperContained.shouldScan(chunkSection.wrapperContained); }
// public void method_20346(yarnwrap.world.chunk.ChunkSection poiSet) { wrapperContained.method_20346(poiSet.wrapperContained); }
// public void scanAndPopulate(yarnwrap.world.chunk.ChunkSection chunkSection,yarnwrap.util.math.ChunkSectionPos sectionPos,java.util.function.BiConsumer populator) { wrapperContained.scanAndPopulate(chunkSection.wrapperContained,sectionPos.wrapperContained,populator); }
// public void method_20349(yarnwrap.world.chunk.ChunkSection populator) { wrapperContained.method_20349(populator.wrapperContained); }
// public java.lang.Boolean method_20592(yarnwrap.world.poi.PointOfInterestSet poiSet) { return wrapperContained.method_20592(poiSet.wrapperContained); }
// public java.util.stream.Stream getPositions(java.util.function.Predicate typePredicate,java.util.function.Predicate posPredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getPositions(typePredicate,posPredicate,pos.wrapperContained,radius,occupationStatus); }
// public java.util.stream.Stream getInSquare(java.util.function.Predicate typePredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getInSquare(typePredicate,pos.wrapperContained,radius,occupationStatus); }
public void preloadChunks(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,int radius) { wrapperContained.preloadChunks(world.wrapperContained,pos.wrapperContained,radius); }
// public boolean method_22441(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.method_22441(chunkPos.wrapperContained); }
// public com.mojang.datafixers.util.Pair method_22443(yarnwrap.util.math.ChunkSectionPos sectionPos) { return wrapperContained.method_22443(sectionPos.wrapperContained); }
public boolean hasTypeAt(yarnwrap.registry.RegistryKey type,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasTypeAt(type.wrapperContained,pos.wrapperContained); }
// public boolean method_30335(yarnwrap.util.math.BlockPos poi) { return wrapperContained.method_30335(poi.wrapperContained); }
// public java.util.stream.Stream getSortedTypesAndPositions(java.util.function.Predicate typePredicate,java.util.function.Predicate posPredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getSortedTypesAndPositions(typePredicate,posPredicate,pos.wrapperContained,radius,occupationStatus); }
// public java.util.Optional method_33580(yarnwrap.util.math.BlockPos poiSet) { return wrapperContained.method_33580(poiSet.wrapperContained); }
// public java.lang.Boolean method_33581(yarnwrap.util.math.BlockPos poiSet) { return wrapperContained.method_33581(poiSet.wrapperContained); }
// public void method_33582(yarnwrap.util.math.BlockPos poiSet) { wrapperContained.method_33582(poiSet.wrapperContained); }
// public java.util.Optional getNearestPosition(java.util.function.Predicate typePredicate,java.util.function.Predicate posPredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getNearestPosition(typePredicate,posPredicate,pos.wrapperContained,radius,occupationStatus); }
// public java.lang.Integer method_35154(yarnwrap.util.math.BlockPos poiSet) { return wrapperContained.method_35154(poiSet.wrapperContained); }
public int getFreeTickets(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getFreeTickets(pos.wrapperContained); }
// public boolean method_43978(yarnwrap.registry.RegistryKey entry) { return wrapperContained.method_43978(entry.wrapperContained); }
// public double method_43979(yarnwrap.util.math.BlockPos poi) { return wrapperContained.method_43979(poi.wrapperContained); }
// public boolean method_43980(yarnwrap.registry.entry.RegistryEntry entry) { return wrapperContained.method_43980(entry.wrapperContained); }
// public com.mojang.datafixers.util.Pair method_43981(yarnwrap.world.poi.PointOfInterest poi) { return wrapperContained.method_43981(poi.wrapperContained); }
// public boolean method_43982(java.util.function.Predicate poi) { return wrapperContained.method_43982(poi); }
// public java.util.stream.Stream getTypesAndPositions(java.util.function.Predicate typePredicate,java.util.function.Predicate posPredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getTypesAndPositions(typePredicate,posPredicate,pos.wrapperContained,radius,occupationStatus); }
// public com.mojang.datafixers.util.Pair method_43984(yarnwrap.world.poi.PointOfInterest poi) { return wrapperContained.method_43984(poi.wrapperContained); }
// public java.util.Optional getNearestTypeAndPosition(java.util.function.Predicate typePredicate,yarnwrap.util.math.BlockPos pos,int radius,Object occupationStatus) { return wrapperContained.getNearestTypeAndPosition(typePredicate,pos.wrapperContained,radius,occupationStatus); }

}