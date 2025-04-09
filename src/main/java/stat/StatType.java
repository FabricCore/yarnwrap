package yarnwrap.stat;
public class StatType { public net.minecraft.stat.StatType wrapperContained; public StatType(net.minecraft.stat.StatType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.Registry registry() { return new yarnwrap.registry.Registry(wrapperContained.registry); }
// public java.util.Map stats() { return wrapperContained.stats; }
// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec); }
public yarnwrap.stat.Stat getOrCreateStat(java.lang.Object key,yarnwrap.stat.StatFormatter formatter) { return new yarnwrap.stat.Stat(wrapperContained.getOrCreateStat(key,formatter.wrapperContained)); }
public yarnwrap.stat.Stat getOrCreateStat(java.lang.Object key) { return new yarnwrap.stat.Stat(wrapperContained.getOrCreateStat(key)); }
public boolean hasStat(java.lang.Object key) { return wrapperContained.hasStat(key); }
public yarnwrap.registry.Registry getRegistry() { return new yarnwrap.registry.Registry(wrapperContained.getRegistry()); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
public yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.getPacketCodec()); }

}