package yarnwrap.stat;
public class ServerStatHandler { public net.minecraft.stat.ServerStatHandler wrapperContained; public ServerStatHandler(net.minecraft.stat.ServerStatHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.File file() { return wrapperContained.file; }
// public java.util.Set pendingStats() { return wrapperContained.pendingStats; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Optional createStat(yarnwrap.stat.StatType type,java.lang.String id) { return wrapperContained.createStat(type.wrapperContained,id); }
public void parse(com.mojang.datafixers.DataFixer dataFixer,java.lang.String json) { wrapperContained.parse(dataFixer,json); }
// public yarnwrap.util.Identifier getStatId(yarnwrap.stat.Stat stat) { return new yarnwrap.util.Identifier(wrapperContained.getStatId(stat.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound jsonToCompound(com.google.gson.JsonObject json) { return new yarnwrap.nbt.NbtCompound(wrapperContained.jsonToCompound(json)); }
// public java.util.Set takePendingStats() { return wrapperContained.takePendingStats(); }
public void sendStats(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendStats(player.wrapperContained); }
// public java.lang.String asString() { return wrapperContained.asString(); }
public void save() { wrapperContained.save(); }
public void updateStatSet() { wrapperContained.updateStatSet(); }

}