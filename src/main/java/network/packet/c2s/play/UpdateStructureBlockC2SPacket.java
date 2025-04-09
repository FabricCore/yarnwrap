package yarnwrap.network.packet.c2s.play;
public class UpdateStructureBlockC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateStructureBlockC2SPacket wrapperContained; public UpdateStructureBlockC2SPacket(net.minecraft.network.packet.c2s.play.UpdateStructureBlockC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String templateName() { return wrapperContained.templateName; }
// public yarnwrap.util.BlockMirror mirror() { return new yarnwrap.util.BlockMirror(wrapperContained.mirror); }
// public Object action() { return wrapperContained.action; }
// public yarnwrap.util.math.Vec3i size() { return new yarnwrap.util.math.Vec3i(wrapperContained.size); }
// public yarnwrap.block.enums.StructureBlockMode mode() { return new yarnwrap.block.enums.StructureBlockMode(wrapperContained.mode); }
// public java.lang.String metadata() { return wrapperContained.metadata; }
// public boolean showBoundingBox() { return wrapperContained.showBoundingBox; }
// public boolean showAir() { return wrapperContained.showAir; }
// public yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(wrapperContained.rotation); }
// public boolean ignoreEntities() { return wrapperContained.ignoreEntities; }
// public float integrity() { return wrapperContained.integrity; }
// public yarnwrap.util.math.BlockPos offset() { return new yarnwrap.util.math.BlockPos(wrapperContained.offset); }
// public long seed() { return wrapperContained.seed; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public int IGNORE_ENTITIES_MASK() { return wrapperContained.IGNORE_ENTITIES_MASK; }
// public int SHOW_AIR_MASK() { return wrapperContained.SHOW_AIR_MASK; }
// public int SHOW_BOUNDING_BOX_MASK() { return wrapperContained.SHOW_BOUNDING_BOX_MASK; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.util.math.Vec3i getSize() { return new yarnwrap.util.math.Vec3i(wrapperContained.getSize()); }
public yarnwrap.util.BlockMirror getMirror() { return new yarnwrap.util.BlockMirror(wrapperContained.getMirror()); }
public float getIntegrity() { return wrapperContained.getIntegrity(); }
public yarnwrap.util.math.BlockPos getOffset() { return new yarnwrap.util.math.BlockPos(wrapperContained.getOffset()); }
public long getSeed() { return wrapperContained.getSeed(); }
public yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public Object getAction() { return wrapperContained.getAction(); }
public java.lang.String getMetadata() { return wrapperContained.getMetadata(); }
public java.lang.String getTemplateName() { return wrapperContained.getTemplateName(); }
public boolean shouldShowAir() { return wrapperContained.shouldShowAir(); }
public yarnwrap.block.enums.StructureBlockMode getMode() { return new yarnwrap.block.enums.StructureBlockMode(wrapperContained.getMode()); }
public boolean shouldShowBoundingBox() { return wrapperContained.shouldShowBoundingBox(); }
public boolean shouldIgnoreEntities() { return wrapperContained.shouldIgnoreEntities(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}