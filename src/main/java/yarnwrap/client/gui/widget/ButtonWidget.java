package yarnwrap.client.gui.widget;
public class ButtonWidget { public net.minecraft.client.gui.widget.ButtonWidget wrapperContained; public ButtonWidget(net.minecraft.client.gui.widget.ButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object onPress() { return wrapperContained.onPress; }
// // public void onPress(Object value) { wrapperContained.onPress = value; }
// // public static Object onPress() { return net.minecraft.client.gui.widget.ButtonWidget.onPress; }
// // public static void onPress(Object value, ) { net.minecraft.client.gui.widget.ButtonWidget.onPress = value; }

// public int DEFAULT_WIDTH_SMALL() { return wrapperContained.DEFAULT_WIDTH_SMALL; }
// public void DEFAULT_WIDTH_SMALL(int value) { wrapperContained.DEFAULT_WIDTH_SMALL = value; }
public static int DEFAULT_WIDTH_SMALL() { return net.minecraft.client.gui.widget.ButtonWidget.DEFAULT_WIDTH_SMALL; }
// public static void DEFAULT_WIDTH_SMALL(int value, ) { net.minecraft.client.gui.widget.ButtonWidget.DEFAULT_WIDTH_SMALL = value; }

// public int DEFAULT_WIDTH() { return wrapperContained.DEFAULT_WIDTH; }
// public void DEFAULT_WIDTH(int value) { wrapperContained.DEFAULT_WIDTH = value; }
public static int DEFAULT_WIDTH() { return net.minecraft.client.gui.widget.ButtonWidget.DEFAULT_WIDTH; }
// public static void DEFAULT_WIDTH(int value, ) { net.minecraft.client.gui.widget.ButtonWidget.DEFAULT_WIDTH = value; }

// public int DEFAULT_HEIGHT() { return wrapperContained.DEFAULT_HEIGHT; }
// public void DEFAULT_HEIGHT(int value) { wrapperContained.DEFAULT_HEIGHT = value; }
public static int DEFAULT_HEIGHT() { return net.minecraft.client.gui.widget.ButtonWidget.DEFAULT_HEIGHT; }
// public static void DEFAULT_HEIGHT(int value, ) { net.minecraft.client.gui.widget.ButtonWidget.DEFAULT_HEIGHT = value; }

// public Object DEFAULT_NARRATION_SUPPLIER() { return wrapperContained.DEFAULT_NARRATION_SUPPLIER; }
// // public void DEFAULT_NARRATION_SUPPLIER(Object value) { wrapperContained.DEFAULT_NARRATION_SUPPLIER = value; }
// // public static Object DEFAULT_NARRATION_SUPPLIER() { return net.minecraft.client.gui.widget.ButtonWidget.DEFAULT_NARRATION_SUPPLIER; }
// // public static void DEFAULT_NARRATION_SUPPLIER(Object value, ) { net.minecraft.client.gui.widget.ButtonWidget.DEFAULT_NARRATION_SUPPLIER = value; }

// public Object narrationSupplier() { return wrapperContained.narrationSupplier; }
// // public void narrationSupplier(Object value) { wrapperContained.narrationSupplier = value; }
// // public static Object narrationSupplier() { return net.minecraft.client.gui.widget.ButtonWidget.narrationSupplier; }
// // public static void narrationSupplier(Object value, ) { net.minecraft.client.gui.widget.ButtonWidget.narrationSupplier = value; }

// public ButtonWidget(int x,int y,int width,int height,yarnwrap.text.Text message,Object onPress,Object narrationSupplier) { this.wrapperContained = new net.minecraft.client.gui.widget.ButtonWidget(x,y,width,height,message.wrapperContained,onPress,narrationSupplier); }
// public yarnwrap.text.MutableText method_46429(java.util.function.Supplier textSupplier) { return new yarnwrap.text.MutableText(wrapperContained.method_46429(textSupplier)); }
// public static yarnwrap.text.MutableText method_46429(java.util.function.Supplier textSupplier, ) { return new yarnwrap.text.MutableText(net.minecraft.client.gui.widget.ButtonWidget.method_46429(textSupplier)); }
// public Object builder(yarnwrap.text.Text message,Object onPress) { return wrapperContained.builder(message.wrapperContained,onPress); }
// public static Object builder(yarnwrap.text.Text message,Object onPress, ) { return net.minecraft.client.gui.widget.ButtonWidget.builder(message.wrapperContained,onPress); }

}