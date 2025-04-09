package yarnwrap.network.packet.s2c.play;
public class StatisticsS2CPacket { public net.minecraft.network.packet.s2c.play.StatisticsS2CPacket wrapperContained; public StatisticsS2CPacket(net.minecraft.network.packet.s2c.play.StatisticsS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap stats() { return wrapperContained.stats; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public yarnwrap.network.codec.PacketCodec STAT_MAP_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.STAT_MAP_CODEC); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap stats() { return wrapperContained.stats(); }

}