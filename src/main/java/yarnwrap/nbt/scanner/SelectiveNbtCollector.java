package yarnwrap.nbt.scanner;
public class SelectiveNbtCollector { public net.minecraft.nbt.scanner.SelectiveNbtCollector wrapperContained; public SelectiveNbtCollector(net.minecraft.nbt.scanner.SelectiveNbtCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queriesLeft() { return wrapperContained.queriesLeft; }
// public void queriesLeft(int value) { wrapperContained.queriesLeft = value; }
// public static int queriesLeft() { return net.minecraft.nbt.scanner.SelectiveNbtCollector.queriesLeft; }
// public static void queriesLeft(int value, ) { net.minecraft.nbt.scanner.SelectiveNbtCollector.queriesLeft = value; }

// public java.util.Set allPossibleTypes() { return wrapperContained.allPossibleTypes; }
// public void allPossibleTypes(java.util.Set value) { wrapperContained.allPossibleTypes = value; }
// public static java.util.Set allPossibleTypes() { return net.minecraft.nbt.scanner.SelectiveNbtCollector.allPossibleTypes; }
// public static void allPossibleTypes(java.util.Set value, ) { net.minecraft.nbt.scanner.SelectiveNbtCollector.allPossibleTypes = value; }

// public java.util.Deque selectionStack() { return wrapperContained.selectionStack; }
// public void selectionStack(java.util.Deque value) { wrapperContained.selectionStack = value; }
// public static java.util.Deque selectionStack() { return net.minecraft.nbt.scanner.SelectiveNbtCollector.selectionStack; }
// public static void selectionStack(java.util.Deque value, ) { net.minecraft.nbt.scanner.SelectiveNbtCollector.selectionStack = value; }

public SelectiveNbtCollector(net.minecraft.nbt.scanner.NbtScanQuery[] queries) { this.wrapperContained = new net.minecraft.nbt.scanner.SelectiveNbtCollector(queries); }
public int getQueriesLeft() { return wrapperContained.getQueriesLeft(); }
// public static int getQueriesLeft() { return net.minecraft.nbt.scanner.SelectiveNbtCollector.getQueriesLeft(); }

}