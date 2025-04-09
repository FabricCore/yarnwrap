package yarnwrap.network.packet.s2c.play;
public class MapUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket wrapperContained; public MapUpdateS2CPacket(net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional updateData() { return wrapperContained.updateData; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public java.util.Optional updateData() { return wrapperContained.updateData(); }
public void apply(yarnwrap.item.map.MapState mapState) { wrapperContained.apply(mapState.wrapperContained); }

}