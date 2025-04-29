package yarnwrap.world.gen.chunk.placement;
public class ConcentricRingsStructurePlacement { public net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement wrapperContained; public ConcentricRingsStructurePlacement(net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.CODEC = value; }

// public int distance() { return wrapperContained.distance; }
// public void distance(int value) { wrapperContained.distance = value; }
// public static int distance() { return net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.distance; }
// public static void distance(int value, ) { net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.distance = value; }

// public int spread() { return wrapperContained.spread; }
// public void spread(int value) { wrapperContained.spread = value; }
// public static int spread() { return net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.spread; }
// public static void spread(int value, ) { net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.spread = value; }

// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public static int count() { return net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.count; }
// public static void count(int value, ) { net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.count = value; }

// public yarnwrap.registry.entry.RegistryEntryList preferredBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.preferredBiomes); }
// public void preferredBiomes(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.preferredBiomes = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntryList preferredBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.preferredBiomes); }
// public static void preferredBiomes(yarnwrap.registry.entry.RegistryEntryList value, ) { net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.preferredBiomes = value.wrapperContained; }

public ConcentricRingsStructurePlacement(int distance,int spread,int structureCount,yarnwrap.registry.entry.RegistryEntryList preferredBiomes) { this.wrapperContained = new net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement(distance,spread,structureCount,preferredBiomes.wrapperContained); }
// public ConcentricRingsStructurePlacement(yarnwrap.util.math.Vec3i locateOffset,Object generationPredicateType,float frequency,int salt,java.util.Optional exclusionZone,int distance,int spread,int structureCount,yarnwrap.registry.entry.RegistryEntryList preferredBiomes) { this.wrapperContained = new net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement(locateOffset.wrapperContained,generationPredicateType,frequency,salt,exclusionZone,distance,spread,structureCount,preferredBiomes.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_40167(Object instance) { return wrapperContained.method_40167(instance); }
// public static com.mojang.datafixers.kinds.App method_40167(Object instance, ) { return net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.method_40167(instance); }
public int getDistance() { return wrapperContained.getDistance(); }
// public static int getDistance() { return net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.getDistance(); }
public int getSpread() { return wrapperContained.getSpread(); }
// public static int getSpread() { return net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.getSpread(); }
// public Object buildConcentricRingsCodec(Object instance) { return wrapperContained.buildConcentricRingsCodec(instance); }
// public static Object buildConcentricRingsCodec(Object instance, ) { return net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.buildConcentricRingsCodec(instance); }
public int getCount() { return wrapperContained.getCount(); }
// public static int getCount() { return net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.getCount(); }
public yarnwrap.registry.entry.RegistryEntryList getPreferredBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.getPreferredBiomes()); }
// public static yarnwrap.registry.entry.RegistryEntryList getPreferredBiomes() { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.world.gen.chunk.placement.ConcentricRingsStructurePlacement.getPreferredBiomes()); }

}