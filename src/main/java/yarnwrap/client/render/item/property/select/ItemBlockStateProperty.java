package yarnwrap.client.render.item.property.select;
public class ItemBlockStateProperty { public net.minecraft.client.render.item.property.select.ItemBlockStateProperty wrapperContained; public ItemBlockStateProperty(net.minecraft.client.render.item.property.select.ItemBlockStateProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
// public static Object TYPE() { return net.minecraft.client.render.item.property.select.ItemBlockStateProperty.TYPE; }
// // public static void TYPE(Object value, ) { net.minecraft.client.render.item.property.select.ItemBlockStateProperty.TYPE = value; }

// public com.mojang.serialization.codecs.PrimitiveCodec VALUE_CODEC() { return wrapperContained.VALUE_CODEC; }
// public void VALUE_CODEC(com.mojang.serialization.codecs.PrimitiveCodec value) { wrapperContained.VALUE_CODEC = value; }
public static com.mojang.serialization.codecs.PrimitiveCodec VALUE_CODEC() { return net.minecraft.client.render.item.property.select.ItemBlockStateProperty.VALUE_CODEC; }
// public static void VALUE_CODEC(com.mojang.serialization.codecs.PrimitiveCodec value, ) { net.minecraft.client.render.item.property.select.ItemBlockStateProperty.VALUE_CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65680(Object instance) { return wrapperContained.method_65680(instance); }
// public static com.mojang.datafixers.kinds.App method_65680(Object instance, ) { return net.minecraft.client.render.item.property.select.ItemBlockStateProperty.method_65680(instance); }

}