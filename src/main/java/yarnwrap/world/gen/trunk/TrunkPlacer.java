package yarnwrap.world.gen.trunk;
public class TrunkPlacer { public net.minecraft.world.gen.trunk.TrunkPlacer wrapperContained; public TrunkPlacer(net.minecraft.world.gen.trunk.TrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int baseHeight() { return wrapperContained.baseHeight; }
// public void baseHeight(int value) { wrapperContained.baseHeight = value; }
// public static int baseHeight() { return net.minecraft.world.gen.trunk.TrunkPlacer.baseHeight; }
// public static void baseHeight(int value, ) { net.minecraft.world.gen.trunk.TrunkPlacer.baseHeight = value; }

// public int firstRandomHeight() { return wrapperContained.firstRandomHeight; }
// public void firstRandomHeight(int value) { wrapperContained.firstRandomHeight = value; }
// public static int firstRandomHeight() { return net.minecraft.world.gen.trunk.TrunkPlacer.firstRandomHeight; }
// public static void firstRandomHeight(int value, ) { net.minecraft.world.gen.trunk.TrunkPlacer.firstRandomHeight = value; }

// public int secondRandomHeight() { return wrapperContained.secondRandomHeight; }
// public void secondRandomHeight(int value) { wrapperContained.secondRandomHeight = value; }
// public static int secondRandomHeight() { return net.minecraft.world.gen.trunk.TrunkPlacer.secondRandomHeight; }
// public static void secondRandomHeight(int value, ) { net.minecraft.world.gen.trunk.TrunkPlacer.secondRandomHeight = value; }

// public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
public static com.mojang.serialization.Codec TYPE_CODEC() { return net.minecraft.world.gen.trunk.TrunkPlacer.TYPE_CODEC; }
// public static void TYPE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.trunk.TrunkPlacer.TYPE_CODEC = value; }

// public int MAX_BASE_HEIGHT() { return wrapperContained.MAX_BASE_HEIGHT; }
// public void MAX_BASE_HEIGHT(int value) { wrapperContained.MAX_BASE_HEIGHT = value; }
// public static int MAX_BASE_HEIGHT() { return net.minecraft.world.gen.trunk.TrunkPlacer.MAX_BASE_HEIGHT; }
// public static void MAX_BASE_HEIGHT(int value, ) { net.minecraft.world.gen.trunk.TrunkPlacer.MAX_BASE_HEIGHT = value; }

// public int MAX_RANDOM_HEIGHT() { return wrapperContained.MAX_RANDOM_HEIGHT; }
// public void MAX_RANDOM_HEIGHT(int value) { wrapperContained.MAX_RANDOM_HEIGHT = value; }
// public static int MAX_RANDOM_HEIGHT() { return net.minecraft.world.gen.trunk.TrunkPlacer.MAX_RANDOM_HEIGHT; }
// public static void MAX_RANDOM_HEIGHT(int value, ) { net.minecraft.world.gen.trunk.TrunkPlacer.MAX_RANDOM_HEIGHT = value; }

// public TrunkPlacer(int baseHeight,int firstRandomHeight,int secondRandomHeight) { this.wrapperContained = new net.minecraft.world.gen.trunk.TrunkPlacer(baseHeight,firstRandomHeight,secondRandomHeight); }
public java.util.List generate(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,int height,yarnwrap.util.math.BlockPos startPos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.generate(world.wrapperContained,replacer,random.wrapperContained,height,startPos.wrapperContained,config.wrapperContained); }
// public static java.util.List generate(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,int height,yarnwrap.util.math.BlockPos startPos,yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.generate(world.wrapperContained,replacer,random.wrapperContained,height,startPos.wrapperContained,config.wrapperContained); }
public int getHeight(yarnwrap.util.math.random.Random random) { return wrapperContained.getHeight(random.wrapperContained); }
// public static int getHeight(yarnwrap.util.math.random.Random random, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.getHeight(random.wrapperContained); }
// public void setToDirt(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { wrapperContained.setToDirt(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public static void setToDirt(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { net.minecraft.world.gen.trunk.TrunkPlacer.setToDirt(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public void trySetState(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,Object pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { wrapperContained.trySetState(world.wrapperContained,replacer,random.wrapperContained,pos,config.wrapperContained); }
// public static void trySetState(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,Object pos,yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { net.minecraft.world.gen.trunk.TrunkPlacer.trySetState(world.wrapperContained,replacer,random.wrapperContained,pos,config.wrapperContained); }
// public boolean getAndSetState(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.getAndSetState(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public static boolean getAndSetState(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.getAndSetState(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public boolean canGenerate(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canGenerate(world.wrapperContained,pos.wrapperContained); }
// public static boolean canGenerate(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.canGenerate(world.wrapperContained,pos.wrapperContained); }
// public boolean method_27405(yarnwrap.block.BlockState state) { return wrapperContained.method_27405(state.wrapperContained); }
// public static boolean method_27405(yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.method_27405(state.wrapperContained); }
// public yarnwrap.world.gen.trunk.TrunkPlacerType getType() { return new yarnwrap.world.gen.trunk.TrunkPlacerType(wrapperContained.getType()); }
// public static yarnwrap.world.gen.trunk.TrunkPlacerType getType() { return new yarnwrap.world.gen.trunk.TrunkPlacerType(net.minecraft.world.gen.trunk.TrunkPlacer.getType()); }
// public Object fillTrunkPlacerFields(Object instance) { return wrapperContained.fillTrunkPlacerFields(instance); }
// public static Object fillTrunkPlacerFields(Object instance, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.fillTrunkPlacerFields(instance); }
// public java.lang.Integer method_28905(yarnwrap.world.gen.trunk.TrunkPlacer placer) { return wrapperContained.method_28905(placer.wrapperContained); }
// public static java.lang.Integer method_28905(yarnwrap.world.gen.trunk.TrunkPlacer placer, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.method_28905(placer.wrapperContained); }
// public java.lang.Integer method_28906(yarnwrap.world.gen.trunk.TrunkPlacer placer) { return wrapperContained.method_28906(placer.wrapperContained); }
// public static java.lang.Integer method_28906(yarnwrap.world.gen.trunk.TrunkPlacer placer, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.method_28906(placer.wrapperContained); }
// public java.lang.Integer method_28907(yarnwrap.world.gen.trunk.TrunkPlacer placer) { return wrapperContained.method_28907(placer.wrapperContained); }
// public static java.lang.Integer method_28907(yarnwrap.world.gen.trunk.TrunkPlacer placer, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.method_28907(placer.wrapperContained); }
// // public boolean getAndSetState(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.getAndSetState(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// // public static boolean getAndSetState(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.getAndSetState(world.wrapperContained,replacer,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public boolean canReplace(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canReplace(world.wrapperContained,pos.wrapperContained); }
// public static boolean canReplace(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.canReplace(world.wrapperContained,pos.wrapperContained); }
// public boolean method_43197(yarnwrap.block.BlockState state) { return wrapperContained.method_43197(state.wrapperContained); }
// public static boolean method_43197(yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.method_43197(state.wrapperContained); }
public boolean canReplaceOrIsLog(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canReplaceOrIsLog(world.wrapperContained,pos.wrapperContained); }
// public static boolean canReplaceOrIsLog(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.trunk.TrunkPlacer.canReplaceOrIsLog(world.wrapperContained,pos.wrapperContained); }

}