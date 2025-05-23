package yarnwrap.text;
public class ClickEvent { public net.minecraft.text.ClickEvent wrapperContained; public ClickEvent(net.minecraft.text.ClickEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.text.ClickEvent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.text.ClickEvent.CODEC = value; }

public Object getAction() { return wrapperContained.getAction(); }
// public static Object getAction() { return net.minecraft.text.ClickEvent.getAction(); }
// public com.mojang.serialization.MapCodec method_66564(Object action) { return wrapperContained.method_66564(action); }
// public static com.mojang.serialization.MapCodec method_66564(Object action, ) { return net.minecraft.text.ClickEvent.method_66564(action); }

}