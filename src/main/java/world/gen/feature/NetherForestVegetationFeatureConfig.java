package yarnwrap.world.gen.feature;
public class NetherForestVegetationFeatureConfig { public net.minecraft.world.gen.feature.NetherForestVegetationFeatureConfig wrapperContained; public NetherForestVegetationFeatureConfig(net.minecraft.world.gen.feature.NetherForestVegetationFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec VEGETATION_CODEC() { return wrapperContained.VEGETATION_CODEC; }
public int spreadWidth() { return wrapperContained.spreadWidth; }
public int spreadHeight() { return wrapperContained.spreadHeight; }

}