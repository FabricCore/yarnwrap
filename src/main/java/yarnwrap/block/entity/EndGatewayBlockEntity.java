package yarnwrap.block.entity;
public class EndGatewayBlockEntity { public net.minecraft.block.entity.EndGatewayBlockEntity wrapperContained; public EndGatewayBlockEntity(net.minecraft.block.entity.EndGatewayBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean exactTeleport() { return wrapperContained.exactTeleport; }
// public void exactTeleport(boolean value) { wrapperContained.exactTeleport = value; }
// public static boolean exactTeleport() { return net.minecraft.block.entity.EndGatewayBlockEntity.exactTeleport; }
// public static void exactTeleport(boolean value, ) { net.minecraft.block.entity.EndGatewayBlockEntity.exactTeleport = value; }

// public int teleportCooldown() { return wrapperContained.teleportCooldown; }
// public void teleportCooldown(int value) { wrapperContained.teleportCooldown = value; }
// public static int teleportCooldown() { return net.minecraft.block.entity.EndGatewayBlockEntity.teleportCooldown; }
// public static void teleportCooldown(int value, ) { net.minecraft.block.entity.EndGatewayBlockEntity.teleportCooldown = value; }

// public long age() { return wrapperContained.age; }
// public void age(long value) { wrapperContained.age = value; }
// public static long age() { return net.minecraft.block.entity.EndGatewayBlockEntity.age; }
// public static void age(long value, ) { net.minecraft.block.entity.EndGatewayBlockEntity.age = value; }

// public yarnwrap.util.math.BlockPos exitPortalPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.exitPortalPos); }
// public void exitPortalPos(yarnwrap.util.math.BlockPos value) { wrapperContained.exitPortalPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos exitPortalPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.EndGatewayBlockEntity.exitPortalPos); }
// public static void exitPortalPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.block.entity.EndGatewayBlockEntity.exitPortalPos = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.entity.EndGatewayBlockEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.entity.EndGatewayBlockEntity.LOGGER = value; }

// public long DEFAULT_AGE() { return wrapperContained.DEFAULT_AGE; }
// public void DEFAULT_AGE(long value) { wrapperContained.DEFAULT_AGE = value; }
// public static long DEFAULT_AGE() { return net.minecraft.block.entity.EndGatewayBlockEntity.DEFAULT_AGE; }
// public static void DEFAULT_AGE(long value, ) { net.minecraft.block.entity.EndGatewayBlockEntity.DEFAULT_AGE = value; }

// public boolean DEFAULT_EXACT_TELEPORT() { return wrapperContained.DEFAULT_EXACT_TELEPORT; }
// public void DEFAULT_EXACT_TELEPORT(boolean value) { wrapperContained.DEFAULT_EXACT_TELEPORT = value; }
// public static boolean DEFAULT_EXACT_TELEPORT() { return net.minecraft.block.entity.EndGatewayBlockEntity.DEFAULT_EXACT_TELEPORT; }
// public static void DEFAULT_EXACT_TELEPORT(boolean value, ) { net.minecraft.block.entity.EndGatewayBlockEntity.DEFAULT_EXACT_TELEPORT = value; }

// public yarnwrap.util.math.BlockPos findExitPortalPos(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int searchRadius,boolean force) { return new yarnwrap.util.math.BlockPos(wrapperContained.findExitPortalPos(world.wrapperContained,pos.wrapperContained,searchRadius,force)); }
// public static yarnwrap.util.math.BlockPos findExitPortalPos(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int searchRadius,boolean force, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.EndGatewayBlockEntity.findExitPortalPos(world.wrapperContained,pos.wrapperContained,searchRadius,force)); }
// public void startTeleportCooldown(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EndGatewayBlockEntity blockEntity) { wrapperContained.startTeleportCooldown(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void startTeleportCooldown(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EndGatewayBlockEntity blockEntity, ) { net.minecraft.block.entity.EndGatewayBlockEntity.startTeleportCooldown(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public float getCooldownBeamHeight(float tickProgress) { return wrapperContained.getCooldownBeamHeight(tickProgress); }
// public static float getCooldownBeamHeight(float tickProgress, ) { return net.minecraft.block.entity.EndGatewayBlockEntity.getCooldownBeamHeight(tickProgress); }
// public yarnwrap.util.math.BlockPos findPortalPosition(yarnwrap.world.chunk.WorldChunk chunk) { return new yarnwrap.util.math.BlockPos(wrapperContained.findPortalPosition(chunk.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos findPortalPosition(yarnwrap.world.chunk.WorldChunk chunk, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.EndGatewayBlockEntity.findPortalPosition(chunk.wrapperContained)); }
// public yarnwrap.world.chunk.WorldChunk getChunk(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getChunk(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.world.chunk.WorldChunk getChunk(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.block.entity.EndGatewayBlockEntity.getChunk(world.wrapperContained,pos.wrapperContained)); }
public int getDrawnSidesCount() { return wrapperContained.getDrawnSidesCount(); }
// public static int getDrawnSidesCount() { return net.minecraft.block.entity.EndGatewayBlockEntity.getDrawnSidesCount(); }
// public void createPortal(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.EndGatewayFeatureConfig config) { wrapperContained.createPortal(world.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public static void createPortal(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.EndGatewayFeatureConfig config, ) { net.minecraft.block.entity.EndGatewayBlockEntity.createPortal(world.wrapperContained,pos.wrapperContained,config.wrapperContained); }
public float getRecentlyGeneratedBeamHeight(float tickProgress) { return wrapperContained.getRecentlyGeneratedBeamHeight(tickProgress); }
// public static float getRecentlyGeneratedBeamHeight(float tickProgress, ) { return net.minecraft.block.entity.EndGatewayBlockEntity.getRecentlyGeneratedBeamHeight(tickProgress); }
public void setExitPortalPos(yarnwrap.util.math.BlockPos pos,boolean exactTeleport) { wrapperContained.setExitPortalPos(pos.wrapperContained,exactTeleport); }
// public static void setExitPortalPos(yarnwrap.util.math.BlockPos pos,boolean exactTeleport, ) { net.minecraft.block.entity.EndGatewayBlockEntity.setExitPortalPos(pos.wrapperContained,exactTeleport); }
// public yarnwrap.util.math.BlockPos findBestPortalExitPos(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.findBestPortalExitPos(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos findBestPortalExitPos(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.EndGatewayBlockEntity.findBestPortalExitPos(world.wrapperContained,pos.wrapperContained)); }
public boolean isRecentlyGenerated() { return wrapperContained.isRecentlyGenerated(); }
// public static boolean isRecentlyGenerated() { return net.minecraft.block.entity.EndGatewayBlockEntity.isRecentlyGenerated(); }
public boolean needsCooldownBeforeTeleporting() { return wrapperContained.needsCooldownBeforeTeleporting(); }
// public static boolean needsCooldownBeforeTeleporting() { return net.minecraft.block.entity.EndGatewayBlockEntity.needsCooldownBeforeTeleporting(); }
// public boolean isChunkEmpty(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos) { return wrapperContained.isChunkEmpty(world.wrapperContained,pos.wrapperContained); }
// public static boolean isChunkEmpty(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.block.entity.EndGatewayBlockEntity.isChunkEmpty(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.math.BlockPos setupExitPortalLocation(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.setupExitPortalLocation(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos setupExitPortalLocation(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.EndGatewayBlockEntity.setupExitPortalLocation(world.wrapperContained,pos.wrapperContained)); }
// public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EndGatewayBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EndGatewayBlockEntity blockEntity, ) { net.minecraft.block.entity.EndGatewayBlockEntity.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public yarnwrap.util.math.Vec3d findTeleportLocation(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.findTeleportLocation(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d findTeleportLocation(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.block.entity.EndGatewayBlockEntity.findTeleportLocation(world.wrapperContained,pos.wrapperContained)); }
// public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EndGatewayBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EndGatewayBlockEntity blockEntity, ) { net.minecraft.block.entity.EndGatewayBlockEntity.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public yarnwrap.util.math.Vec3d getOrCreateExitPortalPos(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.getOrCreateExitPortalPos(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getOrCreateExitPortalPos(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.block.entity.EndGatewayBlockEntity.getOrCreateExitPortalPos(world.wrapperContained,pos.wrapperContained)); }

}