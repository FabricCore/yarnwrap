package yarnwrap.world.dimension;
public class DimensionTypes { public net.minecraft.world.dimension.DimensionTypes wrapperContained; public DimensionTypes(net.minecraft.world.dimension.DimensionTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier OVERWORLD_ID() { return new yarnwrap.util.Identifier(wrapperContained.OVERWORLD_ID); }
// public void OVERWORLD_ID(yarnwrap.util.Identifier value) { wrapperContained.OVERWORLD_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier OVERWORLD_ID() { return new yarnwrap.util.Identifier(net.minecraft.world.dimension.DimensionTypes.OVERWORLD_ID); }
// public static void OVERWORLD_ID(yarnwrap.util.Identifier value, ) { net.minecraft.world.dimension.DimensionTypes.OVERWORLD_ID = value.wrapperContained; }

// public yarnwrap.util.Identifier THE_NETHER_ID() { return new yarnwrap.util.Identifier(wrapperContained.THE_NETHER_ID); }
// public void THE_NETHER_ID(yarnwrap.util.Identifier value) { wrapperContained.THE_NETHER_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier THE_NETHER_ID() { return new yarnwrap.util.Identifier(net.minecraft.world.dimension.DimensionTypes.THE_NETHER_ID); }
// public static void THE_NETHER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.world.dimension.DimensionTypes.THE_NETHER_ID = value.wrapperContained; }

// public yarnwrap.util.Identifier THE_END_ID() { return new yarnwrap.util.Identifier(wrapperContained.THE_END_ID); }
// public void THE_END_ID(yarnwrap.util.Identifier value) { wrapperContained.THE_END_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier THE_END_ID() { return new yarnwrap.util.Identifier(net.minecraft.world.dimension.DimensionTypes.THE_END_ID); }
// public static void THE_END_ID(yarnwrap.util.Identifier value, ) { net.minecraft.world.dimension.DimensionTypes.THE_END_ID = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.world.dimension.DimensionTypes.of(id)); }

}