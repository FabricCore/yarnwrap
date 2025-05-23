package yarnwrap.block.entity;
public class TestInstanceBlockEntity { public net.minecraft.block.entity.TestInstanceBlockEntity wrapperContained; public TestInstanceBlockEntity(net.minecraft.block.entity.TestInstanceBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text INVALID_TEST_TEXT() { return new yarnwrap.text.Text(wrapperContained.INVALID_TEST_TEXT); }
// public void INVALID_TEST_TEXT(yarnwrap.text.Text value) { wrapperContained.INVALID_TEST_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text INVALID_TEST_TEXT() { return new yarnwrap.text.Text(net.minecraft.block.entity.TestInstanceBlockEntity.INVALID_TEST_TEXT); }
// public static void INVALID_TEST_TEXT(yarnwrap.text.Text value, ) { net.minecraft.block.entity.TestInstanceBlockEntity.INVALID_TEST_TEXT = value.wrapperContained; }

// public java.util.List CLEARED_BEAM_SEGMENTS() { return wrapperContained.CLEARED_BEAM_SEGMENTS; }
// public void CLEARED_BEAM_SEGMENTS(java.util.List value) { wrapperContained.CLEARED_BEAM_SEGMENTS = value; }
// public static java.util.List CLEARED_BEAM_SEGMENTS() { return net.minecraft.block.entity.TestInstanceBlockEntity.CLEARED_BEAM_SEGMENTS; }
// public static void CLEARED_BEAM_SEGMENTS(java.util.List value, ) { net.minecraft.block.entity.TestInstanceBlockEntity.CLEARED_BEAM_SEGMENTS = value; }

// public java.util.List RUNNING_BEAM_SEGMENTS() { return wrapperContained.RUNNING_BEAM_SEGMENTS; }
// public void RUNNING_BEAM_SEGMENTS(java.util.List value) { wrapperContained.RUNNING_BEAM_SEGMENTS = value; }
// public static java.util.List RUNNING_BEAM_SEGMENTS() { return net.minecraft.block.entity.TestInstanceBlockEntity.RUNNING_BEAM_SEGMENTS; }
// public static void RUNNING_BEAM_SEGMENTS(java.util.List value, ) { net.minecraft.block.entity.TestInstanceBlockEntity.RUNNING_BEAM_SEGMENTS = value; }

// public java.util.List SUCCESS_BEAM_SEGMENTS() { return wrapperContained.SUCCESS_BEAM_SEGMENTS; }
// public void SUCCESS_BEAM_SEGMENTS(java.util.List value) { wrapperContained.SUCCESS_BEAM_SEGMENTS = value; }
// public static java.util.List SUCCESS_BEAM_SEGMENTS() { return net.minecraft.block.entity.TestInstanceBlockEntity.SUCCESS_BEAM_SEGMENTS; }
// public static void SUCCESS_BEAM_SEGMENTS(java.util.List value, ) { net.minecraft.block.entity.TestInstanceBlockEntity.SUCCESS_BEAM_SEGMENTS = value; }

// public java.util.List REQUIRED_FAIL_BEAM_SEGMENTS() { return wrapperContained.REQUIRED_FAIL_BEAM_SEGMENTS; }
// public void REQUIRED_FAIL_BEAM_SEGMENTS(java.util.List value) { wrapperContained.REQUIRED_FAIL_BEAM_SEGMENTS = value; }
// public static java.util.List REQUIRED_FAIL_BEAM_SEGMENTS() { return net.minecraft.block.entity.TestInstanceBlockEntity.REQUIRED_FAIL_BEAM_SEGMENTS; }
// public static void REQUIRED_FAIL_BEAM_SEGMENTS(java.util.List value, ) { net.minecraft.block.entity.TestInstanceBlockEntity.REQUIRED_FAIL_BEAM_SEGMENTS = value; }

// public java.util.List OPTIONAL_FAIL_BEAM_SEGMENTS() { return wrapperContained.OPTIONAL_FAIL_BEAM_SEGMENTS; }
// public void OPTIONAL_FAIL_BEAM_SEGMENTS(java.util.List value) { wrapperContained.OPTIONAL_FAIL_BEAM_SEGMENTS = value; }
// public static java.util.List OPTIONAL_FAIL_BEAM_SEGMENTS() { return net.minecraft.block.entity.TestInstanceBlockEntity.OPTIONAL_FAIL_BEAM_SEGMENTS; }
// public static void OPTIONAL_FAIL_BEAM_SEGMENTS(java.util.List value, ) { net.minecraft.block.entity.TestInstanceBlockEntity.OPTIONAL_FAIL_BEAM_SEGMENTS = value; }

// public yarnwrap.util.math.Vec3i STRUCTURE_OFFSET() { return new yarnwrap.util.math.Vec3i(wrapperContained.STRUCTURE_OFFSET); }
// public void STRUCTURE_OFFSET(yarnwrap.util.math.Vec3i value) { wrapperContained.STRUCTURE_OFFSET = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3i STRUCTURE_OFFSET() { return new yarnwrap.util.math.Vec3i(net.minecraft.block.entity.TestInstanceBlockEntity.STRUCTURE_OFFSET); }
// public static void STRUCTURE_OFFSET(yarnwrap.util.math.Vec3i value, ) { net.minecraft.block.entity.TestInstanceBlockEntity.STRUCTURE_OFFSET = value.wrapperContained; }

// public Object data() { return wrapperContained.data; }
// // public void data(Object value) { wrapperContained.data = value; }
// // public static Object data() { return net.minecraft.block.entity.TestInstanceBlockEntity.data; }
// // public static void data(Object value, ) { net.minecraft.block.entity.TestInstanceBlockEntity.data = value; }

public TestInstanceBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.TestInstanceBlockEntity(pos.wrapperContained,state.wrapperContained); }
public boolean placeStructure() { return wrapperContained.placeStructure(); }
// public static boolean placeStructure() { return net.minecraft.block.entity.TestInstanceBlockEntity.placeStructure(); }
public yarnwrap.util.math.BlockPos getStartPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getStartPos()); }
// public static yarnwrap.util.math.BlockPos getStartPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.TestInstanceBlockEntity.getStartPos()); }
public void placeBarriers() { wrapperContained.placeBarriers(); }
// public static void placeBarriers() { net.minecraft.block.entity.TestInstanceBlockEntity.placeBarriers(); }
public void clearBarriers() { wrapperContained.clearBarriers(); }
// public static void clearBarriers() { net.minecraft.block.entity.TestInstanceBlockEntity.clearBarriers(); }
// public java.util.Optional getTestEntry() { return wrapperContained.getTestEntry(); }
// public static java.util.Optional getTestEntry() { return net.minecraft.block.entity.TestInstanceBlockEntity.getTestEntry(); }
// public yarnwrap.util.math.Vec3i getTransformedSize() { return new yarnwrap.util.math.Vec3i(wrapperContained.getTransformedSize()); }
// public static yarnwrap.util.math.Vec3i getTransformedSize() { return new yarnwrap.util.math.Vec3i(net.minecraft.block.entity.TestInstanceBlockEntity.getTransformedSize()); }
// public void discardEntities() { wrapperContained.discardEntities(); }
// public static void discardEntities() { net.minecraft.block.entity.TestInstanceBlockEntity.discardEntities(); }
// public void setChunksForced() { wrapperContained.setChunksForced(); }
// public static void setChunksForced() { net.minecraft.block.entity.TestInstanceBlockEntity.setChunksForced(); }
// public yarnwrap.text.Text method_66739(yarnwrap.registry.RegistryKey key) { return new yarnwrap.text.Text(wrapperContained.method_66739(key.wrapperContained)); }
// public static yarnwrap.text.Text method_66739(yarnwrap.registry.RegistryKey key, ) { return new yarnwrap.text.Text(net.minecraft.block.entity.TestInstanceBlockEntity.method_66739(key.wrapperContained)); }
// public java.util.Optional getStructureSize(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.RegistryKey testInstance) { return wrapperContained.getStructureSize(world.wrapperContained,testInstance.wrapperContained); }
// public static java.util.Optional getStructureSize(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.RegistryKey testInstance, ) { return net.minecraft.block.entity.TestInstanceBlockEntity.getStructureSize(world.wrapperContained,testInstance.wrapperContained); }
// public java.util.Optional method_66741(yarnwrap.server.world.ServerWorld structureId) { return wrapperContained.method_66741(structureId.wrapperContained); }
// public static java.util.Optional method_66741(yarnwrap.server.world.ServerWorld structureId, ) { return net.minecraft.block.entity.TestInstanceBlockEntity.method_66741(structureId.wrapperContained); }
// public boolean exportData(yarnwrap.server.world.ServerWorld world,yarnwrap.util.Identifier structureId,java.util.function.Consumer messageConsumer) { return wrapperContained.exportData(world.wrapperContained,structureId.wrapperContained,messageConsumer); }
// public static boolean exportData(yarnwrap.server.world.ServerWorld world,yarnwrap.util.Identifier structureId,java.util.function.Consumer messageConsumer, ) { return net.minecraft.block.entity.TestInstanceBlockEntity.exportData(world.wrapperContained,structureId.wrapperContained,messageConsumer); }
// public void method_66743(yarnwrap.server.world.ServerWorld pos) { wrapperContained.method_66743(pos.wrapperContained); }
// public static void method_66743(yarnwrap.server.world.ServerWorld pos, ) { net.minecraft.block.entity.TestInstanceBlockEntity.method_66743(pos.wrapperContained); }
// public void placeStructure(yarnwrap.server.world.ServerWorld world,yarnwrap.structure.StructureTemplate template) { wrapperContained.placeStructure(world.wrapperContained,template.wrapperContained); }
// public static void placeStructure(yarnwrap.server.world.ServerWorld world,yarnwrap.structure.StructureTemplate template, ) { net.minecraft.block.entity.TestInstanceBlockEntity.placeStructure(world.wrapperContained,template.wrapperContained); }
// public void setData(Object data) { wrapperContained.setData(data); }
// public static void setData(Object data, ) { net.minecraft.block.entity.TestInstanceBlockEntity.setData(data); }
public void reset(java.util.function.Consumer messageConsumer) { wrapperContained.reset(messageConsumer); }
// public static void reset(java.util.function.Consumer messageConsumer, ) { net.minecraft.block.entity.TestInstanceBlockEntity.reset(messageConsumer); }
// public yarnwrap.util.math.BlockPos getStructurePos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getStructurePos(pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getStructurePos(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.TestInstanceBlockEntity.getStructurePos(pos.wrapperContained)); }
// public void method_66748(yarnwrap.util.math.BlockPos pos) { wrapperContained.method_66748(pos.wrapperContained); }
// public static void method_66748(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.entity.TestInstanceBlockEntity.method_66748(pos.wrapperContained); }
// public java.lang.Boolean method_66749(Object entry) { return wrapperContained.method_66749(entry); }
// public static java.lang.Boolean method_66749(Object entry, ) { return net.minecraft.block.entity.TestInstanceBlockEntity.method_66749(entry); }
public void setErrorMessage(yarnwrap.text.Text errorMessage) { wrapperContained.setErrorMessage(errorMessage.wrapperContained); }
// public static void setErrorMessage(yarnwrap.text.Text errorMessage, ) { net.minecraft.block.entity.TestInstanceBlockEntity.setErrorMessage(errorMessage.wrapperContained); }
// public java.util.Optional getStructureTemplate(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.RegistryKey testInstance) { return wrapperContained.getStructureTemplate(world.wrapperContained,testInstance.wrapperContained); }
// public static java.util.Optional getStructureTemplate(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.RegistryKey testInstance, ) { return net.minecraft.block.entity.TestInstanceBlockEntity.getStructureTemplate(world.wrapperContained,testInstance.wrapperContained); }
public java.util.Optional saveStructure(java.util.function.Consumer messageConsumer) { return wrapperContained.saveStructure(messageConsumer); }
// public static java.util.Optional saveStructure(java.util.function.Consumer messageConsumer, ) { return net.minecraft.block.entity.TestInstanceBlockEntity.saveStructure(messageConsumer); }
// public void method_66754(yarnwrap.util.math.BlockPos pos) { wrapperContained.method_66754(pos.wrapperContained); }
// public static void method_66754(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.entity.TestInstanceBlockEntity.method_66754(pos.wrapperContained); }
// public yarnwrap.util.Identifier method_66755(Object entry) { return new yarnwrap.util.Identifier(wrapperContained.method_66755(entry)); }
// public static yarnwrap.util.Identifier method_66755(Object entry, ) { return new yarnwrap.util.Identifier(net.minecraft.block.entity.TestInstanceBlockEntity.method_66755(entry)); }
// public java.util.Optional method_66756(yarnwrap.server.world.ServerWorld template) { return wrapperContained.method_66756(template.wrapperContained); }
// public static java.util.Optional method_66756(yarnwrap.server.world.ServerWorld template, ) { return net.minecraft.block.entity.TestInstanceBlockEntity.method_66756(template.wrapperContained); }
public boolean export(java.util.function.Consumer messageConsumer) { return wrapperContained.export(messageConsumer); }
// public static boolean export(java.util.function.Consumer messageConsumer, ) { return net.minecraft.block.entity.TestInstanceBlockEntity.export(messageConsumer); }
// public void method_66758(yarnwrap.util.math.BlockPos pos) { wrapperContained.method_66758(pos.wrapperContained); }
// public static void method_66758(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.entity.TestInstanceBlockEntity.method_66758(pos.wrapperContained); }
public yarnwrap.util.math.BlockBox getBlockBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.getBlockBox()); }
// public static yarnwrap.util.math.BlockBox getBlockBox() { return new yarnwrap.util.math.BlockBox(net.minecraft.block.entity.TestInstanceBlockEntity.getBlockBox()); }
public void start(java.util.function.Consumer messageConsumer) { wrapperContained.start(messageConsumer); }
// public static void start(java.util.function.Consumer messageConsumer, ) { net.minecraft.block.entity.TestInstanceBlockEntity.start(messageConsumer); }
public void forEachPos(java.util.function.Consumer posConsumer) { wrapperContained.forEachPos(posConsumer); }
// public static void forEachPos(java.util.function.Consumer posConsumer, ) { net.minecraft.block.entity.TestInstanceBlockEntity.forEachPos(posConsumer); }
public yarnwrap.util.math.Box getBox() { return new yarnwrap.util.math.Box(wrapperContained.getBox()); }
// public static yarnwrap.util.math.Box getBox() { return new yarnwrap.util.math.Box(net.minecraft.block.entity.TestInstanceBlockEntity.getBox()); }
public java.util.Optional getTestKey() { return wrapperContained.getTestKey(); }
// public static java.util.Optional getTestKey() { return net.minecraft.block.entity.TestInstanceBlockEntity.getTestKey(); }
public yarnwrap.text.Text getTestName() { return new yarnwrap.text.Text(wrapperContained.getTestName()); }
// public static yarnwrap.text.Text getTestName() { return new yarnwrap.text.Text(net.minecraft.block.entity.TestInstanceBlockEntity.getTestName()); }
public boolean shouldIgnoreEntities() { return wrapperContained.shouldIgnoreEntities(); }
// public static boolean shouldIgnoreEntities() { return net.minecraft.block.entity.TestInstanceBlockEntity.shouldIgnoreEntities(); }
public yarnwrap.util.math.Vec3i getSize() { return new yarnwrap.util.math.Vec3i(wrapperContained.getSize()); }
// public static yarnwrap.util.math.Vec3i getSize() { return new yarnwrap.util.math.Vec3i(net.minecraft.block.entity.TestInstanceBlockEntity.getSize()); }
public yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation()); }
// public static yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(net.minecraft.block.entity.TestInstanceBlockEntity.getRotation()); }
public java.util.Optional getErrorMessage() { return wrapperContained.getErrorMessage(); }
// public static java.util.Optional getErrorMessage() { return net.minecraft.block.entity.TestInstanceBlockEntity.getErrorMessage(); }
public void setFinished() { wrapperContained.setFinished(); }
// public static void setFinished() { net.minecraft.block.entity.TestInstanceBlockEntity.setFinished(); }
public void setRunning() { wrapperContained.setRunning(); }
// public static void setRunning() { net.minecraft.block.entity.TestInstanceBlockEntity.setRunning(); }
public yarnwrap.util.math.BlockPos getStructurePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getStructurePos()); }
// public static yarnwrap.util.math.BlockPos getStructurePos() { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.TestInstanceBlockEntity.getStructurePos()); }
// public boolean method_67243(yarnwrap.entity.Entity entity) { return wrapperContained.method_67243(entity.wrapperContained); }
// public static boolean method_67243(yarnwrap.entity.Entity entity, ) { return net.minecraft.block.entity.TestInstanceBlockEntity.method_67243(entity.wrapperContained); }

}