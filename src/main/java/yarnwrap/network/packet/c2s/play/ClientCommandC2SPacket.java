package yarnwrap.network.packet.c2s.play;
public class ClientCommandC2SPacket { public net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket wrapperContained; public ClientCommandC2SPacket(net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int mountJumpHeight() { return wrapperContained.mountJumpHeight; }
// public void mountJumpHeight(int value) { wrapperContained.mountJumpHeight = value; }
// public static int mountJumpHeight() { return net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.mountJumpHeight; }
// public static void mountJumpHeight(int value, ) { net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.mountJumpHeight = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.entityId = value; }

// public Object mode() { return wrapperContained.mode; }
// // public void mode(Object value) { wrapperContained.mode = value; }
// // public static Object mode() { return net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.mode; }
// // public static void mode(Object value, ) { net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.mode = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.CODEC = value.wrapperContained; }

// public ClientCommandC2SPacket(yarnwrap.entity.Entity entity,Object mode) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket(entity.wrapperContained,mode); }
// public ClientCommandC2SPacket(yarnwrap.entity.Entity entity,Object mode,int mountJumpHeight) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket(entity.wrapperContained,mode,mountJumpHeight); }
// public ClientCommandC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket(buf.wrapperContained); }
public Object getMode() { return wrapperContained.getMode(); }
// public static Object getMode() { return net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.getMode(); }
public int getMountJumpHeight() { return wrapperContained.getMountJumpHeight(); }
// public static int getMountJumpHeight() { return net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.getMountJumpHeight(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.getEntityId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.write(buf.wrapperContained); }

}