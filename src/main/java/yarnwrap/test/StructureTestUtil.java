package yarnwrap.test;
public class StructureTestUtil { public net.minecraft.test.StructureTestUtil wrapperContained; public StructureTestUtil(net.minecraft.test.StructureTestUtil wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String testStructuresDirectoryName() { return wrapperContained.testStructuresDirectoryName; }
public void testStructuresDirectoryName(java.lang.String value) { wrapperContained.testStructuresDirectoryName = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public java.lang.String TEST_STRUCTURES_DIRECTORY_NAME() { return wrapperContained.TEST_STRUCTURES_DIRECTORY_NAME; }
// public void TEST_STRUCTURES_DIRECTORY_NAME(java.lang.String value) { wrapperContained.TEST_STRUCTURES_DIRECTORY_NAME = value; }
// public boolean method_22241(yarnwrap.entity.Entity entity) { return wrapperContained.method_22241(entity.wrapperContained); }
public yarnwrap.util.math.Box getStructureBoundingBox(yarnwrap.block.entity.StructureBlockBlockEntity structureBlockEntity) { return new yarnwrap.util.math.Box(wrapperContained.getStructureBoundingBox(structureBlockEntity.wrapperContained)); }
public java.util.Optional findContainingStructureBlock(yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.server.world.ServerWorld world) { return wrapperContained.findContainingStructureBlock(pos.wrapperContained,radius,world.wrapperContained); }
// public int method_22245(yarnwrap.util.math.BlockPos posx) { return wrapperContained.method_22245(posx.wrapperContained); }
public void clearArea(yarnwrap.util.math.BlockBox area,yarnwrap.server.world.ServerWorld world) { wrapperContained.clearArea(area.wrapperContained,world.wrapperContained); }
// public boolean isInStructureBounds(yarnwrap.util.math.BlockPos structureBlockPos,yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world) { return wrapperContained.isInStructureBounds(structureBlockPos.wrapperContained,pos.wrapperContained,world.wrapperContained); }
public void placeStartButton(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos relativePos,yarnwrap.util.BlockRotation rotation,yarnwrap.server.world.ServerWorld world) { wrapperContained.placeStartButton(pos.wrapperContained,relativePos.wrapperContained,rotation.wrapperContained,world.wrapperContained); }
// public boolean method_22249(yarnwrap.util.math.BlockPos structureBlockPos) { return wrapperContained.method_22249(structureBlockPos.wrapperContained); }
public void createTestArea(java.lang.String testName,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3i relativePos,yarnwrap.util.BlockRotation rotation,yarnwrap.server.world.ServerWorld world) { wrapperContained.createTestArea(testName,pos.wrapperContained,relativePos.wrapperContained,rotation.wrapperContained,world.wrapperContained); }
// public yarnwrap.block.entity.StructureBlockBlockEntity placeStructureTemplate(yarnwrap.test.GameTestState state,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.block.entity.StructureBlockBlockEntity(wrapperContained.placeStructureTemplate(state.wrapperContained,pos.wrapperContained,rotation.wrapperContained,world.wrapperContained)); }
// public void method_22254(int pos) { wrapperContained.method_22254(pos); }
public java.util.Optional findNearestStructureBlock(yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.server.world.ServerWorld world) { return wrapperContained.findNearestStructureBlock(pos.wrapperContained,radius,world.wrapperContained); }
// public void forceLoadNearbyChunks(yarnwrap.util.math.BlockBox box,yarnwrap.server.world.ServerWorld world) { wrapperContained.forceLoadNearbyChunks(box.wrapperContained,world.wrapperContained); }
public java.util.stream.Stream findStructureBlocks(yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.server.world.ServerWorld world) { return wrapperContained.findStructureBlocks(pos.wrapperContained,radius,world.wrapperContained); }
// public void resetBlock(int altitude,yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world) { wrapperContained.resetBlock(altitude,pos.wrapperContained,world.wrapperContained); }
public yarnwrap.util.BlockRotation getRotation(int steps) { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation(steps)); }
public yarnwrap.util.math.BlockBox getStructureBlockBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3i relativePos,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.math.BlockBox(wrapperContained.getStructureBlockBox(pos.wrapperContained,relativePos.wrapperContained,rotation.wrapperContained)); }
public yarnwrap.util.math.BlockBox getStructureBlockBox(yarnwrap.block.entity.StructureBlockBlockEntity structureBlockEntity) { return new yarnwrap.util.math.BlockBox(wrapperContained.getStructureBlockBox(structureBlockEntity.wrapperContained)); }
public int getRotationSteps(yarnwrap.util.BlockRotation rotation) { return wrapperContained.getRotationSteps(rotation.wrapperContained); }
// public boolean method_54845(yarnwrap.server.world.ServerWorld p) { return wrapperContained.method_54845(p.wrapperContained); }
public yarnwrap.util.math.BlockPos getStructureBlockBoxCornerPos(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3i size,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.math.BlockPos(wrapperContained.getStructureBlockBoxCornerPos(pos.wrapperContained,size.wrapperContained,rotation.wrapperContained)); }
public yarnwrap.util.math.BlockPos getStructureBlockPos(yarnwrap.block.entity.StructureBlockBlockEntity structureBlockEntity) { return new yarnwrap.util.math.BlockPos(wrapperContained.getStructureBlockPos(structureBlockEntity.wrapperContained)); }
// public void method_54901(yarnwrap.server.world.ServerWorld chunkPos) { wrapperContained.method_54901(chunkPos.wrapperContained); }
public yarnwrap.block.entity.StructureBlockBlockEntity initStructure(yarnwrap.test.GameTestState state,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.block.entity.StructureBlockBlockEntity(wrapperContained.initStructure(state.wrapperContained,pos.wrapperContained,rotation.wrapperContained,world.wrapperContained)); }
// public java.util.Optional method_56250(yarnwrap.server.world.ServerWorld p) { return wrapperContained.method_56250(p.wrapperContained); }
// public boolean method_56251(yarnwrap.util.math.Vec3d blockEntity) { return wrapperContained.method_56251(blockEntity.wrapperContained); }
public java.util.stream.Stream findTargetedStructureBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.server.world.ServerWorld world) { return wrapperContained.findTargetedStructureBlock(pos.wrapperContained,entity.wrapperContained,world.wrapperContained); }
public void clearBarrierBox(yarnwrap.util.math.Box box,yarnwrap.server.world.ServerWorld world) { wrapperContained.clearBarrierBox(box.wrapperContained,world.wrapperContained); }
public void placeBarrierBox(yarnwrap.util.math.Box box,yarnwrap.server.world.ServerWorld world,boolean noSkyAccess) { wrapperContained.placeBarrierBox(box.wrapperContained,world.wrapperContained,noSkyAccess); }
// public void method_57103(yarnwrap.util.math.BlockPos pos) { wrapperContained.method_57103(pos.wrapperContained); }
// public void method_57104(yarnwrap.util.math.BlockPos pos) { wrapperContained.method_57104(pos.wrapperContained); }
public java.util.stream.Stream findStructureBlocks(yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.server.world.ServerWorld world,java.lang.String templateName) { return wrapperContained.findStructureBlocks(pos.wrapperContained,radius,world.wrapperContained,templateName); }
// public boolean method_59783(java.lang.String blockEntity) { return wrapperContained.method_59783(blockEntity); }
// public yarnwrap.block.entity.StructureBlockBlockEntity method_59784(yarnwrap.server.world.ServerWorld posx) { return new yarnwrap.block.entity.StructureBlockBlockEntity(wrapperContained.method_59784(posx.wrapperContained)); }
// public yarnwrap.util.math.BlockBox createBox(yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.util.math.BlockBox(wrapperContained.createBox(pos.wrapperContained,radius,world.wrapperContained)); }

}