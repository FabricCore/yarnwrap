package yarnwrap.nbt.scanner;
public class SelectiveNbtCollector { public net.minecraft.nbt.scanner.SelectiveNbtCollector wrapperContained; public SelectiveNbtCollector(net.minecraft.nbt.scanner.SelectiveNbtCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queriesLeft() { return wrapperContained.queriesLeft; }
// public java.util.Set allPossibleTypes() { return wrapperContained.allPossibleTypes; }
// public java.util.Deque selectionStack() { return wrapperContained.selectionStack; }
public int getQueriesLeft() { return wrapperContained.getQueriesLeft(); }

}