package yarnwrap.block;
public class CactusBlock { public net.minecraft.block.CactusBlock wrapperContained; public CactusBlock(net.minecraft.block.CactusBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.CactusBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.CactusBlock.AGE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTLINE_SHAPE); }
// public void OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.OUTLINE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CactusBlock.OUTLINE_SHAPE); }
// public static void OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CactusBlock.OUTLINE_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.COLLISION_SHAPE); }
// public void COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.COLLISION_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CactusBlock.COLLISION_SHAPE); }
// public static void COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CactusBlock.COLLISION_SHAPE = value.wrapperContained; }

// public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public static int MAX_AGE() { return net.minecraft.block.CactusBlock.MAX_AGE; }
// public static void MAX_AGE(int value, ) { net.minecraft.block.CactusBlock.MAX_AGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CactusBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CactusBlock.CODEC = value; }

// public int TALL_THRESHOLD() { return wrapperContained.TALL_THRESHOLD; }
// public void TALL_THRESHOLD(int value) { wrapperContained.TALL_THRESHOLD = value; }
// public static int TALL_THRESHOLD() { return net.minecraft.block.CactusBlock.TALL_THRESHOLD; }
// public static void TALL_THRESHOLD(int value, ) { net.minecraft.block.CactusBlock.TALL_THRESHOLD = value; }

// public int FLOWER_GROWTH_AGE() { return wrapperContained.FLOWER_GROWTH_AGE; }
// public void FLOWER_GROWTH_AGE(int value) { wrapperContained.FLOWER_GROWTH_AGE = value; }
// public static int FLOWER_GROWTH_AGE() { return net.minecraft.block.CactusBlock.FLOWER_GROWTH_AGE; }
// public static void FLOWER_GROWTH_AGE(int value, ) { net.minecraft.block.CactusBlock.FLOWER_GROWTH_AGE = value; }

// public double FLOWER_CHANCE_WHEN_SHORT() { return wrapperContained.FLOWER_CHANCE_WHEN_SHORT; }
// public void FLOWER_CHANCE_WHEN_SHORT(double value) { wrapperContained.FLOWER_CHANCE_WHEN_SHORT = value; }
// public static double FLOWER_CHANCE_WHEN_SHORT() { return net.minecraft.block.CactusBlock.FLOWER_CHANCE_WHEN_SHORT; }
// public static void FLOWER_CHANCE_WHEN_SHORT(double value, ) { net.minecraft.block.CactusBlock.FLOWER_CHANCE_WHEN_SHORT = value; }

// public double FLOWER_CHANCE_WHEN_TALL() { return wrapperContained.FLOWER_CHANCE_WHEN_TALL; }
// public void FLOWER_CHANCE_WHEN_TALL(double value) { wrapperContained.FLOWER_CHANCE_WHEN_TALL = value; }
// public static double FLOWER_CHANCE_WHEN_TALL() { return net.minecraft.block.CactusBlock.FLOWER_CHANCE_WHEN_TALL; }
// public static void FLOWER_CHANCE_WHEN_TALL(double value, ) { net.minecraft.block.CactusBlock.FLOWER_CHANCE_WHEN_TALL = value; }


}