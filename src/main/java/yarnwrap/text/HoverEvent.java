package yarnwrap.text;
public class HoverEvent { public net.minecraft.text.HoverEvent wrapperContained; public HoverEvent(net.minecraft.text.HoverEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public Object data() { return wrapperContained.data; }
// // public void data(Object value) { wrapperContained.data = value; }
// public HoverEvent(Object action,java.lang.Object contents) { this.wrapperContained = new net.minecraft.text.HoverEvent(action,contents); }
// public HoverEvent(Object data) { this.wrapperContained = new net.minecraft.text.HoverEvent(data); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public java.lang.Object getValue(Object action) { return wrapperContained.getValue(action); }
public Object getAction() { return wrapperContained.getAction(); }
// public Object method_54184(yarnwrap.text.HoverEvent event) { return wrapperContained.method_54184(event.wrapperContained); }

}