package yarnwrap.world.spawner;
public class PatrolSpawner { public net.minecraft.world.spawner.PatrolSpawner wrapperContained; public PatrolSpawner(net.minecraft.world.spawner.PatrolSpawner wrapperContained) { this.wrapperContained = wrapperContained; }

// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public boolean spawnPillager(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,boolean captain) { return wrapperContained.spawnPillager(world.wrapperContained,pos.wrapperContained,random.wrapperContained,captain); }

}