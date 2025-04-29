package yarnwrap.world.event;
public class GameEvent { public net.minecraft.world.event.GameEvent wrapperContained; public GameEvent(net.minecraft.world.event.GameEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_RANGE() { return wrapperContained.DEFAULT_RANGE; }
// public void DEFAULT_RANGE(int value) { wrapperContained.DEFAULT_RANGE = value; }
public static int DEFAULT_RANGE() { return net.minecraft.world.event.GameEvent.DEFAULT_RANGE; }
// public static void DEFAULT_RANGE(int value, ) { net.minecraft.world.event.GameEvent.DEFAULT_RANGE = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.event.GameEvent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.event.GameEvent.CODEC = value; }

public GameEvent(int range) { this.wrapperContained = new net.minecraft.world.event.GameEvent(range); }
// public Object register(java.lang.String id) { return wrapperContained.register(id); }
// public static Object register(java.lang.String id, ) { return net.minecraft.world.event.GameEvent.register(id); }
// public Object register(java.lang.String id,int range) { return wrapperContained.register(id,range); }
// public static Object register(java.lang.String id,int range, ) { return net.minecraft.world.event.GameEvent.register(id,range); }
// public yarnwrap.registry.entry.RegistryEntry registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.event.GameEvent.registerAndGetDefault(registry.wrapperContained)); }

}