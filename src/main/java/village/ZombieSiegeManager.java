package yarnwrap.village;
public class ZombieSiegeManager { public net.minecraft.village.ZombieSiegeManager wrapperContained; public ZombieSiegeManager(net.minecraft.village.ZombieSiegeManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object state() { return wrapperContained.state; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int startZ() { return wrapperContained.startZ; }
// public int startY() { return wrapperContained.startY; }
// public int startX() { return wrapperContained.startX; }
// public int countdown() { return wrapperContained.countdown; }
// public int remaining() { return wrapperContained.remaining; }
// public boolean spawned() { return wrapperContained.spawned; }
// public boolean spawn(yarnwrap.server.world.ServerWorld world) { return wrapperContained.spawn(world.wrapperContained); }
// public void trySpawnZombie(yarnwrap.server.world.ServerWorld world) { wrapperContained.trySpawnZombie(world.wrapperContained); }
// public yarnwrap.util.math.Vec3d getSpawnVector(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.getSpawnVector(world.wrapperContained,pos.wrapperContained)); }

}