package yarnwrap.client.gui.widget;
public class CyclingButtonWidget { public net.minecraft.client.gui.widget.CyclingButtonWidget wrapperContained; public CyclingButtonWidget(net.minecraft.client.gui.widget.CyclingButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.BooleanSupplier HAS_ALT_DOWN() { return wrapperContained.HAS_ALT_DOWN; }
// public void HAS_ALT_DOWN(java.util.function.BooleanSupplier value) { wrapperContained.HAS_ALT_DOWN = value; }
// public java.util.List BOOLEAN_VALUES() { return wrapperContained.BOOLEAN_VALUES; }
// public void BOOLEAN_VALUES(java.util.List value) { wrapperContained.BOOLEAN_VALUES = value; }
// public yarnwrap.text.Text optionText() { return new yarnwrap.text.Text(wrapperContained.optionText); }
// public void optionText(yarnwrap.text.Text value) { wrapperContained.optionText = value.wrapperContained; }
// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public java.lang.Object value() { return wrapperContained.value; }
// public void value(java.lang.Object value) { wrapperContained.value = value; }
// public Object values() { return wrapperContained.values; }
// // public void values(Object value) { wrapperContained.values = value; }
// public java.util.function.Function valueToText() { return wrapperContained.valueToText; }
// public void valueToText(java.util.function.Function value) { wrapperContained.valueToText = value; }
// public java.util.function.Function narrationMessageFactory() { return wrapperContained.narrationMessageFactory; }
// public void narrationMessageFactory(java.util.function.Function value) { wrapperContained.narrationMessageFactory = value; }
// public Object callback() { return wrapperContained.callback; }
// // public void callback(Object value) { wrapperContained.callback = value; }
// public Object tooltipFactory() { return wrapperContained.tooltipFactory; }
// // public void tooltipFactory(Object value) { wrapperContained.tooltipFactory = value; }
// public boolean optionTextOmitted() { return wrapperContained.optionTextOmitted; }
// public void optionTextOmitted(boolean value) { wrapperContained.optionTextOmitted = value; }
public java.lang.Object getValue() { return wrapperContained.getValue(); }
public void setValue(java.lang.Object value) { wrapperContained.setValue(value); }
public Object builder(java.util.function.Function valueToText) { return wrapperContained.builder(valueToText); }
public Object onOffBuilder(yarnwrap.text.Text on,yarnwrap.text.Text off) { return wrapperContained.onOffBuilder(on.wrapperContained,off.wrapperContained); }
// public void internalSetValue(java.lang.Object value) { wrapperContained.internalSetValue(value); }
// public yarnwrap.text.MutableText composeGenericOptionText(java.lang.Object value) { return new yarnwrap.text.MutableText(wrapperContained.composeGenericOptionText(value)); }
public yarnwrap.text.MutableText getGenericNarrationMessage() { return new yarnwrap.text.MutableText(wrapperContained.getGenericNarrationMessage()); }
// public void cycle(int amount) { wrapperContained.cycle(amount); }
public Object onOffBuilder(boolean initialValue) { return wrapperContained.onOffBuilder(initialValue); }
public Object onOffBuilder() { return wrapperContained.onOffBuilder(); }
// public yarnwrap.text.Text composeText(java.lang.Object value) { return new yarnwrap.text.Text(wrapperContained.composeText(value)); }
// public java.lang.Object getValue(int offset) { return wrapperContained.getValue(offset); }
// public void refreshTooltip() { wrapperContained.refreshTooltip(); }

}