package yarnwrap.world.gen.trunk;
public class GiantTrunkPlacer { public net.minecraft.world.gen.trunk.GiantTrunkPlacer wrapperContained; public GiantTrunkPlacer(net.minecraft.world.gen.trunk.GiantTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void setLog(yarnwrap.world.TestableWorld world,java.util.function.BiConsumer replacer,yarnwrap.util.math.random.Random random,Object tmpPos,yarnwrap.world.gen.feature.TreeFeatureConfig config,yarnwrap.util.math.BlockPos startPos,int dx,int dy,int dz) { wrapperContained.setLog(world.wrapperContained,replacer,random.wrapperContained,tmpPos,config.wrapperContained,startPos.wrapperContained,dx,dy,dz); }
// public com.mojang.datafixers.kinds.App method_28900(Object instance) { return wrapperContained.method_28900(instance); }

}