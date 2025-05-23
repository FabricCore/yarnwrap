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

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public static com.mojang.serialization.Codec CODEC() { return net.minecraft.stat.ServerStatHandler.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.stat.ServerStatHandler.CODEC = value; }

public ServerStatHandler(yarnwrap.server.MinecraftServer server,java.io.File file) { this.wrapperContained = new net.minecraft.stat.ServerStatHandler(server.wrapperContained,file); }
public void parse(com.mojang.datafixers.DataFixer dataFixer,java.lang.String json) { wrapperContained.parse(dataFixer,json); }
// public static void parse(com.mojang.datafixers.DataFixer dataFixer,java.lang.String json, ) { net.minecraft.stat.ServerStatHandler.parse(dataFixer,json); }
// public java.util.Set takePendingStats() { return wrapperContained.takePendingStats(); }
// public static java.util.Set takePendingStats() { return net.minecraft.stat.ServerStatHandler.takePendingStats(); }
public void sendStats(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendStats(player.wrapperContained); }
// public static void sendStats(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.stat.ServerStatHandler.sendStats(player.wrapperContained); }
// public java.lang.String asString() { return wrapperContained.asString(); }
// public static java.lang.String asString() { return net.minecraft.stat.ServerStatHandler.asString(); }
public void save() { wrapperContained.save(); }
// public static void save() { net.minecraft.stat.ServerStatHandler.save(); }
public void updateStatSet() { wrapperContained.updateStatSet(); }
// public static void updateStatSet() { net.minecraft.stat.ServerStatHandler.updateStatSet(); }
// public com.mojang.serialization.Codec createCodec(yarnwrap.stat.StatType statType) { return wrapperContained.createCodec(statType.wrapperContained); }
// public static com.mojang.serialization.Codec createCodec(yarnwrap.stat.StatType statType, ) { return net.minecraft.stat.ServerStatHandler.createCodec(statType.wrapperContained); }
// public com.mojang.serialization.DataResult method_67581(yarnwrap.stat.StatType stat) { return wrapperContained.method_67581(stat.wrapperContained); }
// public static com.mojang.serialization.DataResult method_67581(yarnwrap.stat.StatType stat, ) { return net.minecraft.stat.ServerStatHandler.method_67581(stat.wrapperContained); }
// public yarnwrap.stat.StatType method_67582(Object entry) { return new yarnwrap.stat.StatType(wrapperContained.method_67582(entry)); }
// public static yarnwrap.stat.StatType method_67582(Object entry, ) { return new yarnwrap.stat.StatType(net.minecraft.stat.ServerStatHandler.method_67582(entry)); }
// public java.util.Map method_67583(java.util.Map stats) { return wrapperContained.method_67583(stats); }
// public static java.util.Map method_67583(java.util.Map stats, ) { return net.minecraft.stat.ServerStatHandler.method_67583(stats); }
// public void method_67584(java.util.Map type,yarnwrap.stat.StatType stats) { wrapperContained.method_67584(type,stats.wrapperContained); }
// public static void method_67584(java.util.Map type,yarnwrap.stat.StatType stats, ) { net.minecraft.stat.ServerStatHandler.method_67584(type,stats.wrapperContained); }
// public java.util.Map method_67586(java.util.Map statsByTypes) { return wrapperContained.method_67586(statsByTypes); }
// public static java.util.Map method_67586(java.util.Map statsByTypes, ) { return net.minecraft.stat.ServerStatHandler.method_67586(statsByTypes); }

}