package yarnwrap.text;
public class HoverEvent { public net.minecraft.text.HoverEvent wrapperContained; public HoverEvent(net.minecraft.text.HoverEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public Object data() { return wrapperContained.data; }
// public java.lang.Object getValue(Object action) { return wrapperContained.getValue(action); }
public Object getAction() { return wrapperContained.getAction(); }

}