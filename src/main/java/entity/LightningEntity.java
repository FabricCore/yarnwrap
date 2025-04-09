package yarnwrap.entity;
public class LightningEntity { public net.minecraft.entity.LightningEntity wrapperContained; public LightningEntity(net.minecraft.entity.LightningEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set struckEntities() { return wrapperContained.struckEntities; }
// public int blocksSetOnFire() { return wrapperContained.blocksSetOnFire; }
// public yarnwrap.server.network.ServerPlayerEntity channeler() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.channeler); }
// public int remainingActions() { return wrapperContained.remainingActions; }
// public boolean cosmetic() { return wrapperContained.cosmetic; }
// public int ambientTick() { return wrapperContained.ambientTick; }
public long seed() { return wrapperContained.seed; }
public void setCosmetic(boolean cosmetic) { wrapperContained.setCosmetic(cosmetic); }
// public void powerLightningRod() { wrapperContained.powerLightningRod(); }
// public void cleanOxidation(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.cleanOxidation(world.wrapperContained,pos.wrapperContained); }
// public void cleanOxidationAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,Object mutablePos,int count) { wrapperContained.cleanOxidationAround(world.wrapperContained,pos.wrapperContained,mutablePos,count); }
// public java.util.Optional cleanOxidationAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.cleanOxidationAround(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.server.network.ServerPlayerEntity getChanneler() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getChanneler()); }
// public yarnwrap.util.math.BlockPos getAffectedBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getAffectedBlockPos()); }
public int getBlocksSetOnFire() { return wrapperContained.getBlocksSetOnFire(); }
public java.util.stream.Stream getStruckEntities() { return wrapperContained.getStruckEntities(); }
// public void spawnFire(int spreadAttempts) { wrapperContained.spawnFire(spreadAttempts); }
public void setChanneler(yarnwrap.server.network.ServerPlayerEntity channeler) { wrapperContained.setChanneler(channeler.wrapperContained); }

}