package yarnwrap.block.entity;
public class MobSpawnerBlockEntity { public net.minecraft.block.entity.MobSpawnerBlockEntity wrapperContained; public MobSpawnerBlockEntity(net.minecraft.block.entity.MobSpawnerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.spawner.MobSpawnerLogic logic() { return new yarnwrap.block.spawner.MobSpawnerLogic(wrapperContained.logic); }
public yarnwrap.block.spawner.MobSpawnerLogic getLogic() { return new yarnwrap.block.spawner.MobSpawnerLogic(wrapperContained.getLogic()); }
public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.MobSpawnerBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.MobSpawnerBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}