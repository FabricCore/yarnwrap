package yarnwrap.world.spawner;
public class SpecialSpawner { public net.minecraft.world.spawner.SpecialSpawner wrapperContained; public SpecialSpawner(net.minecraft.world.spawner.SpecialSpawner wrapperContained) { this.wrapperContained = wrapperContained; }

public void spawn(yarnwrap.server.world.ServerWorld world,boolean spawnMonsters,boolean spawnAnimals) { wrapperContained.spawn(world.wrapperContained,spawnMonsters,spawnAnimals); }
// public static void spawn(yarnwrap.server.world.ServerWorld world,boolean spawnMonsters,boolean spawnAnimals, ) { net.minecraft.world.spawner.SpecialSpawner.spawn(world.wrapperContained,spawnMonsters,spawnAnimals); }

}