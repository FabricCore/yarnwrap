package yarnwrap.world.chunk;
public class ProtoChunk { public net.minecraft.world.chunk.ProtoChunk wrapperContained; public ProtoChunk(net.minecraft.world.chunk.ProtoChunk wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.ChunkStatus status() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.status); }
// public void status(yarnwrap.world.chunk.ChunkStatus value) { wrapperContained.status = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkStatus status() { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.ProtoChunk.status); }
// public static void status(yarnwrap.world.chunk.ChunkStatus value, ) { net.minecraft.world.chunk.ProtoChunk.status = value.wrapperContained; }

// public yarnwrap.world.gen.carver.CarvingMask carvingMask() { return new yarnwrap.world.gen.carver.CarvingMask(wrapperContained.carvingMask); }
// public void carvingMask(yarnwrap.world.gen.carver.CarvingMask value) { wrapperContained.carvingMask = value.wrapperContained; }
// public static yarnwrap.world.gen.carver.CarvingMask carvingMask() { return new yarnwrap.world.gen.carver.CarvingMask(net.minecraft.world.chunk.ProtoChunk.carvingMask); }
// public static void carvingMask(yarnwrap.world.gen.carver.CarvingMask value, ) { net.minecraft.world.chunk.ProtoChunk.carvingMask = value.wrapperContained; }

// public java.util.List entities() { return wrapperContained.entities; }
// public void entities(java.util.List value) { wrapperContained.entities = value; }
// public static java.util.List entities() { return net.minecraft.world.chunk.ProtoChunk.entities; }
// public static void entities(java.util.List value, ) { net.minecraft.world.chunk.ProtoChunk.entities = value; }

// public yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.lightingProvider); }
// public void lightingProvider(yarnwrap.world.chunk.light.LightingProvider value) { wrapperContained.lightingProvider = value.wrapperContained; }
// public static yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(net.minecraft.world.chunk.ProtoChunk.lightingProvider); }
// public static void lightingProvider(yarnwrap.world.chunk.light.LightingProvider value, ) { net.minecraft.world.chunk.ProtoChunk.lightingProvider = value.wrapperContained; }

// public yarnwrap.world.chunk.BelowZeroRetrogen belowZeroRetrogen() { return new yarnwrap.world.chunk.BelowZeroRetrogen(wrapperContained.belowZeroRetrogen); }
// public void belowZeroRetrogen(yarnwrap.world.chunk.BelowZeroRetrogen value) { wrapperContained.belowZeroRetrogen = value.wrapperContained; }
// public static yarnwrap.world.chunk.BelowZeroRetrogen belowZeroRetrogen() { return new yarnwrap.world.chunk.BelowZeroRetrogen(net.minecraft.world.chunk.ProtoChunk.belowZeroRetrogen); }
// public static void belowZeroRetrogen(yarnwrap.world.chunk.BelowZeroRetrogen value, ) { net.minecraft.world.chunk.ProtoChunk.belowZeroRetrogen = value.wrapperContained; }

// public yarnwrap.world.tick.SimpleTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.SimpleTickScheduler(wrapperContained.blockTickScheduler); }
// public void blockTickScheduler(yarnwrap.world.tick.SimpleTickScheduler value) { wrapperContained.blockTickScheduler = value.wrapperContained; }
// public static yarnwrap.world.tick.SimpleTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.SimpleTickScheduler(net.minecraft.world.chunk.ProtoChunk.blockTickScheduler); }
// public static void blockTickScheduler(yarnwrap.world.tick.SimpleTickScheduler value, ) { net.minecraft.world.chunk.ProtoChunk.blockTickScheduler = value.wrapperContained; }

// public yarnwrap.world.tick.SimpleTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.SimpleTickScheduler(wrapperContained.fluidTickScheduler); }
// public void fluidTickScheduler(yarnwrap.world.tick.SimpleTickScheduler value) { wrapperContained.fluidTickScheduler = value.wrapperContained; }
// public static yarnwrap.world.tick.SimpleTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.SimpleTickScheduler(net.minecraft.world.chunk.ProtoChunk.fluidTickScheduler); }
// public static void fluidTickScheduler(yarnwrap.world.tick.SimpleTickScheduler value, ) { net.minecraft.world.chunk.ProtoChunk.fluidTickScheduler = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.chunk.ProtoChunk.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.chunk.ProtoChunk.LOGGER = value; }

public ProtoChunk(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.UpgradeData upgradeData,net.minecraft.world.chunk.ChunkSection[] sections,yarnwrap.world.tick.SimpleTickScheduler blockTickScheduler,yarnwrap.world.tick.SimpleTickScheduler fluidTickScheduler,yarnwrap.world.HeightLimitView world,yarnwrap.registry.Registry biomeRegistry,yarnwrap.world.gen.chunk.BlendingData blendingData) { this.wrapperContained = new net.minecraft.world.chunk.ProtoChunk(pos.wrapperContained,upgradeData.wrapperContained,sections,blockTickScheduler.wrapperContained,fluidTickScheduler.wrapperContained,world.wrapperContained,biomeRegistry.wrapperContained,blendingData.wrapperContained); }
public ProtoChunk(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.UpgradeData upgradeData,yarnwrap.world.HeightLimitView world,yarnwrap.registry.Registry biomeRegistry,yarnwrap.world.gen.chunk.BlendingData blendingData) { this.wrapperContained = new net.minecraft.world.chunk.ProtoChunk(pos.wrapperContained,upgradeData.wrapperContained,world.wrapperContained,biomeRegistry.wrapperContained,blendingData.wrapperContained); }
public yarnwrap.world.gen.carver.CarvingMask getCarvingMask() { return new yarnwrap.world.gen.carver.CarvingMask(wrapperContained.getCarvingMask()); }
// public static yarnwrap.world.gen.carver.CarvingMask getCarvingMask() { return new yarnwrap.world.gen.carver.CarvingMask(net.minecraft.world.chunk.ProtoChunk.getCarvingMask()); }
public java.util.List getEntities() { return wrapperContained.getEntities(); }
// public static java.util.List getEntities() { return net.minecraft.world.chunk.ProtoChunk.getEntities(); }
// public short getPackedSectionRelative(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPackedSectionRelative(pos.wrapperContained); }
// public static short getPackedSectionRelative(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.chunk.ProtoChunk.getPackedSectionRelative(pos.wrapperContained); }
public void addEntity(yarnwrap.nbt.NbtCompound entityNbt) { wrapperContained.addEntity(entityNbt.wrapperContained); }
// public static void addEntity(yarnwrap.nbt.NbtCompound entityNbt, ) { net.minecraft.world.chunk.ProtoChunk.addEntity(entityNbt.wrapperContained); }
public void setCarvingMask(yarnwrap.world.gen.carver.CarvingMask carvingMask) { wrapperContained.setCarvingMask(carvingMask.wrapperContained); }
// public static void setCarvingMask(yarnwrap.world.gen.carver.CarvingMask carvingMask, ) { net.minecraft.world.chunk.ProtoChunk.setCarvingMask(carvingMask.wrapperContained); }
public void setStatus(yarnwrap.world.chunk.ChunkStatus status) { wrapperContained.setStatus(status.wrapperContained); }
// public static void setStatus(yarnwrap.world.chunk.ChunkStatus status, ) { net.minecraft.world.chunk.ProtoChunk.setStatus(status.wrapperContained); }
public java.util.Map getBlockEntities() { return wrapperContained.getBlockEntities(); }
// public static java.util.Map getBlockEntities() { return net.minecraft.world.chunk.ProtoChunk.getBlockEntities(); }
// public yarnwrap.util.math.BlockPos joinBlockPos(short sectionRel,int sectionY,yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.util.math.BlockPos(wrapperContained.joinBlockPos(sectionRel,sectionY,chunkPos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos joinBlockPos(short sectionRel,int sectionY,yarnwrap.util.math.ChunkPos chunkPos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.chunk.ProtoChunk.joinBlockPos(sectionRel,sectionY,chunkPos.wrapperContained)); }
public java.util.Map getBlockEntityNbts() { return wrapperContained.getBlockEntityNbts(); }
// public static java.util.Map getBlockEntityNbts() { return net.minecraft.world.chunk.ProtoChunk.getBlockEntityNbts(); }
public void setLightingProvider(yarnwrap.world.chunk.light.LightingProvider lightingProvider) { wrapperContained.setLightingProvider(lightingProvider.wrapperContained); }
// public static void setLightingProvider(yarnwrap.world.chunk.light.LightingProvider lightingProvider, ) { net.minecraft.world.chunk.ProtoChunk.setLightingProvider(lightingProvider.wrapperContained); }
public yarnwrap.world.gen.carver.CarvingMask getOrCreateCarvingMask() { return new yarnwrap.world.gen.carver.CarvingMask(wrapperContained.getOrCreateCarvingMask()); }
// public static yarnwrap.world.gen.carver.CarvingMask getOrCreateCarvingMask() { return new yarnwrap.world.gen.carver.CarvingMask(net.minecraft.world.chunk.ProtoChunk.getOrCreateCarvingMask()); }
public yarnwrap.world.tick.ChunkTickScheduler getBlockProtoTickScheduler() { return new yarnwrap.world.tick.ChunkTickScheduler(wrapperContained.getBlockProtoTickScheduler()); }
// public static yarnwrap.world.tick.ChunkTickScheduler getBlockProtoTickScheduler() { return new yarnwrap.world.tick.ChunkTickScheduler(net.minecraft.world.chunk.ProtoChunk.getBlockProtoTickScheduler()); }
public yarnwrap.world.tick.ChunkTickScheduler getFluidProtoTickScheduler() { return new yarnwrap.world.tick.ChunkTickScheduler(wrapperContained.getFluidProtoTickScheduler()); }
// public static yarnwrap.world.tick.ChunkTickScheduler getFluidProtoTickScheduler() { return new yarnwrap.world.tick.ChunkTickScheduler(net.minecraft.world.chunk.ProtoChunk.getFluidProtoTickScheduler()); }
public void setBelowZeroRetrogen(yarnwrap.world.chunk.BelowZeroRetrogen belowZeroRetrogen) { wrapperContained.setBelowZeroRetrogen(belowZeroRetrogen.wrapperContained); }
// public static void setBelowZeroRetrogen(yarnwrap.world.chunk.BelowZeroRetrogen belowZeroRetrogen, ) { net.minecraft.world.chunk.ProtoChunk.setBelowZeroRetrogen(belowZeroRetrogen.wrapperContained); }
// public yarnwrap.world.tick.ChunkTickScheduler createProtoTickScheduler(yarnwrap.world.tick.SimpleTickScheduler tickScheduler) { return new yarnwrap.world.tick.ChunkTickScheduler(wrapperContained.createProtoTickScheduler(tickScheduler.wrapperContained)); }
// public static yarnwrap.world.tick.ChunkTickScheduler createProtoTickScheduler(yarnwrap.world.tick.SimpleTickScheduler tickScheduler, ) { return new yarnwrap.world.tick.ChunkTickScheduler(net.minecraft.world.chunk.ProtoChunk.createProtoTickScheduler(tickScheduler.wrapperContained)); }

}