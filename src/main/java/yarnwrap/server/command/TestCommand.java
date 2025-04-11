package yarnwrap.server.command;
public class TestCommand { public net.minecraft.server.command.TestCommand wrapperContained; public TestCommand(net.minecraft.server.command.TestCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String BLOCK_ENTITY_NOT_FOUND_TEXT() { return wrapperContained.BLOCK_ENTITY_NOT_FOUND_TEXT; }
// public void BLOCK_ENTITY_NOT_FOUND_TEXT(java.lang.String value) { wrapperContained.BLOCK_ENTITY_NOT_FOUND_TEXT = value; }
// public Object RUNNERS() { return wrapperContained.RUNNERS; }
// // public void RUNNERS(Object value) { wrapperContained.RUNNERS = value; }
// public void method_22263(java.lang.String player) { wrapperContained.method_22263(player); }
// public int executePos(yarnwrap.server.command.ServerCommandSource source,java.lang.String variableName) { return wrapperContained.executePos(source.wrapperContained,variableName); }
// public int executeCreate(yarnwrap.server.command.ServerCommandSource source,java.lang.String testName,int x,int y,int z) { return wrapperContained.executeCreate(source.wrapperContained,testName,x,y,z); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public void sendMessage(yarnwrap.server.world.ServerWorld world,java.lang.String message,yarnwrap.util.Formatting formatting) { wrapperContained.sendMessage(world.wrapperContained,message,formatting.wrapperContained); }
// public boolean method_22276(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.method_22276(player.wrapperContained); }
// public void sendMessage(yarnwrap.server.command.ServerCommandSource source,java.lang.String message) { wrapperContained.sendMessage(source.wrapperContained,message); }
// public int executeExport(yarnwrap.server.command.ServerCommandSource source,java.lang.String testName) { return wrapperContained.executeExport(source.wrapperContained,testName); }
// public int method_22283(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22283(context); }
// public int executeImport(yarnwrap.server.command.ServerCommandSource source,java.lang.String testName) { return wrapperContained.executeImport(source.wrapperContained,testName); }
// public int method_22286(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22286(context); }
// public int method_22287(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22287(context); }
// public int method_22288(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22288(context); }
// public int method_22289(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22289(context); }
// public int method_22290(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22290(context); }
// public int method_23648(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_23648(context); }
// public yarnwrap.util.math.BlockPos getStructurePos(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.util.math.BlockPos(wrapperContained.getStructurePos(source.wrapperContained)); }
// public boolean checkStructure(yarnwrap.server.world.ServerWorld world,java.lang.String templateId) { return wrapperContained.checkStructure(world.wrapperContained,templateId); }
// public int export(yarnwrap.server.command.ServerCommandSource source,yarnwrap.block.entity.StructureBlockBlockEntity blockEntity) { return wrapperContained.export(source.wrapperContained,blockEntity.wrapperContained); }
// public int stop() { return wrapperContained.stop(); }
// public yarnwrap.test.GameTestState method_56255(int testFunction) { return new yarnwrap.test.GameTestState(wrapperContained.method_56255(testFunction)); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_56256(com.mojang.brigadier.builder.ArgumentBuilder extraConfigAdder) { return wrapperContained.method_56256(extraConfigAdder); }
// public com.mojang.brigadier.builder.ArgumentBuilder testAttemptConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,java.util.function.Function callback) { return wrapperContained.testAttemptConfig(builder,callback); }
// public com.mojang.brigadier.builder.ArgumentBuilder testAttemptConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,java.util.function.Function callback,java.util.function.Function extraConfigAdder) { return wrapperContained.testAttemptConfig(builder,callback,extraConfigAdder); }
// public int start(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.world.ServerWorld world,yarnwrap.test.TestRunContext context) { return wrapperContained.start(source.wrapperContained,world.wrapperContained,context.wrapperContained); }
// public java.util.Optional method_56260(yarnwrap.server.command.ServerCommandSource pos) { return wrapperContained.method_56260(pos.wrapperContained); }
// public java.util.stream.Stream stream(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestAttemptConfig config,yarnwrap.test.StructureBlockFinder finder) { return wrapperContained.stream(source.wrapperContained,config.wrapperContained,finder.wrapperContained); }
// public java.util.stream.Stream stream(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestAttemptConfig config,yarnwrap.test.TestFunctionFinder finder,int rotationSteps) { return wrapperContained.stream(source.wrapperContained,config.wrapperContained,finder.wrapperContained,rotationSteps); }
// public boolean method_56263(yarnwrap.server.command.ServerCommandSource testFunction) { return wrapperContained.method_56263(testFunction.wrapperContained); }
// public java.util.Optional find(yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world,yarnwrap.test.TestAttemptConfig config) { return wrapperContained.find(pos.wrapperContained,world.wrapperContained,config.wrapperContained); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_56265(java.util.function.Function extraConfigAdder) { return wrapperContained.method_56265(extraConfigAdder); }
// public int method_56266(java.util.function.Function context) { return wrapperContained.method_56266(context); }
// public int reset(yarnwrap.test.GameTestState state) { return wrapperContained.reset(state.wrapperContained); }
// public com.mojang.brigadier.builder.ArgumentBuilder testAttemptAndPlacementConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,java.util.function.Function callback) { return wrapperContained.testAttemptAndPlacementConfig(builder,callback); }
// public int method_56269(java.util.function.Function context) { return wrapperContained.method_56269(context); }
// public void method_56270(yarnwrap.test.GameTestState state) { wrapperContained.method_56270(state.wrapperContained); }
// public int method_56271(java.util.function.Function context) { return wrapperContained.method_56271(context); }
// public int method_56272(java.util.function.Function context) { return wrapperContained.method_56272(context); }
// public int method_56273(java.util.function.Function context) { return wrapperContained.method_56273(context); }
// public int method_56274(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56274(context); }
// public int method_56275(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56275(context); }
// public int method_56276(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56276(context); }
// public int method_56277(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56277(context); }
// public int method_56278(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56278(context); }
// public int method_56279(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56279(context); }
// public int method_56280(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56280(context); }
// public int method_56281(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56281(context); }
// public int method_56282(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56282(context); }
// public int method_56283(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56283(context); }
// public int method_56284(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56284(context); }
// public Object method_56285(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56285(context); }
// public Object method_56286(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56286(context); }
// public Object method_56287(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56287(context); }
// public void method_57105(yarnwrap.server.world.ServerWorld pos) { wrapperContained.method_57105(pos.wrapperContained); }
// public void method_57106(yarnwrap.entity.Entity entity) { wrapperContained.method_57106(entity.wrapperContained); }
// public int method_57963(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_57963(context); }
// public int method_57964(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_57964(context); }
// public int method_59786(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_59786(context); }
// public int method_61102(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_61102(context); }
// public int method_61103(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_61103(context); }

}