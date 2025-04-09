package yarnwrap.server.command;
public class TestFinder { public net.minecraft.server.command.TestFinder wrapperContained; public TestFinder(net.minecraft.server.command.TestFinder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestFunctionFinder NOOP_TEST_FUNCTION_FINDER() { return new yarnwrap.test.TestFunctionFinder(wrapperContained.NOOP_TEST_FUNCTION_FINDER); }
// public yarnwrap.test.StructureBlockFinder NOOP_STRUCTURE_BLOCK_FINDER() { return new yarnwrap.test.StructureBlockFinder(wrapperContained.NOOP_STRUCTURE_BLOCK_FINDER); }
// public yarnwrap.test.TestFunctionFinder testFunctionFinder() { return new yarnwrap.test.TestFunctionFinder(wrapperContained.testFunctionFinder); }
// public yarnwrap.test.StructureBlockFinder structureBlockPosFinder() { return new yarnwrap.test.StructureBlockFinder(wrapperContained.structureBlockPosFinder); }
// public yarnwrap.server.command.ServerCommandSource commandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.commandSource); }
// public java.util.function.Function runnerFactory() { return wrapperContained.runnerFactory; }
public yarnwrap.server.command.ServerCommandSource getCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getCommandSource()); }
// public java.lang.Object createRunner() { return wrapperContained.createRunner(); }

}