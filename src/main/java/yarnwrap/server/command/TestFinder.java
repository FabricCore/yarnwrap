package yarnwrap.server.command;
public class TestFinder { public net.minecraft.server.command.TestFinder wrapperContained; public TestFinder(net.minecraft.server.command.TestFinder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestFunctionFinder NOOP_TEST_FUNCTION_FINDER() { return new yarnwrap.test.TestFunctionFinder(wrapperContained.NOOP_TEST_FUNCTION_FINDER); }
// public void NOOP_TEST_FUNCTION_FINDER(yarnwrap.test.TestFunctionFinder value) { wrapperContained.NOOP_TEST_FUNCTION_FINDER = value.wrapperContained; }
// public yarnwrap.test.StructureBlockFinder NOOP_STRUCTURE_BLOCK_FINDER() { return new yarnwrap.test.StructureBlockFinder(wrapperContained.NOOP_STRUCTURE_BLOCK_FINDER); }
// public void NOOP_STRUCTURE_BLOCK_FINDER(yarnwrap.test.StructureBlockFinder value) { wrapperContained.NOOP_STRUCTURE_BLOCK_FINDER = value.wrapperContained; }
// public yarnwrap.test.TestFunctionFinder testFunctionFinder() { return new yarnwrap.test.TestFunctionFinder(wrapperContained.testFunctionFinder); }
// public void testFunctionFinder(yarnwrap.test.TestFunctionFinder value) { wrapperContained.testFunctionFinder = value.wrapperContained; }
// public yarnwrap.test.StructureBlockFinder structureBlockPosFinder() { return new yarnwrap.test.StructureBlockFinder(wrapperContained.structureBlockPosFinder); }
// public void structureBlockPosFinder(yarnwrap.test.StructureBlockFinder value) { wrapperContained.structureBlockPosFinder = value.wrapperContained; }
// public yarnwrap.server.command.ServerCommandSource commandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.commandSource); }
// public void commandSource(yarnwrap.server.command.ServerCommandSource value) { wrapperContained.commandSource = value.wrapperContained; }
// public java.util.function.Function runnerFactory() { return wrapperContained.runnerFactory; }
// public void runnerFactory(java.util.function.Function value) { wrapperContained.runnerFactory = value; }
public yarnwrap.server.command.ServerCommandSource getCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getCommandSource()); }
// public java.lang.Object createRunner() { return wrapperContained.createRunner(); }

}