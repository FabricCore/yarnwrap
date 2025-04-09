package yarnwrap.network.packet.s2c.play;
public class EntityTrackerUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket wrapperContained; public EntityTrackerUpdateS2CPacket(net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int id() { return wrapperContained.id; }
// public java.util.List trackedValues() { return wrapperContained.trackedValues; }
public int MARKER_ID() { return wrapperContained.MARKER_ID; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public int id() { return wrapperContained.id(); }
// public java.util.List trackedValues() { return wrapperContained.trackedValues(); }
// public void write(java.util.List trackedValues,yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(trackedValues,buf.wrapperContained); }
// public java.util.List read(yarnwrap.network.RegistryByteBuf buf) { return wrapperContained.read(buf.wrapperContained); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}