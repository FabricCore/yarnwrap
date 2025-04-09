package yarnwrap.world.gen.chunk.placement;
public class ConcentricRingsStructurePlacement { public net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement wrapperContained; public ConcentricRingsStructurePlacement(net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public int distance() { return wrapperContained.distance; }
// public int spread() { return wrapperContained.spread; }
// public int count() { return wrapperContained.count; }
// public yarnwrap.registry.entry.RegistryEntryList preferredBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.preferredBiomes); }
public int getDistance() { return wrapperContained.getDistance(); }
public int getSpread() { return wrapperContained.getSpread(); }
// public Object buildConcentricRingsCodec(Object instance) { return wrapperContained.buildConcentricRingsCodec(instance); }
public int getCount() { return wrapperContained.getCount(); }
public yarnwrap.registry.entry.RegistryEntryList getPreferredBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.getPreferredBiomes()); }

}