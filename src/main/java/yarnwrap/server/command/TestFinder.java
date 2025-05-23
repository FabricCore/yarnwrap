package yarnwrap.server.command;
public class TestFinder { public net.minecraft.server.command.TestFinder wrapperContained; public TestFinder(net.minecraft.server.command.TestFinder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.TestInstanceFinder NOOP_TEST_FUNCTION_FINDER() { return new yarnwrap.test.TestInstanceFinder(wrapperContained.NOOP_TEST_FUNCTION_FINDER); }
// public void NOOP_TEST_FUNCTION_FINDER(yarnwrap.test.TestInstanceFinder value) { wrapperContained.NOOP_TEST_FUNCTION_FINDER = value.wrapperContained; }
// public static yarnwrap.test.TestInstanceFinder NOOP_TEST_FUNCTION_FINDER() { return new yarnwrap.test.TestInstanceFinder(net.minecraft.server.command.TestFinder.NOOP_TEST_FUNCTION_FINDER); }
// public static void NOOP_TEST_FUNCTION_FINDER(yarnwrap.test.TestInstanceFinder value, ) { net.minecraft.server.command.TestFinder.NOOP_TEST_FUNCTION_FINDER = value.wrapperContained; }

// public yarnwrap.test.TestInstanceBlockFinder NOOP_TEST_INSTANCE_BLOCK_FINDER() { return new yarnwrap.test.TestInstanceBlockFinder(wrapperContained.NOOP_TEST_INSTANCE_BLOCK_FINDER); }
// public void NOOP_TEST_INSTANCE_BLOCK_FINDER(yarnwrap.test.TestInstanceBlockFinder value) { wrapperContained.NOOP_TEST_INSTANCE_BLOCK_FINDER = value.wrapperContained; }
// public static yarnwrap.test.TestInstanceBlockFinder NOOP_TEST_INSTANCE_BLOCK_FINDER() { return new yarnwrap.test.TestInstanceBlockFinder(net.minecraft.server.command.TestFinder.NOOP_TEST_INSTANCE_BLOCK_FINDER); }
// public static void NOOP_TEST_INSTANCE_BLOCK_FINDER(yarnwrap.test.TestInstanceBlockFinder value, ) { net.minecraft.server.command.TestFinder.NOOP_TEST_INSTANCE_BLOCK_FINDER = value.wrapperContained; }

// public yarnwrap.server.command.ServerCommandSource commandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.commandSource); }
// public void commandSource(yarnwrap.server.command.ServerCommandSource value) { wrapperContained.commandSource = value.wrapperContained; }
// public static yarnwrap.server.command.ServerCommandSource commandSource() { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.TestFinder.commandSource); }
// public static void commandSource(yarnwrap.server.command.ServerCommandSource value, ) { net.minecraft.server.command.TestFinder.commandSource = value.wrapperContained; }

// public yarnwrap.test.TestInstanceFinder instanceFinder() { return new yarnwrap.test.TestInstanceFinder(wrapperContained.instanceFinder); }
// public void instanceFinder(yarnwrap.test.TestInstanceFinder value) { wrapperContained.instanceFinder = value.wrapperContained; }
// public static yarnwrap.test.TestInstanceFinder instanceFinder() { return new yarnwrap.test.TestInstanceFinder(net.minecraft.server.command.TestFinder.instanceFinder); }
// public static void instanceFinder(yarnwrap.test.TestInstanceFinder value, ) { net.minecraft.server.command.TestFinder.instanceFinder = value.wrapperContained; }

// public yarnwrap.test.TestInstanceBlockFinder blockFinder() { return new yarnwrap.test.TestInstanceBlockFinder(wrapperContained.blockFinder); }
// public void blockFinder(yarnwrap.test.TestInstanceBlockFinder value) { wrapperContained.blockFinder = value.wrapperContained; }
// public static yarnwrap.test.TestInstanceBlockFinder blockFinder() { return new yarnwrap.test.TestInstanceBlockFinder(net.minecraft.server.command.TestFinder.blockFinder); }
// public static void blockFinder(yarnwrap.test.TestInstanceBlockFinder value, ) { net.minecraft.server.command.TestFinder.blockFinder = value.wrapperContained; }

// public TestFinder(yarnwrap.server.command.ServerCommandSource commandSource,yarnwrap.test.TestInstanceFinder instanceFinder,yarnwrap.test.TestInstanceBlockFinder blockFinder) { this.wrapperContained = new net.minecraft.server.command.TestFinder(commandSource.wrapperContained,instanceFinder.wrapperContained,blockFinder.wrapperContained); }
public yarnwrap.server.command.ServerCommandSource getCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getCommandSource()); }
// public static yarnwrap.server.command.ServerCommandSource getCommandSource() { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.command.TestFinder.getCommandSource()); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.server.command.TestFinder.builder(); }

}