package yarnwrap.text;
public class ClickEvent { public net.minecraft.text.ClickEvent wrapperContained; public ClickEvent(net.minecraft.text.ClickEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String value() { return wrapperContained.value; }
// public Object action() { return wrapperContained.action; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public java.lang.String getValue() { return wrapperContained.getValue(); }
public Object getAction() { return wrapperContained.getAction(); }

}