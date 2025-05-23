package yarnwrap.block;
public class CropBlock { public net.minecraft.block.CropBlock wrapperContained; public CropBlock(net.minecraft.block.CropBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.CropBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.CropBlock.AGE = value.wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return wrapperContained.SHAPES_BY_AGE; }
// public void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.SHAPES_BY_AGE = value; }
// public static net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return net.minecraft.block.CropBlock.SHAPES_BY_AGE; }
// public static void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.CropBlock.SHAPES_BY_AGE = value; }

// public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public static int MAX_AGE() { return net.minecraft.block.CropBlock.MAX_AGE; }
// public static void MAX_AGE(int value, ) { net.minecraft.block.CropBlock.MAX_AGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CropBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CropBlock.CODEC = value; }

// public yarnwrap.state.property.IntProperty getAgeProperty() { return new yarnwrap.state.property.IntProperty(wrapperContained.getAgeProperty()); }
// public static yarnwrap.state.property.IntProperty getAgeProperty() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.CropBlock.getAgeProperty()); }
public boolean isMature(yarnwrap.block.BlockState state) { return wrapperContained.isMature(state.wrapperContained); }
// public static boolean isMature(yarnwrap.block.BlockState state, ) { return net.minecraft.block.CropBlock.isMature(state.wrapperContained); }
public void applyGrowth(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.applyGrowth(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void applyGrowth(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.CropBlock.applyGrowth(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public int getMaxAge() { return wrapperContained.getMaxAge(); }
// public static int getMaxAge() { return net.minecraft.block.CropBlock.getMaxAge(); }
public yarnwrap.block.BlockState withAge(int age) { return new yarnwrap.block.BlockState(wrapperContained.withAge(age)); }
// public static yarnwrap.block.BlockState withAge(int age, ) { return new yarnwrap.block.BlockState(net.minecraft.block.CropBlock.withAge(age)); }
public int getAge(yarnwrap.block.BlockState state) { return wrapperContained.getAge(state.wrapperContained); }
// public static int getAge(yarnwrap.block.BlockState state, ) { return net.minecraft.block.CropBlock.getAge(state.wrapperContained); }
// public float getAvailableMoisture(yarnwrap.block.Block block,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getAvailableMoisture(block.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static float getAvailableMoisture(yarnwrap.block.Block block,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.CropBlock.getAvailableMoisture(block.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public int getGrowthAmount(yarnwrap.world.World world) { return wrapperContained.getGrowthAmount(world.wrapperContained); }
// public static int getGrowthAmount(yarnwrap.world.World world, ) { return net.minecraft.block.CropBlock.getGrowthAmount(world.wrapperContained); }
// public yarnwrap.item.ItemConvertible getSeedsItem() { return new yarnwrap.item.ItemConvertible(wrapperContained.getSeedsItem()); }
// public static yarnwrap.item.ItemConvertible getSeedsItem() { return new yarnwrap.item.ItemConvertible(net.minecraft.block.CropBlock.getSeedsItem()); }
// public boolean hasEnoughLightAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasEnoughLightAt(world.wrapperContained,pos.wrapperContained); }
// public static boolean hasEnoughLightAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.CropBlock.hasEnoughLightAt(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape method_66427(int age) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66427(age)); }
// public static yarnwrap.util.shape.VoxelShape method_66427(int age, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CropBlock.method_66427(age)); }

}