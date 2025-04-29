package yarnwrap.stat;
public class ServerStatHandler { public net.minecraft.stat.ServerStatHandler wrapperContained; public ServerStatHandler(net.minecraft.stat.ServerStatHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.File file() { return wrapperContained.file; }
// public void file(java.io.File value) { wrapperContained.file = value; }
// public static java.io.File file() { return net.minecraft.stat.ServerStatHandler.file; }
// public static void file(java.io.File value, ) { net.minecraft.stat.ServerStatHandler.file = value; }

// public java.util.Set pendingStats() { return wrapperContained.pendingStats; }
// public void pendingStats(java.util.Set value) { wrapperContained.pendingStats = value; }
// public static java.util.Set pendingStats() { return net.minecraft.stat.ServerStatHandler.pendingStats; }
// public static void pendingStats(java.util.Set value, ) { net.minecraft.stat.ServerStatHandler.pendingStats = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.stat.ServerStatHandler.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.stat.ServerStatHandler.server = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.stat.ServerStatHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.stat.ServerStatHandler.LOGGER = value; }

public ServerStatHandler(yarnwrap.server.MinecraftServer server,java.io.File file) { this.wrapperContained = new net.minecraft.stat.ServerStatHandler(server.wrapperContained,file); }
// public java.util.Optional createStat(yarnwrap.stat.StatType type,java.lang.String id) { return wrapperContained.createStat(type.wrapperContained,id); }
// public static java.util.Optional createStat(yarnwrap.stat.StatType type,java.lang.String id, ) { return net.minecraft.stat.ServerStatHandler.createStat(type.wrapperContained,id); }
public void parse(com.mojang.datafixers.DataFixer dataFixer,java.lang.String json) { wrapperContained.parse(dataFixer,json); }
// public static void parse(com.mojang.datafixers.DataFixer dataFixer,java.lang.String json, ) { net.minecraft.stat.ServerStatHandler.parse(dataFixer,json); }
// public yarnwrap.util.Identifier getStatId(yarnwrap.stat.Stat stat) { return new yarnwrap.util.Identifier(wrapperContained.getStatId(stat.wrapperContained)); }
// public static yarnwrap.util.Identifier getStatId(yarnwrap.stat.Stat stat, ) { return new yarnwrap.util.Identifier(net.minecraft.stat.ServerStatHandler.getStatId(stat.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound jsonToCompound(com.google.gson.JsonObject json) { return new yarnwrap.nbt.NbtCompound(wrapperContained.jsonToCompound(json)); }
// public static yarnwrap.nbt.NbtCompound jsonToCompound(com.google.gson.JsonObject json, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.stat.ServerStatHandler.jsonToCompound(json)); }
// public java.util.Set takePendingStats() { return wrapperContained.takePendingStats(); }
// public static java.util.Set takePendingStats() { return net.minecraft.stat.ServerStatHandler.takePendingStats(); }
public void sendStats(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendStats(player.wrapperContained); }
// public static void sendStats(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.stat.ServerStatHandler.sendStats(player.wrapperContained); }
// public java.lang.String asString() { return wrapperContained.asString(); }
// public static java.lang.String asString() { return net.minecraft.stat.ServerStatHandler.asString(); }
public void save() { wrapperContained.save(); }
// public static void save() { net.minecraft.stat.ServerStatHandler.save(); }
// public com.google.gson.JsonObject method_14913(yarnwrap.stat.StatType statType) { return wrapperContained.method_14913(statType.wrapperContained); }
// public static com.google.gson.JsonObject method_14913(yarnwrap.stat.StatType statType, ) { return net.minecraft.stat.ServerStatHandler.method_14913(statType.wrapperContained); }
public void updateStatSet() { wrapperContained.updateStatSet(); }
// public static void updateStatSet() { net.minecraft.stat.ServerStatHandler.updateStatSet(); }
// public void method_17990(yarnwrap.nbt.NbtCompound id) { wrapperContained.method_17990(id.wrapperContained); }
// public static void method_17990(yarnwrap.nbt.NbtCompound id, ) { net.minecraft.stat.ServerStatHandler.method_17990(id.wrapperContained); }
// public void method_17991(yarnwrap.nbt.NbtCompound statType) { wrapperContained.method_17991(statType.wrapperContained); }
// public static void method_17991(yarnwrap.nbt.NbtCompound statType, ) { net.minecraft.stat.ServerStatHandler.method_17991(statType.wrapperContained); }

}