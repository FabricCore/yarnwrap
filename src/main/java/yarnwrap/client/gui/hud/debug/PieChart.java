package yarnwrap.client.gui.hud.debug;
public class PieChart { public net.minecraft.client.gui.hud.debug.PieChart wrapperContained; public PieChart(net.minecraft.client.gui.hud.debug.PieChart wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.gui.hud.debug.PieChart.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.gui.hud.debug.PieChart.textRenderer = value.wrapperContained; }

// public yarnwrap.util.profiler.ProfileResult profileResult() { return new yarnwrap.util.profiler.ProfileResult(wrapperContained.profileResult); }
// public void profileResult(yarnwrap.util.profiler.ProfileResult value) { wrapperContained.profileResult = value.wrapperContained; }
// public static yarnwrap.util.profiler.ProfileResult profileResult() { return new yarnwrap.util.profiler.ProfileResult(net.minecraft.client.gui.hud.debug.PieChart.profileResult); }
// public static void profileResult(yarnwrap.util.profiler.ProfileResult value, ) { net.minecraft.client.gui.hud.debug.PieChart.profileResult = value.wrapperContained; }

// public java.lang.String currentPath() { return wrapperContained.currentPath; }
// public void currentPath(java.lang.String value) { wrapperContained.currentPath = value; }
// public static java.lang.String currentPath() { return net.minecraft.client.gui.hud.debug.PieChart.currentPath; }
// public static void currentPath(java.lang.String value, ) { net.minecraft.client.gui.hud.debug.PieChart.currentPath = value; }

// public int bottomMargin() { return wrapperContained.bottomMargin; }
// public void bottomMargin(int value) { wrapperContained.bottomMargin = value; }
// public static int bottomMargin() { return net.minecraft.client.gui.hud.debug.PieChart.bottomMargin; }
// public static void bottomMargin(int value, ) { net.minecraft.client.gui.hud.debug.PieChart.bottomMargin = value; }

public PieChart(yarnwrap.client.font.TextRenderer textRenderer) { this.wrapperContained = new net.minecraft.client.gui.hud.debug.PieChart(textRenderer.wrapperContained); }
public void setBottomMargin(int bottomMargin) { wrapperContained.setBottomMargin(bottomMargin); }
// public static void setBottomMargin(int bottomMargin, ) { net.minecraft.client.gui.hud.debug.PieChart.setBottomMargin(bottomMargin); }
public void setProfileResult(yarnwrap.util.profiler.ProfileResult profileResult) { wrapperContained.setProfileResult(profileResult.wrapperContained); }
// public static void setProfileResult(yarnwrap.util.profiler.ProfileResult profileResult, ) { net.minecraft.client.gui.hud.debug.PieChart.setProfileResult(profileResult.wrapperContained); }
public void render(yarnwrap.client.gui.DrawContext context) { wrapperContained.render(context.wrapperContained); }
// public static void render(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.hud.debug.PieChart.render(context.wrapperContained); }
public void select(int index) { wrapperContained.select(index); }
// public static void select(int index, ) { net.minecraft.client.gui.hud.debug.PieChart.select(index); }

}