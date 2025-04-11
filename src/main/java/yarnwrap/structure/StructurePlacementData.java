package yarnwrap.structure;
public class StructurePlacementData { public net.minecraft.structure.StructurePlacementData wrapperContained; public StructurePlacementData(net.minecraft.structure.StructurePlacementData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.BlockMirror mirror() { return new yarnwrap.util.BlockMirror(wrapperContained.mirror); }
// public void mirror(yarnwrap.util.BlockMirror value) { wrapperContained.mirror = value.wrapperContained; }
// public yarnwrap.util.math.BlockBox boundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.boundingBox); }
// public void boundingBox(yarnwrap.util.math.BlockBox value) { wrapperContained.boundingBox = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos position() { return new yarnwrap.util.math.BlockPos(wrapperContained.position); }
// public void position(yarnwrap.util.math.BlockPos value) { wrapperContained.position = value.wrapperContained; }
// public yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.BlockRotation value) { wrapperContained.rotation = value.wrapperContained; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public boolean ignoreEntities() { return wrapperContained.ignoreEntities; }
// public void ignoreEntities(boolean value) { wrapperContained.ignoreEntities = value; }
// public java.util.List processors() { return wrapperContained.processors; }
// public void processors(java.util.List value) { wrapperContained.processors = value; }
// public boolean updateNeighbors() { return wrapperContained.updateNeighbors; }
// public void updateNeighbors(boolean value) { wrapperContained.updateNeighbors = value; }
// public boolean initializeMobs() { return wrapperContained.initializeMobs; }
// public void initializeMobs(boolean value) { wrapperContained.initializeMobs = value; }
// public yarnwrap.structure.StructureLiquidSettings liquidSettings() { return new yarnwrap.structure.StructureLiquidSettings(wrapperContained.liquidSettings); }
// public void liquidSettings(yarnwrap.structure.StructureLiquidSettings value) { wrapperContained.liquidSettings = value.wrapperContained; }
public yarnwrap.structure.StructurePlacementData setRandom(yarnwrap.util.math.random.Random random) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setRandom(random.wrapperContained)); }
public yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation()); }
public yarnwrap.util.BlockMirror getMirror() { return new yarnwrap.util.BlockMirror(wrapperContained.getMirror()); }
public yarnwrap.util.math.random.Random getRandom(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.random.Random(wrapperContained.getRandom(pos.wrapperContained)); }
public yarnwrap.structure.StructurePlacementData setPosition(yarnwrap.util.math.BlockPos position) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setPosition(position.wrapperContained)); }
public Object getRandomBlockInfos(java.util.List infoLists,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getRandomBlockInfos(infoLists,pos.wrapperContained); }
public yarnwrap.structure.StructurePlacementData setRotation(yarnwrap.util.BlockRotation rotation) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setRotation(rotation.wrapperContained)); }
public yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.getBoundingBox()); }
public yarnwrap.structure.StructurePlacementData setMirror(yarnwrap.util.BlockMirror mirror) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setMirror(mirror.wrapperContained)); }
public yarnwrap.structure.StructurePlacementData setBoundingBox(yarnwrap.util.math.BlockBox boundingBox) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setBoundingBox(boundingBox.wrapperContained)); }
public yarnwrap.structure.StructurePlacementData copy() { return new yarnwrap.structure.StructurePlacementData(wrapperContained.copy()); }
public yarnwrap.structure.StructurePlacementData setUpdateNeighbors(boolean updateNeighbors) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setUpdateNeighbors(updateNeighbors)); }
public yarnwrap.structure.StructurePlacementData setIgnoreEntities(boolean ignoreEntities) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setIgnoreEntities(ignoreEntities)); }
public yarnwrap.util.math.BlockPos getPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPosition()); }
public boolean shouldIgnoreEntities() { return wrapperContained.shouldIgnoreEntities(); }
public java.util.List getProcessors() { return wrapperContained.getProcessors(); }
public yarnwrap.structure.StructurePlacementData clearProcessors() { return new yarnwrap.structure.StructurePlacementData(wrapperContained.clearProcessors()); }
public yarnwrap.structure.StructurePlacementData addProcessor(yarnwrap.structure.processor.StructureProcessor processor) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.addProcessor(processor.wrapperContained)); }
public boolean shouldUpdateNeighbors() { return wrapperContained.shouldUpdateNeighbors(); }
public yarnwrap.structure.StructurePlacementData removeProcessor(yarnwrap.structure.processor.StructureProcessor processor) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.removeProcessor(processor.wrapperContained)); }
public yarnwrap.structure.StructurePlacementData setInitializeMobs(boolean initializeMobs) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setInitializeMobs(initializeMobs)); }
public boolean shouldInitializeMobs() { return wrapperContained.shouldInitializeMobs(); }
public yarnwrap.structure.StructurePlacementData setLiquidSettings(yarnwrap.structure.StructureLiquidSettings liquidSettings) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setLiquidSettings(liquidSettings.wrapperContained)); }
public boolean shouldApplyWaterlogging() { return wrapperContained.shouldApplyWaterlogging(); }

}