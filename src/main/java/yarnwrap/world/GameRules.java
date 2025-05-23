package yarnwrap.world;
public class GameRules { public net.minecraft.world.GameRules wrapperContained; public GameRules(net.minecraft.world.GameRules wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map rules() { return wrapperContained.rules; }
// public void rules(java.util.Map value) { wrapperContained.rules = value; }
// public static java.util.Map rules() { return net.minecraft.world.GameRules.rules; }
// public static void rules(java.util.Map value, ) { net.minecraft.world.GameRules.rules = value; }

// public java.util.Map RULE_TYPES() { return wrapperContained.RULE_TYPES; }
// public void RULE_TYPES(java.util.Map value) { wrapperContained.RULE_TYPES = value; }
// public static java.util.Map RULE_TYPES() { return net.minecraft.world.GameRules.RULE_TYPES; }
// public static void RULE_TYPES(java.util.Map value, ) { net.minecraft.world.GameRules.RULE_TYPES = value; }

// public Object DO_MOB_GRIEFING() { return wrapperContained.DO_MOB_GRIEFING; }
// // public void DO_MOB_GRIEFING(Object value) { wrapperContained.DO_MOB_GRIEFING = value; }
// public static Object DO_MOB_GRIEFING() { return net.minecraft.world.GameRules.DO_MOB_GRIEFING; }
// // public static void DO_MOB_GRIEFING(Object value, ) { net.minecraft.world.GameRules.DO_MOB_GRIEFING = value; }

// public Object KEEP_INVENTORY() { return wrapperContained.KEEP_INVENTORY; }
// // public void KEEP_INVENTORY(Object value) { wrapperContained.KEEP_INVENTORY = value; }
// public static Object KEEP_INVENTORY() { return net.minecraft.world.GameRules.KEEP_INVENTORY; }
// // public static void KEEP_INVENTORY(Object value, ) { net.minecraft.world.GameRules.KEEP_INVENTORY = value; }

// public Object DO_MOB_SPAWNING() { return wrapperContained.DO_MOB_SPAWNING; }
// // public void DO_MOB_SPAWNING(Object value) { wrapperContained.DO_MOB_SPAWNING = value; }
// public static Object DO_MOB_SPAWNING() { return net.minecraft.world.GameRules.DO_MOB_SPAWNING; }
// // public static void DO_MOB_SPAWNING(Object value, ) { net.minecraft.world.GameRules.DO_MOB_SPAWNING = value; }

// public Object DO_MOB_LOOT() { return wrapperContained.DO_MOB_LOOT; }
// // public void DO_MOB_LOOT(Object value) { wrapperContained.DO_MOB_LOOT = value; }
// public static Object DO_MOB_LOOT() { return net.minecraft.world.GameRules.DO_MOB_LOOT; }
// // public static void DO_MOB_LOOT(Object value, ) { net.minecraft.world.GameRules.DO_MOB_LOOT = value; }

// public Object DO_TILE_DROPS() { return wrapperContained.DO_TILE_DROPS; }
// // public void DO_TILE_DROPS(Object value) { wrapperContained.DO_TILE_DROPS = value; }
// public static Object DO_TILE_DROPS() { return net.minecraft.world.GameRules.DO_TILE_DROPS; }
// // public static void DO_TILE_DROPS(Object value, ) { net.minecraft.world.GameRules.DO_TILE_DROPS = value; }

// public Object REDUCED_DEBUG_INFO() { return wrapperContained.REDUCED_DEBUG_INFO; }
// // public void REDUCED_DEBUG_INFO(Object value) { wrapperContained.REDUCED_DEBUG_INFO = value; }
// public static Object REDUCED_DEBUG_INFO() { return net.minecraft.world.GameRules.REDUCED_DEBUG_INFO; }
// // public static void REDUCED_DEBUG_INFO(Object value, ) { net.minecraft.world.GameRules.REDUCED_DEBUG_INFO = value; }

// public Object MAX_ENTITY_CRAMMING() { return wrapperContained.MAX_ENTITY_CRAMMING; }
// // public void MAX_ENTITY_CRAMMING(Object value) { wrapperContained.MAX_ENTITY_CRAMMING = value; }
// public static Object MAX_ENTITY_CRAMMING() { return net.minecraft.world.GameRules.MAX_ENTITY_CRAMMING; }
// // public static void MAX_ENTITY_CRAMMING(Object value, ) { net.minecraft.world.GameRules.MAX_ENTITY_CRAMMING = value; }

// public Object ANNOUNCE_ADVANCEMENTS() { return wrapperContained.ANNOUNCE_ADVANCEMENTS; }
// // public void ANNOUNCE_ADVANCEMENTS(Object value) { wrapperContained.ANNOUNCE_ADVANCEMENTS = value; }
// public static Object ANNOUNCE_ADVANCEMENTS() { return net.minecraft.world.GameRules.ANNOUNCE_ADVANCEMENTS; }
// // public static void ANNOUNCE_ADVANCEMENTS(Object value, ) { net.minecraft.world.GameRules.ANNOUNCE_ADVANCEMENTS = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.GameRules.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.GameRules.LOGGER = value; }

// public Object DISABLE_RAIDS() { return wrapperContained.DISABLE_RAIDS; }
// // public void DISABLE_RAIDS(Object value) { wrapperContained.DISABLE_RAIDS = value; }
// public static Object DISABLE_RAIDS() { return net.minecraft.world.GameRules.DISABLE_RAIDS; }
// // public static void DISABLE_RAIDS(Object value, ) { net.minecraft.world.GameRules.DISABLE_RAIDS = value; }

// public Object DO_IMMEDIATE_RESPAWN() { return wrapperContained.DO_IMMEDIATE_RESPAWN; }
// // public void DO_IMMEDIATE_RESPAWN(Object value) { wrapperContained.DO_IMMEDIATE_RESPAWN = value; }
// public static Object DO_IMMEDIATE_RESPAWN() { return net.minecraft.world.GameRules.DO_IMMEDIATE_RESPAWN; }
// // public static void DO_IMMEDIATE_RESPAWN(Object value, ) { net.minecraft.world.GameRules.DO_IMMEDIATE_RESPAWN = value; }

// public int DEFAULT_RANDOM_TICK_SPEED() { return wrapperContained.DEFAULT_RANDOM_TICK_SPEED; }
// public void DEFAULT_RANDOM_TICK_SPEED(int value) { wrapperContained.DEFAULT_RANDOM_TICK_SPEED = value; }
public static int DEFAULT_RANDOM_TICK_SPEED() { return net.minecraft.world.GameRules.DEFAULT_RANDOM_TICK_SPEED; }
// public static void DEFAULT_RANDOM_TICK_SPEED(int value, ) { net.minecraft.world.GameRules.DEFAULT_RANDOM_TICK_SPEED = value; }

// public yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.enabledFeatures); }
// public void enabledFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.enabledFeatures = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.world.GameRules.enabledFeatures); }
// public static void enabledFeatures(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.world.GameRules.enabledFeatures = value.wrapperContained; }

// public GameRules(java.util.Map rules,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { this.wrapperContained = new net.minecraft.world.GameRules(rules,enabledFeatures.wrapperContained); }
public GameRules(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { this.wrapperContained = new net.minecraft.world.GameRules(enabledFeatures.wrapperContained); }
public GameRules(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,com.mojang.serialization.DynamicLike values) { this.wrapperContained = new net.minecraft.world.GameRules(enabledFeatures.wrapperContained,values); }
// public boolean getBoolean(Object rule) { return wrapperContained.getBoolean(rule); }
// public static boolean getBoolean(Object rule, ) { return net.minecraft.world.GameRules.getBoolean(rule); }
// public int getInt(Object rule) { return wrapperContained.getInt(rule); }
// public static int getInt(Object rule, ) { return net.minecraft.world.GameRules.getInt(rule); }
// public void load(com.mojang.serialization.DynamicLike values) { wrapperContained.load(values); }
// public static void load(com.mojang.serialization.DynamicLike values, ) { net.minecraft.world.GameRules.load(values); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public static yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.GameRules.toNbt()); }
// public Object register(java.lang.String name,Object category,Object type) { return wrapperContained.register(name,category,type); }
// public static Object register(java.lang.String name,Object category,Object type, ) { return net.minecraft.world.GameRules.register(name,category,type); }
// public void method_8361(yarnwrap.server.MinecraftServer server,Object rule) { wrapperContained.method_8361(server.wrapperContained,rule); }
// public static void method_8361(yarnwrap.server.MinecraftServer server,Object rule, ) { net.minecraft.world.GameRules.method_8361(server.wrapperContained,rule); }
// public void accept(Object visitor) { wrapperContained.accept(visitor); }
// public static void accept(Object visitor, ) { net.minecraft.world.GameRules.accept(visitor); }
// public void accept(Object visitor,Object key,Object type) { wrapperContained.accept(visitor,key,type); }
// public static void accept(Object visitor,Object key,Object type, ) { net.minecraft.world.GameRules.accept(visitor,key,type); }
// public Object get(Object key) { return wrapperContained.get(key); }
// public static Object get(Object key, ) { return net.minecraft.world.GameRules.get(key); }
// public void method_20747(com.mojang.serialization.DynamicLike key,Object rule) { wrapperContained.method_20747(key,rule); }
// public static void method_20747(com.mojang.serialization.DynamicLike key,Object rule, ) { net.minecraft.world.GameRules.method_20747(key,rule); }
// public void method_20750(Object key,Object type) { wrapperContained.method_20750(key,type); }
// public static void method_20750(Object key,Object type, ) { net.minecraft.world.GameRules.method_20750(key,type); }
// public void method_20751(yarnwrap.nbt.NbtCompound key,Object rule) { wrapperContained.method_20751(key.wrapperContained,rule); }
// public static void method_20751(yarnwrap.nbt.NbtCompound key,Object rule, ) { net.minecraft.world.GameRules.method_20751(key.wrapperContained,rule); }
// public java.lang.String method_20752(Object key) { return wrapperContained.method_20752(key); }
// public static java.lang.String method_20752(Object key, ) { return net.minecraft.world.GameRules.method_20752(key); }
// public void setValue(Object key,yarnwrap.world.GameRules rules,yarnwrap.server.MinecraftServer server) { wrapperContained.setValue(key,rules.wrapperContained,server.wrapperContained); }
// public static void setValue(Object key,yarnwrap.world.GameRules rules,yarnwrap.server.MinecraftServer server, ) { net.minecraft.world.GameRules.setValue(key,rules.wrapperContained,server.wrapperContained); }
public void setAllValues(yarnwrap.world.GameRules rules,yarnwrap.server.MinecraftServer server) { wrapperContained.setAllValues(rules.wrapperContained,server.wrapperContained); }
// public static void setAllValues(yarnwrap.world.GameRules rules,yarnwrap.server.MinecraftServer server, ) { net.minecraft.world.GameRules.setAllValues(rules.wrapperContained,server.wrapperContained); }
// public void method_27323(yarnwrap.world.GameRules key) { wrapperContained.method_27323(key.wrapperContained); }
// public static void method_27323(yarnwrap.world.GameRules key, ) { net.minecraft.world.GameRules.method_27323(key.wrapperContained); }
// public Object method_27324(Object entry) { return wrapperContained.method_27324(entry); }
// public static Object method_27324(Object entry, ) { return net.minecraft.world.GameRules.method_27324(entry); }
public yarnwrap.world.GameRules copy(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return new yarnwrap.world.GameRules(wrapperContained.copy(enabledFeatures.wrapperContained)); }
// public static yarnwrap.world.GameRules copy(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures, ) { return new yarnwrap.world.GameRules(net.minecraft.world.GameRules.copy(enabledFeatures.wrapperContained)); }
// public void method_53838(yarnwrap.server.MinecraftServer server,Object rule) { wrapperContained.method_53838(server.wrapperContained,rule); }
// public static void method_53838(yarnwrap.server.MinecraftServer server,Object rule, ) { net.minecraft.world.GameRules.method_53838(server.wrapperContained,rule); }
// public void method_53839(yarnwrap.server.MinecraftServer server,Object rule) { wrapperContained.method_53839(server.wrapperContained,rule); }
// public static void method_53839(yarnwrap.server.MinecraftServer server,Object rule, ) { net.minecraft.world.GameRules.method_53839(server.wrapperContained,rule); }
// public void method_56113(yarnwrap.server.MinecraftServer server,Object value) { wrapperContained.method_56113(server.wrapperContained,value); }
// public static void method_56113(yarnwrap.server.MinecraftServer server,Object value, ) { net.minecraft.world.GameRules.method_56113(server.wrapperContained,value); }
// public boolean method_61724(yarnwrap.resource.featuretoggle.FeatureSet entry) { return wrapperContained.method_61724(entry.wrapperContained); }
// public static boolean method_61724(yarnwrap.resource.featuretoggle.FeatureSet entry, ) { return net.minecraft.world.GameRules.method_61724(entry.wrapperContained); }
// public java.util.stream.Stream streamAllRules(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return wrapperContained.streamAllRules(enabledFeatures.wrapperContained); }
// public static java.util.stream.Stream streamAllRules(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures, ) { return net.minecraft.world.GameRules.streamAllRules(enabledFeatures.wrapperContained); }
// public Object method_61726(Object entry) { return wrapperContained.method_61726(entry); }
// public static Object method_61726(Object entry, ) { return net.minecraft.world.GameRules.method_61726(entry); }
// public void method_61727(yarnwrap.server.MinecraftServer server,Object value) { wrapperContained.method_61727(server.wrapperContained,value); }
// public static void method_61727(yarnwrap.server.MinecraftServer server,Object value, ) { net.minecraft.world.GameRules.method_61727(server.wrapperContained,value); }
// public Object getRuleType(Object key) { return wrapperContained.getRuleType(key); }
// public static Object getRuleType(Object key, ) { return net.minecraft.world.GameRules.getRuleType(key); }
// public com.mojang.serialization.Codec createKeyCodec(java.lang.Class ruleClass) { return wrapperContained.createKeyCodec(ruleClass); }
// public static com.mojang.serialization.Codec createKeyCodec(java.lang.Class ruleClass, ) { return net.minecraft.world.GameRules.createKeyCodec(ruleClass); }
// public boolean method_66705(java.lang.Class ruleType) { return wrapperContained.method_66705(ruleType); }
// public static boolean method_66705(java.lang.Class ruleType, ) { return net.minecraft.world.GameRules.method_66705(ruleType); }
// public boolean method_66707(java.lang.String key) { return wrapperContained.method_66707(key); }
// public static boolean method_66707(java.lang.String key, ) { return net.minecraft.world.GameRules.method_66707(key); }
// public void method_70741(Object world) { wrapperContained.method_70741(world); }
// public static void method_70741(Object world, ) { net.minecraft.world.GameRules.method_70741(world); }
// public void method_70742(yarnwrap.server.MinecraftServer server,Object rule) { wrapperContained.method_70742(server.wrapperContained,rule); }
// public static void method_70742(yarnwrap.server.MinecraftServer server,Object rule, ) { net.minecraft.world.GameRules.method_70742(server.wrapperContained,rule); }

}