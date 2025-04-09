package yarnwrap.network.packet.c2s.play;
public class ClientCommandC2SPacket { public net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket wrapperContained; public ClientCommandC2SPacket(net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int mountJumpHeight() { return wrapperContained.mountJumpHeight; }
// public int entityId() { return wrapperContained.entityId; }
// public Object mode() { return wrapperContained.mode; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public Object getMode() { return wrapperContained.getMode(); }
public int getMountJumpHeight() { return wrapperContained.getMountJumpHeight(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}