package yarnwrap.client.gui.widget;
public class ButtonWidget { public net.minecraft.client.gui.widget.ButtonWidget wrapperContained; public ButtonWidget(net.minecraft.client.gui.widget.ButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object onPress() { return wrapperContained.onPress; }
// // public void onPress(Object value) { wrapperContained.onPress = value; }
public int DEFAULT_WIDTH_SMALL() { return wrapperContained.DEFAULT_WIDTH_SMALL; }
// public void DEFAULT_WIDTH_SMALL(int value) { wrapperContained.DEFAULT_WIDTH_SMALL = value; }
public int DEFAULT_WIDTH() { return wrapperContained.DEFAULT_WIDTH; }
// public void DEFAULT_WIDTH(int value) { wrapperContained.DEFAULT_WIDTH = value; }
public int DEFAULT_HEIGHT() { return wrapperContained.DEFAULT_HEIGHT; }
// public void DEFAULT_HEIGHT(int value) { wrapperContained.DEFAULT_HEIGHT = value; }
// public Object DEFAULT_NARRATION_SUPPLIER() { return wrapperContained.DEFAULT_NARRATION_SUPPLIER; }
// // public void DEFAULT_NARRATION_SUPPLIER(Object value) { wrapperContained.DEFAULT_NARRATION_SUPPLIER = value; }
// public Object narrationSupplier() { return wrapperContained.narrationSupplier; }
// // public void narrationSupplier(Object value) { wrapperContained.narrationSupplier = value; }
// public Object builder(yarnwrap.text.Text message,Object onPress) { return wrapperContained.builder(message.wrapperContained,onPress); }

}