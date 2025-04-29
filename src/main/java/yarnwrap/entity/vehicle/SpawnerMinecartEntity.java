package yarnwrap.entity.vehicle;
public class SpawnerMinecartEntity { public net.minecraft.entity.vehicle.SpawnerMinecartEntity wrapperContained; public SpawnerMinecartEntity(net.minecraft.entity.vehicle.SpawnerMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Runnable ticker() { return wrapperContained.ticker; }
// public void ticker(java.lang.Runnable value) { wrapperContained.ticker = value; }
// public static java.lang.Runnable ticker() { return net.minecraft.entity.vehicle.SpawnerMinecartEntity.ticker; }
// public static void ticker(java.lang.Runnable value, ) { net.minecraft.entity.vehicle.SpawnerMinecartEntity.ticker = value; }

// public yarnwrap.block.spawner.MobSpawnerLogic logic() { return new yarnwrap.block.spawner.MobSpawnerLogic(wrapperContained.logic); }
// public void logic(yarnwrap.block.spawner.MobSpawnerLogic value) { wrapperContained.logic = value.wrapperContained; }
// public static yarnwrap.block.spawner.MobSpawnerLogic logic() { return new yarnwrap.block.spawner.MobSpawnerLogic(net.minecraft.entity.vehicle.SpawnerMinecartEntity.logic); }
// public static void logic(yarnwrap.block.spawner.MobSpawnerLogic value, ) { net.minecraft.entity.vehicle.SpawnerMinecartEntity.logic = value.wrapperContained; }

public SpawnerMinecartEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.vehicle.SpawnerMinecartEntity(world.wrapperContained,x,y,z); }
// public java.lang.Runnable getTicker(yarnwrap.world.World world) { return wrapperContained.getTicker(world.wrapperContained); }
// public static java.lang.Runnable getTicker(yarnwrap.world.World world, ) { return net.minecraft.entity.vehicle.SpawnerMinecartEntity.getTicker(world.wrapperContained); }
public yarnwrap.block.spawner.MobSpawnerLogic getLogic() { return new yarnwrap.block.spawner.MobSpawnerLogic(wrapperContained.getLogic()); }
// public static yarnwrap.block.spawner.MobSpawnerLogic getLogic() { return new yarnwrap.block.spawner.MobSpawnerLogic(net.minecraft.entity.vehicle.SpawnerMinecartEntity.getLogic()); }

}