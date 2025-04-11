package yarnwrap.client.option;
public class SimpleOption { public net.minecraft.client.option.SimpleOption wrapperContained; public SimpleOption(net.minecraft.client.option.SimpleOption wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public Object tooltipFactory() { return wrapperContained.tooltipFactory; }
// // public void tooltipFactory(Object value) { wrapperContained.tooltipFactory = value; }
// public java.util.function.Function textGetter() { return wrapperContained.textGetter; }
// public void textGetter(java.util.function.Function value) { wrapperContained.textGetter = value; }
// public Object callbacks() { return wrapperContained.callbacks; }
// // public void callbacks(Object value) { wrapperContained.callbacks = value; }
// public java.lang.Object defaultValue() { return wrapperContained.defaultValue; }
// public void defaultValue(java.lang.Object value) { wrapperContained.defaultValue = value; }
// public java.util.function.Consumer changeCallback() { return wrapperContained.changeCallback; }
// public void changeCallback(java.util.function.Consumer value) { wrapperContained.changeCallback = value; }
// public java.lang.Object value() { return wrapperContained.value; }
// public void value(java.lang.Object value) { wrapperContained.value = value; }
public Object BOOLEAN() { return wrapperContained.BOOLEAN; }
// // public void BOOLEAN(Object value) { wrapperContained.BOOLEAN = value; }
// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
// public void text(yarnwrap.text.Text value) { wrapperContained.text = value.wrapperContained; }
public Object BOOLEAN_TEXT_GETTER() { return wrapperContained.BOOLEAN_TEXT_GETTER; }
// // public void BOOLEAN_TEXT_GETTER(Object value) { wrapperContained.BOOLEAN_TEXT_GETTER = value; }
public yarnwrap.client.gui.widget.ClickableWidget createWidget(yarnwrap.client.option.GameOptions options,int x,int y,int width) { return new yarnwrap.client.gui.widget.ClickableWidget(wrapperContained.createWidget(options.wrapperContained,x,y,width)); }
public void setValue(java.lang.Object value) { wrapperContained.setValue(value); }
// public yarnwrap.client.option.SimpleOption ofBoolean(java.lang.String key,Object tooltipFactory,boolean defaultValue) { return new yarnwrap.client.option.SimpleOption(wrapperContained.ofBoolean(key,tooltipFactory,defaultValue)); }
// public yarnwrap.client.option.SimpleOption ofBoolean(java.lang.String key,Object tooltipFactory,boolean defaultValue,java.util.function.Consumer changeCallback) { return new yarnwrap.client.option.SimpleOption(wrapperContained.ofBoolean(key,tooltipFactory,defaultValue,changeCallback)); }
public yarnwrap.client.option.SimpleOption ofBoolean(java.lang.String key,boolean defaultValue,java.util.function.Consumer changeCallback) { return new yarnwrap.client.option.SimpleOption(wrapperContained.ofBoolean(key,defaultValue,changeCallback)); }
public java.lang.Object getValue() { return wrapperContained.getValue(); }
public Object getCallbacks() { return wrapperContained.getCallbacks(); }
public Object emptyTooltip() { return wrapperContained.emptyTooltip(); }
public yarnwrap.client.option.SimpleOption ofBoolean(java.lang.String key,boolean defaultValue) { return new yarnwrap.client.option.SimpleOption(wrapperContained.ofBoolean(key,defaultValue)); }
public com.mojang.serialization.Codec getCodec() { return wrapperContained.getCodec(); }
public Object constantTooltip(yarnwrap.text.Text text) { return wrapperContained.constantTooltip(text.wrapperContained); }
public Object enumValueText() { return wrapperContained.enumValueText(); }
public yarnwrap.client.gui.widget.ClickableWidget createWidget(yarnwrap.client.option.GameOptions options,int x,int y,int width,java.util.function.Consumer changeCallback) { return new yarnwrap.client.gui.widget.ClickableWidget(wrapperContained.createWidget(options.wrapperContained,x,y,width,changeCallback)); }
// public yarnwrap.client.option.SimpleOption ofBoolean(java.lang.String key,Object tooltipFactory,Object valueTextGetter,boolean defaultValue,java.util.function.Consumer changeCallback) { return new yarnwrap.client.option.SimpleOption(wrapperContained.ofBoolean(key,tooltipFactory,valueTextGetter,defaultValue,changeCallback)); }
public yarnwrap.client.gui.widget.ClickableWidget createWidget(yarnwrap.client.option.GameOptions options) { return new yarnwrap.client.gui.widget.ClickableWidget(wrapperContained.createWidget(options.wrapperContained)); }

}