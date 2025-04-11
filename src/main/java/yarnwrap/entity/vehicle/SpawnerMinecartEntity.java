package yarnwrap.entity.vehicle;
public class SpawnerMinecartEntity { public net.minecraft.entity.vehicle.SpawnerMinecartEntity wrapperContained; public SpawnerMinecartEntity(net.minecraft.entity.vehicle.SpawnerMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Runnable ticker() { return wrapperContained.ticker; }
// public void ticker(java.lang.Runnable value) { wrapperContained.ticker = value; }
// public yarnwrap.block.spawner.MobSpawnerLogic logic() { return new yarnwrap.block.spawner.MobSpawnerLogic(wrapperContained.logic); }
// public void logic(yarnwrap.block.spawner.MobSpawnerLogic value) { wrapperContained.logic = value.wrapperContained; }
// public java.lang.Runnable getTicker(yarnwrap.world.World world) { return wrapperContained.getTicker(world.wrapperContained); }
public yarnwrap.block.spawner.MobSpawnerLogic getLogic() { return new yarnwrap.block.spawner.MobSpawnerLogic(wrapperContained.getLogic()); }

}