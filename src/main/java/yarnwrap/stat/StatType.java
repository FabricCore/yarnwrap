package yarnwrap.stat;
public class StatType { public net.minecraft.stat.StatType wrapperContained; public StatType(net.minecraft.stat.StatType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.Registry registry() { return new yarnwrap.registry.Registry(wrapperContained.registry); }
// public void registry(yarnwrap.registry.Registry value) { wrapperContained.registry = value.wrapperContained; }
// public static yarnwrap.registry.Registry registry() { return new yarnwrap.registry.Registry(net.minecraft.stat.StatType.registry); }
// public static void registry(yarnwrap.registry.Registry value, ) { net.minecraft.stat.StatType.registry = value.wrapperContained; }

// public java.util.Map stats() { return wrapperContained.stats; }
// public void stats(java.util.Map value) { wrapperContained.stats = value; }
// public static java.util.Map stats() { return net.minecraft.stat.StatType.stats; }
// public static void stats(java.util.Map value, ) { net.minecraft.stat.StatType.stats = value; }

// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.text.Text name() { return new yarnwrap.text.Text(net.minecraft.stat.StatType.name); }
// public static void name(yarnwrap.text.Text value, ) { net.minecraft.stat.StatType.name = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec); }
// public void packetCodec(yarnwrap.network.codec.PacketCodec value) { wrapperContained.packetCodec = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.stat.StatType.packetCodec); }
// public static void packetCodec(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.stat.StatType.packetCodec = value.wrapperContained; }

public StatType(yarnwrap.registry.Registry registry,yarnwrap.text.Text name) { this.wrapperContained = new net.minecraft.stat.StatType(registry.wrapperContained,name.wrapperContained); }
public yarnwrap.stat.Stat getOrCreateStat(java.lang.Object key,yarnwrap.stat.StatFormatter formatter) { return new yarnwrap.stat.Stat(wrapperContained.getOrCreateStat(key,formatter.wrapperContained)); }
// public static yarnwrap.stat.Stat getOrCreateStat(java.lang.Object key,yarnwrap.stat.StatFormatter formatter, ) { return new yarnwrap.stat.Stat(net.minecraft.stat.StatType.getOrCreateStat(key,formatter.wrapperContained)); }
public yarnwrap.stat.Stat getOrCreateStat(java.lang.Object key) { return new yarnwrap.stat.Stat(wrapperContained.getOrCreateStat(key)); }
// public static yarnwrap.stat.Stat getOrCreateStat(java.lang.Object key, ) { return new yarnwrap.stat.Stat(net.minecraft.stat.StatType.getOrCreateStat(key)); }
public boolean hasStat(java.lang.Object key) { return wrapperContained.hasStat(key); }
// public static boolean hasStat(java.lang.Object key, ) { return net.minecraft.stat.StatType.hasStat(key); }
public yarnwrap.registry.Registry getRegistry() { return new yarnwrap.registry.Registry(wrapperContained.getRegistry()); }
// public static yarnwrap.registry.Registry getRegistry() { return new yarnwrap.registry.Registry(net.minecraft.stat.StatType.getRegistry()); }
// public yarnwrap.stat.Stat method_14961(yarnwrap.stat.StatFormatter value) { return new yarnwrap.stat.Stat(wrapperContained.method_14961(value.wrapperContained)); }
// public static yarnwrap.stat.Stat method_14961(yarnwrap.stat.StatFormatter value, ) { return new yarnwrap.stat.Stat(net.minecraft.stat.StatType.method_14961(value.wrapperContained)); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.stat.StatType.getName()); }
public yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.getPacketCodec()); }
// public static yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.stat.StatType.getPacketCodec()); }

}