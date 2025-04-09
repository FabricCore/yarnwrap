package yarnwrap.world.gen.feature;
public class GeodeLayerThicknessConfig { public net.minecraft.world.gen.feature.GeodeLayerThicknessConfig wrapperContained; public GeodeLayerThicknessConfig(net.minecraft.world.gen.feature.GeodeLayerThicknessConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public double filling() { return wrapperContained.filling; }
public double innerLayer() { return wrapperContained.innerLayer; }
public double middleLayer() { return wrapperContained.middleLayer; }
public double outerLayer() { return wrapperContained.outerLayer; }
// public com.mojang.serialization.Codec RANGE() { return wrapperContained.RANGE; }

}