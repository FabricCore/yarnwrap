package yarnwrap.server.dedicated.gui;
public class DedicatedServerGui { public net.minecraft.server.dedicated.gui.DedicatedServerGui wrapperContained; public DedicatedServerGui(net.minecraft.server.dedicated.gui.DedicatedServerGui wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.awt.Font FONT_MONOSPACE() { return wrapperContained.FONT_MONOSPACE; }
// public void FONT_MONOSPACE(java.awt.Font value) { wrapperContained.FONT_MONOSPACE = value; }
// public static java.awt.Font FONT_MONOSPACE() { return net.minecraft.server.dedicated.gui.DedicatedServerGui.FONT_MONOSPACE; }
// public static void FONT_MONOSPACE(java.awt.Font value, ) { net.minecraft.server.dedicated.gui.DedicatedServerGui.FONT_MONOSPACE = value; }

// public java.lang.Thread consoleUpdateThread() { return wrapperContained.consoleUpdateThread; }
// public void consoleUpdateThread(java.lang.Thread value) { wrapperContained.consoleUpdateThread = value; }
// public static java.lang.Thread consoleUpdateThread() { return net.minecraft.server.dedicated.gui.DedicatedServerGui.consoleUpdateThread; }
// public static void consoleUpdateThread(java.lang.Thread value, ) { net.minecraft.server.dedicated.gui.DedicatedServerGui.consoleUpdateThread = value; }

// public yarnwrap.server.dedicated.MinecraftDedicatedServer server() { return new yarnwrap.server.dedicated.MinecraftDedicatedServer(wrapperContained.server); }
// public void server(yarnwrap.server.dedicated.MinecraftDedicatedServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.dedicated.MinecraftDedicatedServer server() { return new yarnwrap.server.dedicated.MinecraftDedicatedServer(net.minecraft.server.dedicated.gui.DedicatedServerGui.server); }
// public static void server(yarnwrap.server.dedicated.MinecraftDedicatedServer value, ) { net.minecraft.server.dedicated.gui.DedicatedServerGui.server = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.dedicated.gui.DedicatedServerGui.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.dedicated.gui.DedicatedServerGui.LOGGER = value; }

// public java.util.concurrent.atomic.AtomicBoolean stopped() { return wrapperContained.stopped; }
// public void stopped(java.util.concurrent.atomic.AtomicBoolean value) { wrapperContained.stopped = value; }
// public static java.util.concurrent.atomic.AtomicBoolean stopped() { return net.minecraft.server.dedicated.gui.DedicatedServerGui.stopped; }
// public static void stopped(java.util.concurrent.atomic.AtomicBoolean value, ) { net.minecraft.server.dedicated.gui.DedicatedServerGui.stopped = value; }

// public java.util.Collection stopTasks() { return wrapperContained.stopTasks; }
// public void stopTasks(java.util.Collection value) { wrapperContained.stopTasks = value; }
// public static java.util.Collection stopTasks() { return net.minecraft.server.dedicated.gui.DedicatedServerGui.stopTasks; }
// public static void stopTasks(java.util.Collection value, ) { net.minecraft.server.dedicated.gui.DedicatedServerGui.stopTasks = value; }

// public java.lang.String TITLE() { return wrapperContained.TITLE; }
// public void TITLE(java.lang.String value) { wrapperContained.TITLE = value; }
// public static java.lang.String TITLE() { return net.minecraft.server.dedicated.gui.DedicatedServerGui.TITLE; }
// public static void TITLE(java.lang.String value, ) { net.minecraft.server.dedicated.gui.DedicatedServerGui.TITLE = value; }

// public java.lang.String SHUTTING_DOWN_TITLE() { return wrapperContained.SHUTTING_DOWN_TITLE; }
// public void SHUTTING_DOWN_TITLE(java.lang.String value) { wrapperContained.SHUTTING_DOWN_TITLE = value; }
// public static java.lang.String SHUTTING_DOWN_TITLE() { return net.minecraft.server.dedicated.gui.DedicatedServerGui.SHUTTING_DOWN_TITLE; }
// public static void SHUTTING_DOWN_TITLE(java.lang.String value, ) { net.minecraft.server.dedicated.gui.DedicatedServerGui.SHUTTING_DOWN_TITLE = value; }

// public DedicatedServerGui(yarnwrap.server.dedicated.MinecraftDedicatedServer server) { this.wrapperContained = new net.minecraft.server.dedicated.gui.DedicatedServerGui(server.wrapperContained); }
// public yarnwrap.server.dedicated.gui.DedicatedServerGui create(yarnwrap.server.dedicated.MinecraftDedicatedServer server) { return new yarnwrap.server.dedicated.gui.DedicatedServerGui(wrapperContained.create(server.wrapperContained)); }
// public static yarnwrap.server.dedicated.gui.DedicatedServerGui create(yarnwrap.server.dedicated.MinecraftDedicatedServer server, ) { return new yarnwrap.server.dedicated.gui.DedicatedServerGui(net.minecraft.server.dedicated.gui.DedicatedServerGui.create(server.wrapperContained)); }
public void appendToConsole(javax.swing.JTextArea textArea,javax.swing.JScrollPane scrollPane,java.lang.String message) { wrapperContained.appendToConsole(textArea,scrollPane,message); }
// public static void appendToConsole(javax.swing.JTextArea textArea,javax.swing.JScrollPane scrollPane,java.lang.String message, ) { net.minecraft.server.dedicated.gui.DedicatedServerGui.appendToConsole(textArea,scrollPane,message); }
// public javax.swing.JComponent createLogPanel() { return wrapperContained.createLogPanel(); }
// public static javax.swing.JComponent createLogPanel() { return net.minecraft.server.dedicated.gui.DedicatedServerGui.createLogPanel(); }
public void start() { wrapperContained.start(); }
// public static void start() { net.minecraft.server.dedicated.gui.DedicatedServerGui.start(); }
// public javax.swing.JComponent createPlaysPanel() { return wrapperContained.createPlaysPanel(); }
// public static javax.swing.JComponent createPlaysPanel() { return net.minecraft.server.dedicated.gui.DedicatedServerGui.createPlaysPanel(); }
// public javax.swing.JComponent createStatsPanel() { return wrapperContained.createStatsPanel(); }
// public static javax.swing.JComponent createStatsPanel() { return net.minecraft.server.dedicated.gui.DedicatedServerGui.createStatsPanel(); }
// public void method_13977(javax.swing.JTextField event) { wrapperContained.method_13977(event); }
// public static void method_13977(javax.swing.JTextField event, ) { net.minecraft.server.dedicated.gui.DedicatedServerGui.method_13977(event); }
public void addStopTask(java.lang.Runnable task) { wrapperContained.addStopTask(task); }
// public static void addStopTask(java.lang.Runnable task, ) { net.minecraft.server.dedicated.gui.DedicatedServerGui.addStopTask(task); }
// public void runStopTasks() { wrapperContained.runStopTasks(); }
// public static void runStopTasks() { net.minecraft.server.dedicated.gui.DedicatedServerGui.runStopTasks(); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.server.dedicated.gui.DedicatedServerGui.stop(); }

}