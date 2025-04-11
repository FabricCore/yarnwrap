package yarnwrap.block.entity;
public class StructureBlockBlockEntity { public net.minecraft.block.entity.StructureBlockBlockEntity wrapperContained; public StructureBlockBlockEntity(net.minecraft.block.entity.StructureBlockBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos offset() { return new yarnwrap.util.math.BlockPos(wrapperContained.offset); }
// public void offset(yarnwrap.util.math.BlockPos value) { wrapperContained.offset = value.wrapperContained; }
// public yarnwrap.util.BlockMirror mirror() { return new yarnwrap.util.BlockMirror(wrapperContained.mirror); }
// public void mirror(yarnwrap.util.BlockMirror value) { wrapperContained.mirror = value.wrapperContained; }
// public yarnwrap.block.enums.StructureBlockMode mode() { return new yarnwrap.block.enums.StructureBlockMode(wrapperContained.mode); }
// public void mode(yarnwrap.block.enums.StructureBlockMode value) { wrapperContained.mode = value.wrapperContained; }
// public boolean showBoundingBox() { return wrapperContained.showBoundingBox; }
// public void showBoundingBox(boolean value) { wrapperContained.showBoundingBox = value; }
// public boolean showAir() { return wrapperContained.showAir; }
// public void showAir(boolean value) { wrapperContained.showAir = value; }
// public boolean powered() { return wrapperContained.powered; }
// public void powered(boolean value) { wrapperContained.powered = value; }
// public java.lang.String metadata() { return wrapperContained.metadata; }
// public void metadata(java.lang.String value) { wrapperContained.metadata = value; }
// public boolean ignoreEntities() { return wrapperContained.ignoreEntities; }
// public void ignoreEntities(boolean value) { wrapperContained.ignoreEntities = value; }
// public yarnwrap.util.math.Vec3i size() { return new yarnwrap.util.math.Vec3i(wrapperContained.size); }
// public void size(yarnwrap.util.math.Vec3i value) { wrapperContained.size = value.wrapperContained; }
// public float integrity() { return wrapperContained.integrity; }
// public void integrity(float value) { wrapperContained.integrity = value; }
// public yarnwrap.util.Identifier templateName() { return new yarnwrap.util.Identifier(wrapperContained.templateName); }
// public void templateName(yarnwrap.util.Identifier value) { wrapperContained.templateName = value.wrapperContained; }
// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public java.lang.String author() { return wrapperContained.author; }
// public void author(java.lang.String value) { wrapperContained.author = value; }
// public yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.BlockRotation value) { wrapperContained.rotation = value.wrapperContained; }
public java.lang.String AUTHOR_KEY() { return wrapperContained.AUTHOR_KEY; }
// public void AUTHOR_KEY(java.lang.String value) { wrapperContained.AUTHOR_KEY = value; }
public void setTemplateName(java.lang.String templateName) { wrapperContained.setTemplateName(templateName); }
public void setTemplateName(yarnwrap.util.Identifier templateName) { wrapperContained.setTemplateName(templateName.wrapperContained); }
public yarnwrap.util.BlockMirror getMirror() { return new yarnwrap.util.BlockMirror(wrapperContained.getMirror()); }
public float getIntegrity() { return wrapperContained.getIntegrity(); }
public void setShowAir(boolean showAir) { wrapperContained.setShowAir(showAir); }
// public void updateBlockMode() { wrapperContained.updateBlockMode(); }
public yarnwrap.util.math.Vec3i getSize() { return new yarnwrap.util.math.Vec3i(wrapperContained.getSize()); }
public boolean openScreen(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.openScreen(player.wrapperContained); }
public void setIgnoreEntities(boolean ignoreEntities) { wrapperContained.setIgnoreEntities(ignoreEntities); }
public yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation()); }
public boolean isPowered() { return wrapperContained.isPowered(); }
public void setMirror(yarnwrap.util.BlockMirror mirror) { wrapperContained.setMirror(mirror.wrapperContained); }
public boolean shouldShowBoundingBox() { return wrapperContained.shouldShowBoundingBox(); }
public java.lang.String getMetadata() { return wrapperContained.getMetadata(); }
public yarnwrap.util.math.BlockPos getOffset() { return new yarnwrap.util.math.BlockPos(wrapperContained.getOffset()); }
public void setShowBoundingBox(boolean showBoundingBox) { wrapperContained.setShowBoundingBox(showBoundingBox); }
public void unloadStructure() { wrapperContained.unloadStructure(); }
public java.lang.String getTemplateName() { return wrapperContained.getTemplateName(); }
public void setMetadata(java.lang.String metadata) { wrapperContained.setMetadata(metadata); }
public boolean saveStructure() { return wrapperContained.saveStructure(); }
public boolean saveStructure(boolean interactive) { return wrapperContained.saveStructure(interactive); }
public boolean shouldIgnoreEntities() { return wrapperContained.shouldIgnoreEntities(); }
public void setIntegrity(float integrity) { wrapperContained.setIntegrity(integrity); }
public long getSeed() { return wrapperContained.getSeed(); }
public boolean isStructureAvailable() { return wrapperContained.isStructureAvailable(); }
public void setAuthor(yarnwrap.entity.LivingEntity entity) { wrapperContained.setAuthor(entity.wrapperContained); }
public yarnwrap.block.enums.StructureBlockMode getMode() { return new yarnwrap.block.enums.StructureBlockMode(wrapperContained.getMode()); }
public boolean shouldShowAir() { return wrapperContained.shouldShowAir(); }
public boolean loadStructure(yarnwrap.server.world.ServerWorld world) { return wrapperContained.loadStructure(world.wrapperContained); }
public void setSize(yarnwrap.util.math.Vec3i size) { wrapperContained.setSize(size.wrapperContained); }
public void setOffset(yarnwrap.util.math.BlockPos offset) { wrapperContained.setOffset(offset.wrapperContained); }
public void setPowered(boolean powered) { wrapperContained.setPowered(powered); }
public void setMode(yarnwrap.block.enums.StructureBlockMode mode) { wrapperContained.setMode(mode.wrapperContained); }
public void setSeed(long seed) { wrapperContained.setSeed(seed); }
public boolean detectStructureSize() { return wrapperContained.detectStructureSize(); }
public boolean hasStructureName() { return wrapperContained.hasStructureName(); }
public void setRotation(yarnwrap.util.BlockRotation rotation) { wrapperContained.setRotation(rotation.wrapperContained); }
public yarnwrap.util.math.random.Random createRandom(long seed) { return new yarnwrap.util.math.random.Random(wrapperContained.createRandom(seed)); }
// public java.util.stream.Stream streamCornerPos(yarnwrap.util.math.BlockPos start,yarnwrap.util.math.BlockPos end) { return wrapperContained.streamCornerPos(start.wrapperContained,end.wrapperContained); }
// public java.util.Optional getStructureBox(yarnwrap.util.math.BlockPos pos,java.util.stream.Stream corners) { return wrapperContained.getStructureBox(pos.wrapperContained,corners); }
public boolean loadAndTryPlaceStructure(yarnwrap.server.world.ServerWorld world) { return wrapperContained.loadAndTryPlaceStructure(world.wrapperContained); }
// public void loadAndPlaceStructure(yarnwrap.server.world.ServerWorld world,yarnwrap.structure.StructureTemplate template) { wrapperContained.loadAndPlaceStructure(world.wrapperContained,template.wrapperContained); }
// public void loadStructure(yarnwrap.structure.StructureTemplate template) { wrapperContained.loadStructure(template.wrapperContained); }
public void loadAndPlaceStructure(yarnwrap.server.world.ServerWorld world) { wrapperContained.loadAndPlaceStructure(world.wrapperContained); }
// public yarnwrap.structure.StructureTemplate getStructureTemplate(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.structure.StructureTemplate(wrapperContained.getStructureTemplate(world.wrapperContained)); }

}