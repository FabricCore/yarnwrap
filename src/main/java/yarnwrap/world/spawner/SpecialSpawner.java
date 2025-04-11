package yarnwrap.world.spawner;
public class SpecialSpawner { public net.minecraft.world.spawner.SpecialSpawner wrapperContained; public SpecialSpawner(net.minecraft.world.spawner.SpecialSpawner wrapperContained) { this.wrapperContained = wrapperContained; }

public int spawn(yarnwrap.server.world.ServerWorld world,boolean spawnMonsters,boolean spawnAnimals) { return wrapperContained.spawn(world.wrapperContained,spawnMonsters,spawnAnimals); }

}