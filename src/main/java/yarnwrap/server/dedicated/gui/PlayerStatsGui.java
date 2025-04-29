package yarnwrap.server.dedicated.gui;
public class PlayerStatsGui { public net.minecraft.server.dedicated.gui.PlayerStatsGui wrapperContained; public PlayerStatsGui(net.minecraft.server.dedicated.gui.PlayerStatsGui wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] memoryUsePercentage() { return wrapperContained.memoryUsePercentage; }
// public void memoryUsePercentage(int[] value) { wrapperContained.memoryUsePercentage = value; }
// public static int[] memoryUsePercentage() { return net.minecraft.server.dedicated.gui.PlayerStatsGui.memoryUsePercentage; }
// public static void memoryUsePercentage(int[] value, ) { net.minecraft.server.dedicated.gui.PlayerStatsGui.memoryUsePercentage = value; }

// public java.text.DecimalFormat AVG_TICK_FORMAT() { return wrapperContained.AVG_TICK_FORMAT; }
// public void AVG_TICK_FORMAT(java.text.DecimalFormat value) { wrapperContained.AVG_TICK_FORMAT = value; }
// public static java.text.DecimalFormat AVG_TICK_FORMAT() { return net.minecraft.server.dedicated.gui.PlayerStatsGui.AVG_TICK_FORMAT; }
// public static void AVG_TICK_FORMAT(java.text.DecimalFormat value, ) { net.minecraft.server.dedicated.gui.PlayerStatsGui.AVG_TICK_FORMAT = value; }

// public java.lang.String[] lines() { return wrapperContained.lines; }
// public void lines(java.lang.String[] value) { wrapperContained.lines = value; }
// public static java.lang.String[] lines() { return net.minecraft.server.dedicated.gui.PlayerStatsGui.lines; }
// public static void lines(java.lang.String[] value, ) { net.minecraft.server.dedicated.gui.PlayerStatsGui.lines = value; }

// public int memoryUsePercentagePos() { return wrapperContained.memoryUsePercentagePos; }
// public void memoryUsePercentagePos(int value) { wrapperContained.memoryUsePercentagePos = value; }
// public static int memoryUsePercentagePos() { return net.minecraft.server.dedicated.gui.PlayerStatsGui.memoryUsePercentagePos; }
// public static void memoryUsePercentagePos(int value, ) { net.minecraft.server.dedicated.gui.PlayerStatsGui.memoryUsePercentagePos = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.dedicated.gui.PlayerStatsGui.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.dedicated.gui.PlayerStatsGui.server = value.wrapperContained; }

// public javax.swing.Timer timer() { return wrapperContained.timer; }
// public void timer(javax.swing.Timer value) { wrapperContained.timer = value; }
// public static javax.swing.Timer timer() { return net.minecraft.server.dedicated.gui.PlayerStatsGui.timer; }
// public static void timer(javax.swing.Timer value, ) { net.minecraft.server.dedicated.gui.PlayerStatsGui.timer = value; }

public PlayerStatsGui(yarnwrap.server.MinecraftServer server) { this.wrapperContained = new net.minecraft.server.dedicated.gui.PlayerStatsGui(server.wrapperContained); }
// public void update() { wrapperContained.update(); }
// public static void update() { net.minecraft.server.dedicated.gui.PlayerStatsGui.update(); }
// public void method_13983(java.awt.event.ActionEvent event) { wrapperContained.method_13983(event); }
// public static void method_13983(java.awt.event.ActionEvent event, ) { net.minecraft.server.dedicated.gui.PlayerStatsGui.method_13983(event); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.server.dedicated.gui.PlayerStatsGui.stop(); }
public void paint(java.awt.Graphics graphics) { wrapperContained.paint(graphics); }
// public static void paint(java.awt.Graphics graphics, ) { net.minecraft.server.dedicated.gui.PlayerStatsGui.paint(graphics); }

}