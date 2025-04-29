package yarnwrap.network.packet.s2c.play;
public class MapUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket wrapperContained; public MapUpdateS2CPacket(net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional updateData() { return wrapperContained.updateData; }
// public void updateData(java.util.Optional value) { wrapperContained.updateData = value; }
// public static java.util.Optional updateData() { return net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket.updateData; }
// public static void updateData(java.util.Optional value, ) { net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket.updateData = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket.CODEC = value.wrapperContained; }

// public MapUpdateS2CPacket(yarnwrap.component.type.MapIdComponent mapId,byte scale,boolean locked,java.util.Collection decorations,Object updateData) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket(mapId.wrapperContained,scale,locked,decorations,updateData); }
// public java.util.Optional updateData() { return wrapperContained.updateData(); }
// // public static java.util.Optional updateData() { return net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket.updateData(); }
public void apply(yarnwrap.item.map.MapState mapState) { wrapperContained.apply(mapState.wrapperContained); }
// public static void apply(yarnwrap.item.map.MapState mapState, ) { net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket.apply(mapState.wrapperContained); }
// public void method_56618(yarnwrap.item.map.MapState updateData) { wrapperContained.method_56618(updateData.wrapperContained); }
// public static void method_56618(yarnwrap.item.map.MapState updateData, ) { net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket.method_56618(updateData.wrapperContained); }

}