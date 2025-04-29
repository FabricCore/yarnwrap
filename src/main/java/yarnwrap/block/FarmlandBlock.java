package yarnwrap.block;
public class FarmlandBlock { public net.minecraft.block.FarmlandBlock wrapperContained; public FarmlandBlock(net.minecraft.block.FarmlandBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty MOISTURE() { return new yarnwrap.state.property.IntProperty(wrapperContained.MOISTURE); }
// public void MOISTURE(yarnwrap.state.property.IntProperty value) { wrapperContained.MOISTURE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty MOISTURE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.FarmlandBlock.MOISTURE); }
// public static void MOISTURE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.FarmlandBlock.MOISTURE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.FarmlandBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.FarmlandBlock.SHAPE = value.wrapperContained; }

// public int MAX_MOISTURE() { return wrapperContained.MAX_MOISTURE; }
// public void MAX_MOISTURE(int value) { wrapperContained.MAX_MOISTURE = value; }
public static int MAX_MOISTURE() { return net.minecraft.block.FarmlandBlock.MAX_MOISTURE; }
// public static void MAX_MOISTURE(int value, ) { net.minecraft.block.FarmlandBlock.MAX_MOISTURE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.FarmlandBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.FarmlandBlock.CODEC = value; }

// public boolean hasCrop(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasCrop(world.wrapperContained,pos.wrapperContained); }
// public static boolean hasCrop(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.FarmlandBlock.hasCrop(world.wrapperContained,pos.wrapperContained); }
// public void setToDirt(yarnwrap.entity.Entity entity,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.setToDirt(entity.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void setToDirt(yarnwrap.entity.Entity entity,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.FarmlandBlock.setToDirt(entity.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean isWaterNearby(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isWaterNearby(world.wrapperContained,pos.wrapperContained); }
// public static boolean isWaterNearby(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.FarmlandBlock.isWaterNearby(world.wrapperContained,pos.wrapperContained); }

}