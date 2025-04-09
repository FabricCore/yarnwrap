package yarnwrap.network.packet.c2s.play;
public class UpdateJigsawC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket wrapperContained; public UpdateJigsawC2SPacket(net.minecraft.network.packet.c2s.play.UpdateJigsawC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name); }
// public java.lang.String finalState() { return wrapperContained.finalState; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public yarnwrap.util.Identifier target() { return new yarnwrap.util.Identifier(wrapperContained.target); }
// public yarnwrap.util.Identifier pool() { return new yarnwrap.util.Identifier(wrapperContained.pool); }
// public Object jointType() { return wrapperContained.jointType; }
// public int selectionPriority() { return wrapperContained.selectionPriority; }
// public int placementPriority() { return wrapperContained.placementPriority; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
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