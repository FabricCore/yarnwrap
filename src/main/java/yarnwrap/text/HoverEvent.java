package yarnwrap.text;
public class HoverEvent { public net.minecraft.text.HoverEvent wrapperContained; public HoverEvent(net.minecraft.text.HoverEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.text.HoverEvent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.text.HoverEvent.CODEC = value; }

public Object getAction() { return wrapperContained.getAction(); }
// public static Object getAction() { return net.minecraft.text.HoverEvent.getAction(); }
// public com.mojang.serialization.MapCodec method_54184(Object action) { return wrapperContained.method_54184(action); }
// public static com.mojang.serialization.MapCodec method_54184(Object action, ) { return net.minecraft.text.HoverEvent.method_54184(action); }

}