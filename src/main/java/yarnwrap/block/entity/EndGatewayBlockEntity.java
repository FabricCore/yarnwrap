package yarnwrap.block.entity;
public class EndGatewayBlockEntity { public net.minecraft.block.entity.EndGatewayBlockEntity wrapperContained; public EndGatewayBlockEntity(net.minecraft.block.entity.EndGatewayBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean exactTeleport() { return wrapperContained.exactTeleport; }
// public void exactTeleport(boolean value) { wrapperContained.exactTeleport = value; }
// public int teleportCooldown() { return wrapperContained.teleportCooldown; }
// public void teleportCooldown(int value) { wrapperContained.teleportCooldown = value; }
// public long age() { return wrapperContained.age; }
// public void age(long value) { wrapperContained.age = value; }
// public yarnwrap.util.math.BlockPos exitPortalPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.exitPortalPos); }
// public void exitPortalPos(yarnwrap.util.math.BlockPos value) { wrapperContained.exitPortalPos = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.util.math.BlockPos findExitPortalPos(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int searchRadius,boolean force) { return new yarnwrap.util.math.BlockPos(wrapperContained.findExitPortalPos(world.wrapperContained,pos.wrapperContained,searchRadius,force)); }
public void startTeleportCooldown(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EndGatewayBlockEntity blockEntity) { wrapperContained.startTeleportCooldown(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public float getCooldownBeamHeight(float tickDelta) { return wrapperContained.getCooldownBeamHeight(tickDelta); }
// public yarnwrap.util.math.BlockPos findPortalPosition(yarnwrap.world.chunk.WorldChunk chunk) { return new yarnwrap.util.math.BlockPos(wrapperContained.findPortalPosition(chunk.wrapperContained)); }
// public yarnwrap.world.chunk.WorldChunk getChunk(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getChunk(world.wrapperContained,pos.wrapperContained)); }
public int getDrawnSidesCount() { return wrapperContained.getDrawnSidesCount(); }
// public void createPortal(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.EndGatewayFeatureConfig config) { wrapperContained.createPortal(world.wrapperContained,pos.wrapperContained,config.wrapperContained); }
public float getRecentlyGeneratedBeamHeight(float tickDelta) { return wrapperContained.getRecentlyGeneratedBeamHeight(tickDelta); }
public void setExitPortalPos(yarnwrap.util.math.BlockPos pos,boolean exactTeleport) { wrapperContained.setExitPortalPos(pos.wrapperContained,exactTeleport); }
// public yarnwrap.util.math.BlockPos findBestPortalExitPos(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.findBestPortalExitPos(world.wrapperContained,pos.wrapperContained)); }
public boolean isRecentlyGenerated() { return wrapperContained.isRecentlyGenerated(); }
public boolean needsCooldownBeforeTeleporting() { return wrapperContained.needsCooldownBeforeTeleporting(); }
// public boolean isChunkEmpty(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos) { return wrapperContained.isChunkEmpty(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.math.BlockPos setupExitPortalLocation(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.setupExitPortalLocation(world.wrapperContained,pos.wrapperContained)); }
public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EndGatewayBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public yarnwrap.util.math.Vec3d findTeleportLocation(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.findTeleportLocation(world.wrapperContained,pos.wrapperContained)); }
public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EndGatewayBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public yarnwrap.util.math.Vec3d getOrCreateExitPortalPos(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.getOrCreateExitPortalPos(world.wrapperContained,pos.wrapperContained)); }

}