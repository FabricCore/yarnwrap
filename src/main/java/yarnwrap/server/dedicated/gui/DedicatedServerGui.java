package yarnwrap.server.dedicated.gui;
public class DedicatedServerGui { public net.minecraft.server.dedicated.gui.DedicatedServerGui wrapperContained; public DedicatedServerGui(net.minecraft.server.dedicated.gui.DedicatedServerGui wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.awt.Font FONT_MONOSPACE() { return wrapperContained.FONT_MONOSPACE; }
// public void FONT_MONOSPACE(java.awt.Font value) { wrapperContained.FONT_MONOSPACE = value; }
// public java.lang.Thread consoleUpdateThread() { return wrapperContained.consoleUpdateThread; }
// public void consoleUpdateThread(java.lang.Thread value) { wrapperContained.consoleUpdateThread = value; }
// public yarnwrap.server.dedicated.MinecraftDedicatedServer server() { return new yarnwrap.server.dedicated.MinecraftDedicatedServer(wrapperContained.server); }
// public void server(yarnwrap.server.dedicated.MinecraftDedicatedServer value) { wrapperContained.server = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.concurrent.atomic.AtomicBoolean stopped() { return wrapperContained.stopped; }
// public void stopped(java.util.concurrent.atomic.AtomicBoolean value) { wrapperContained.stopped = value; }
// public java.util.Collection stopTasks() { return wrapperContained.stopTasks; }
// public void stopTasks(java.util.Collection value) { wrapperContained.stopTasks = value; }
// public java.lang.String TITLE() { return wrapperContained.TITLE; }
// public void TITLE(java.lang.String value) { wrapperContained.TITLE = value; }
// public java.lang.String SHUTTING_DOWN_TITLE() { return wrapperContained.SHUTTING_DOWN_TITLE; }
// public void SHUTTING_DOWN_TITLE(java.lang.String value) { wrapperContained.SHUTTING_DOWN_TITLE = value; }
public yarnwrap.server.dedicated.gui.DedicatedServerGui create(yarnwrap.server.dedicated.MinecraftDedicatedServer server) { return new yarnwrap.server.dedicated.gui.DedicatedServerGui(wrapperContained.create(server.wrapperContained)); }
public void appendToConsole(javax.swing.JTextArea textArea,javax.swing.JScrollPane scrollPane,java.lang.String message) { wrapperContained.appendToConsole(textArea,scrollPane,message); }
// public javax.swing.JComponent createLogPanel() { return wrapperContained.createLogPanel(); }
public void start() { wrapperContained.start(); }
// public javax.swing.JComponent createPlaysPanel() { return wrapperContained.createPlaysPanel(); }
// public javax.swing.JComponent createStatsPanel() { return wrapperContained.createStatsPanel(); }
public void addStopTask(java.lang.Runnable task) { wrapperContained.addStopTask(task); }
// public void runStopTasks() { wrapperContained.runStopTasks(); }
public void stop() { wrapperContained.stop(); }

}