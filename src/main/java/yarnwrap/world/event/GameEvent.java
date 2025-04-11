package yarnwrap.world.event;
public class GameEvent { public net.minecraft.world.event.GameEvent wrapperContained; public GameEvent(net.minecraft.world.event.GameEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public int DEFAULT_RANGE() { return wrapperContained.DEFAULT_RANGE; }
// public void DEFAULT_RANGE(int value) { wrapperContained.DEFAULT_RANGE = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public Object register(java.lang.String id) { return wrapperContained.register(id); }
// public Object register(java.lang.String id,int range) { return wrapperContained.register(id,range); }
public yarnwrap.registry.entry.RegistryEntry registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }

}