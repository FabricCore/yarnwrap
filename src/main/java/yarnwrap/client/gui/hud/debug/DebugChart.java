package yarnwrap.client.gui.hud.debug;
public class DebugChart { public net.minecraft.client.gui.hud.debug.DebugChart wrapperContained; public DebugChart(net.minecraft.client.gui.hud.debug.DebugChart wrapperContained) { this.wrapperContained = wrapperContained; }

// public int TEXT_COLOR() { return wrapperContained.TEXT_COLOR; }
// public void TEXT_COLOR(int value) { wrapperContained.TEXT_COLOR = value; }
// public static int TEXT_COLOR() { return net.minecraft.client.gui.hud.debug.DebugChart.TEXT_COLOR; }
// public static void TEXT_COLOR(int value, ) { net.minecraft.client.gui.hud.debug.DebugChart.TEXT_COLOR = value; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.gui.hud.debug.DebugChart.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.gui.hud.debug.DebugChart.textRenderer = value.wrapperContained; }

// public yarnwrap.util.profiler.log.MultiValueDebugSampleLog log() { return new yarnwrap.util.profiler.log.MultiValueDebugSampleLog(wrapperContained.log); }
// public void log(yarnwrap.util.profiler.log.MultiValueDebugSampleLog value) { wrapperContained.log = value.wrapperContained; }
// public static yarnwrap.util.profiler.log.MultiValueDebugSampleLog log() { return new yarnwrap.util.profiler.log.MultiValueDebugSampleLog(net.minecraft.client.gui.hud.debug.DebugChart.log); }
// public static void log(yarnwrap.util.profiler.log.MultiValueDebugSampleLog value, ) { net.minecraft.client.gui.hud.debug.DebugChart.log = value.wrapperContained; }

// public DebugChart(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.util.profiler.log.MultiValueDebugSampleLog log) { this.wrapperContained = new net.minecraft.client.gui.hud.debug.DebugChart(textRenderer.wrapperContained,log.wrapperContained); }
// public java.lang.String format(double value) { return wrapperContained.format(value); }
// public static java.lang.String format(double value, ) { return net.minecraft.client.gui.hud.debug.DebugChart.format(value); }
// public int getColor(double value,double min,int minColor,double median,int medianColor,double max,int maxColor) { return wrapperContained.getColor(value,min,minColor,median,medianColor,max,maxColor); }
// public static int getColor(double value,double min,int minColor,double median,int medianColor,double max,int maxColor, ) { return net.minecraft.client.gui.hud.debug.DebugChart.getColor(value,min,minColor,median,medianColor,max,maxColor); }
public int getWidth(int centerX) { return wrapperContained.getWidth(centerX); }
// public static int getWidth(int centerX, ) { return net.minecraft.client.gui.hud.debug.DebugChart.getWidth(centerX); }
// public int getColor(long value) { return wrapperContained.getColor(value); }
// public static int getColor(long value, ) { return net.minecraft.client.gui.hud.debug.DebugChart.getColor(value); }
public void render(yarnwrap.client.gui.DrawContext context,int x,int width) { wrapperContained.render(context.wrapperContained,x,width); }
// public static void render(yarnwrap.client.gui.DrawContext context,int x,int width, ) { net.minecraft.client.gui.hud.debug.DebugChart.render(context.wrapperContained,x,width); }
// public void renderThresholds(yarnwrap.client.gui.DrawContext context,int x,int width,int height) { wrapperContained.renderThresholds(context.wrapperContained,x,width,height); }
// public static void renderThresholds(yarnwrap.client.gui.DrawContext context,int x,int width,int height, ) { net.minecraft.client.gui.hud.debug.DebugChart.renderThresholds(context.wrapperContained,x,width,height); }
// public void drawBorderedText(yarnwrap.client.gui.DrawContext context,java.lang.String string,int x,int y) { wrapperContained.drawBorderedText(context.wrapperContained,string,x,y); }
// public static void drawBorderedText(yarnwrap.client.gui.DrawContext context,java.lang.String string,int x,int y, ) { net.minecraft.client.gui.hud.debug.DebugChart.drawBorderedText(context.wrapperContained,string,x,y); }
// public int getHeight(double value) { return wrapperContained.getHeight(value); }
// public static int getHeight(double value, ) { return net.minecraft.client.gui.hud.debug.DebugChart.getHeight(value); }
// public void drawBar(yarnwrap.client.gui.DrawContext context,int y,int x,int index) { wrapperContained.drawBar(context.wrapperContained,y,x,index); }
// public static void drawBar(yarnwrap.client.gui.DrawContext context,int y,int x,int index, ) { net.minecraft.client.gui.hud.debug.DebugChart.drawBar(context.wrapperContained,y,x,index); }
// public long get(int index) { return wrapperContained.get(index); }
// public static long get(int index, ) { return net.minecraft.client.gui.hud.debug.DebugChart.get(index); }
// public void drawTotalBar(yarnwrap.client.gui.DrawContext context,int y,int x,int index) { wrapperContained.drawTotalBar(context.wrapperContained,y,x,index); }
// public static void drawTotalBar(yarnwrap.client.gui.DrawContext context,int y,int x,int index, ) { net.minecraft.client.gui.hud.debug.DebugChart.drawTotalBar(context.wrapperContained,y,x,index); }
// public void drawOverlayBar(yarnwrap.client.gui.DrawContext context,int y,int x,int index) { wrapperContained.drawOverlayBar(context.wrapperContained,y,x,index); }
// public static void drawOverlayBar(yarnwrap.client.gui.DrawContext context,int y,int x,int index, ) { net.minecraft.client.gui.hud.debug.DebugChart.drawOverlayBar(context.wrapperContained,y,x,index); }

}