package yarnwrap.network.packet.c2s.play;
public class UpdateStructureBlockC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateStructureBlockC2SPacket wrapperContained; public UpdateStructureBlockC2SPacket(net.minecraft.network.packet.c2s.play.UpdateStructureBlockC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String templateName() { return wrapperContained.templateName; }
// public void templateName(java.lang.String value) { wrapperContained.templateName = value; }
// public yarnwrap.util.BlockMirror mirror() { return new yarnwrap.util.BlockMirror(wrapperContained.mirror); }
// public void mirror(yarnwrap.util.BlockMirror value) { wrapperContained.mirror = value.wrapperContained; }
// public Object action() { return wrapperContained.action; }
// // public void action(Object value) { wrapperContained.action = value; }
// public yarnwrap.util.math.Vec3i size() { return new yarnwrap.util.math.Vec3i(wrapperContained.size); }
// public void size(yarnwrap.util.math.Vec3i value) { wrapperContained.size = value.wrapperContained; }
// public yarnwrap.block.enums.StructureBlockMode mode() { return new yarnwrap.block.enums.StructureBlockMode(wrapperContained.mode); }
// public void mode(yarnwrap.block.enums.StructureBlockMode value) { wrapperContained.mode = value.wrapperContained; }
// public java.lang.String metadata() { return wrapperContained.metadata; }
// public void metadata(java.lang.String value) { wrapperContained.metadata = value; }
// public boolean showBoundingBox() { return wrapperContained.showBoundingBox; }
// public void showBoundingBox(boolean value) { wrapperContained.showBoundingBox = value; }
// public boolean showAir() { return wrapperContained.showAir; }
// public void showAir(boolean value) { wrapperContained.showAir = value; }
// public yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.BlockRotation value) { wrapperContained.rotation = value.wrapperContained; }
// public boolean ignoreEntities() { return wrapperContained.ignoreEntities; }
// public void ignoreEntities(boolean value) { wrapperContained.ignoreEntities = value; }
// public float integrity() { return wrapperContained.integrity; }
// public void integrity(float value) { wrapperContained.integrity = value; }
// public yarnwrap.util.math.BlockPos offset() { return new yarnwrap.util.math.BlockPos(wrapperContained.offset); }
// public void offset(yarnwrap.util.math.BlockPos value) { wrapperContained.offset = value.wrapperContained; }
// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public int IGNORE_ENTITIES_MASK() { return wrapperContained.IGNORE_ENTITIES_MASK; }
// public void IGNORE_ENTITIES_MASK(int value) { wrapperContained.IGNORE_ENTITIES_MASK = value; }
// public int SHOW_AIR_MASK() { return wrapperContained.SHOW_AIR_MASK; }
// public void SHOW_AIR_MASK(int value) { wrapperContained.SHOW_AIR_MASK = value; }
// public int SHOW_BOUNDING_BOX_MASK() { return wrapperContained.SHOW_BOUNDING_BOX_MASK; }
// public void SHOW_BOUNDING_BOX_MASK(int value) { wrapperContained.SHOW_BOUNDING_BOX_MASK = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
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