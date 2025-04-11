package yarnwrap.entity;
public class LightningEntity { public net.minecraft.entity.LightningEntity wrapperContained; public LightningEntity(net.minecraft.entity.LightningEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set struckEntities() { return wrapperContained.struckEntities; }
// public void struckEntities(java.util.Set value) { wrapperContained.struckEntities = value; }
// public int blocksSetOnFire() { return wrapperContained.blocksSetOnFire; }
// public void blocksSetOnFire(int value) { wrapperContained.blocksSetOnFire = value; }
// public yarnwrap.server.network.ServerPlayerEntity channeler() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.channeler); }
// public void channeler(yarnwrap.server.network.ServerPlayerEntity value) { wrapperContained.channeler = value.wrapperContained; }
// public int remainingActions() { return wrapperContained.remainingActions; }
// public void remainingActions(int value) { wrapperContained.remainingActions = value; }
// public boolean cosmetic() { return wrapperContained.cosmetic; }
// public void cosmetic(boolean value) { wrapperContained.cosmetic = value; }
// public int ambientTick() { return wrapperContained.ambientTick; }
// public void ambientTick(int value) { wrapperContained.ambientTick = value; }
public long seed() { return wrapperContained.seed; }
public void seed(long value) { wrapperContained.seed = value; }
public void setCosmetic(boolean cosmetic) { wrapperContained.setCosmetic(cosmetic); }
// public void powerLightningRod() { wrapperContained.powerLightningRod(); }
// public void cleanOxidation(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.cleanOxidation(world.wrapperContained,pos.wrapperContained); }
// public void method_34708(yarnwrap.world.World state) { wrapperContained.method_34708(state.wrapperContained); }
// public void cleanOxidationAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,Object mutablePos,int count) { wrapperContained.cleanOxidationAround(world.wrapperContained,pos.wrapperContained,mutablePos,count); }
// public java.util.Optional cleanOxidationAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.cleanOxidationAround(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.server.network.ServerPlayerEntity getChanneler() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getChanneler()); }
// public yarnwrap.util.math.BlockPos getAffectedBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getAffectedBlockPos()); }
public int getBlocksSetOnFire() { return wrapperContained.getBlocksSetOnFire(); }
public java.util.stream.Stream getStruckEntities() { return wrapperContained.getStruckEntities(); }
// public void spawnFire(int spreadAttempts) { wrapperContained.spawnFire(spreadAttempts); }
public void setChanneler(yarnwrap.server.network.ServerPlayerEntity channeler) { wrapperContained.setChanneler(channeler.wrapperContained); }

}