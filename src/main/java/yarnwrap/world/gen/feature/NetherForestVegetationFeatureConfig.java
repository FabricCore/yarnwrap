package yarnwrap.world.gen.feature;
public class NetherForestVegetationFeatureConfig { public net.minecraft.world.gen.feature.NetherForestVegetationFeatureConfig wrapperContained; public NetherForestVegetationFeatureConfig(net.minecraft.world.gen.feature.NetherForestVegetationFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec VEGETATION_CODEC() { return wrapperContained.VEGETATION_CODEC; }
// public void VEGETATION_CODEC(com.mojang.serialization.Codec value) { wrapperContained.VEGETATION_CODEC = value; }
public int spreadWidth() { return wrapperContained.spreadWidth; }
// public void spreadWidth(int value) { wrapperContained.spreadWidth = value; }
public int spreadHeight() { return wrapperContained.spreadHeight; }
// public void spreadHeight(int value) { wrapperContained.spreadHeight = value; }
public NetherForestVegetationFeatureConfig(yarnwrap.world.gen.stateprovider.BlockStateProvider stateProvider,int spreadWidth,int spreadHeight) { this.wrapperContained = new net.minecraft.world.gen.feature.NetherForestVegetationFeatureConfig(stateProvider.wrapperContained,spreadWidth,spreadHeight); }
// public java.lang.Integer method_39608(yarnwrap.world.gen.feature.NetherForestVegetationFeatureConfig config) { return wrapperContained.method_39608(config.wrapperContained); }
// public java.lang.Integer method_39609(yarnwrap.world.gen.feature.NetherForestVegetationFeatureConfig config) { return wrapperContained.method_39609(config.wrapperContained); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_39610(yarnwrap.world.gen.feature.NetherForestVegetationFeatureConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_39610(config.wrapperContained)); }

}