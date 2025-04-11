package yarnwrap.nbt.scanner;
public class SelectiveNbtCollector { public net.minecraft.nbt.scanner.SelectiveNbtCollector wrapperContained; public SelectiveNbtCollector(net.minecraft.nbt.scanner.SelectiveNbtCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queriesLeft() { return wrapperContained.queriesLeft; }
// public void queriesLeft(int value) { wrapperContained.queriesLeft = value; }
// public java.util.Set allPossibleTypes() { return wrapperContained.allPossibleTypes; }
// public void allPossibleTypes(java.util.Set value) { wrapperContained.allPossibleTypes = value; }
// public java.util.Deque selectionStack() { return wrapperContained.selectionStack; }
// public void selectionStack(java.util.Deque value) { wrapperContained.selectionStack = value; }
public int getQueriesLeft() { return wrapperContained.getQueriesLeft(); }

}