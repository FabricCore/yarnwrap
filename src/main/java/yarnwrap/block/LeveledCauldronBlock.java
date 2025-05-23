package yarnwrap.block;
public class LeveledCauldronBlock { public net.minecraft.block.LeveledCauldronBlock wrapperContained; public LeveledCauldronBlock(net.minecraft.block.LeveledCauldronBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty LEVEL() { return new yarnwrap.state.property.IntProperty(wrapperContained.LEVEL); }
// public void LEVEL(yarnwrap.state.property.IntProperty value) { wrapperContained.LEVEL = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty LEVEL() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.LeveledCauldronBlock.LEVEL); }
// public static void LEVEL(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.LeveledCauldronBlock.LEVEL = value.wrapperContained; }

// public int MIN_LEVEL() { return wrapperContained.MIN_LEVEL; }
// public void MIN_LEVEL(int value) { wrapperContained.MIN_LEVEL = value; }
public static int MIN_LEVEL() { return net.minecraft.block.LeveledCauldronBlock.MIN_LEVEL; }
// public static void MIN_LEVEL(int value, ) { net.minecraft.block.LeveledCauldronBlock.MIN_LEVEL = value; }

// public int MAX_LEVEL() { return wrapperContained.MAX_LEVEL; }
// public void MAX_LEVEL(int value) { wrapperContained.MAX_LEVEL = value; }
public static int MAX_LEVEL() { return net.minecraft.block.LeveledCauldronBlock.MAX_LEVEL; }
// public static void MAX_LEVEL(int value, ) { net.minecraft.block.LeveledCauldronBlock.MAX_LEVEL = value; }

// public int BASE_FLUID_HEIGHT() { return wrapperContained.BASE_FLUID_HEIGHT; }
// public void BASE_FLUID_HEIGHT(int value) { wrapperContained.BASE_FLUID_HEIGHT = value; }
// public static int BASE_FLUID_HEIGHT() { return net.minecraft.block.LeveledCauldronBlock.BASE_FLUID_HEIGHT; }
// public static void BASE_FLUID_HEIGHT(int value, ) { net.minecraft.block.LeveledCauldronBlock.BASE_FLUID_HEIGHT = value; }

// public double FLUID_HEIGHT_PER_LEVEL() { return wrapperContained.FLUID_HEIGHT_PER_LEVEL; }
// public void FLUID_HEIGHT_PER_LEVEL(double value) { wrapperContained.FLUID_HEIGHT_PER_LEVEL = value; }
// public static double FLUID_HEIGHT_PER_LEVEL() { return net.minecraft.block.LeveledCauldronBlock.FLUID_HEIGHT_PER_LEVEL; }
// public static void FLUID_HEIGHT_PER_LEVEL(double value, ) { net.minecraft.block.LeveledCauldronBlock.FLUID_HEIGHT_PER_LEVEL = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.LeveledCauldronBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.LeveledCauldronBlock.CODEC = value; }

// public Object precipitation() { return wrapperContained.precipitation; }
// // public void precipitation(Object value) { wrapperContained.precipitation = value; }
// // public static Object precipitation() { return net.minecraft.block.LeveledCauldronBlock.precipitation; }
// // public static void precipitation(Object value, ) { net.minecraft.block.LeveledCauldronBlock.precipitation = value; }

// public net.minecraft.util.shape.VoxelShape[] INSIDE_COLLISION_SHAPE_BY_LEVEL() { return wrapperContained.INSIDE_COLLISION_SHAPE_BY_LEVEL; }
// public void INSIDE_COLLISION_SHAPE_BY_LEVEL(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.INSIDE_COLLISION_SHAPE_BY_LEVEL = value; }
// public static net.minecraft.util.shape.VoxelShape[] INSIDE_COLLISION_SHAPE_BY_LEVEL() { return net.minecraft.block.LeveledCauldronBlock.INSIDE_COLLISION_SHAPE_BY_LEVEL; }
// public static void INSIDE_COLLISION_SHAPE_BY_LEVEL(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.LeveledCauldronBlock.INSIDE_COLLISION_SHAPE_BY_LEVEL = value; }

// public LeveledCauldronBlock(Object precipitation,Object behaviorMap,Object settings) { this.wrapperContained = new net.minecraft.block.LeveledCauldronBlock(precipitation,behaviorMap,settings); }
// public void decrementFluidLevel(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.decrementFluidLevel(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void decrementFluidLevel(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.LeveledCauldronBlock.decrementFluidLevel(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public void onFireCollision(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.onFireCollision(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void onFireCollision(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.LeveledCauldronBlock.onFireCollision(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54024(Object instance) { return wrapperContained.method_54024(instance); }
// public static com.mojang.datafixers.kinds.App method_54024(Object instance, ) { return net.minecraft.block.LeveledCauldronBlock.method_54024(instance); }
// public Object method_54025(yarnwrap.block.LeveledCauldronBlock block) { return wrapperContained.method_54025(block.wrapperContained); }
// public static Object method_54025(yarnwrap.block.LeveledCauldronBlock block, ) { return net.minecraft.block.LeveledCauldronBlock.method_54025(block.wrapperContained); }
// public Object method_54026(yarnwrap.block.LeveledCauldronBlock block) { return wrapperContained.method_54026(block.wrapperContained); }
// public static Object method_54026(yarnwrap.block.LeveledCauldronBlock block, ) { return net.minecraft.block.LeveledCauldronBlock.method_54026(block.wrapperContained); }
// public void method_71627(yarnwrap.server.world.ServerWorld collidedEntity) { wrapperContained.method_71627(collidedEntity.wrapperContained); }
// public static void method_71627(yarnwrap.server.world.ServerWorld collidedEntity, ) { net.minecraft.block.LeveledCauldronBlock.method_71627(collidedEntity.wrapperContained); }
// public double getFluidHeight(int level) { return wrapperContained.getFluidHeight(level); }
// public static double getFluidHeight(int level, ) { return net.minecraft.block.LeveledCauldronBlock.getFluidHeight(level); }
// public yarnwrap.util.shape.VoxelShape method_71630(int level) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_71630(level)); }
// public static yarnwrap.util.shape.VoxelShape method_71630(int level, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.LeveledCauldronBlock.method_71630(level)); }

}