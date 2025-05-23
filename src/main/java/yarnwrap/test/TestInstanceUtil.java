package yarnwrap.test;
public class TestInstanceUtil { public net.minecraft.test.TestInstanceUtil wrapperContained; public TestInstanceUtil(net.minecraft.test.TestInstanceUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path testStructuresDirectoryName() { return wrapperContained.testStructuresDirectoryName; }
// public void testStructuresDirectoryName(java.nio.file.Path value) { wrapperContained.testStructuresDirectoryName = value; }
public static java.nio.file.Path testStructuresDirectoryName() { return net.minecraft.test.TestInstanceUtil.testStructuresDirectoryName; }
// public static void testStructuresDirectoryName(java.nio.file.Path value, ) { net.minecraft.test.TestInstanceUtil.testStructuresDirectoryName = value; }

// public java.lang.String TEST_STRUCTURES_DIRECTORY_NAME() { return wrapperContained.TEST_STRUCTURES_DIRECTORY_NAME; }
// public void TEST_STRUCTURES_DIRECTORY_NAME(java.lang.String value) { wrapperContained.TEST_STRUCTURES_DIRECTORY_NAME = value; }
public static java.lang.String TEST_STRUCTURES_DIRECTORY_NAME() { return net.minecraft.test.TestInstanceUtil.TEST_STRUCTURES_DIRECTORY_NAME; }
// public static void TEST_STRUCTURES_DIRECTORY_NAME(java.lang.String value, ) { net.minecraft.test.TestInstanceUtil.TEST_STRUCTURES_DIRECTORY_NAME = value; }

// public boolean method_22241(yarnwrap.entity.Entity entity) { return wrapperContained.method_22241(entity.wrapperContained); }
// public static boolean method_22241(yarnwrap.entity.Entity entity, ) { return net.minecraft.test.TestInstanceUtil.method_22241(entity.wrapperContained); }
// public java.util.Optional findContainingTestInstanceBlock(yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.server.world.ServerWorld world) { return wrapperContained.findContainingTestInstanceBlock(pos.wrapperContained,radius,world.wrapperContained); }
// public static java.util.Optional findContainingTestInstanceBlock(yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.test.TestInstanceUtil.findContainingTestInstanceBlock(pos.wrapperContained,radius,world.wrapperContained); }
// public void clearArea(yarnwrap.util.math.BlockBox area,yarnwrap.server.world.ServerWorld world) { wrapperContained.clearArea(area.wrapperContained,world.wrapperContained); }
// public static void clearArea(yarnwrap.util.math.BlockBox area,yarnwrap.server.world.ServerWorld world, ) { net.minecraft.test.TestInstanceUtil.clearArea(area.wrapperContained,world.wrapperContained); }
// public boolean isInBounds(yarnwrap.util.math.BlockPos testInstanceBlockPos,yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world) { return wrapperContained.isInBounds(testInstanceBlockPos.wrapperContained,pos.wrapperContained,world.wrapperContained); }
// public static boolean isInBounds(yarnwrap.util.math.BlockPos testInstanceBlockPos,yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.test.TestInstanceUtil.isInBounds(testInstanceBlockPos.wrapperContained,pos.wrapperContained,world.wrapperContained); }
// public void method_22254(int pos) { wrapperContained.method_22254(pos); }
// public static void method_22254(int pos, ) { net.minecraft.test.TestInstanceUtil.method_22254(pos); }
// public java.util.Optional findNearestTestInstanceBlock(yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.server.world.ServerWorld world) { return wrapperContained.findNearestTestInstanceBlock(pos.wrapperContained,radius,world.wrapperContained); }
// public static java.util.Optional findNearestTestInstanceBlock(yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.test.TestInstanceUtil.findNearestTestInstanceBlock(pos.wrapperContained,radius,world.wrapperContained); }
// public java.util.stream.Stream findTestInstanceBlocks(yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.server.world.ServerWorld world) { return wrapperContained.findTestInstanceBlocks(pos.wrapperContained,radius,world.wrapperContained); }
// public static java.util.stream.Stream findTestInstanceBlocks(yarnwrap.util.math.BlockPos pos,int radius,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.test.TestInstanceUtil.findTestInstanceBlocks(pos.wrapperContained,radius,world.wrapperContained); }
// public void resetBlock(int altitude,yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world) { wrapperContained.resetBlock(altitude,pos.wrapperContained,world.wrapperContained); }
// public static void resetBlock(int altitude,yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world, ) { net.minecraft.test.TestInstanceUtil.resetBlock(altitude,pos.wrapperContained,world.wrapperContained); }
// public yarnwrap.util.BlockRotation getRotation(int steps) { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation(steps)); }
// public static yarnwrap.util.BlockRotation getRotation(int steps, ) { return new yarnwrap.util.BlockRotation(net.minecraft.test.TestInstanceUtil.getRotation(steps)); }
// public yarnwrap.util.math.BlockBox getTestInstanceBlockBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3i relativePos,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.math.BlockBox(wrapperContained.getTestInstanceBlockBox(pos.wrapperContained,relativePos.wrapperContained,rotation.wrapperContained)); }
// public static yarnwrap.util.math.BlockBox getTestInstanceBlockBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3i relativePos,yarnwrap.util.BlockRotation rotation, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.test.TestInstanceUtil.getTestInstanceBlockBox(pos.wrapperContained,relativePos.wrapperContained,rotation.wrapperContained)); }
// public int getRotationSteps(yarnwrap.util.BlockRotation rotation) { return wrapperContained.getRotationSteps(rotation.wrapperContained); }
// public static int getRotationSteps(yarnwrap.util.BlockRotation rotation, ) { return net.minecraft.test.TestInstanceUtil.getRotationSteps(rotation.wrapperContained); }
// public yarnwrap.util.math.BlockPos getTestInstanceBlockBoxCornerPos(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3i size,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.math.BlockPos(wrapperContained.getTestInstanceBlockBoxCornerPos(pos.wrapperContained,size.wrapperContained,rotation.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getTestInstanceBlockBoxCornerPos(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3i size,yarnwrap.util.BlockRotation rotation, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.test.TestInstanceUtil.getTestInstanceBlockBoxCornerPos(pos.wrapperContained,size.wrapperContained,rotation.wrapperContained)); }
// public java.util.stream.Stream findTargetedTestInstanceBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.server.world.ServerWorld world) { return wrapperContained.findTargetedTestInstanceBlock(pos.wrapperContained,entity.wrapperContained,world.wrapperContained); }
// public static java.util.stream.Stream findTargetedTestInstanceBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.test.TestInstanceUtil.findTargetedTestInstanceBlock(pos.wrapperContained,entity.wrapperContained,world.wrapperContained); }
// public yarnwrap.block.entity.TestInstanceBlockEntity createTestInstanceBlockEntity(yarnwrap.util.Identifier testInstanceId,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3i size,yarnwrap.util.BlockRotation rotation,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.block.entity.TestInstanceBlockEntity(wrapperContained.createTestInstanceBlockEntity(testInstanceId.wrapperContained,pos.wrapperContained,size.wrapperContained,rotation.wrapperContained,world.wrapperContained)); }
// public static yarnwrap.block.entity.TestInstanceBlockEntity createTestInstanceBlockEntity(yarnwrap.util.Identifier testInstanceId,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3i size,yarnwrap.util.BlockRotation rotation,yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.block.entity.TestInstanceBlockEntity(net.minecraft.test.TestInstanceUtil.createTestInstanceBlockEntity(testInstanceId.wrapperContained,pos.wrapperContained,size.wrapperContained,rotation.wrapperContained,world.wrapperContained)); }
// public java.util.Optional method_66993(yarnwrap.server.world.ServerWorld blockPos) { return wrapperContained.method_66993(blockPos.wrapperContained); }
// public static java.util.Optional method_66993(yarnwrap.server.world.ServerWorld blockPos, ) { return net.minecraft.test.TestInstanceUtil.method_66993(blockPos.wrapperContained); }
// public boolean method_66994(yarnwrap.util.math.Vec3d testInstanceBlockEntity) { return wrapperContained.method_66994(testInstanceBlockEntity.wrapperContained); }
// public static boolean method_66994(yarnwrap.util.math.Vec3d testInstanceBlockEntity, ) { return net.minecraft.test.TestInstanceUtil.method_66994(testInstanceBlockEntity.wrapperContained); }
// public boolean method_66995(yarnwrap.util.math.BlockPos blockPos) { return wrapperContained.method_66995(blockPos.wrapperContained); }
// public static boolean method_66995(yarnwrap.util.math.BlockPos blockPos, ) { return net.minecraft.test.TestInstanceUtil.method_66995(blockPos.wrapperContained); }
// public int method_66996(yarnwrap.util.math.BlockPos blockPos) { return wrapperContained.method_66996(blockPos.wrapperContained); }
// public static int method_66996(yarnwrap.util.math.BlockPos blockPos, ) { return net.minecraft.test.TestInstanceUtil.method_66996(blockPos.wrapperContained); }
// public boolean method_71143(yarnwrap.util.math.BlockPos poiPos) { return wrapperContained.method_71143(poiPos.wrapperContained); }
// public static boolean method_71143(yarnwrap.util.math.BlockPos poiPos, ) { return net.minecraft.test.TestInstanceUtil.method_71143(poiPos.wrapperContained); }
// public boolean method_71144(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_71144(poiType.wrapperContained); }
// public static boolean method_71144(yarnwrap.registry.entry.RegistryEntry poiType, ) { return net.minecraft.test.TestInstanceUtil.method_71144(poiType.wrapperContained); }

}