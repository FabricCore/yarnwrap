package yarnwrap.world.chunk;
public class ProtoChunk { public net.minecraft.world.chunk.ProtoChunk wrapperContained; public ProtoChunk(net.minecraft.world.chunk.ProtoChunk wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.ChunkStatus status() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.status); }
// public void status(yarnwrap.world.chunk.ChunkStatus value) { wrapperContained.status = value.wrapperContained; }
// public java.util.Map carvingMasks() { return wrapperContained.carvingMasks; }
// public void carvingMasks(java.util.Map value) { wrapperContained.carvingMasks = value; }
// public java.util.List entities() { return wrapperContained.entities; }
// public void entities(java.util.List value) { wrapperContained.entities = value; }
// public yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.lightingProvider); }
// public void lightingProvider(yarnwrap.world.chunk.light.LightingProvider value) { wrapperContained.lightingProvider = value.wrapperContained; }
// public yarnwrap.world.chunk.BelowZeroRetrogen belowZeroRetrogen() { return new yarnwrap.world.chunk.BelowZeroRetrogen(wrapperContained.belowZeroRetrogen); }
// public void belowZeroRetrogen(yarnwrap.world.chunk.BelowZeroRetrogen value) { wrapperContained.belowZeroRetrogen = value.wrapperContained; }
// public yarnwrap.world.tick.SimpleTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.SimpleTickScheduler(wrapperContained.blockTickScheduler); }
// public void blockTickScheduler(yarnwrap.world.tick.SimpleTickScheduler value) { wrapperContained.blockTickScheduler = value.wrapperContained; }
// public yarnwrap.world.tick.SimpleTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.SimpleTickScheduler(wrapperContained.fluidTickScheduler); }
// public void fluidTickScheduler(yarnwrap.world.tick.SimpleTickScheduler value) { wrapperContained.fluidTickScheduler = value.wrapperContained; }
public ProtoChunk(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.UpgradeData upgradeData,yarnwrap.world.HeightLimitView world,yarnwrap.registry.Registry biomeRegistry,yarnwrap.world.gen.chunk.BlendingData blendingData) { this.wrapperContained = new net.minecraft.world.chunk.ProtoChunk(pos.wrapperContained,upgradeData.wrapperContained,world.wrapperContained,biomeRegistry.wrapperContained,blendingData.wrapperContained); }
public ProtoChunk(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.UpgradeData upgradeData,net.minecraft.world.chunk.ChunkSection[] sections,yarnwrap.world.tick.SimpleTickScheduler blockTickScheduler,yarnwrap.world.tick.SimpleTickScheduler fluidTickScheduler,yarnwrap.world.HeightLimitView world,yarnwrap.registry.Registry biomeRegistry,yarnwrap.world.gen.chunk.BlendingData blendingData) { this.wrapperContained = new net.minecraft.world.chunk.ProtoChunk(pos.wrapperContained,upgradeData.wrapperContained,sections,blockTickScheduler.wrapperContained,fluidTickScheduler.wrapperContained,world.wrapperContained,biomeRegistry.wrapperContained,blendingData.wrapperContained); }
// public yarnwrap.world.gen.carver.CarvingMask getCarvingMask(Object step) { return new yarnwrap.world.gen.carver.CarvingMask(wrapperContained.getCarvingMask(step)); }
public java.util.List getEntities() { return wrapperContained.getEntities(); }
// public yarnwrap.world.gen.carver.CarvingMask method_12297(Object step2) { return new yarnwrap.world.gen.carver.CarvingMask(wrapperContained.method_12297(step2)); }
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