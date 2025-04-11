package yarnwrap.village.raid;
public class RaidManager { public net.minecraft.village.raid.RaidManager wrapperContained; public RaidManager(net.minecraft.village.raid.RaidManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int currentTime() { return wrapperContained.currentTime; }
// public void currentTime(int value) { wrapperContained.currentTime = value; }
// public int nextAvailableId() { return wrapperContained.nextAvailableId; }
// public void nextAvailableId(int value) { wrapperContained.nextAvailableId = value; }
// public java.util.Map raids() { return wrapperContained.raids; }
// public void raids(java.util.Map value) { wrapperContained.raids = value; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public java.lang.String RAIDS() { return wrapperContained.RAIDS; }
// public void RAIDS(java.lang.String value) { wrapperContained.RAIDS = value; }
public RaidManager(yarnwrap.server.world.ServerWorld world) { this.wrapperContained = new net.minecraft.village.raid.RaidManager(world.wrapperContained); }
// public yarnwrap.village.raid.Raid getOrCreateRaid(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.village.raid.Raid(wrapperContained.getOrCreateRaid(world.wrapperContained,pos.wrapperContained)); }
public java.lang.String nameFor(yarnwrap.registry.entry.RegistryEntry dimensionTypeEntry) { return wrapperContained.nameFor(dimensionTypeEntry.wrapperContained); }
// public int nextId() { return wrapperContained.nextId(); }
public void tick() { wrapperContained.tick(); }
public yarnwrap.village.raid.Raid startRaid(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.village.raid.Raid(wrapperContained.startRaid(player.wrapperContained,pos.wrapperContained)); }
public yarnwrap.village.raid.Raid getRaid(int id) { return new yarnwrap.village.raid.Raid(wrapperContained.getRaid(id)); }
public boolean isValidRaiderFor(yarnwrap.entity.raid.RaiderEntity raider,yarnwrap.village.raid.Raid raid) { return wrapperContained.isValidRaiderFor(raider.wrapperContained,raid.wrapperContained); }
public yarnwrap.village.raid.Raid getRaidAt(yarnwrap.util.math.BlockPos pos,int searchDistance) { return new yarnwrap.village.raid.Raid(wrapperContained.getRaidAt(pos.wrapperContained,searchDistance)); }
// public boolean method_44012(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_44012(poiType.wrapperContained); }
public Object getPersistentStateType(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getPersistentStateType(world.wrapperContained); }
// public yarnwrap.village.raid.RaidManager method_52561(yarnwrap.server.world.ServerWorld nbt,yarnwrap.nbt.NbtCompound registryLookup) { return new yarnwrap.village.raid.RaidManager(wrapperContained.method_52561(nbt.wrapperContained,registryLookup.wrapperContained)); }
public yarnwrap.village.raid.RaidManager fromNbt(yarnwrap.server.world.ServerWorld world,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.village.raid.RaidManager(wrapperContained.fromNbt(world.wrapperContained,nbt.wrapperContained)); }

}