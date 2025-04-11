package yarnwrap.world.gen.trunk;
public class TrunkPlacer { public net.minecraft.world.gen.trunk.TrunkPlacer wrapperContained; public TrunkPlacer(net.minecraft.world.gen.trunk.TrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int baseHeight() { return wrapperContained.baseHeight; }
// public void baseHeight(int value) { wrapperContained.baseHeight = value; }
// public int firstRandomHeight() { return wrapperContained.firstRandomHeight; }
// public void firstRandomHeight(int value) { wrapperContained.firstRandomHeight = value; }
// public int secondRandomHeight() { return wrapperContained.secondRandomHeight; }
// public void secondRandomHeight(int value) { wrapperContained.secondRandomHeight = value; }
public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
// public int MAX_BASE_HEIGHT() { return wrapperContained.MAX_BASE_HEIGHT; }
// public void MAX_BASE_HEIGHT(int value) { wrapperContained.MAX_BASE_HEIGHT = value; }
// public int MAX_RANDOM_HEIGHT() { return wrapperContained.MAX_RANDOM_HEIGHT; }
// public void MAX_RANDOM_HEIGHT(int value) { wrapperContained.MAX_RANDOM_HEIGHT = value; }
public java.util.List generate(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,int height,yarnwrap.util.math.BlockPos startPos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.generate(world.wrapperContained,replacer,random.wrapperContained,height,startPos.wrapperContained,config.wrapperContained); }
public int getHeight(yarnwrap.util.math.random.Random random) { return wrapperContained.getHeight(random.wrapperContained); }
// public void setToDirt(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { wrapperContained.setToDirt(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public void trySetState(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,Object pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { wrapperContained.trySetState(world.wrapperContained,replacer,random.wrapperContained,pos,config.wrapperContained); }
// public boolean getAndSetState(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.getAndSetState(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public boolean canGenerate(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canGenerate(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.world.gen.trunk.TrunkPlacerType getType() { return new yarnwrap.world.gen.trunk.TrunkPlacerType(wrapperContained.getType()); }
// public Object fillTrunkPlacerFields(Object instance) { return wrapperContained.fillTrunkPlacerFields(instance); }
// // public boolean getAndSetState(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.getAndSetState(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public boolean canReplace(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canReplace(world.wrapperContained,pos.wrapperContained); }
public boolean canReplaceOrIsLog(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canReplaceOrIsLog(world.wrapperContained,pos.wrapperContained); }

}