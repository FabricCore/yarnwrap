package yarnwrap.server.command;
public class TestFinder { public net.minecraft.server.command.TestFinder wrapperContained; public TestFinder(net.minecraft.server.command.TestFinder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestFunctionFinder NOOP_TEST_FUNCTION_FINDER() { return new yarnwrap.test.TestFunctionFinder(wrapperContained.NOOP_TEST_FUNCTION_FINDER); }
// public void NOOP_TEST_FUNCTION_FINDER(yarnwrap.test.TestFunctionFinder value) { wrapperContained.NOOP_TEST_FUNCTION_FINDER = value.wrapperContained; }
// public static yarnwrap.test.TestFunctionFinder NOOP_TEST_FUNCTION_FINDER() { return new yarnwrap.test.TestFunctionFinder(net.minecraft.server.command.TestFinder.NOOP_TEST_FUNCTION_FINDER); }
// public static void NOOP_TEST_FUNCTION_FINDER(yarnwrap.test.TestFunctionFinder value, ) { net.minecraft.server.command.TestFinder.NOOP_TEST_FUNCTION_FINDER = value.wrapperContained; }

// public yarnwrap.test.StructureBlockFinder NOOP_STRUCTURE_BLOCK_FINDER() { return new yarnwrap.test.StructureBlockFinder(wrapperContained.NOOP_STRUCTURE_BLOCK_FINDER); }
// public void NOOP_STRUCTURE_BLOCK_FINDER(yarnwrap.test.StructureBlockFinder value) { wrapperContained.NOOP_STRUCTURE_BLOCK_FINDER = value.wrapperContained; }
// public static yarnwrap.test.StructureBlockFinder NOOP_STRUCTURE_BLOCK_FINDER() { return new yarnwrap.test.StructureBlockFinder(net.minecraft.server.command.TestFinder.NOOP_STRUCTURE_BLOCK_FINDER); }
// public static void NOOP_STRUCTURE_BLOCK_FINDER(yarnwrap.test.StructureBlockFinder value, ) { net.minecraft.server.command.TestFinder.NOOP_STRUCTURE_BLOCK_FINDER = value.wrapperContained; }

// public yarnwrap.test.TestFunctionFinder testFunctionFinder() { return new yarnwrap.test.TestFunctionFinder(wrapperContained.testFunctionFinder); }
// public void testFunctionFinder(yarnwrap.test.TestFunctionFinder value) { wrapperContained.testFunctionFinder = value.wrapperContained; }
// public static yarnwrap.test.TestFunctionFinder testFunctionFinder() { return new yarnwrap.test.TestFunctionFinder(net.minecraft.server.command.TestFinder.testFunctionFinder); }
// public static void testFunctionFinder(yarnwrap.test.TestFunctionFinder value, ) { net.minecraft.server.command.TestFinder.testFunctionFinder = value.wrapperContained; }

// public yarnwrap.test.StructureBlockFinder structureBlockPosFinder() { return new yarnwrap.test.StructureBlockFinder(wrapperContained.structureBlockPosFinder); }
// public void structureBlockPosFinder(yarnwrap.test.StructureBlockFinder value) { wrapperContained.structureBlockPosFinder = value.wrapperContained; }
// public static yarnwrap.test.StructureBlockFinder structureBlockPosFinder() { return new yarnwrap.test.StructureBlockFinder(net.minecraft.server.command.TestFinder.structureBlockPosFinder); }
// public static void structureBlockPosFinder(yarnwrap.test.StructureBlockFinder value, ) { net.minecraft.server.command.TestFinder.structureBlockPosFinder = value.wrapperContained; }

// public yarnwrap.server.command.ServerCommandSource commandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.commandSource); }
// public void commandSource(yarnwrap.server.command.ServerCommandSource value) { wrapperContained.commandSource = value.wrapperContained; }
// public static yarnwrap.server.command.ServerCommandSource commandSource() { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.TestFinder.commandSource); }
// public static void commandSource(yarnwrap.server.command.ServerCommandSource value, ) { net.minecraft.server.command.TestFinder.commandSource = value.wrapperContained; }

// public java.util.function.Function runnerFactory() { return wrapperContained.runnerFactory; }
// public void runnerFactory(java.util.function.Function value) { wrapperContained.runnerFactory = value; }
// public static java.util.function.Function runnerFactory() { return net.minecraft.server.command.TestFinder.runnerFactory; }
// public static void runnerFactory(java.util.function.Function value, ) { net.minecraft.server.command.TestFinder.runnerFactory = value; }

// public TestFinder(yarnwrap.server.command.ServerCommandSource commandSource,java.util.function.Function runnerFactory,yarnwrap.test.TestFunctionFinder testFunctionFinder,yarnwrap.test.StructureBlockFinder structureBlockPosFinder) { this.wrapperContained = new net.minecraft.server.command.TestFinder(commandSource.wrapperContained,runnerFactory,testFunctionFinder.wrapperContained,structureBlockPosFinder.wrapperContained); }
public yarnwrap.server.command.ServerCommandSource getCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getCommandSource()); }
// public static yarnwrap.server.command.ServerCommandSource getCommandSource() { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.TestFinder.getCommandSource()); }
// public java.lang.Object createRunner() { return wrapperContained.createRunner(); }
// public static java.lang.Object createRunner() { return net.minecraft.server.command.TestFinder.createRunner(); }

}