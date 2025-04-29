package yarnwrap.network.packet.s2c.play;
public class EntityTrackerUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket wrapperContained; public EntityTrackerUpdateS2CPacket(net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.id; }
// public static void id(int value, ) { net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.id = value; }

// public java.util.List trackedValues() { return wrapperContained.trackedValues; }
// public void trackedValues(java.util.List value) { wrapperContained.trackedValues = value; }
// public static java.util.List trackedValues() { return net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.trackedValues; }
// public static void trackedValues(java.util.List value, ) { net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.trackedValues = value; }

// public int MARKER_ID() { return wrapperContained.MARKER_ID; }
// public void MARKER_ID(int value) { wrapperContained.MARKER_ID = value; }
public static int MARKER_ID() { return net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.MARKER_ID; }
// public static void MARKER_ID(int value, ) { net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.MARKER_ID = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.CODEC = value.wrapperContained; }

// public EntityTrackerUpdateS2CPacket(int id) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket(id); }
// public EntityTrackerUpdateS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket(buf.wrapperContained); }
// public int id() { return wrapperContained.id(); }
// // public static int id() { return net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.id(); }
// public java.util.List trackedValues() { return wrapperContained.trackedValues(); }
// // public static java.util.List trackedValues() { return net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.trackedValues(); }
// public void write(java.util.List trackedValues,yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(trackedValues,buf.wrapperContained); }
// public static void write(java.util.List trackedValues,yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.write(trackedValues,buf.wrapperContained); }
// public java.util.List read(yarnwrap.network.RegistryByteBuf buf) { return wrapperContained.read(buf.wrapperContained); }
// public static java.util.List read(yarnwrap.network.RegistryByteBuf buf, ) { return net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.read(buf.wrapperContained); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket.write(buf.wrapperContained); }

}