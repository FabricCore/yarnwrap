package yarnwrap.client.util;
public class CommandHistoryManager { public net.minecraft.client.util.CommandHistoryManager wrapperContained; public CommandHistoryManager(net.minecraft.client.util.CommandHistoryManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int MAX_SIZE() { return wrapperContained.MAX_SIZE; }
// public java.lang.String FILENAME() { return wrapperContained.FILENAME; }
// public java.nio.file.Path path() { return wrapperContained.path; }
// public yarnwrap.util.collection.ArrayListDeque history() { return new yarnwrap.util.collection.ArrayListDeque(wrapperContained.history); }
public java.util.Collection getHistory() { return wrapperContained.getHistory(); }
public void add(java.lang.String command) { wrapperContained.add(command); }
// public void write() { wrapperContained.write(); }

}