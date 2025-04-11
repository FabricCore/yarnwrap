package yarnwrap.world.gen.feature;
public class NetherForestVegetationFeatureConfig { public net.minecraft.world.gen.feature.NetherForestVegetationFeatureConfig wrapperContained; public NetherForestVegetationFeatureConfig(net.minecraft.world.gen.feature.NetherForestVegetationFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec VEGETATION_CODEC() { return wrapperContained.VEGETATION_CODEC; }
// public void VEGETATION_CODEC(com.mojang.serialization.Codec value) { wrapperContained.VEGETATION_CODEC = value; }
public int spreadWidth() { return wrapperContained.spreadWidth; }
// public void spreadWidth(int value) { wrapperContained.spreadWidth = value; }
public int spreadHeight() { return wrapperContained.spreadHeight; }
// public void spreadHeight(int value) { wrapperContained.spreadHeight = value; }

}