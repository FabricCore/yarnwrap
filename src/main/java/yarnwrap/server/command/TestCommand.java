package yarnwrap.server.command;
public class TestCommand { public net.minecraft.server.command.TestCommand wrapperContained; public TestCommand(net.minecraft.server.command.TestCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_TESTS_TO_CLEAR_EXCEPTION() { return wrapperContained.NO_TESTS_TO_CLEAR_EXCEPTION; }
// public void NO_TESTS_TO_CLEAR_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NO_TESTS_TO_CLEAR_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_TESTS_TO_CLEAR_EXCEPTION() { return net.minecraft.server.command.TestCommand.NO_TESTS_TO_CLEAR_EXCEPTION; }
// public static void NO_TESTS_TO_CLEAR_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.TestCommand.NO_TESTS_TO_CLEAR_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TEST_INSTANCE_NOT_FOUND_EXCEPTION() { return wrapperContained.TEST_INSTANCE_NOT_FOUND_EXCEPTION; }
// public void TEST_INSTANCE_NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.TEST_INSTANCE_NOT_FOUND_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType TEST_INSTANCE_NOT_FOUND_EXCEPTION() { return net.minecraft.server.command.TestCommand.TEST_INSTANCE_NOT_FOUND_EXCEPTION; }
// public static void TEST_INSTANCE_NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.TestCommand.TEST_INSTANCE_NOT_FOUND_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXPORT_STRUCTURES_NOT_FOUND_EXCEPTION() { return wrapperContained.EXPORT_STRUCTURES_NOT_FOUND_EXCEPTION; }
// public void EXPORT_STRUCTURES_NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.EXPORT_STRUCTURES_NOT_FOUND_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXPORT_STRUCTURES_NOT_FOUND_EXCEPTION() { return net.minecraft.server.command.TestCommand.EXPORT_STRUCTURES_NOT_FOUND_EXCEPTION; }
// public static void EXPORT_STRUCTURES_NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.TestCommand.EXPORT_STRUCTURES_NOT_FOUND_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_TEST_INSTANCES_EXCEPTION() { return wrapperContained.NO_TEST_INSTANCES_EXCEPTION; }
// public void NO_TEST_INSTANCES_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NO_TEST_INSTANCES_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_TEST_INSTANCES_EXCEPTION() { return net.minecraft.server.command.TestCommand.NO_TEST_INSTANCES_EXCEPTION; }
// public static void NO_TEST_INSTANCES_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.TestCommand.NO_TEST_INSTANCES_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType NO_TEST_CONTAINING_POS_EXCEPTION() { return wrapperContained.NO_TEST_CONTAINING_POS_EXCEPTION; }
// public void NO_TEST_CONTAINING_POS_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value) { wrapperContained.NO_TEST_CONTAINING_POS_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType NO_TEST_CONTAINING_POS_EXCEPTION() { return net.minecraft.server.command.TestCommand.NO_TEST_CONTAINING_POS_EXCEPTION; }
// public static void NO_TEST_CONTAINING_POS_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value, ) { net.minecraft.server.command.TestCommand.NO_TEST_CONTAINING_POS_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_TESTS_TO_RESET_EXCEPTION() { return wrapperContained.NO_TESTS_TO_RESET_EXCEPTION; }
// public void NO_TESTS_TO_RESET_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NO_TESTS_TO_RESET_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_TESTS_TO_RESET_EXCEPTION() { return net.minecraft.server.command.TestCommand.NO_TESTS_TO_RESET_EXCEPTION; }
// public static void NO_TESTS_TO_RESET_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.TestCommand.NO_TESTS_TO_RESET_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType TOO_LARGE_EXCEPTION() { return wrapperContained.TOO_LARGE_EXCEPTION; }
// public void TOO_LARGE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.TOO_LARGE_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType TOO_LARGE_EXCEPTION() { return net.minecraft.server.command.TestCommand.TOO_LARGE_EXCEPTION; }
// public static void TOO_LARGE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.server.command.TestCommand.TOO_LARGE_EXCEPTION = value; }

// public int executePos(yarnwrap.server.command.ServerCommandSource source,java.lang.String variableName) { return wrapperContained.executePos(source.wrapperContained,variableName); }
// public static int executePos(yarnwrap.server.command.ServerCommandSource source,java.lang.String variableName, ) { return net.minecraft.server.command.TestCommand.executePos(source.wrapperContained,variableName); }
// public int executeCreate(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.Identifier id,int x,int y,int z) { return wrapperContained.executeCreate(source.wrapperContained,id.wrapperContained,x,y,z); }
// public static int executeCreate(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.Identifier id,int x,int y,int z, ) { return net.minecraft.server.command.TestCommand.executeCreate(source.wrapperContained,id.wrapperContained,x,y,z); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess, ) { net.minecraft.server.command.TestCommand.register(dispatcher,registryAccess.wrapperContained); }
// public int executeExport(yarnwrap.server.command.ServerCommandSource source,yarnwrap.registry.entry.RegistryEntry instance) { return wrapperContained.executeExport(source.wrapperContained,instance.wrapperContained); }
// public static int executeExport(yarnwrap.server.command.ServerCommandSource source,yarnwrap.registry.entry.RegistryEntry instance, ) { return net.minecraft.server.command.TestCommand.executeExport(source.wrapperContained,instance.wrapperContained); }
// public int method_22288(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22288(context); }
// public static int method_22288(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_22288(context); }
// public int method_23648(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_23648(context); }
// public static int method_23648(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_23648(context); }
// public yarnwrap.util.math.BlockPos getStructurePos(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.util.math.BlockPos(wrapperContained.getStructurePos(source.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getStructurePos(yarnwrap.server.command.ServerCommandSource source, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.server.command.TestCommand.getStructurePos(source.wrapperContained)); }
// public boolean checkStructure(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.Identifier templateId) { return wrapperContained.checkStructure(source.wrapperContained,templateId.wrapperContained); }
// public static boolean checkStructure(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.Identifier templateId, ) { return net.minecraft.server.command.TestCommand.checkStructure(source.wrapperContained,templateId.wrapperContained); }
// public int stop() { return wrapperContained.stop(); }
// public static int stop() { return net.minecraft.server.command.TestCommand.stop(); }
// public yarnwrap.test.GameTestState method_56255(int instance) { return new yarnwrap.test.GameTestState(wrapperContained.method_56255(instance)); }
// public static yarnwrap.test.GameTestState method_56255(int instance, ) { return new yarnwrap.test.GameTestState(net.minecraft.server.command.TestCommand.method_56255(instance)); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_56256(com.mojang.brigadier.builder.ArgumentBuilder extraConfigAdder) { return wrapperContained.method_56256(extraConfigAdder); }
// public static com.mojang.brigadier.builder.ArgumentBuilder method_56256(com.mojang.brigadier.builder.ArgumentBuilder extraConfigAdder, ) { return net.minecraft.server.command.TestCommand.method_56256(extraConfigAdder); }
// public com.mojang.brigadier.builder.ArgumentBuilder testAttemptConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,yarnwrap.command.ArgumentGetter finderGetter) { return wrapperContained.testAttemptConfig(builder,finderGetter.wrapperContained); }
// public static com.mojang.brigadier.builder.ArgumentBuilder testAttemptConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,yarnwrap.command.ArgumentGetter finderGetter, ) { return net.minecraft.server.command.TestCommand.testAttemptConfig(builder,finderGetter.wrapperContained); }
// public com.mojang.brigadier.builder.ArgumentBuilder testAttemptConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,yarnwrap.command.ArgumentGetter finderGetter,java.util.function.Function extraConfigAdder) { return wrapperContained.testAttemptConfig(builder,finderGetter.wrapperContained,extraConfigAdder); }
// public static com.mojang.brigadier.builder.ArgumentBuilder testAttemptConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,yarnwrap.command.ArgumentGetter finderGetter,java.util.function.Function extraConfigAdder, ) { return net.minecraft.server.command.TestCommand.testAttemptConfig(builder,finderGetter.wrapperContained,extraConfigAdder); }
// public int start(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestRunContext context) { return wrapperContained.start(source.wrapperContained,context.wrapperContained); }
// public static int start(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestRunContext context, ) { return net.minecraft.server.command.TestCommand.start(source.wrapperContained,context.wrapperContained); }
// public java.util.Optional method_56260(yarnwrap.server.command.ServerCommandSource pos) { return wrapperContained.method_56260(pos.wrapperContained); }
// public static java.util.Optional method_56260(yarnwrap.server.command.ServerCommandSource pos, ) { return net.minecraft.server.command.TestCommand.method_56260(pos.wrapperContained); }
// public java.util.stream.Stream stream(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestAttemptConfig config,yarnwrap.test.TestInstanceBlockFinder finder) { return wrapperContained.stream(source.wrapperContained,config.wrapperContained,finder.wrapperContained); }
// public static java.util.stream.Stream stream(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestAttemptConfig config,yarnwrap.test.TestInstanceBlockFinder finder, ) { return net.minecraft.server.command.TestCommand.stream(source.wrapperContained,config.wrapperContained,finder.wrapperContained); }
// public java.util.stream.Stream stream(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestAttemptConfig config,yarnwrap.test.TestInstanceFinder finder,int rotationSteps) { return wrapperContained.stream(source.wrapperContained,config.wrapperContained,finder.wrapperContained,rotationSteps); }
// public static java.util.stream.Stream stream(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestAttemptConfig config,yarnwrap.test.TestInstanceFinder finder,int rotationSteps, ) { return net.minecraft.server.command.TestCommand.stream(source.wrapperContained,config.wrapperContained,finder.wrapperContained,rotationSteps); }
// public java.util.Optional find(yarnwrap.util.math.BlockPos pos,yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestAttemptConfig config) { return wrapperContained.find(pos.wrapperContained,source.wrapperContained,config.wrapperContained); }
// public static java.util.Optional find(yarnwrap.util.math.BlockPos pos,yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.TestAttemptConfig config, ) { return net.minecraft.server.command.TestCommand.find(pos.wrapperContained,source.wrapperContained,config.wrapperContained); }
// public int reset(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.GameTestState state) { return wrapperContained.reset(source.wrapperContained,state.wrapperContained); }
// public static int reset(yarnwrap.server.command.ServerCommandSource source,yarnwrap.test.GameTestState state, ) { return net.minecraft.server.command.TestCommand.reset(source.wrapperContained,state.wrapperContained); }
// public com.mojang.brigadier.builder.ArgumentBuilder testAttemptAndPlacementConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,yarnwrap.command.ArgumentGetter finderGetter) { return wrapperContained.testAttemptAndPlacementConfig(builder,finderGetter.wrapperContained); }
// public static com.mojang.brigadier.builder.ArgumentBuilder testAttemptAndPlacementConfig(com.mojang.brigadier.builder.ArgumentBuilder builder,yarnwrap.command.ArgumentGetter finderGetter, ) { return net.minecraft.server.command.TestCommand.testAttemptAndPlacementConfig(builder,finderGetter.wrapperContained); }
// public void method_56270(yarnwrap.test.GameTestState state) { wrapperContained.method_56270(state.wrapperContained); }
// public static void method_56270(yarnwrap.test.GameTestState state, ) { net.minecraft.server.command.TestCommand.method_56270(state.wrapperContained); }
// public int method_56274(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56274(context); }
// public static int method_56274(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_56274(context); }
// public void method_57105(yarnwrap.server.world.ServerWorld pos) { wrapperContained.method_57105(pos.wrapperContained); }
// public static void method_57105(yarnwrap.server.world.ServerWorld pos, ) { net.minecraft.server.command.TestCommand.method_57105(pos.wrapperContained); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_66999(yarnwrap.command.ArgumentGetter builder2) { return wrapperContained.method_66999(builder2.wrapperContained); }
// public static com.mojang.brigadier.builder.ArgumentBuilder method_66999(yarnwrap.command.ArgumentGetter builder2, ) { return net.minecraft.server.command.TestCommand.method_66999(builder2.wrapperContained); }
// public int method_67000(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_67000(context.wrapperContained); }
// public static int method_67000(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.TestCommand.method_67000(context.wrapperContained); }
// public int method_67001(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67001(context); }
// public static int method_67001(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67001(context); }
// public java.util.concurrent.CompletableFuture suggestTestFunctions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestTestFunctions(context,builder); }
// public static java.util.concurrent.CompletableFuture suggestTestFunctions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.server.command.TestCommand.suggestTestFunctions(context,builder); }
// public boolean method_67003(yarnwrap.server.command.ServerCommandSource instance) { return wrapperContained.method_67003(instance.wrapperContained); }
// public static boolean method_67003(yarnwrap.server.command.ServerCommandSource instance, ) { return net.minecraft.server.command.TestCommand.method_67003(instance.wrapperContained); }
// public com.mojang.brigadier.Message method_67004(java.lang.Object x,java.lang.Object y,java.lang.Object z) { return wrapperContained.method_67004(x,y,z); }
// public static com.mojang.brigadier.Message method_67004(java.lang.Object x,java.lang.Object y,java.lang.Object z, ) { return net.minecraft.server.command.TestCommand.method_67004(x,y,z); }
// public yarnwrap.text.Style method_67007(java.lang.String style) { return new yarnwrap.text.Style(wrapperContained.method_67007(style)); }
// public static yarnwrap.text.Style method_67007(java.lang.String style, ) { return new yarnwrap.text.Style(net.minecraft.server.command.TestCommand.method_67007(style)); }
// public int reset(yarnwrap.server.command.TestFinder finder) { return wrapperContained.reset(finder.wrapperContained); }
// public static int reset(yarnwrap.server.command.TestFinder finder, ) { return net.minecraft.server.command.TestCommand.reset(finder.wrapperContained); }
// public void method_67010(yarnwrap.server.command.TestFinder pos) { wrapperContained.method_67010(pos.wrapperContained); }
// public static void method_67010(yarnwrap.server.command.TestFinder pos, ) { net.minecraft.server.command.TestCommand.method_67010(pos.wrapperContained); }
// public java.lang.Integer method_67011(yarnwrap.server.command.TestFinder state) { return wrapperContained.method_67011(state.wrapperContained); }
// public static java.lang.Integer method_67011(yarnwrap.server.command.TestFinder state, ) { return net.minecraft.server.command.TestCommand.method_67011(state.wrapperContained); }
// public int start(yarnwrap.server.command.TestFinder finder,yarnwrap.test.TestAttemptConfig config,int rotationSteps,int testsPerRow) { return wrapperContained.start(finder.wrapperContained,config.wrapperContained,rotationSteps,testsPerRow); }
// public static int start(yarnwrap.server.command.TestFinder finder,yarnwrap.test.TestAttemptConfig config,int rotationSteps,int testsPerRow, ) { return net.minecraft.server.command.TestCommand.start(finder.wrapperContained,config.wrapperContained,rotationSteps,testsPerRow); }
// public int method_67016(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_67016(context.wrapperContained); }
// public static int method_67016(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.TestCommand.method_67016(context.wrapperContained); }
// public java.util.stream.Stream method_67017(yarnwrap.server.world.ServerWorld pos) { return wrapperContained.method_67017(pos.wrapperContained); }
// public static java.util.stream.Stream method_67017(yarnwrap.server.world.ServerWorld pos, ) { return net.minecraft.server.command.TestCommand.method_67017(pos.wrapperContained); }
// public int method_67018(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67018(context); }
// public static int method_67018(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67018(context); }
// public int clear(yarnwrap.server.command.TestFinder finder) { return wrapperContained.clear(finder.wrapperContained); }
// public static int clear(yarnwrap.server.command.TestFinder finder, ) { return net.minecraft.server.command.TestCommand.clear(finder.wrapperContained); }
// public int method_67021(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_67021(context.wrapperContained); }
// public static int method_67021(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.TestCommand.method_67021(context.wrapperContained); }
// public int method_67022(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67022(context); }
// public static int method_67022(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67022(context); }
// public int export(yarnwrap.server.command.TestFinder finder) { return wrapperContained.export(finder.wrapperContained); }
// public static int export(yarnwrap.server.command.TestFinder finder, ) { return net.minecraft.server.command.TestCommand.export(finder.wrapperContained); }
// public int method_67024(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_67024(context.wrapperContained); }
// public static int method_67024(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.TestCommand.method_67024(context.wrapperContained); }
// public int method_67025(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67025(context); }
// public static int method_67025(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67025(context); }
// public int start(yarnwrap.server.command.TestFinder finder) { return wrapperContained.start(finder.wrapperContained); }
// public static int start(yarnwrap.server.command.TestFinder finder, ) { return net.minecraft.server.command.TestCommand.start(finder.wrapperContained); }
// public int method_67027(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_67027(context.wrapperContained); }
// public static int method_67027(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.TestCommand.method_67027(context.wrapperContained); }
// public int method_67028(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67028(context); }
// public static int method_67028(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67028(context); }
// public int locate(yarnwrap.server.command.TestFinder finder) { return wrapperContained.locate(finder.wrapperContained); }
// public static int locate(yarnwrap.server.command.TestFinder finder, ) { return net.minecraft.server.command.TestCommand.locate(finder.wrapperContained); }
// public int method_67030(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67030(context); }
// public static int method_67030(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67030(context); }
// public int method_67031(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67031(context); }
// public static int method_67031(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67031(context); }
// public int method_67032(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67032(context); }
// public static int method_67032(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67032(context); }
// public int method_67033(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67033(context); }
// public static int method_67033(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67033(context); }
// public int method_67034(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67034(context); }
// public static int method_67034(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67034(context); }
// public int method_67035(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67035(context); }
// public static int method_67035(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67035(context); }
// public int method_67036(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67036(context); }
// public static int method_67036(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67036(context); }
// public int method_67037(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67037(context); }
// public static int method_67037(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67037(context); }
// public int method_67038(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_67038(context); }
// public static int method_67038(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_67038(context); }
// public yarnwrap.server.command.TestFinder method_67044(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.server.command.TestFinder(wrapperContained.method_67044(context)); }
// public static yarnwrap.server.command.TestFinder method_67044(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.server.command.TestFinder(net.minecraft.server.command.TestCommand.method_67044(context)); }
// public com.mojang.brigadier.Message method_67307(java.lang.Object maxSize) { return wrapperContained.method_67307(maxSize); }
// public static com.mojang.brigadier.Message method_67307(java.lang.Object maxSize, ) { return net.minecraft.server.command.TestCommand.method_67307(maxSize); }
// public void method_68079(yarnwrap.server.world.ServerWorld box) { wrapperContained.method_68079(box.wrapperContained); }
// public static void method_68079(yarnwrap.server.world.ServerWorld box, ) { net.minecraft.server.command.TestCommand.method_68079(box.wrapperContained); }
// public int method_71944(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_71944(context); }
// public static int method_71944(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_71944(context); }
// public int method_71945(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_71945(context); }
// public static int method_71945(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_71945(context); }
// public int method_71946(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_71946(context); }
// public static int method_71946(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_71946(context); }
// public int method_71947(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_71947(context); }
// public static int method_71947(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TestCommand.method_71947(context); }
// public yarnwrap.server.command.TestFinder method_71948(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.server.command.TestFinder(wrapperContained.method_71948(context)); }
// public static yarnwrap.server.command.TestFinder method_71948(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.server.command.TestFinder(net.minecraft.server.command.TestCommand.method_71948(context)); }

}