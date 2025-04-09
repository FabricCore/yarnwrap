package yarnwrap.client.gui.widget;
public class CyclingButtonWidget { public net.minecraft.client.gui.widget.CyclingButtonWidget wrapperContained; public CyclingButtonWidget(net.minecraft.client.gui.widget.CyclingButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.BooleanSupplier HAS_ALT_DOWN() { return wrapperContained.HAS_ALT_DOWN; }
// public java.util.List BOOLEAN_VALUES() { return wrapperContained.BOOLEAN_VALUES; }
// public yarnwrap.text.Text optionText() { return new yarnwrap.text.Text(wrapperContained.optionText); }
// public int index() { return wrapperContained.index; }
// public java.lang.Object value() { return wrapperContained.value; }
// public Object values() { return wrapperContained.values; }
// public java.util.function.Function valueToText() { return wrapperContained.valueToText; }
// public java.util.function.Function narrationMessageFactory() { return wrapperContained.narrationMessageFactory; }
// public Object callback() { return wrapperContained.callback; }
// public Object tooltipFactory() { return wrapperContained.tooltipFactory; }
// public boolean optionTextOmitted() { return wrapperContained.optionTextOmitted; }
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