package yarnwrap.network.packet.s2c.play;
public class ServerMetadataS2CPacket { public net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket wrapperContained; public ServerMetadataS2CPacket(net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
// public void description(yarnwrap.text.Text value) { wrapperContained.description = value.wrapperContained; }
// public static yarnwrap.text.Text description() { return new yarnwrap.text.Text(net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket.description); }
// public static void description(yarnwrap.text.Text value, ) { net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket.description = value.wrapperContained; }

// public java.util.Optional favicon() { return wrapperContained.favicon; }
// public void favicon(java.util.Optional value) { wrapperContained.favicon = value; }
// public static java.util.Optional favicon() { return net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket.favicon; }
// public static void favicon(java.util.Optional value, ) { net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket.favicon = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket.CODEC = value.wrapperContained; }

// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description()); }
// // public static yarnwrap.text.Text description() { return new yarnwrap.text.Text(net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket.description()); }
// public java.util.Optional favicon() { return wrapperContained.favicon(); }
// // public static java.util.Optional favicon() { return net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket.favicon(); }

}