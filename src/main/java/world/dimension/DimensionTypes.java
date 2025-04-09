package yarnwrap.world.dimension;
public class DimensionTypes { public net.minecraft.world.dimension.DimensionTypes wrapperContained; public DimensionTypes(net.minecraft.world.dimension.DimensionTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier OVERWORLD_ID() { return new yarnwrap.util.Identifier(wrapperContained.OVERWORLD_ID); }
public yarnwrap.util.Identifier THE_NETHER_ID() { return new yarnwrap.util.Identifier(wrapperContained.THE_NETHER_ID); }
public yarnwrap.util.Identifier THE_END_ID() { return new yarnwrap.util.Identifier(wrapperContained.THE_END_ID); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }

}