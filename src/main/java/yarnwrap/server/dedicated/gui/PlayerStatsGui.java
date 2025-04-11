package yarnwrap.server.dedicated.gui;
public class PlayerStatsGui { public net.minecraft.server.dedicated.gui.PlayerStatsGui wrapperContained; public PlayerStatsGui(net.minecraft.server.dedicated.gui.PlayerStatsGui wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] memoryUsePercentage() { return wrapperContained.memoryUsePercentage; }
// public void memoryUsePercentage(int[] value) { wrapperContained.memoryUsePercentage = value; }
// public java.text.DecimalFormat AVG_TICK_FORMAT() { return wrapperContained.AVG_TICK_FORMAT; }
// public void AVG_TICK_FORMAT(java.text.DecimalFormat value) { wrapperContained.AVG_TICK_FORMAT = value; }
// public java.lang.String[] lines() { return wrapperContained.lines; }
// public void lines(java.lang.String[] value) { wrapperContained.lines = value; }
// public int memoryUsePercentagePos() { return wrapperContained.memoryUsePercentagePos; }
// public void memoryUsePercentagePos(int value) { wrapperContained.memoryUsePercentagePos = value; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public javax.swing.Timer timer() { return wrapperContained.timer; }
// public void timer(javax.swing.Timer value) { wrapperContained.timer = value; }
// public void update() { wrapperContained.update(); }
public void stop() { wrapperContained.stop(); }

}