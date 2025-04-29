package yarnwrap.nbt.scanner;
public class ExclusiveNbtCollector { public net.minecraft.nbt.scanner.ExclusiveNbtCollector wrapperContained; public ExclusiveNbtCollector(net.minecraft.nbt.scanner.ExclusiveNbtCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Deque treeStack() { return wrapperContained.treeStack; }
// public void treeStack(java.util.Deque value) { wrapperContained.treeStack = value; }
// public static java.util.Deque treeStack() { return net.minecraft.nbt.scanner.ExclusiveNbtCollector.treeStack; }
// public static void treeStack(java.util.Deque value, ) { net.minecraft.nbt.scanner.ExclusiveNbtCollector.treeStack = value; }

public ExclusiveNbtCollector(net.minecraft.nbt.scanner.NbtScanQuery[] excludedQueries) { this.wrapperContained = new net.minecraft.nbt.scanner.ExclusiveNbtCollector(excludedQueries); }

}