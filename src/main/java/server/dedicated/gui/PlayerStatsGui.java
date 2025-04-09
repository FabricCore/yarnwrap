package yarnwrap.server.dedicated.gui;
public class PlayerStatsGui { public net.minecraft.server.dedicated.gui.PlayerStatsGui wrapperContained; public PlayerStatsGui(net.minecraft.server.dedicated.gui.PlayerStatsGui wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] memoryUsePercentage() { return wrapperContained.memoryUsePercentage; }
// public java.text.DecimalFormat AVG_TICK_FORMAT() { return wrapperContained.AVG_TICK_FORMAT; }
// public java.lang.String[] lines() { return wrapperContained.lines; }
// public int memoryUsePercentagePos() { return wrapperContained.memoryUsePercentagePos; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public javax.swing.Timer timer() { return wrapperContained.timer; }
// public void update() { wrapperContained.update(); }
public void stop() { wrapperContained.stop(); }

}