package yarnwrap.network.packet.c2s.play;
public class PlayerActionC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket wrapperContained; public PlayerActionC2SPacket(net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction direction() { return new yarnwrap.util.math.Direction(wrapperContained.direction); }
// public void direction(yarnwrap.util.math.Direction value) { wrapperContained.direction = value.wrapperContained; }
// public static yarnwrap.util.math.Direction direction() { return new yarnwrap.util.math.Direction(net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.direction); }
// public static void direction(yarnwrap.util.math.Direction value, ) { net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.direction = value.wrapperContained; }

// public Object action() { return wrapperContained.action; }
// // public void action(Object value) { wrapperContained.action = value; }
// // public static Object action() { return net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.action; }
// // public static void action(Object value, ) { net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.action = value; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.pos = value.wrapperContained; }

// public int sequence() { return wrapperContained.sequence; }
// public void sequence(int value) { wrapperContained.sequence = value; }
// public static int sequence() { return net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.sequence; }
// public static void sequence(int value, ) { net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.sequence = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.CODEC = value.wrapperContained; }

// public PlayerActionC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket(buf.wrapperContained); }
// public PlayerActionC2SPacket(Object action,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket(action,pos.wrapperContained,direction.wrapperContained); }
// public PlayerActionC2SPacket(Object action,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,int sequence) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket(action,pos.wrapperContained,direction.wrapperContained,sequence); }
public yarnwrap.util.math.Direction getDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getDirection()); }
// public static yarnwrap.util.math.Direction getDirection() { return new yarnwrap.util.math.Direction(net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getDirection()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getPos()); }
public Object getAction() { return wrapperContained.getAction(); }
// public static Object getAction() { return net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getAction(); }
public int getSequence() { return wrapperContained.getSequence(); }
// public static int getSequence() { return net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.getSequence(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.write(buf.wrapperContained); }

}