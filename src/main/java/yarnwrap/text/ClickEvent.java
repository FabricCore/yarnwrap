package yarnwrap.text;
public class ClickEvent { public net.minecraft.text.ClickEvent wrapperContained; public ClickEvent(net.minecraft.text.ClickEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String value() { return wrapperContained.value; }
// public void value(java.lang.String value) { wrapperContained.value = value; }
// public static java.lang.String value() { return net.minecraft.text.ClickEvent.value; }
// public static void value(java.lang.String value, ) { net.minecraft.text.ClickEvent.value = value; }

// public Object action() { return wrapperContained.action; }
// // public void action(Object value) { wrapperContained.action = value; }
// // public static Object action() { return net.minecraft.text.ClickEvent.action; }
// // public static void action(Object value, ) { net.minecraft.text.ClickEvent.action = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.text.ClickEvent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.text.ClickEvent.CODEC = value; }

// public ClickEvent(Object action,java.lang.String value) { this.wrapperContained = new net.minecraft.text.ClickEvent(action,value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.text.ClickEvent.equals(o); }
public java.lang.String getValue() { return wrapperContained.getValue(); }
// public static java.lang.String getValue() { return net.minecraft.text.ClickEvent.getValue(); }
public Object getAction() { return wrapperContained.getAction(); }
// public static Object getAction() { return net.minecraft.text.ClickEvent.getAction(); }
// public com.mojang.datafixers.kinds.App method_54149(Object instance) { return wrapperContained.method_54149(instance); }
// public static com.mojang.datafixers.kinds.App method_54149(Object instance, ) { return net.minecraft.text.ClickEvent.method_54149(instance); }
// public java.lang.String method_54150(yarnwrap.text.ClickEvent event) { return wrapperContained.method_54150(event.wrapperContained); }
// public static java.lang.String method_54150(yarnwrap.text.ClickEvent event, ) { return net.minecraft.text.ClickEvent.method_54150(event.wrapperContained); }
// public Object method_54151(yarnwrap.text.ClickEvent event) { return wrapperContained.method_54151(event.wrapperContained); }
// public static Object method_54151(yarnwrap.text.ClickEvent event, ) { return net.minecraft.text.ClickEvent.method_54151(event.wrapperContained); }

}