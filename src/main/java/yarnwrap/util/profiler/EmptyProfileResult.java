package yarnwrap.util.profiler;
public class EmptyProfileResult { public net.minecraft.util.profiler.EmptyProfileResult wrapperContained; public EmptyProfileResult(net.minecraft.util.profiler.EmptyProfileResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiler.EmptyProfileResult INSTANCE() { return new yarnwrap.util.profiler.EmptyProfileResult(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.profiler.EmptyProfileResult value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.util.profiler.EmptyProfileResult INSTANCE() { return new yarnwrap.util.profiler.EmptyProfileResult(net.minecraft.util.profiler.EmptyProfileResult.INSTANCE); }
// public static void INSTANCE(yarnwrap.util.profiler.EmptyProfileResult value, ) { net.minecraft.util.profiler.EmptyProfileResult.INSTANCE = value.wrapperContained; }


}