package yarnwrap.network.packet.c2s.play;
public class UpdateJigsawC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket wrapperContained; public UpdateJigsawC2SPacket(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name); }
// public void name(yarnwrap.util.Identifier value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.name); }
// public static void name(yarnwrap.util.Identifier value, ) { net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.name = value.wrapperContained; }

// public java.lang.String finalState() { return wrapperContained.finalState; }
// public void finalState(java.lang.String value) { wrapperContained.finalState = value; }
// public static java.lang.String finalState() { return net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.finalState; }
// public static void finalState(java.lang.String value, ) { net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.finalState = value; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.pos = value.wrapperContained; }

// public yarnwrap.util.Identifier target() { return new yarnwrap.util.Identifier(wrapperContained.target); }
// public void target(yarnwrap.util.Identifier value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.util.Identifier target() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.target); }
// public static void target(yarnwrap.util.Identifier value, ) { net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.target = value.wrapperContained; }

// public yarnwrap.util.Identifier pool() { return new yarnwrap.util.Identifier(wrapperContained.pool); }
// public void pool(yarnwrap.util.Identifier value) { wrapperContained.pool = value.wrapperContained; }
// public static yarnwrap.util.Identifier pool() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.pool); }
// public static void pool(yarnwrap.util.Identifier value, ) { net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.pool = value.wrapperContained; }

// public Object jointType() { return wrapperContained.jointType; }
// // public void jointType(Object value) { wrapperContained.jointType = value; }
// // public static Object jointType() { return net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.jointType; }
// // public static void jointType(Object value, ) { net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.jointType = value; }

// public int selectionPriority() { return wrapperContained.selectionPriority; }
// public void selectionPriority(int value) { wrapperContained.selectionPriority = value; }
// public static int selectionPriority() { return net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.selectionPriority; }
// public static void selectionPriority(int value, ) { net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.selectionPriority = value; }

// public int placementPriority() { return wrapperContained.placementPriority; }
// public void placementPriority(int value) { wrapperContained.placementPriority = value; }
// public static int placementPriority() { return net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.placementPriority; }
// public static void placementPriority(int value, ) { net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.placementPriority = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.CODEC = value.wrapperContained; }

// public UpdateJigsawC2SPacket(yarnwrap.util.math.BlockPos pos,yarnwrap.util.Identifier name,yarnwrap.util.Identifier target,yarnwrap.util.Identifier pool,java.lang.String finalState,Object jointType,int selectionPriority,int placementPriority) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket(pos.wrapperContained,name.wrapperContained,target.wrapperContained,pool.wrapperContained,finalState,jointType,selectionPriority,placementPriority); }
// public UpdateJigsawC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket(buf.wrapperContained); }
public java.lang.String getFinalState() { return wrapperContained.getFinalState(); }
// public static java.lang.String getFinalState() { return net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.getFinalState(); }
public yarnwrap.util.Identifier getTarget() { return new yarnwrap.util.Identifier(wrapperContained.getTarget()); }
// public static yarnwrap.util.Identifier getTarget() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.getTarget()); }
public yarnwrap.util.Identifier getName() { return new yarnwrap.util.Identifier(wrapperContained.getName()); }
// public static yarnwrap.util.Identifier getName() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.getName()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.getPos()); }
public yarnwrap.util.Identifier getPool() { return new yarnwrap.util.Identifier(wrapperContained.getPool()); }
// public static yarnwrap.util.Identifier getPool() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.getPool()); }
public Object getJointType() { return wrapperContained.getJointType(); }
// public static Object getJointType() { return net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.getJointType(); }
public int getSelectionPriority() { return wrapperContained.getSelectionPriority(); }
// public static int getSelectionPriority() { return net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.getSelectionPriority(); }
public int getPlacementPriority() { return wrapperContained.getPlacementPriority(); }
// public static int getPlacementPriority() { return net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.getPlacementPriority(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket.write(buf.wrapperContained); }

}