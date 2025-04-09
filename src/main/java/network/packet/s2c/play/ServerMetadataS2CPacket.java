package yarnwrap.network.packet.s2c.play;
public class ServerMetadataS2CPacket { public net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket wrapperContained; public ServerMetadataS2CPacket(net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
// public java.util.Optional favicon() { return wrapperContained.favicon; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description()); }
// public java.util.Optional favicon() { return wrapperContained.favicon(); }

}