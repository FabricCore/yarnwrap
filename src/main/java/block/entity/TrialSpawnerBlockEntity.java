package yarnwrap.block.entity;
public class TrialSpawnerBlockEntity { public net.minecraft.block.entity.TrialSpawnerBlockEntity wrapperContained; public TrialSpawnerBlockEntity(net.minecraft.block.entity.TrialSpawnerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.block.spawner.TrialSpawnerLogic spawner() { return new yarnwrap.block.spawner.TrialSpawnerLogic(wrapperContained.spawner); }
public yarnwrap.block.spawner.TrialSpawnerLogic getSpawner() { return new yarnwrap.block.spawner.TrialSpawnerLogic(wrapperContained.getSpawner()); }

}