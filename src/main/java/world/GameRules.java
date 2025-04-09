package yarnwrap.world;
public class GameRules { public net.minecraft.world.GameRules wrapperContained; public GameRules(net.minecraft.world.GameRules wrapperContained) { this.wrapperContained = wrapperContained; }

public Object DO_MOB_GRIEFING() { return wrapperContained.DO_MOB_GRIEFING; }
public Object KEEP_INVENTORY() { return wrapperContained.KEEP_INVENTORY; }
public Object DO_MOB_SPAWNING() { return wrapperContained.DO_MOB_SPAWNING; }
public Object DO_MOB_LOOT() { return wrapperContained.DO_MOB_LOOT; }
public Object DO_TILE_DROPS() { return wrapperContained.DO_TILE_DROPS; }
public Object REDUCED_DEBUG_INFO() { return wrapperContained.REDUCED_DEBUG_INFO; }
public Object MAX_ENTITY_CRAMMING() { return wrapperContained.MAX_ENTITY_CRAMMING; }
public Object ANNOUNCE_ADVANCEMENTS() { return wrapperContained.ANNOUNCE_ADVANCEMENTS; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public Object DISABLE_RAIDS() { return wrapperContained.DISABLE_RAIDS; }
public Object DO_IMMEDIATE_RESPAWN() { return wrapperContained.DO_IMMEDIATE_RESPAWN; }
public int DEFAULT_RANDOM_TICK_SPEED() { return wrapperContained.DEFAULT_RANDOM_TICK_SPEED; }
// public java.util.Map rules() { return wrapperContained.rules; }
// public java.util.Map RULE_TYPES() { return wrapperContained.RULE_TYPES; }
// public void accept(Object visitor) { wrapperContained.accept(visitor); }
// public void accept(Object consumer,Object key,Object type) { wrapperContained.accept(consumer,key,type); }
// public Object get(Object key) { return wrapperContained.get(key); }
// public void setValue(Object key,yarnwrap.world.GameRules rules,yarnwrap.server.MinecraftServer server) { wrapperContained.setValue(key,rules.wrapperContained,server.wrapperContained); }
public void setAllValues(yarnwrap.world.GameRules rules,yarnwrap.server.MinecraftServer server) { wrapperContained.setAllValues(rules.wrapperContained,server.wrapperContained); }
public yarnwrap.world.GameRules copy() { return new yarnwrap.world.GameRules(wrapperContained.copy()); }
// public boolean getBoolean(Object rule) { return wrapperContained.getBoolean(rule); }
// public int getInt(Object rule) { return wrapperContained.getInt(rule); }
// public void load(com.mojang.serialization.DynamicLike dynamic) { wrapperContained.load(dynamic); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public Object register(java.lang.String name,Object category,Object type) { return wrapperContained.register(name,category,type); }

}