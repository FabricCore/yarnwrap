package yarnwrap.world.gen.feature;
public class EndGatewayFeatureConfig { public net.minecraft.world.gen.feature.EndGatewayFeatureConfig wrapperContained; public EndGatewayFeatureConfig(net.minecraft.world.gen.feature.EndGatewayFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean exact() { return wrapperContained.exact; }
// public void exact(boolean value) { wrapperContained.exact = value; }
// public java.util.Optional exitPos() { return wrapperContained.exitPos; }
// public void exitPos(java.util.Optional value) { wrapperContained.exitPos = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public boolean isExact() { return wrapperContained.isExact(); }
public yarnwrap.world.gen.feature.EndGatewayFeatureConfig createConfig() { return new yarnwrap.world.gen.feature.EndGatewayFeatureConfig(wrapperContained.createConfig()); }
public yarnwrap.world.gen.feature.EndGatewayFeatureConfig createConfig(yarnwrap.util.math.BlockPos exitPortalPosition,boolean exitsAtSpawn) { return new yarnwrap.world.gen.feature.EndGatewayFeatureConfig(wrapperContained.createConfig(exitPortalPosition.wrapperContained,exitsAtSpawn)); }
public java.util.Optional getExitPos() { return wrapperContained.getExitPos(); }

}