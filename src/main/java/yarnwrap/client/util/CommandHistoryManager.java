package yarnwrap.client.util;
public class CommandHistoryManager { public net.minecraft.client.util.CommandHistoryManager wrapperContained; public CommandHistoryManager(net.minecraft.client.util.CommandHistoryManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int MAX_SIZE() { return wrapperContained.MAX_SIZE; }
// public void MAX_SIZE(int value) { wrapperContained.MAX_SIZE = value; }
// public java.lang.String FILENAME() { return wrapperContained.FILENAME; }
// public void FILENAME(java.lang.String value) { wrapperContained.FILENAME = value; }
// public java.nio.file.Path path() { return wrapperContained.path; }
// public void path(java.nio.file.Path value) { wrapperContained.path = value; }
// public yarnwrap.util.collection.ArrayListDeque history() { return new yarnwrap.util.collection.ArrayListDeque(wrapperContained.history); }
// public void history(yarnwrap.util.collection.ArrayListDeque value) { wrapperContained.history = value.wrapperContained; }
public CommandHistoryManager(java.nio.file.Path directoryPath) { this.wrapperContained = new net.minecraft.client.util.CommandHistoryManager(directoryPath); }
public java.util.Collection getHistory() { return wrapperContained.getHistory(); }
public void add(java.lang.String command) { wrapperContained.add(command); }
// public void write() { wrapperContained.write(); }

}