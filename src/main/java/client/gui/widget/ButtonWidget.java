package yarnwrap.client.gui.widget;
public class ButtonWidget { public net.minecraft.client.gui.widget.ButtonWidget wrapperContained; public ButtonWidget(net.minecraft.client.gui.widget.ButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object onPress() { return wrapperContained.onPress; }
public int DEFAULT_WIDTH_SMALL() { return wrapperContained.DEFAULT_WIDTH_SMALL; }
public int DEFAULT_WIDTH() { return wrapperContained.DEFAULT_WIDTH; }
public int DEFAULT_HEIGHT() { return wrapperContained.DEFAULT_HEIGHT; }
// public Object DEFAULT_NARRATION_SUPPLIER() { return wrapperContained.DEFAULT_NARRATION_SUPPLIER; }
// public Object narrationSupplier() { return wrapperContained.narrationSupplier; }
// public Object builder(yarnwrap.text.Text message,Object onPress) { return wrapperContained.builder(message.wrapperContained,onPress); }

}