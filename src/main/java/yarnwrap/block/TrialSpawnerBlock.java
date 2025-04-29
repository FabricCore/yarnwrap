package yarnwrap.block;
public class TrialSpawnerBlock { public net.minecraft.block.TrialSpawnerBlock wrapperContained; public TrialSpawnerBlock(net.minecraft.block.TrialSpawnerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TrialSpawnerBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TrialSpawnerBlock.CODEC = value; }

// public yarnwrap.state.property.EnumProperty TRIAL_SPAWNER_STATE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.TRIAL_SPAWNER_STATE); }
// public void TRIAL_SPAWNER_STATE(yarnwrap.state.property.EnumProperty value) { wrapperContained.TRIAL_SPAWNER_STATE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty TRIAL_SPAWNER_STATE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.TrialSpawnerBlock.TRIAL_SPAWNER_STATE); }
// public static void TRIAL_SPAWNER_STATE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.TrialSpawnerBlock.TRIAL_SPAWNER_STATE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty OMINOUS() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OMINOUS); }
// public void OMINOUS(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OMINOUS = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty OMINOUS() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TrialSpawnerBlock.OMINOUS); }
// public static void OMINOUS(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TrialSpawnerBlock.OMINOUS = value.wrapperContained; }

// public void method_55140(yarnwrap.server.world.ServerWorld world,yarnwrap.world.World pos,yarnwrap.util.math.BlockPos state,yarnwrap.block.BlockState blockEntity) { wrapperContained.method_55140(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void method_55140(yarnwrap.server.world.ServerWorld world,yarnwrap.world.World pos,yarnwrap.util.math.BlockPos state,yarnwrap.block.BlockState blockEntity, ) { net.minecraft.block.TrialSpawnerBlock.method_55140(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void method_55141(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.TrialSpawnerBlockEntity blockEntity) { wrapperContained.method_55141(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void method_55141(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.TrialSpawnerBlockEntity blockEntity, ) { net.minecraft.block.TrialSpawnerBlock.method_55141(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}