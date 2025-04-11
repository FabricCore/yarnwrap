package yarnwrap.network.packet.c2s.play;
public class UpdateJigsawC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket wrapperContained; public UpdateJigsawC2SPacket(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name); }
// public void name(yarnwrap.util.Identifier value) { wrapperContained.name = value.wrapperContained; }
// public java.lang.String finalState() { return wrapperContained.finalState; }
// public void finalState(java.lang.String value) { wrapperContained.finalState = value; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public yarnwrap.util.Identifier target() { return new yarnwrap.util.Identifier(wrapperContained.target); }
// public void target(yarnwrap.util.Identifier value) { wrapperContained.target = value.wrapperContained; }
// public yarnwrap.util.Identifier pool() { return new yarnwrap.util.Identifier(wrapperContained.pool); }
// public void pool(yarnwrap.util.Identifier value) { wrapperContained.pool = value.wrapperContained; }
// public Object jointType() { return wrapperContained.jointType; }
// // public void jointType(Object value) { wrapperContained.jointType = value; }
// public int selectionPriority() { return wrapperContained.selectionPriority; }
// public void selectionPriority(int value) { wrapperContained.selectionPriority = value; }
// public int placementPriority() { return wrapperContained.placementPriority; }
// public void placementPriority(int value) { wrapperContained.placementPriority = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public UpdateJigsawC2SPacket(yarnwrap.util.math.BlockPos pos,yarnwrap.util.Identifier name,yarnwrap.util.Identifier target,yarnwrap.util.Identifier pool,java.lang.String finalState,Object jointType,int selectionPriority,int placementPriority) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket(pos.wrapperContained,name.wrapperContained,target.wrapperContained,pool.wrapperContained,finalState,jointType,selectionPriority,placementPriority); }
// public UpdateJigsawC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket(buf.wrapperContained); }
public java.lang.String getFinalState() { return wrapperContained.getFinalState(); }
public yarnwrap.util.Identifier getTarget() { return new yarnwrap.util.Identifier(wrapperContained.getTarget()); }
public yarnwrap.util.Identifier getName() { return new yarnwrap.util.Identifier(wrapperContained.getName()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public yarnwrap.util.Identifier getPool() { return new yarnwrap.util.Identifier(wrapperContained.getPool()); }
public Object getJointType() { return wrapperContained.getJointType(); }
public int getSelectionPriority() { return wrapperContained.getSelectionPriority(); }
public int getPlacementPriority() { return wrapperContained.getPlacementPriority(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}