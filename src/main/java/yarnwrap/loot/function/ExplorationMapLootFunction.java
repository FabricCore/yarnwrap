package yarnwrap.loot.function;
public class ExplorationMapLootFunction { public net.minecraft.loot.function.ExplorationMapLootFunction wrapperContained; public ExplorationMapLootFunction(net.minecraft.loot.function.ExplorationMapLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public int searchRadius() { return wrapperContained.searchRadius; }
// public void searchRadius(int value) { wrapperContained.searchRadius = value; }
// public static int searchRadius() { return net.minecraft.loot.function.ExplorationMapLootFunction.searchRadius; }
// public static void searchRadius(int value, ) { net.minecraft.loot.function.ExplorationMapLootFunction.searchRadius = value; }

// public boolean skipExistingChunks() { return wrapperContained.skipExistingChunks; }
// public void skipExistingChunks(boolean value) { wrapperContained.skipExistingChunks = value; }
// public static boolean skipExistingChunks() { return net.minecraft.loot.function.ExplorationMapLootFunction.skipExistingChunks; }
// public static void skipExistingChunks(boolean value, ) { net.minecraft.loot.function.ExplorationMapLootFunction.skipExistingChunks = value; }

// public yarnwrap.registry.entry.RegistryEntry DEFAULT_DECORATION() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.DEFAULT_DECORATION); }
// public void DEFAULT_DECORATION(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.DEFAULT_DECORATION = value.wrapperContained; }
public static yarnwrap.registry.entry.RegistryEntry DEFAULT_DECORATION() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.loot.function.ExplorationMapLootFunction.DEFAULT_DECORATION); }
// public static void DEFAULT_DECORATION(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.loot.function.ExplorationMapLootFunction.DEFAULT_DECORATION = value.wrapperContained; }

// public yarnwrap.registry.tag.TagKey destination() { return new yarnwrap.registry.tag.TagKey(wrapperContained.destination); }
// public void destination(yarnwrap.registry.tag.TagKey value) { wrapperContained.destination = value.wrapperContained; }
// public static yarnwrap.registry.tag.TagKey destination() { return new yarnwrap.registry.tag.TagKey(net.minecraft.loot.function.ExplorationMapLootFunction.destination); }
// public static void destination(yarnwrap.registry.tag.TagKey value, ) { net.minecraft.loot.function.ExplorationMapLootFunction.destination = value.wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry decoration() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.decoration); }
// public void decoration(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.decoration = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry decoration() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.loot.function.ExplorationMapLootFunction.decoration); }
// public static void decoration(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.loot.function.ExplorationMapLootFunction.decoration = value.wrapperContained; }

// public byte zoom() { return wrapperContained.zoom; }
// public void zoom(byte value) { wrapperContained.zoom = value; }
// public static byte zoom() { return net.minecraft.loot.function.ExplorationMapLootFunction.zoom; }
// public static void zoom(byte value, ) { net.minecraft.loot.function.ExplorationMapLootFunction.zoom = value; }

// public yarnwrap.registry.tag.TagKey DEFAULT_DESTINATION() { return new yarnwrap.registry.tag.TagKey(wrapperContained.DEFAULT_DESTINATION); }
// public void DEFAULT_DESTINATION(yarnwrap.registry.tag.TagKey value) { wrapperContained.DEFAULT_DESTINATION = value.wrapperContained; }
public static yarnwrap.registry.tag.TagKey DEFAULT_DESTINATION() { return new yarnwrap.registry.tag.TagKey(net.minecraft.loot.function.ExplorationMapLootFunction.DEFAULT_DESTINATION); }
// public static void DEFAULT_DESTINATION(yarnwrap.registry.tag.TagKey value, ) { net.minecraft.loot.function.ExplorationMapLootFunction.DEFAULT_DESTINATION = value.wrapperContained; }

// public byte DEFAULT_ZOOM() { return wrapperContained.DEFAULT_ZOOM; }
// public void DEFAULT_ZOOM(byte value) { wrapperContained.DEFAULT_ZOOM = value; }
public static byte DEFAULT_ZOOM() { return net.minecraft.loot.function.ExplorationMapLootFunction.DEFAULT_ZOOM; }
// public static void DEFAULT_ZOOM(byte value, ) { net.minecraft.loot.function.ExplorationMapLootFunction.DEFAULT_ZOOM = value; }

// public int DEFAULT_SEARCH_RADIUS() { return wrapperContained.DEFAULT_SEARCH_RADIUS; }
// public void DEFAULT_SEARCH_RADIUS(int value) { wrapperContained.DEFAULT_SEARCH_RADIUS = value; }
public static int DEFAULT_SEARCH_RADIUS() { return net.minecraft.loot.function.ExplorationMapLootFunction.DEFAULT_SEARCH_RADIUS; }
// public static void DEFAULT_SEARCH_RADIUS(int value, ) { net.minecraft.loot.function.ExplorationMapLootFunction.DEFAULT_SEARCH_RADIUS = value; }

// public boolean DEFAULT_SKIP_EXISTING_CHUNKS() { return wrapperContained.DEFAULT_SKIP_EXISTING_CHUNKS; }
// public void DEFAULT_SKIP_EXISTING_CHUNKS(boolean value) { wrapperContained.DEFAULT_SKIP_EXISTING_CHUNKS = value; }
public static boolean DEFAULT_SKIP_EXISTING_CHUNKS() { return net.minecraft.loot.function.ExplorationMapLootFunction.DEFAULT_SKIP_EXISTING_CHUNKS; }
// public static void DEFAULT_SKIP_EXISTING_CHUNKS(boolean value, ) { net.minecraft.loot.function.ExplorationMapLootFunction.DEFAULT_SKIP_EXISTING_CHUNKS = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.ExplorationMapLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.ExplorationMapLootFunction.CODEC = value; }

// public ExplorationMapLootFunction(java.util.List conditions,yarnwrap.registry.tag.TagKey destination,yarnwrap.registry.entry.RegistryEntry decoration,byte zoom,int searchRadius,boolean skipExistingChunks) { this.wrapperContained = new net.minecraft.loot.function.ExplorationMapLootFunction(conditions,destination.wrapperContained,decoration.wrapperContained,zoom,searchRadius,skipExistingChunks); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.loot.function.ExplorationMapLootFunction.builder(); }
// public java.lang.Boolean method_53332(yarnwrap.loot.function.ExplorationMapLootFunction function) { return wrapperContained.method_53332(function.wrapperContained); }
// public static java.lang.Boolean method_53332(yarnwrap.loot.function.ExplorationMapLootFunction function, ) { return net.minecraft.loot.function.ExplorationMapLootFunction.method_53332(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53333(Object instance) { return wrapperContained.method_53333(instance); }
// public static com.mojang.datafixers.kinds.App method_53333(Object instance, ) { return net.minecraft.loot.function.ExplorationMapLootFunction.method_53333(instance); }
// public java.lang.Integer method_53334(yarnwrap.loot.function.ExplorationMapLootFunction function) { return wrapperContained.method_53334(function.wrapperContained); }
// public static java.lang.Integer method_53334(yarnwrap.loot.function.ExplorationMapLootFunction function, ) { return net.minecraft.loot.function.ExplorationMapLootFunction.method_53334(function.wrapperContained); }
// public java.lang.Byte method_53335(yarnwrap.loot.function.ExplorationMapLootFunction function) { return wrapperContained.method_53335(function.wrapperContained); }
// public static java.lang.Byte method_53335(yarnwrap.loot.function.ExplorationMapLootFunction function, ) { return net.minecraft.loot.function.ExplorationMapLootFunction.method_53335(function.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_53336(yarnwrap.loot.function.ExplorationMapLootFunction function) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_53336(function.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_53336(yarnwrap.loot.function.ExplorationMapLootFunction function, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.loot.function.ExplorationMapLootFunction.method_53336(function.wrapperContained)); }
// public yarnwrap.registry.tag.TagKey method_53337(yarnwrap.loot.function.ExplorationMapLootFunction function) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_53337(function.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_53337(yarnwrap.loot.function.ExplorationMapLootFunction function, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.loot.function.ExplorationMapLootFunction.method_53337(function.wrapperContained)); }

}