package yarnwrap.world.gen.chunk.placement;
public class ConcentricRingsStructurePlacement { public net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement wrapperContained; public ConcentricRingsStructurePlacement(net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public int distance() { return wrapperContained.distance; }
// public void distance(int value) { wrapperContained.distance = value; }
// public int spread() { return wrapperContained.spread; }
// public void spread(int value) { wrapperContained.spread = value; }
// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public yarnwrap.registry.entry.RegistryEntryList preferredBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.preferredBiomes); }
// public void preferredBiomes(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.preferredBiomes = value.wrapperContained; }
public int getDistance() { return wrapperContained.getDistance(); }
public int getSpread() { return wrapperContained.getSpread(); }
// public Object buildConcentricRingsCodec(Object instance) { return wrapperContained.buildConcentricRingsCodec(instance); }
public int getCount() { return wrapperContained.getCount(); }
public yarnwrap.registry.entry.RegistryEntryList getPreferredBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.getPreferredBiomes()); }

}