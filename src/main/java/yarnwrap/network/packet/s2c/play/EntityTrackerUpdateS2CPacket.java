package yarnwrap.network.packet.s2c.play;
public class EntityTrackerUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket wrapperContained; public EntityTrackerUpdateS2CPacket(net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public java.util.List trackedValues() { return wrapperContained.trackedValues; }
// public void trackedValues(java.util.List value) { wrapperContained.trackedValues = value; }
public int MARKER_ID() { return wrapperContained.MARKER_ID; }
// public void MARKER_ID(int value) { wrapperContained.MARKER_ID = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public EntityTrackerUpdateS2CPacket(int id) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket(id); }
// public EntityTrackerUpdateS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket(buf.wrapperContained); }
// public int id() { return wrapperContained.id(); }
// public java.util.List trackedValues() { return wrapperContained.trackedValues(); }
// public void write(java.util.List trackedValues,yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(trackedValues,buf.wrapperContained); }
// public java.util.List read(yarnwrap.network.RegistryByteBuf buf) { return wrapperContained.read(buf.wrapperContained); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}