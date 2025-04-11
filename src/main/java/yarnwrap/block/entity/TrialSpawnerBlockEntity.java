package yarnwrap.block.entity;
public class TrialSpawnerBlockEntity { public net.minecraft.block.entity.TrialSpawnerBlockEntity wrapperContained; public TrialSpawnerBlockEntity(net.minecraft.block.entity.TrialSpawnerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.block.spawner.TrialSpawnerLogic spawner() { return new yarnwrap.block.spawner.TrialSpawnerLogic(wrapperContained.spawner); }
// public void spawner(yarnwrap.block.spawner.TrialSpawnerLogic value) { wrapperContained.spawner = value.wrapperContained; }
public TrialSpawnerBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.TrialSpawnerBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public void method_55147(yarnwrap.block.spawner.TrialSpawnerLogic spawner) { wrapperContained.method_55147(spawner.wrapperContained); }
// public void method_55148(yarnwrap.nbt.NbtCompound nbtx) { wrapperContained.method_55148(nbtx.wrapperContained); }
public yarnwrap.block.spawner.TrialSpawnerLogic getSpawner() { return new yarnwrap.block.spawner.TrialSpawnerLogic(wrapperContained.getSpawner()); }

}