package yarnwrap.client.util;
public class CommandHistoryManager { public net.minecraft.client.util.CommandHistoryManager wrapperContained; public CommandHistoryManager(net.minecraft.client.util.CommandHistoryManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.util.CommandHistoryManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.util.CommandHistoryManager.LOGGER = value; }

// public int MAX_SIZE() { return wrapperContained.MAX_SIZE; }
// public void MAX_SIZE(int value) { wrapperContained.MAX_SIZE = value; }
// public static int MAX_SIZE() { return net.minecraft.client.util.CommandHistoryManager.MAX_SIZE; }
// public static void MAX_SIZE(int value, ) { net.minecraft.client.util.CommandHistoryManager.MAX_SIZE = value; }

// public java.lang.String FILENAME() { return wrapperContained.FILENAME; }
// public void FILENAME(java.lang.String value) { wrapperContained.FILENAME = value; }
// public static java.lang.String FILENAME() { return net.minecraft.client.util.CommandHistoryManager.FILENAME; }
// public static void FILENAME(java.lang.String value, ) { net.minecraft.client.util.CommandHistoryManager.FILENAME = value; }

// public java.nio.file.Path path() { return wrapperContained.path; }
// public void path(java.nio.file.Path value) { wrapperContained.path = value; }
// public static java.nio.file.Path path() { return net.minecraft.client.util.CommandHistoryManager.path; }
// public static void path(java.nio.file.Path value, ) { net.minecraft.client.util.CommandHistoryManager.path = value; }

// public yarnwrap.util.collection.ArrayListDeque history() { return new yarnwrap.util.collection.ArrayListDeque(wrapperContained.history); }
// public void history(yarnwrap.util.collection.ArrayListDeque value) { wrapperContained.history = value.wrapperContained; }
// public static yarnwrap.util.collection.ArrayListDeque history() { return new yarnwrap.util.collection.ArrayListDeque(net.minecraft.client.util.CommandHistoryManager.history); }
// public static void history(yarnwrap.util.collection.ArrayListDeque value, ) { net.minecraft.client.util.CommandHistoryManager.history = value.wrapperContained; }

public CommandHistoryManager(java.nio.file.Path directoryPath) { this.wrapperContained = new net.minecraft.client.util.CommandHistoryManager(directoryPath); }
public java.util.Collection getHistory() { return wrapperContained.getHistory(); }
// public static java.util.Collection getHistory() { return net.minecraft.client.util.CommandHistoryManager.getHistory(); }
public void add(java.lang.String command) { wrapperContained.add(command); }
// public static void add(java.lang.String command, ) { net.minecraft.client.util.CommandHistoryManager.add(command); }
// public void write() { wrapperContained.write(); }
// public static void write() { net.minecraft.client.util.CommandHistoryManager.write(); }

}