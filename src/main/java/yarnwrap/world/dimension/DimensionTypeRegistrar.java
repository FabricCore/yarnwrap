package yarnwrap.world.dimension;
public class DimensionTypeRegistrar { public net.minecraft.world.dimension.DimensionTypeRegistrar wrapperContained; public DimensionTypeRegistrar(net.minecraft.world.dimension.DimensionTypeRegistrar wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable dimensionTypeRegisterable) { wrapperContained.bootstrap(dimensionTypeRegisterable.wrapperContained); }

}