package yarnwrap.village.raid;
public class RaidManager { public net.minecraft.village.raid.RaidManager wrapperContained; public RaidManager(net.minecraft.village.raid.RaidManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int currentTime() { return wrapperContained.currentTime; }
// public void currentTime(int value) { wrapperContained.currentTime = value; }
// public static int currentTime() { return net.minecraft.village.raid.RaidManager.currentTime; }
// public static void currentTime(int value, ) { net.minecraft.village.raid.RaidManager.currentTime = value; }

// public int nextAvailableId() { return wrapperContained.nextAvailableId; }
// public void nextAvailableId(int value) { wrapperContained.nextAvailableId = value; }
// public static int nextAvailableId() { return net.minecraft.village.raid.RaidManager.nextAvailableId; }
// public static void nextAvailableId(int value, ) { net.minecraft.village.raid.RaidManager.nextAvailableId = value; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap raids() { return wrapperContained.raids; }
// public void raids(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.raids = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap raids() { return net.minecraft.village.raid.RaidManager.raids; }
// public static void raids(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.village.raid.RaidManager.raids = value; }

// public java.lang.String RAIDS() { return wrapperContained.RAIDS; }
// public void RAIDS(java.lang.String value) { wrapperContained.RAIDS = value; }
// public static java.lang.String RAIDS() { return net.minecraft.village.raid.RaidManager.RAIDS; }
// public static void RAIDS(java.lang.String value, ) { net.minecraft.village.raid.RaidManager.RAIDS = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.village.raid.RaidManager.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.village.raid.RaidManager.CODEC = value; }

// public yarnwrap.world.PersistentStateType STATE_TYPE() { return new yarnwrap.world.PersistentStateType(wrapperContained.STATE_TYPE); }
// public void STATE_TYPE(yarnwrap.world.PersistentStateType value) { wrapperContained.STATE_TYPE = value.wrapperContained; }
public static yarnwrap.world.PersistentStateType STATE_TYPE() { return new yarnwrap.world.PersistentStateType(net.minecraft.village.raid.RaidManager.STATE_TYPE); }
// public static void STATE_TYPE(yarnwrap.world.PersistentStateType value, ) { net.minecraft.village.raid.RaidManager.STATE_TYPE = value.wrapperContained; }

// public yarnwrap.world.PersistentStateType END_STATE_TYPE() { return new yarnwrap.world.PersistentStateType(wrapperContained.END_STATE_TYPE); }
// public void END_STATE_TYPE(yarnwrap.world.PersistentStateType value) { wrapperContained.END_STATE_TYPE = value.wrapperContained; }
public static yarnwrap.world.PersistentStateType END_STATE_TYPE() { return new yarnwrap.world.PersistentStateType(net.minecraft.village.raid.RaidManager.END_STATE_TYPE); }
// public static void END_STATE_TYPE(yarnwrap.world.PersistentStateType value, ) { net.minecraft.village.raid.RaidManager.END_STATE_TYPE = value.wrapperContained; }

// public RaidManager(java.util.List raids,int nextAvailableId,int currentTime) { this.wrapperContained = new net.minecraft.village.raid.RaidManager(raids,nextAvailableId,currentTime); }
// public yarnwrap.village.raid.RaidManager fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.village.raid.RaidManager(wrapperContained.fromNbt(nbt.wrapperContained)); }
// public static yarnwrap.village.raid.RaidManager fromNbt(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.village.raid.RaidManager(net.minecraft.village.raid.RaidManager.fromNbt(nbt.wrapperContained)); }
// public yarnwrap.village.raid.Raid getOrCreateRaid(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.village.raid.Raid(wrapperContained.getOrCreateRaid(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.village.raid.Raid getOrCreateRaid(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.village.raid.Raid(net.minecraft.village.raid.RaidManager.getOrCreateRaid(world.wrapperContained,pos.wrapperContained)); }
// public int nextId() { return wrapperContained.nextId(); }
// public static int nextId() { return net.minecraft.village.raid.RaidManager.nextId(); }
public void tick(yarnwrap.server.world.ServerWorld world) { wrapperContained.tick(world.wrapperContained); }
// public static void tick(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.village.raid.RaidManager.tick(world.wrapperContained); }
public yarnwrap.village.raid.Raid startRaid(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.village.raid.Raid(wrapperContained.startRaid(player.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.village.raid.Raid startRaid(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.village.raid.Raid(net.minecraft.village.raid.RaidManager.startRaid(player.wrapperContained,pos.wrapperContained)); }
public yarnwrap.village.raid.Raid getRaid(int id) { return new yarnwrap.village.raid.Raid(wrapperContained.getRaid(id)); }
// public static yarnwrap.village.raid.Raid getRaid(int id, ) { return new yarnwrap.village.raid.Raid(net.minecraft.village.raid.RaidManager.getRaid(id)); }
// public boolean isValidRaiderFor(yarnwrap.entity.raid.RaiderEntity raider) { return wrapperContained.isValidRaiderFor(raider.wrapperContained); }
// public static boolean isValidRaiderFor(yarnwrap.entity.raid.RaiderEntity raider, ) { return net.minecraft.village.raid.RaidManager.isValidRaiderFor(raider.wrapperContained); }
public yarnwrap.village.raid.Raid getRaidAt(yarnwrap.util.math.BlockPos pos,int searchDistance) { return new yarnwrap.village.raid.Raid(wrapperContained.getRaidAt(pos.wrapperContained,searchDistance)); }
// public static yarnwrap.village.raid.Raid getRaidAt(yarnwrap.util.math.BlockPos pos,int searchDistance, ) { return new yarnwrap.village.raid.Raid(net.minecraft.village.raid.RaidManager.getRaidAt(pos.wrapperContained,searchDistance)); }
// public boolean method_44012(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_44012(poiType.wrapperContained); }
// public static boolean method_44012(yarnwrap.registry.entry.RegistryEntry poiType, ) { return net.minecraft.village.raid.RaidManager.method_44012(poiType.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_67377(Object instance) { return wrapperContained.method_67377(instance); }
// public static com.mojang.datafixers.kinds.App method_67377(Object instance, ) { return net.minecraft.village.raid.RaidManager.method_67377(instance); }
public java.util.OptionalInt getRaidId(yarnwrap.village.raid.Raid raid) { return wrapperContained.getRaidId(raid.wrapperContained); }
// public static java.util.OptionalInt getRaidId(yarnwrap.village.raid.Raid raid, ) { return net.minecraft.village.raid.RaidManager.getRaidId(raid.wrapperContained); }
// public java.lang.Integer method_67379(yarnwrap.village.raid.RaidManager raidManager) { return wrapperContained.method_67379(raidManager.wrapperContained); }
// public static java.lang.Integer method_67379(yarnwrap.village.raid.RaidManager raidManager, ) { return net.minecraft.village.raid.RaidManager.method_67379(raidManager.wrapperContained); }
// public yarnwrap.world.PersistentStateType getPersistentStateType(yarnwrap.registry.entry.RegistryEntry dimensionType) { return new yarnwrap.world.PersistentStateType(wrapperContained.getPersistentStateType(dimensionType.wrapperContained)); }
// public static yarnwrap.world.PersistentStateType getPersistentStateType(yarnwrap.registry.entry.RegistryEntry dimensionType, ) { return new yarnwrap.world.PersistentStateType(net.minecraft.village.raid.RaidManager.getPersistentStateType(dimensionType.wrapperContained)); }
// public java.lang.Integer method_67381(yarnwrap.village.raid.RaidManager raidManager) { return wrapperContained.method_67381(raidManager.wrapperContained); }
// public static java.lang.Integer method_67381(yarnwrap.village.raid.RaidManager raidManager, ) { return net.minecraft.village.raid.RaidManager.method_67381(raidManager.wrapperContained); }
// public java.util.List method_67382(yarnwrap.village.raid.RaidManager raidManager) { return wrapperContained.method_67382(raidManager.wrapperContained); }
// public static java.util.List method_67382(yarnwrap.village.raid.RaidManager raidManager, ) { return net.minecraft.village.raid.RaidManager.method_67382(raidManager.wrapperContained); }

}