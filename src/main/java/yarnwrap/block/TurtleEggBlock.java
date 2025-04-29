package yarnwrap.block;
public class TurtleEggBlock { public net.minecraft.block.TurtleEggBlock wrapperContained; public TurtleEggBlock(net.minecraft.block.TurtleEggBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape LARGE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LARGE_SHAPE); }
// public void LARGE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LARGE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape LARGE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.TurtleEggBlock.LARGE_SHAPE); }
// public static void LARGE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.TurtleEggBlock.LARGE_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.IntProperty EGGS() { return new yarnwrap.state.property.IntProperty(wrapperContained.EGGS); }
// public void EGGS(yarnwrap.state.property.IntProperty value) { wrapperContained.EGGS = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty EGGS() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.TurtleEggBlock.EGGS); }
// public static void EGGS(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.TurtleEggBlock.EGGS = value.wrapperContained; }

// public yarnwrap.state.property.IntProperty HATCH() { return new yarnwrap.state.property.IntProperty(wrapperContained.HATCH); }
// public void HATCH(yarnwrap.state.property.IntProperty value) { wrapperContained.HATCH = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty HATCH() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.TurtleEggBlock.HATCH); }
// public static void HATCH(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.TurtleEggBlock.HATCH = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SMALL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SMALL_SHAPE); }
// public void SMALL_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SMALL_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SMALL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.TurtleEggBlock.SMALL_SHAPE); }
// public static void SMALL_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.TurtleEggBlock.SMALL_SHAPE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TurtleEggBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TurtleEggBlock.CODEC = value; }

// public boolean isSandBelow(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSandBelow(world.wrapperContained,pos.wrapperContained); }
// public static boolean isSandBelow(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.TurtleEggBlock.isSandBelow(world.wrapperContained,pos.wrapperContained); }
// public boolean shouldHatchProgress(yarnwrap.world.World world) { return wrapperContained.shouldHatchProgress(world.wrapperContained); }
// public static boolean shouldHatchProgress(yarnwrap.world.World world, ) { return net.minecraft.block.TurtleEggBlock.shouldHatchProgress(world.wrapperContained); }
// public void breakEgg(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.breakEgg(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void breakEgg(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.TurtleEggBlock.breakEgg(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void tryBreakEgg(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,int inverseChance) { wrapperContained.tryBreakEgg(world.wrapperContained,state.wrapperContained,pos.wrapperContained,entity.wrapperContained,inverseChance); }
// public static void tryBreakEgg(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,int inverseChance, ) { net.minecraft.block.TurtleEggBlock.tryBreakEgg(world.wrapperContained,state.wrapperContained,pos.wrapperContained,entity.wrapperContained,inverseChance); }
// public boolean breaksEgg(yarnwrap.world.World world,yarnwrap.entity.Entity entity) { return wrapperContained.breaksEgg(world.wrapperContained,entity.wrapperContained); }
// public static boolean breaksEgg(yarnwrap.world.World world,yarnwrap.entity.Entity entity, ) { return net.minecraft.block.TurtleEggBlock.breaksEgg(world.wrapperContained,entity.wrapperContained); }
// public boolean isSand(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSand(world.wrapperContained,pos.wrapperContained); }
// public static boolean isSand(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.TurtleEggBlock.isSand(world.wrapperContained,pos.wrapperContained); }

}