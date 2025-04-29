package yarnwrap.block.entity;
public class MobSpawnerBlockEntity { public net.minecraft.block.entity.MobSpawnerBlockEntity wrapperContained; public MobSpawnerBlockEntity(net.minecraft.block.entity.MobSpawnerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.spawner.MobSpawnerLogic logic() { return new yarnwrap.block.spawner.MobSpawnerLogic(wrapperContained.logic); }
// public void logic(yarnwrap.block.spawner.MobSpawnerLogic value) { wrapperContained.logic = value.wrapperContained; }
// public static yarnwrap.block.spawner.MobSpawnerLogic logic() { return new yarnwrap.block.spawner.MobSpawnerLogic(net.minecraft.block.entity.MobSpawnerBlockEntity.logic); }
// public static void logic(yarnwrap.block.spawner.MobSpawnerLogic value, ) { net.minecraft.block.entity.MobSpawnerBlockEntity.logic = value.wrapperContained; }

public MobSpawnerBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.MobSpawnerBlockEntity(pos.wrapperContained,state.wrapperContained); }
public yarnwrap.block.spawner.MobSpawnerLogic getLogic() { return new yarnwrap.block.spawner.MobSpawnerLogic(wrapperContained.getLogic()); }
// public static yarnwrap.block.spawner.MobSpawnerLogic getLogic() { return new yarnwrap.block.spawner.MobSpawnerLogic(net.minecraft.block.entity.MobSpawnerBlockEntity.getLogic()); }
// public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.MobSpawnerBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.MobSpawnerBlockEntity blockEntity, ) { net.minecraft.block.entity.MobSpawnerBlockEntity.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.MobSpawnerBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.MobSpawnerBlockEntity blockEntity, ) { net.minecraft.block.entity.MobSpawnerBlockEntity.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}