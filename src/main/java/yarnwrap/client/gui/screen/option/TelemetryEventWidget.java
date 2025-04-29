package yarnwrap.client.gui.screen.option;
public class TelemetryEventWidget { public net.minecraft.client.gui.screen.option.TelemetryEventWidget wrapperContained; public TelemetryEventWidget(net.minecraft.client.gui.screen.option.TelemetryEventWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MARGIN_X() { return wrapperContained.MARGIN_X; }
// public void MARGIN_X(int value) { wrapperContained.MARGIN_X = value; }
// public static int MARGIN_X() { return net.minecraft.client.gui.screen.option.TelemetryEventWidget.MARGIN_X; }
// public static void MARGIN_X(int value, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.MARGIN_X = value; }

// public java.lang.String REQUIRED_TRANSLATION_KEY() { return wrapperContained.REQUIRED_TRANSLATION_KEY; }
// public void REQUIRED_TRANSLATION_KEY(java.lang.String value) { wrapperContained.REQUIRED_TRANSLATION_KEY = value; }
// public static java.lang.String REQUIRED_TRANSLATION_KEY() { return net.minecraft.client.gui.screen.option.TelemetryEventWidget.REQUIRED_TRANSLATION_KEY; }
// public static void REQUIRED_TRANSLATION_KEY(java.lang.String value, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.REQUIRED_TRANSLATION_KEY = value; }

// public java.lang.String OPTIONAL_TRANSLATION_KEY() { return wrapperContained.OPTIONAL_TRANSLATION_KEY; }
// public void OPTIONAL_TRANSLATION_KEY(java.lang.String value) { wrapperContained.OPTIONAL_TRANSLATION_KEY = value; }
// public static java.lang.String OPTIONAL_TRANSLATION_KEY() { return net.minecraft.client.gui.screen.option.TelemetryEventWidget.OPTIONAL_TRANSLATION_KEY; }
// public static void OPTIONAL_TRANSLATION_KEY(java.lang.String value, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.OPTIONAL_TRANSLATION_KEY = value; }

// public yarnwrap.text.Text PROPERTY_TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.PROPERTY_TITLE_TEXT); }
// public void PROPERTY_TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.PROPERTY_TITLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text PROPERTY_TITLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.option.TelemetryEventWidget.PROPERTY_TITLE_TEXT); }
// public static void PROPERTY_TITLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.PROPERTY_TITLE_TEXT = value.wrapperContained; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.gui.screen.option.TelemetryEventWidget.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.textRenderer = value.wrapperContained; }

// public Object contents() { return wrapperContained.contents; }
// // public void contents(Object value) { wrapperContained.contents = value; }
// // public static Object contents() { return net.minecraft.client.gui.screen.option.TelemetryEventWidget.contents; }
// // public static void contents(Object value, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.contents = value; }

// public java.util.function.DoubleConsumer scrollConsumer() { return wrapperContained.scrollConsumer; }
// public void scrollConsumer(java.util.function.DoubleConsumer value) { wrapperContained.scrollConsumer = value; }
// public static java.util.function.DoubleConsumer scrollConsumer() { return net.minecraft.client.gui.screen.option.TelemetryEventWidget.scrollConsumer; }
// public static void scrollConsumer(java.util.function.DoubleConsumer value, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.scrollConsumer = value; }

// public java.lang.String DISABLED_TRANSLATION_KEY() { return wrapperContained.DISABLED_TRANSLATION_KEY; }
// public void DISABLED_TRANSLATION_KEY(java.lang.String value) { wrapperContained.DISABLED_TRANSLATION_KEY = value; }
// public static java.lang.String DISABLED_TRANSLATION_KEY() { return net.minecraft.client.gui.screen.option.TelemetryEventWidget.DISABLED_TRANSLATION_KEY; }
// public static void DISABLED_TRANSLATION_KEY(java.lang.String value, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.DISABLED_TRANSLATION_KEY = value; }

public TelemetryEventWidget(int x,int y,int width,int height,yarnwrap.client.font.TextRenderer textRenderer) { this.wrapperContained = new net.minecraft.client.gui.screen.option.TelemetryEventWidget(x,y,width,height,textRenderer.wrapperContained); }
// public void appendEventInfo(Object builder,yarnwrap.client.session.telemetry.TelemetryEventType eventType,boolean disabled) { wrapperContained.appendEventInfo(builder,eventType.wrapperContained,disabled); }
// public static void appendEventInfo(Object builder,yarnwrap.client.session.telemetry.TelemetryEventType eventType,boolean disabled, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.appendEventInfo(builder,eventType.wrapperContained,disabled); }
// public void appendProperties(yarnwrap.client.session.telemetry.TelemetryEventType eventType,Object builder,boolean disabled) { wrapperContained.appendProperties(eventType.wrapperContained,builder,disabled); }
// public static void appendProperties(yarnwrap.client.session.telemetry.TelemetryEventType eventType,Object builder,boolean disabled, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.appendProperties(eventType.wrapperContained,builder,disabled); }
public void setScrollConsumer(java.util.function.DoubleConsumer scrollConsumer) { wrapperContained.setScrollConsumer(scrollConsumer); }
// public static void setScrollConsumer(java.util.function.DoubleConsumer scrollConsumer, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.setScrollConsumer(scrollConsumer); }
public void refresh(boolean optionalTelemetryEnabled) { wrapperContained.refresh(optionalTelemetryEnabled); }
// public static void refresh(boolean optionalTelemetryEnabled, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.refresh(optionalTelemetryEnabled); }
// public Object collectContents(boolean optionalTelemetryEnabled) { return wrapperContained.collectContents(optionalTelemetryEnabled); }
// public static Object collectContents(boolean optionalTelemetryEnabled, ) { return net.minecraft.client.gui.screen.option.TelemetryEventWidget.collectContents(optionalTelemetryEnabled); }
// public int getGridWidth() { return wrapperContained.getGridWidth(); }
// public static int getGridWidth() { return net.minecraft.client.gui.screen.option.TelemetryEventWidget.getGridWidth(); }
// public void method_48285(yarnwrap.client.gui.DrawContext widget) { wrapperContained.method_48285(widget.wrapperContained); }
// public static void method_48285(yarnwrap.client.gui.DrawContext widget, ) { net.minecraft.client.gui.screen.option.TelemetryEventWidget.method_48285(widget.wrapperContained); }
// public yarnwrap.text.Text formatTitleText(yarnwrap.text.Text title,boolean disabled) { return new yarnwrap.text.Text(wrapperContained.formatTitleText(title.wrapperContained,disabled)); }
// public static yarnwrap.text.Text formatTitleText(yarnwrap.text.Text title,boolean disabled, ) { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.option.TelemetryEventWidget.formatTitleText(title.wrapperContained,disabled)); }
public void initContents() { wrapperContained.initContents(); }
// public static void initContents() { net.minecraft.client.gui.screen.option.TelemetryEventWidget.initContents(); }

}