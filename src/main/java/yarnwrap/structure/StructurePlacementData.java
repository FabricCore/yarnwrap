package yarnwrap.structure;
public class StructurePlacementData { public net.minecraft.structure.StructurePlacementData wrapperContained; public StructurePlacementData(net.minecraft.structure.StructurePlacementData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.BlockMirror mirror() { return new yarnwrap.util.BlockMirror(wrapperContained.mirror); }
// public void mirror(yarnwrap.util.BlockMirror value) { wrapperContained.mirror = value.wrapperContained; }
// public static yarnwrap.util.BlockMirror mirror() { return new yarnwrap.util.BlockMirror(net.minecraft.structure.StructurePlacementData.mirror); }
// public static void mirror(yarnwrap.util.BlockMirror value, ) { net.minecraft.structure.StructurePlacementData.mirror = value.wrapperContained; }

// public yarnwrap.util.math.BlockBox boundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.boundingBox); }
// public void boundingBox(yarnwrap.util.math.BlockBox value) { wrapperContained.boundingBox = value.wrapperContained; }
// public static yarnwrap.util.math.BlockBox boundingBox() { return new yarnwrap.util.math.BlockBox(net.minecraft.structure.StructurePlacementData.boundingBox); }
// public static void boundingBox(yarnwrap.util.math.BlockBox value, ) { net.minecraft.structure.StructurePlacementData.boundingBox = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos position() { return new yarnwrap.util.math.BlockPos(wrapperContained.position); }
// public void position(yarnwrap.util.math.BlockPos value) { wrapperContained.position = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos position() { return new yarnwrap.util.math.BlockPos(net.minecraft.structure.StructurePlacementData.position); }
// public static void position(yarnwrap.util.math.BlockPos value, ) { net.minecraft.structure.StructurePlacementData.position = value.wrapperContained; }

// public yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.BlockRotation value) { wrapperContained.rotation = value.wrapperContained; }
// public static yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(net.minecraft.structure.StructurePlacementData.rotation); }
// public static void rotation(yarnwrap.util.BlockRotation value, ) { net.minecraft.structure.StructurePlacementData.rotation = value.wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.structure.StructurePlacementData.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.structure.StructurePlacementData.random = value.wrapperContained; }

// public boolean ignoreEntities() { return wrapperContained.ignoreEntities; }
// public void ignoreEntities(boolean value) { wrapperContained.ignoreEntities = value; }
// public static boolean ignoreEntities() { return net.minecraft.structure.StructurePlacementData.ignoreEntities; }
// public static void ignoreEntities(boolean value, ) { net.minecraft.structure.StructurePlacementData.ignoreEntities = value; }

// public java.util.List processors() { return wrapperContained.processors; }
// public void processors(java.util.List value) { wrapperContained.processors = value; }
// public static java.util.List processors() { return net.minecraft.structure.StructurePlacementData.processors; }
// public static void processors(java.util.List value, ) { net.minecraft.structure.StructurePlacementData.processors = value; }

// public boolean updateNeighbors() { return wrapperContained.updateNeighbors; }
// public void updateNeighbors(boolean value) { wrapperContained.updateNeighbors = value; }
// public static boolean updateNeighbors() { return net.minecraft.structure.StructurePlacementData.updateNeighbors; }
// public static void updateNeighbors(boolean value, ) { net.minecraft.structure.StructurePlacementData.updateNeighbors = value; }

// public boolean initializeMobs() { return wrapperContained.initializeMobs; }
// public void initializeMobs(boolean value) { wrapperContained.initializeMobs = value; }
// public static boolean initializeMobs() { return net.minecraft.structure.StructurePlacementData.initializeMobs; }
// public static void initializeMobs(boolean value, ) { net.minecraft.structure.StructurePlacementData.initializeMobs = value; }

// public yarnwrap.structure.StructureLiquidSettings liquidSettings() { return new yarnwrap.structure.StructureLiquidSettings(wrapperContained.liquidSettings); }
// public void liquidSettings(yarnwrap.structure.StructureLiquidSettings value) { wrapperContained.liquidSettings = value.wrapperContained; }
// public static yarnwrap.structure.StructureLiquidSettings liquidSettings() { return new yarnwrap.structure.StructureLiquidSettings(net.minecraft.structure.StructurePlacementData.liquidSettings); }
// public static void liquidSettings(yarnwrap.structure.StructureLiquidSettings value, ) { net.minecraft.structure.StructurePlacementData.liquidSettings = value.wrapperContained; }

public yarnwrap.structure.StructurePlacementData setRandom(yarnwrap.util.math.random.Random random) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setRandom(random.wrapperContained)); }
// public static yarnwrap.structure.StructurePlacementData setRandom(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.setRandom(random.wrapperContained)); }
public yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation()); }
// public static yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(net.minecraft.structure.StructurePlacementData.getRotation()); }
public yarnwrap.util.BlockMirror getMirror() { return new yarnwrap.util.BlockMirror(wrapperContained.getMirror()); }
// public static yarnwrap.util.BlockMirror getMirror() { return new yarnwrap.util.BlockMirror(net.minecraft.structure.StructurePlacementData.getMirror()); }
public yarnwrap.util.math.random.Random getRandom(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.random.Random(wrapperContained.getRandom(pos.wrapperContained)); }
// public static yarnwrap.util.math.random.Random getRandom(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.random.Random(net.minecraft.structure.StructurePlacementData.getRandom(pos.wrapperContained)); }
public yarnwrap.structure.StructurePlacementData setPosition(yarnwrap.util.math.BlockPos position) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setPosition(position.wrapperContained)); }
// public static yarnwrap.structure.StructurePlacementData setPosition(yarnwrap.util.math.BlockPos position, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.setPosition(position.wrapperContained)); }
public Object getRandomBlockInfos(java.util.List infoLists,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getRandomBlockInfos(infoLists,pos.wrapperContained); }
// public static Object getRandomBlockInfos(java.util.List infoLists,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.structure.StructurePlacementData.getRandomBlockInfos(infoLists,pos.wrapperContained); }
public yarnwrap.structure.StructurePlacementData setRotation(yarnwrap.util.BlockRotation rotation) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setRotation(rotation.wrapperContained)); }
// public static yarnwrap.structure.StructurePlacementData setRotation(yarnwrap.util.BlockRotation rotation, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.setRotation(rotation.wrapperContained)); }
public yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.getBoundingBox()); }
// public static yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(net.minecraft.structure.StructurePlacementData.getBoundingBox()); }
public yarnwrap.structure.StructurePlacementData setMirror(yarnwrap.util.BlockMirror mirror) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setMirror(mirror.wrapperContained)); }
// public static yarnwrap.structure.StructurePlacementData setMirror(yarnwrap.util.BlockMirror mirror, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.setMirror(mirror.wrapperContained)); }
public yarnwrap.structure.StructurePlacementData setBoundingBox(yarnwrap.util.math.BlockBox boundingBox) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setBoundingBox(boundingBox.wrapperContained)); }
// public static yarnwrap.structure.StructurePlacementData setBoundingBox(yarnwrap.util.math.BlockBox boundingBox, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.setBoundingBox(boundingBox.wrapperContained)); }
public yarnwrap.structure.StructurePlacementData copy() { return new yarnwrap.structure.StructurePlacementData(wrapperContained.copy()); }
// public static yarnwrap.structure.StructurePlacementData copy() { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.copy()); }
public yarnwrap.structure.StructurePlacementData setUpdateNeighbors(boolean updateNeighbors) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setUpdateNeighbors(updateNeighbors)); }
// public static yarnwrap.structure.StructurePlacementData setUpdateNeighbors(boolean updateNeighbors, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.setUpdateNeighbors(updateNeighbors)); }
public yarnwrap.structure.StructurePlacementData setIgnoreEntities(boolean ignoreEntities) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setIgnoreEntities(ignoreEntities)); }
// public static yarnwrap.structure.StructurePlacementData setIgnoreEntities(boolean ignoreEntities, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.setIgnoreEntities(ignoreEntities)); }
public yarnwrap.util.math.BlockPos getPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPosition()); }
// public static yarnwrap.util.math.BlockPos getPosition() { return new yarnwrap.util.math.BlockPos(net.minecraft.structure.StructurePlacementData.getPosition()); }
public boolean shouldIgnoreEntities() { return wrapperContained.shouldIgnoreEntities(); }
// public static boolean shouldIgnoreEntities() { return net.minecraft.structure.StructurePlacementData.shouldIgnoreEntities(); }
public java.util.List getProcessors() { return wrapperContained.getProcessors(); }
// public static java.util.List getProcessors() { return net.minecraft.structure.StructurePlacementData.getProcessors(); }
public yarnwrap.structure.StructurePlacementData clearProcessors() { return new yarnwrap.structure.StructurePlacementData(wrapperContained.clearProcessors()); }
// public static yarnwrap.structure.StructurePlacementData clearProcessors() { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.clearProcessors()); }
public yarnwrap.structure.StructurePlacementData addProcessor(yarnwrap.structure.processor.StructureProcessor processor) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.addProcessor(processor.wrapperContained)); }
// public static yarnwrap.structure.StructurePlacementData addProcessor(yarnwrap.structure.processor.StructureProcessor processor, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.addProcessor(processor.wrapperContained)); }
public boolean shouldUpdateNeighbors() { return wrapperContained.shouldUpdateNeighbors(); }
// public static boolean shouldUpdateNeighbors() { return net.minecraft.structure.StructurePlacementData.shouldUpdateNeighbors(); }
public yarnwrap.structure.StructurePlacementData removeProcessor(yarnwrap.structure.processor.StructureProcessor processor) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.removeProcessor(processor.wrapperContained)); }
// public static yarnwrap.structure.StructurePlacementData removeProcessor(yarnwrap.structure.processor.StructureProcessor processor, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.removeProcessor(processor.wrapperContained)); }
public yarnwrap.structure.StructurePlacementData setInitializeMobs(boolean initializeMobs) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setInitializeMobs(initializeMobs)); }
// public static yarnwrap.structure.StructurePlacementData setInitializeMobs(boolean initializeMobs, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.setInitializeMobs(initializeMobs)); }
public boolean shouldInitializeMobs() { return wrapperContained.shouldInitializeMobs(); }
// public static boolean shouldInitializeMobs() { return net.minecraft.structure.StructurePlacementData.shouldInitializeMobs(); }
public yarnwrap.structure.StructurePlacementData setLiquidSettings(yarnwrap.structure.StructureLiquidSettings liquidSettings) { return new yarnwrap.structure.StructurePlacementData(wrapperContained.setLiquidSettings(liquidSettings.wrapperContained)); }
// public static yarnwrap.structure.StructurePlacementData setLiquidSettings(yarnwrap.structure.StructureLiquidSettings liquidSettings, ) { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.StructurePlacementData.setLiquidSettings(liquidSettings.wrapperContained)); }
public boolean shouldApplyWaterlogging() { return wrapperContained.shouldApplyWaterlogging(); }
// public static boolean shouldApplyWaterlogging() { return net.minecraft.structure.StructurePlacementData.shouldApplyWaterlogging(); }

}