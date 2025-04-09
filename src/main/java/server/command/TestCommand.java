package yarnwrap.server.command;
public class TestCommand { public net.minecraft.server.command.TestCommand wrapperContained; public TestCommand(net.minecraft.server.command.TestCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String BLOCK_ENTITY_NOT_FOUND_TEXT() { return wrapperContained.BLOCK_ENTITY_NOT_FOUND_TEXT; }
// public Object RUNNERS() { return wrapperContained.RUNNERS; }
// public int executePos(yarnwrap.server.command.ServerCommandSource source,java.lang.String variableName) { return wrapperContained.executePos(source.wrapperContained,variableName); }
// public int executeCreate(yarnwrap.server.command.ServerCommandSource source,java.lang.String testName,int x,int y,int z) { return wrapperContained.executeCreate(source.wrapperContained,testName,x,y,z); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public void sendMessage(yarnwrap.server.world.ServerWorld world,java.lang.String message,yarnwrap.util.Formatting formatting) { wrapperContained.sendMessage(world.wrapperContained,message,formatting.wrapperContained); }
// public void sendMessage(yarnwrap.server.command.ServerCommandSource source,java.lang.String message) { wrapperContained.sendMessage(source.wrapperContained,message); }
// public int executeExport(yarnwrap.server.command.ServerCommandSource source,java.lang.String testName) { return wrapperContained.executeExport(source.wrapperContained,testName); }
// public int executeImport(yarnwrap.server.command.ServerCommandSource source,java.lang.String testName) { return wrapperContained.executeImport(source.wrapperContained,testName); }
// public yarnwrap.util.math.BlockPos getStructurePos(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.util.math.BlockPos(wrapperContained.getStructurePos(source.wrapperContained)); }
// public boolean checkStructure(yarnwrap.server.world.ServerWorld world,java.lang.String templateId) { return wrapperContained.checkStructure(world.wrapperContained,templateId); }
// public int export(yarnwrap.server.command.ServerCommandSource source,yarnwrap.block.entity.StructureBlockBlockEntity blockEntity) { return wrapperContained.export(source.wrapperContained,blockEntity.wrapperContained); }
// public int stop() { return wrapperContained.stop(); }
// public com.mojang.brigadier.builder.ArgumentBuilder testAttemptConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,java.util.function.Function callback) { return wrapperContained.testAttemptConfig(builder,callback); }
// public com.mojang.brigadier.builder.ArgumentBuilder testAttemptConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,java.util.function.Function callback,java.util.function.Function extraConfigAdder) { return wrapperContained.testAttemptConfig(builder,callback,extraConfigAdder); }
// public int start(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.world.ServerWorld world,yarnwrap.test.TestRunContext context) { return wrapperContained.start(source.wrapperContained,world.wrapperContained,context.wrapperContained); }
// public java.util.stream.Stream stream(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestAttemptConfig config,yarnwrap.test.StructureBlockFinder finder) { return wrapperContained.stream(source.wrapperContained,config.wrapperContained,finder.wrapperContained); }
// public java.util.stream.Stream stream(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestAttemptConfig config,yarnwrap.test.TestFunctionFinder finder,int rotationSteps) { return wrapperContained.stream(source.wrapperContained,config.wrapperContained,finder.wrapperContained,rotationSteps); }
// public java.util.Optional find(yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world,yarnwrap.test.TestAttemptConfig config) { return wrapperContained.find(pos.wrapperContained,world.wrapperContained,config.wrapperContained); }
// public int reset(yarnwrap.test.GameTestState state) { return wrapperContained.reset(state.wrapperContained); }
// public com.mojang.brigadier.builder.ArgumentBuilder testAttemptAndPlacementConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,java.util.function.Function callback) { return wrapperContained.testAttemptAndPlacementConfig(builder,callback); }

}