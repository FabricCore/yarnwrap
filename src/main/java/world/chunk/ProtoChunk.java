package yarnwrap.world.chunk;
public class ProtoChunk { public net.minecraft.world.chunk.ProtoChunk wrapperContained; public ProtoChunk(net.minecraft.world.chunk.ProtoChunk wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.ChunkStatus status() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.status); }
// public java.util.Map carvingMasks() { return wrapperContained.carvingMasks; }
// public java.util.List entities() { return wrapperContained.entities; }
// public yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.lightingProvider); }
// public yarnwrap.world.chunk.BelowZeroRetrogen belowZeroRetrogen() { return new yarnwrap.world.chunk.BelowZeroRetrogen(wrapperContained.belowZeroRetrogen); }
// public yarnwrap.world.tick.SimpleTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.SimpleTickScheduler(wrapperContained.blockTickScheduler); }
// public yarnwrap.world.tick.SimpleTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.SimpleTickScheduler(wrapperContained.fluidTickScheduler); }
// public yarnwrap.world.gen.carver.CarvingMask getCarvingMask(Object step) { return new yarnwrap.world.gen.carver.CarvingMask(wrapperContained.getCarvingMask(step)); }
public java.util.List getEntities() { return wrapperContained.getEntities(); }
public short getPackedSectionRelative(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPackedSectionRelative(pos.wrapperContained); }
public void addEntity(yarnwrap.nbt.NbtCompound entityNbt) { wrapperContained.addEntity(entityNbt.wrapperContained); }
// public void setCarvingMask(Object step,yarnwrap.world.gen.carver.CarvingMask carvingMask) { wrapperContained.setCarvingMask(step,carvingMask.wrapperContained); }
public void setStatus(yarnwrap.world.chunk.ChunkStatus status) { wrapperContained.setStatus(status.wrapperContained); }
public java.util.Map getBlockEntities() { return wrapperContained.getBlockEntities(); }
public yarnwrap.util.math.BlockPos joinBlockPos(short sectionRel,int sectionY,yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.util.math.BlockPos(wrapperContained.joinBlockPos(sectionRel,sectionY,chunkPos.wrapperContained)); }
public java.util.Map getBlockEntityNbts() { return wrapperContained.getBlockEntityNbts(); }
public void setLightingProvider(yarnwrap.world.chunk.light.LightingProvider lightingProvider) { wrapperContained.setLightingProvider(lightingProvider.wrapperContained); }
// public yarnwrap.world.gen.carver.CarvingMask getOrCreateCarvingMask(Object step) { return new yarnwrap.world.gen.carver.CarvingMask(wrapperContained.getOrCreateCarvingMask(step)); }
public yarnwrap.world.tick.ChunkTickScheduler getBlockProtoTickScheduler() { return new yarnwrap.world.tick.ChunkTickScheduler(wrapperContained.getBlockProtoTickScheduler()); }
public yarnwrap.world.tick.ChunkTickScheduler getFluidProtoTickScheduler() { return new yarnwrap.world.tick.ChunkTickScheduler(wrapperContained.getFluidProtoTickScheduler()); }
public void setBelowZeroRetrogen(yarnwrap.world.chunk.BelowZeroRetrogen belowZeroRetrogen) { wrapperContained.setBelowZeroRetrogen(belowZeroRetrogen.wrapperContained); }
// public yarnwrap.world.tick.ChunkTickScheduler createProtoTickScheduler(yarnwrap.world.tick.SimpleTickScheduler tickScheduler) { return new yarnwrap.world.tick.ChunkTickScheduler(wrapperContained.createProtoTickScheduler(tickScheduler.wrapperContained)); }

}