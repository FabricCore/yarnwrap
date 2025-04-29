package yarnwrap.util;
public class TopologicalSorts { public net.minecraft.util.TopologicalSorts wrapperContained; public TopologicalSorts(net.minecraft.util.TopologicalSorts wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean sort(java.util.Map successors,java.util.Set visited,java.util.Set visiting,java.util.function.Consumer reversedOrderConsumer,java.lang.Object now) { return wrapperContained.sort(successors,visited,visiting,reversedOrderConsumer,now); }
// public static boolean sort(java.util.Map successors,java.util.Set visited,java.util.Set visiting,java.util.function.Consumer reversedOrderConsumer,java.lang.Object now, ) { return net.minecraft.util.TopologicalSorts.sort(successors,visited,visiting,reversedOrderConsumer,now); }

}