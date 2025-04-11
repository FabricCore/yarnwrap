package yarnwrap.world;
public class GameRules { public net.minecraft.world.GameRules wrapperContained; public GameRules(net.minecraft.world.GameRules wrapperContained) { this.wrapperContained = wrapperContained; }

public Object DO_MOB_GRIEFING() { return wrapperContained.DO_MOB_GRIEFING; }
// // public void DO_MOB_GRIEFING(Object value) { wrapperContained.DO_MOB_GRIEFING = value; }
public Object KEEP_INVENTORY() { return wrapperContained.KEEP_INVENTORY; }
// // public void KEEP_INVENTORY(Object value) { wrapperContained.KEEP_INVENTORY = value; }
public Object DO_MOB_SPAWNING() { return wrapperContained.DO_MOB_SPAWNING; }
// // public void DO_MOB_SPAWNING(Object value) { wrapperContained.DO_MOB_SPAWNING = value; }
public Object DO_MOB_LOOT() { return wrapperContained.DO_MOB_LOOT; }
// // public void DO_MOB_LOOT(Object value) { wrapperContained.DO_MOB_LOOT = value; }
public Object DO_TILE_DROPS() { return wrapperContained.DO_TILE_DROPS; }
// // public void DO_TILE_DROPS(Object value) { wrapperContained.DO_TILE_DROPS = value; }
public Object REDUCED_DEBUG_INFO() { return wrapperContained.REDUCED_DEBUG_INFO; }
// // public void REDUCED_DEBUG_INFO(Object value) { wrapperContained.REDUCED_DEBUG_INFO = value; }
public Object MAX_ENTITY_CRAMMING() { return wrapperContained.MAX_ENTITY_CRAMMING; }
// // public void MAX_ENTITY_CRAMMING(Object value) { wrapperContained.MAX_ENTITY_CRAMMING = value; }
public Object ANNOUNCE_ADVANCEMENTS() { return wrapperContained.ANNOUNCE_ADVANCEMENTS; }
// // public void ANNOUNCE_ADVANCEMENTS(Object value) { wrapperContained.ANNOUNCE_ADVANCEMENTS = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public Object DISABLE_RAIDS() { return wrapperContained.DISABLE_RAIDS; }
// // public void DISABLE_RAIDS(Object value) { wrapperContained.DISABLE_RAIDS = value; }
public Object DO_IMMEDIATE_RESPAWN() { return wrapperContained.DO_IMMEDIATE_RESPAWN; }
// // public void DO_IMMEDIATE_RESPAWN(Object value) { wrapperContained.DO_IMMEDIATE_RESPAWN = value; }
public int DEFAULT_RANDOM_TICK_SPEED() { return wrapperContained.DEFAULT_RANDOM_TICK_SPEED; }
// public void DEFAULT_RANDOM_TICK_SPEED(int value) { wrapperContained.DEFAULT_RANDOM_TICK_SPEED = value; }
// public java.util.Map rules() { return wrapperContained.rules; }
// public void rules(java.util.Map value) { wrapperContained.rules = value; }
// public java.util.Map RULE_TYPES() { return wrapperContained.RULE_TYPES; }
// public void RULE_TYPES(java.util.Map value) { wrapperContained.RULE_TYPES = value; }
public GameRules(com.mojang.serialization.DynamicLike dynamic) { this.wrapperContained = new net.minecraft.world.GameRules(dynamic); }
// public GameRules(java.util.Map rules) { this.wrapperContained = new net.minecraft.world.GameRules(rules); }
// public void accept(Object visitor) { wrapperContained.accept(visitor); }
// public void accept(Object consumer,Object key,Object type) { wrapperContained.accept(consumer,key,type); }
// public Object get(Object key) { return wrapperContained.get(key); }
// public void method_20747(com.mojang.serialization.DynamicLike key,Object rule) { wrapperContained.method_20747(key,rule); }
// public Object method_20748(Object e) { return wrapperContained.method_20748(e); }
// public void method_20750(Object key,Object type) { wrapperContained.method_20750(key,type); }
// public void method_20751(yarnwrap.nbt.NbtCompound key,Object rule) { wrapperContained.method_20751(key.wrapperContained,rule); }
// public java.lang.String method_20752(Object key) { return wrapperContained.method_20752(key); }
// public void setValue(Object key,yarnwrap.world.GameRules rules,yarnwrap.server.MinecraftServer server) { wrapperContained.setValue(key,rules.wrapperContained,server.wrapperContained); }
public void setAllValues(yarnwrap.world.GameRules rules,yarnwrap.server.MinecraftServer server) { wrapperContained.setAllValues(rules.wrapperContained,server.wrapperContained); }
// public void method_27323(yarnwrap.world.GameRules key) { wrapperContained.method_27323(key.wrapperContained); }
// public Object method_27324(Object entry) { return wrapperContained.method_27324(entry); }
public yarnwrap.world.GameRules copy() { return new yarnwrap.world.GameRules(wrapperContained.copy()); }
// public void method_53838(yarnwrap.server.MinecraftServer server,Object rule) { wrapperContained.method_53838(server.wrapperContained,rule); }
// public void method_53839(yarnwrap.server.MinecraftServer server,Object rule) { wrapperContained.method_53839(server.wrapperContained,rule); }
// public void method_56113(yarnwrap.server.MinecraftServer server,Object value) { wrapperContained.method_56113(server.wrapperContained,value); }
// public boolean getBoolean(Object rule) { return wrapperContained.getBoolean(rule); }
// public int getInt(Object rule) { return wrapperContained.getInt(rule); }
// public void load(com.mojang.serialization.DynamicLike dynamic) { wrapperContained.load(dynamic); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public Object register(java.lang.String name,Object category,Object type) { return wrapperContained.register(name,category,type); }
// public void method_8361(yarnwrap.server.MinecraftServer server,Object rule) { wrapperContained.method_8361(server.wrapperContained,rule); }

}