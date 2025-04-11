package yarnwrap.world.gen.trunk;
public class UpwardsBranchingTrunkPlacer { public net.minecraft.world.gen.trunk.UpwardsBranchingTrunkPlacer wrapperContained; public UpwardsBranchingTrunkPlacer(net.minecraft.world.gen.trunk.UpwardsBranchingTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.intprovider.IntProvider extraBranchSteps() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.extraBranchSteps); }
// public void extraBranchSteps(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.extraBranchSteps = value.wrapperContained; }
// public float placeBranchPerLogProbability() { return wrapperContained.placeBranchPerLogProbability; }
// public void placeBranchPerLogProbability(float value) { wrapperContained.placeBranchPerLogProbability = value; }
// public yarnwrap.util.math.intprovider.IntProvider extraBranchLength() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.extraBranchLength); }
// public void extraBranchLength(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.extraBranchLength = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntryList canGrowThrough() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.canGrowThrough); }
// public void canGrowThrough(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.canGrowThrough = value.wrapperContained; }
// public void generateExtraBranch(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,int height,yarnwrap.world.gen.feature.TreeFeatureConfig config,java.util.List nodes,Object pos,int yOffset,yarnwrap.util.math.Direction direction,int length,int steps) { wrapperContained.generateExtraBranch(world.wrapperContained,replacer,random.wrapperContained,height,config.wrapperContained,nodes,pos,yOffset,direction.wrapperContained,length,steps); }

}