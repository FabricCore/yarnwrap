package yarnwrap.client.gui.hud.debug;
public class PacketSizeChart { public net.minecraft.client.gui.hud.debug.PacketSizeChart wrapperContained; public PacketSizeChart(net.minecraft.client.gui.hud.debug.PacketSizeChart wrapperContained) { this.wrapperContained = wrapperContained; }

// public void drawSizeBar(yarnwrap.client.gui.DrawContext context,int x,int width,int height,int bytes) { wrapperContained.drawSizeBar(context.wrapperContained,x,width,height,bytes); }
// public static void drawSizeBar(yarnwrap.client.gui.DrawContext context,int x,int width,int height,int bytes, ) { net.minecraft.client.gui.hud.debug.PacketSizeChart.drawSizeBar(context.wrapperContained,x,width,height,bytes); }
// public void drawSizeBar(yarnwrap.client.gui.DrawContext context,int x,int width,int y,java.lang.String label) { wrapperContained.drawSizeBar(context.wrapperContained,x,width,y,label); }
// public static void drawSizeBar(yarnwrap.client.gui.DrawContext context,int x,int width,int y,java.lang.String label, ) { net.minecraft.client.gui.hud.debug.PacketSizeChart.drawSizeBar(context.wrapperContained,x,width,y,label); }
// public java.lang.String formatBytesPerSecond(double value) { return wrapperContained.formatBytesPerSecond(value); }
// public static java.lang.String formatBytesPerSecond(double value, ) { return net.minecraft.client.gui.hud.debug.PacketSizeChart.formatBytesPerSecond(value); }
// public int calculateHeight(double value) { return wrapperContained.calculateHeight(value); }
// public static int calculateHeight(double value, ) { return net.minecraft.client.gui.hud.debug.PacketSizeChart.calculateHeight(value); }
// public double toBytesPerSecond(double bytesPerTick) { return wrapperContained.toBytesPerSecond(bytesPerTick); }
// public static double toBytesPerSecond(double bytesPerTick, ) { return net.minecraft.client.gui.hud.debug.PacketSizeChart.toBytesPerSecond(bytesPerTick); }

}