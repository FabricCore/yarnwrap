package yarnwrap.world.gen.feature;
public class GeodeLayerThicknessConfig { public net.minecraft.world.gen.feature.GeodeLayerThicknessConfig wrapperContained; public GeodeLayerThicknessConfig(net.minecraft.world.gen.feature.GeodeLayerThicknessConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public double filling() { return wrapperContained.filling; }
// public void filling(double value) { wrapperContained.filling = value; }
public double innerLayer() { return wrapperContained.innerLayer; }
// public void innerLayer(double value) { wrapperContained.innerLayer = value; }
public double middleLayer() { return wrapperContained.middleLayer; }
// public void middleLayer(double value) { wrapperContained.middleLayer = value; }
public double outerLayer() { return wrapperContained.outerLayer; }
// public void outerLayer(double value) { wrapperContained.outerLayer = value; }
// public com.mojang.serialization.Codec RANGE() { return wrapperContained.RANGE; }
// public void RANGE(com.mojang.serialization.Codec value) { wrapperContained.RANGE = value; }
public GeodeLayerThicknessConfig(double filling,double innerLayer,double middleLayer,double outerLayer) { this.wrapperContained = new net.minecraft.world.gen.feature.GeodeLayerThicknessConfig(filling,innerLayer,middleLayer,outerLayer); }
// public java.lang.Double method_31897(yarnwrap.world.gen.feature.GeodeLayerThicknessConfig config) { return wrapperContained.method_31897(config.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_31898(Object instance) { return wrapperContained.method_31898(instance); }
// public java.lang.Double method_31899(yarnwrap.world.gen.feature.GeodeLayerThicknessConfig config) { return wrapperContained.method_31899(config.wrapperContained); }
// public java.lang.Double method_31900(yarnwrap.world.gen.feature.GeodeLayerThicknessConfig config) { return wrapperContained.method_31900(config.wrapperContained); }
// public java.lang.Double method_31901(yarnwrap.world.gen.feature.GeodeLayerThicknessConfig config) { return wrapperContained.method_31901(config.wrapperContained); }

}