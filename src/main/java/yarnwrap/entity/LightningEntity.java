package yarnwrap.entity;
public class LightningEntity { public net.minecraft.entity.LightningEntity wrapperContained; public LightningEntity(net.minecraft.entity.LightningEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set struckEntities() { return wrapperContained.struckEntities; }
// public void struckEntities(java.util.Set value) { wrapperContained.struckEntities = value; }
// public static java.util.Set struckEntities() { return net.minecraft.entity.LightningEntity.struckEntities; }
// public static void struckEntities(java.util.Set value, ) { net.minecraft.entity.LightningEntity.struckEntities = value; }

// public int blocksSetOnFire() { return wrapperContained.blocksSetOnFire; }
// public void blocksSetOnFire(int value) { wrapperContained.blocksSetOnFire = value; }
// public static int blocksSetOnFire() { return net.minecraft.entity.LightningEntity.blocksSetOnFire; }
// public static void blocksSetOnFire(int value, ) { net.minecraft.entity.LightningEntity.blocksSetOnFire = value; }

// public yarnwrap.server.network.ServerPlayerEntity channeler() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.channeler); }
// public void channeler(yarnwrap.server.network.ServerPlayerEntity value) { wrapperContained.channeler = value.wrapperContained; }
// public static yarnwrap.server.network.ServerPlayerEntity channeler() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.entity.LightningEntity.channeler); }
// public static void channeler(yarnwrap.server.network.ServerPlayerEntity value, ) { net.minecraft.entity.LightningEntity.channeler = value.wrapperContained; }

// public int remainingActions() { return wrapperContained.remainingActions; }
// public void remainingActions(int value) { wrapperContained.remainingActions = value; }
// public static int remainingActions() { return net.minecraft.entity.LightningEntity.remainingActions; }
// public static void remainingActions(int value, ) { net.minecraft.entity.LightningEntity.remainingActions = value; }

// public boolean cosmetic() { return wrapperContained.cosmetic; }
// public void cosmetic(boolean value) { wrapperContained.cosmetic = value; }
// public static boolean cosmetic() { return net.minecraft.entity.LightningEntity.cosmetic; }
// public static void cosmetic(boolean value, ) { net.minecraft.entity.LightningEntity.cosmetic = value; }

// public int ambientTick() { return wrapperContained.ambientTick; }
// public void ambientTick(int value) { wrapperContained.ambientTick = value; }
// public static int ambientTick() { return net.minecraft.entity.LightningEntity.ambientTick; }
// public static void ambientTick(int value, ) { net.minecraft.entity.LightningEntity.ambientTick = value; }

public long seed() { return wrapperContained.seed; }
public void seed(long value) { wrapperContained.seed = value; }
// public static long seed() { return net.minecraft.entity.LightningEntity.seed; }
// public static void seed(long value, ) { net.minecraft.entity.LightningEntity.seed = value; }

public void setCosmetic(boolean cosmetic) { wrapperContained.setCosmetic(cosmetic); }
// public static void setCosmetic(boolean cosmetic, ) { net.minecraft.entity.LightningEntity.setCosmetic(cosmetic); }
// public void powerLightningRod() { wrapperContained.powerLightningRod(); }
// public static void powerLightningRod() { net.minecraft.entity.LightningEntity.powerLightningRod(); }
// public void cleanOxidation(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.cleanOxidation(world.wrapperContained,pos.wrapperContained); }
// public static void cleanOxidation(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.LightningEntity.cleanOxidation(world.wrapperContained,pos.wrapperContained); }
// public void method_34708(yarnwrap.world.World state) { wrapperContained.method_34708(state.wrapperContained); }
// public static void method_34708(yarnwrap.world.World state, ) { net.minecraft.entity.LightningEntity.method_34708(state.wrapperContained); }
// public void cleanOxidationAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,Object mutablePos,int count) { wrapperContained.cleanOxidationAround(world.wrapperContained,pos.wrapperContained,mutablePos,count); }
// public static void cleanOxidationAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,Object mutablePos,int count, ) { net.minecraft.entity.LightningEntity.cleanOxidationAround(world.wrapperContained,pos.wrapperContained,mutablePos,count); }
// public java.util.Optional cleanOxidationAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.cleanOxidationAround(world.wrapperContained,pos.wrapperContained); }
// public static java.util.Optional cleanOxidationAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.LightningEntity.cleanOxidationAround(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.server.network.ServerPlayerEntity getChanneler() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getChanneler()); }
// public static yarnwrap.server.network.ServerPlayerEntity getChanneler() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.entity.LightningEntity.getChanneler()); }
// public yarnwrap.util.math.BlockPos getAffectedBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getAffectedBlockPos()); }
// public static yarnwrap.util.math.BlockPos getAffectedBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.LightningEntity.getAffectedBlockPos()); }
public int getBlocksSetOnFire() { return wrapperContained.getBlocksSetOnFire(); }
// public static int getBlocksSetOnFire() { return net.minecraft.entity.LightningEntity.getBlocksSetOnFire(); }
public java.util.stream.Stream getStruckEntities() { return wrapperContained.getStruckEntities(); }
// public static java.util.stream.Stream getStruckEntities() { return net.minecraft.entity.LightningEntity.getStruckEntities(); }
// public void spawnFire(int spreadAttempts) { wrapperContained.spawnFire(spreadAttempts); }
// public static void spawnFire(int spreadAttempts, ) { net.minecraft.entity.LightningEntity.spawnFire(spreadAttempts); }
public void setChanneler(yarnwrap.server.network.ServerPlayerEntity channeler) { wrapperContained.setChanneler(channeler.wrapperContained); }
// public static void setChanneler(yarnwrap.server.network.ServerPlayerEntity channeler, ) { net.minecraft.entity.LightningEntity.setChanneler(channeler.wrapperContained); }

}