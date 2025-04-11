package yarnwrap.stat;
public class ServerStatHandler { public net.minecraft.stat.ServerStatHandler wrapperContained; public ServerStatHandler(net.minecraft.stat.ServerStatHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.File file() { return wrapperContained.file; }
// public void file(java.io.File value) { wrapperContained.file = value; }
// public java.util.Set pendingStats() { return wrapperContained.pendingStats; }
// public void pendingStats(java.util.Set value) { wrapperContained.pendingStats = value; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public ServerStatHandler(yarnwrap.server.MinecraftServer server,java.io.File file) { this.wrapperContained = new net.minecraft.stat.ServerStatHandler(server.wrapperContained,file); }
// public java.util.Optional createStat(yarnwrap.stat.StatType type,java.lang.String id) { return wrapperContained.createStat(type.wrapperContained,id); }
public void parse(com.mojang.datafixers.DataFixer dataFixer,java.lang.String json) { wrapperContained.parse(dataFixer,json); }
// public yarnwrap.util.Identifier getStatId(yarnwrap.stat.Stat stat) { return new yarnwrap.util.Identifier(wrapperContained.getStatId(stat.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound jsonToCompound(com.google.gson.JsonObject json) { return new yarnwrap.nbt.NbtCompound(wrapperContained.jsonToCompound(json)); }
// public java.util.Set takePendingStats() { return wrapperContained.takePendingStats(); }
public void sendStats(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendStats(player.wrapperContained); }
// public java.lang.String asString() { return wrapperContained.asString(); }
public void save() { wrapperContained.save(); }
// public com.google.gson.JsonObject method_14913(yarnwrap.stat.StatType statType) { return wrapperContained.method_14913(statType.wrapperContained); }
public void updateStatSet() { wrapperContained.updateStatSet(); }
// public void method_17990(yarnwrap.nbt.NbtCompound id) { wrapperContained.method_17990(id.wrapperContained); }
// public void method_17991(yarnwrap.nbt.NbtCompound statType) { wrapperContained.method_17991(statType.wrapperContained); }

}