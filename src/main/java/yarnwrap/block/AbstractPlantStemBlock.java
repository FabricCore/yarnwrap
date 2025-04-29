package yarnwrap.block;
public class AbstractPlantStemBlock { public net.minecraft.block.AbstractPlantStemBlock wrapperContained; public AbstractPlantStemBlock(net.minecraft.block.AbstractPlantStemBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.AbstractPlantStemBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.AbstractPlantStemBlock.AGE = value.wrapperContained; }

// public double growthChance() { return wrapperContained.growthChance; }
// public void growthChance(double value) { wrapperContained.growthChance = value; }
// public static double growthChance() { return net.minecraft.block.AbstractPlantStemBlock.growthChance; }
// public static void growthChance(double value, ) { net.minecraft.block.AbstractPlantStemBlock.growthChance = value; }

// public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public static int MAX_AGE() { return net.minecraft.block.AbstractPlantStemBlock.MAX_AGE; }
// public static void MAX_AGE(int value, ) { net.minecraft.block.AbstractPlantStemBlock.MAX_AGE = value; }

// public AbstractPlantStemBlock(Object settings,yarnwrap.util.math.Direction growthDirection,yarnwrap.util.shape.VoxelShape outlineShape,boolean tickWater,double growthChance) { this.wrapperContained = new net.minecraft.block.AbstractPlantStemBlock(settings,growthDirection.wrapperContained,outlineShape.wrapperContained,tickWater,growthChance); }
// public boolean chooseStemState(yarnwrap.block.BlockState state) { return wrapperContained.chooseStemState(state.wrapperContained); }
// public static boolean chooseStemState(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractPlantStemBlock.chooseStemState(state.wrapperContained); }
// public int getGrowthLength(yarnwrap.util.math.random.Random random) { return wrapperContained.getGrowthLength(random.wrapperContained); }
// public static int getGrowthLength(yarnwrap.util.math.random.Random random, ) { return net.minecraft.block.AbstractPlantStemBlock.getGrowthLength(random.wrapperContained); }
// public yarnwrap.block.BlockState copyState(yarnwrap.block.BlockState from,yarnwrap.block.BlockState to) { return new yarnwrap.block.BlockState(wrapperContained.copyState(from.wrapperContained,to.wrapperContained)); }
// public static yarnwrap.block.BlockState copyState(yarnwrap.block.BlockState from,yarnwrap.block.BlockState to, ) { return new yarnwrap.block.BlockState(net.minecraft.block.AbstractPlantStemBlock.copyState(from.wrapperContained,to.wrapperContained)); }
// public yarnwrap.block.BlockState age(yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.age(state.wrapperContained,random.wrapperContained)); }
// public static yarnwrap.block.BlockState age(yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random, ) { return new yarnwrap.block.BlockState(net.minecraft.block.AbstractPlantStemBlock.age(state.wrapperContained,random.wrapperContained)); }
public yarnwrap.block.BlockState withMaxAge(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.withMaxAge(state.wrapperContained)); }
// public static yarnwrap.block.BlockState withMaxAge(yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.block.AbstractPlantStemBlock.withMaxAge(state.wrapperContained)); }
public boolean hasMaxAge(yarnwrap.block.BlockState state) { return wrapperContained.hasMaxAge(state.wrapperContained); }
// public static boolean hasMaxAge(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractPlantStemBlock.hasMaxAge(state.wrapperContained); }

}