package yarnwrap.text;
public class HoverEvent { public net.minecraft.text.HoverEvent wrapperContained; public HoverEvent(net.minecraft.text.HoverEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.text.HoverEvent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.text.HoverEvent.CODEC = value; }

// public Object data() { return wrapperContained.data; }
// // public void data(Object value) { wrapperContained.data = value; }
// // public static Object data() { return net.minecraft.text.HoverEvent.data; }
// // public static void data(Object value, ) { net.minecraft.text.HoverEvent.data = value; }

// public HoverEvent(Object action,java.lang.Object contents) { this.wrapperContained = new net.minecraft.text.HoverEvent(action,contents); }
// public HoverEvent(Object data) { this.wrapperContained = new net.minecraft.text.HoverEvent(data); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.text.HoverEvent.equals(o); }
// public java.lang.Object getValue(Object action) { return wrapperContained.getValue(action); }
// public static java.lang.Object getValue(Object action, ) { return net.minecraft.text.HoverEvent.getValue(action); }
public Object getAction() { return wrapperContained.getAction(); }
// public static Object getAction() { return net.minecraft.text.HoverEvent.getAction(); }
// public Object method_54184(yarnwrap.text.HoverEvent event) { return wrapperContained.method_54184(event.wrapperContained); }
// public static Object method_54184(yarnwrap.text.HoverEvent event, ) { return net.minecraft.text.HoverEvent.method_54184(event.wrapperContained); }

}