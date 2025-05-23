package yarnwrap.block.entity;
public class TrialSpawnerBlockEntity { public net.minecraft.block.entity.TrialSpawnerBlockEntity wrapperContained; public TrialSpawnerBlockEntity(net.minecraft.block.entity.TrialSpawnerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.spawner.TrialSpawnerLogic logic() { return new yarnwrap.block.spawner.TrialSpawnerLogic(wrapperContained.logic); }
// public void logic(yarnwrap.block.spawner.TrialSpawnerLogic value) { wrapperContained.logic = value.wrapperContained; }
// public static yarnwrap.block.spawner.TrialSpawnerLogic logic() { return new yarnwrap.block.spawner.TrialSpawnerLogic(net.minecraft.block.entity.TrialSpawnerBlockEntity.logic); }
// public static void logic(yarnwrap.block.spawner.TrialSpawnerLogic value, ) { net.minecraft.block.entity.TrialSpawnerBlockEntity.logic = value.wrapperContained; }

public TrialSpawnerBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.TrialSpawnerBlockEntity(pos.wrapperContained,state.wrapperContained); }
public yarnwrap.block.spawner.TrialSpawnerLogic getSpawner() { return new yarnwrap.block.spawner.TrialSpawnerLogic(wrapperContained.getSpawner()); }
// public static yarnwrap.block.spawner.TrialSpawnerLogic getSpawner() { return new yarnwrap.block.spawner.TrialSpawnerLogic(net.minecraft.block.entity.TrialSpawnerBlockEntity.getSpawner()); }
// public yarnwrap.block.spawner.TrialSpawnerLogic createDefaultLogic() { return new yarnwrap.block.spawner.TrialSpawnerLogic(wrapperContained.createDefaultLogic()); }
// public static yarnwrap.block.spawner.TrialSpawnerLogic createDefaultLogic() { return new yarnwrap.block.spawner.TrialSpawnerLogic(net.minecraft.block.entity.TrialSpawnerBlockEntity.createDefaultLogic()); }

}