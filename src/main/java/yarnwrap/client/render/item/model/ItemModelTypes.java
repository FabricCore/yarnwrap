package yarnwrap.client.render.item.model;
public class ItemModelTypes { public net.minecraft.client.render.item.model.ItemModelTypes wrapperContained; public ItemModelTypes(net.minecraft.client.render.item.model.ItemModelTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.render.item.model.ItemModelTypes.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.render.item.model.ItemModelTypes.CODEC = value; }

// public Object ID_MAPPER() { return wrapperContained.ID_MAPPER; }
// // public void ID_MAPPER(Object value) { wrapperContained.ID_MAPPER = value; }
// public static Object ID_MAPPER() { return net.minecraft.client.render.item.model.ItemModelTypes.ID_MAPPER; }
// // public static void ID_MAPPER(Object value, ) { net.minecraft.client.render.item.model.ItemModelTypes.ID_MAPPER = value; }

// public void bootstrap() { wrapperContained.bootstrap(); }
public static void bootstrap() { net.minecraft.client.render.item.model.ItemModelTypes.bootstrap(); }
// public com.mojang.serialization.MapCodec method_65600(com.mojang.serialization.MapCodec codec) { return wrapperContained.method_65600(codec); }
// public static com.mojang.serialization.MapCodec method_65600(com.mojang.serialization.MapCodec codec, ) { return net.minecraft.client.render.item.model.ItemModelTypes.method_65600(codec); }

}