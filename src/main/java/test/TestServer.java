package yarnwrap.test;
public class TestServer { public net.minecraft.test.TestServer wrapperContained; public TestServer(net.minecraft.test.TestServer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int RESULT_STRING_LOG_INTERVAL() { return wrapperContained.RESULT_STRING_LOG_INTERVAL; }
// public java.util.List batches() { return wrapperContained.batches; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public yarnwrap.world.GameRules GAME_RULES() { return new yarnwrap.world.GameRules(wrapperContained.GAME_RULES); }
// public yarnwrap.world.gen.GeneratorOptions TEST_LEVEL() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.TEST_LEVEL); }
// public yarnwrap.test.TestSet testSet() { return new yarnwrap.test.TestSet(wrapperContained.testSet); }
// public yarnwrap.util.ApiServices NONE_API_SERVICES() { return new yarnwrap.util.ApiServices(wrapperContained.NONE_API_SERVICES); }
// public int TEST_POS_XZ_RANGE() { return wrapperContained.TEST_POS_XZ_RANGE; }
// public java.util.List testFunctions() { return wrapperContained.testFunctions; }
// public com.google.common.base.Stopwatch stopwatch() { return wrapperContained.stopwatch; }
// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl debugSampleLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.debugSampleLog); }
// public void runTestBatches(yarnwrap.server.world.ServerWorld world) { wrapperContained.runTestBatches(world.wrapperContained); }
// public boolean isTesting() { return wrapperContained.isTesting(); }
// public yarnwrap.test.TestServer create(java.lang.Thread thread,Object session,yarnwrap.resource.ResourcePackManager resourcePackManager,java.util.Collection batches,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.test.TestServer(wrapperContained.create(thread,session,resourcePackManager.wrapperContained,batches,pos.wrapperContained)); }

}