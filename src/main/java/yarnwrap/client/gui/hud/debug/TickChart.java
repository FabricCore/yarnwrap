package yarnwrap.client.gui.hud.debug;
public class TickChart { public net.minecraft.client.gui.hud.debug.TickChart wrapperContained; public TickChart(net.minecraft.client.gui.hud.debug.TickChart wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier millisPerTickSupplier() { return wrapperContained.millisPerTickSupplier; }
// public void millisPerTickSupplier(java.util.function.Supplier value) { wrapperContained.millisPerTickSupplier = value; }
// public static java.util.function.Supplier millisPerTickSupplier() { return net.minecraft.client.gui.hud.debug.TickChart.millisPerTickSupplier; }
// public static void millisPerTickSupplier(java.util.function.Supplier value, ) { net.minecraft.client.gui.hud.debug.TickChart.millisPerTickSupplier = value; }

public TickChart(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.util.profiler.log.MultiValueDebugSampleLog log,java.util.function.Supplier millisPerTickSupplier) { this.wrapperContained = new net.minecraft.client.gui.hud.debug.TickChart(textRenderer.wrapperContained,log.wrapperContained,millisPerTickSupplier); }
// public double toMillisecondsPerTick(double nanosecondsPerTick) { return wrapperContained.toMillisecondsPerTick(nanosecondsPerTick); }
// public static double toMillisecondsPerTick(double nanosecondsPerTick, ) { return net.minecraft.client.gui.hud.debug.TickChart.toMillisecondsPerTick(nanosecondsPerTick); }

}