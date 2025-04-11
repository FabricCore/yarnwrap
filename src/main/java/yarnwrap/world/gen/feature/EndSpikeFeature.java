package yarnwrap.world.gen.feature;
public class EndSpikeFeature { public net.minecraft.world.gen.feature.EndSpikeFeature wrapperContained; public EndSpikeFeature(net.minecraft.world.gen.feature.EndSpikeFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.cache.LoadingCache CACHE() { return wrapperContained.CACHE; }
// public void CACHE(com.google.common.cache.LoadingCache value) { wrapperContained.CACHE = value; }
public int COUNT() { return wrapperContained.COUNT; }
// public void COUNT(int value) { wrapperContained.COUNT = value; }
// public int DISTANCE_FROM_ORIGIN() { return wrapperContained.DISTANCE_FROM_ORIGIN; }
// public void DISTANCE_FROM_ORIGIN(int value) { wrapperContained.DISTANCE_FROM_ORIGIN = value; }
public java.util.List getSpikes(yarnwrap.world.StructureWorldAccess world) { return wrapperContained.getSpikes(world.wrapperContained); }
// public void generateSpike(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.feature.EndSpikeFeatureConfig config,Object spike) { wrapperContained.generateSpike(world.wrapperContained,random.wrapperContained,config.wrapperContained,spike); }

}