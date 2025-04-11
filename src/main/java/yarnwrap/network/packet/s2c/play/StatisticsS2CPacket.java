package yarnwrap.network.packet.s2c.play;
public class StatisticsS2CPacket { public net.minecraft.network.packet.s2c.play.StatisticsS2CPacket wrapperContained; public StatisticsS2CPacket(net.minecraft.network.packet.s2c.play.StatisticsS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap stats() { return wrapperContained.stats; }
// public void stats(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.stats = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public yarnwrap.network.codec.PacketCodec STAT_MAP_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.STAT_MAP_CODEC); }
// public void STAT_MAP_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.STAT_MAP_CODEC = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap stats() { return wrapperContained.stats(); }

}