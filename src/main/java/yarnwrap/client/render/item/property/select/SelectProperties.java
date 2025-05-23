package yarnwrap.client.render.item.property.select;
public class SelectProperties { public net.minecraft.client.render.item.property.select.SelectProperties wrapperContained; public SelectProperties(net.minecraft.client.render.item.property.select.SelectProperties wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.render.item.property.select.SelectProperties.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.render.item.property.select.SelectProperties.CODEC = value; }

// public Object ID_MAPPER() { return wrapperContained.ID_MAPPER; }
// // public void ID_MAPPER(Object value) { wrapperContained.ID_MAPPER = value; }
// public static Object ID_MAPPER() { return net.minecraft.client.render.item.property.select.SelectProperties.ID_MAPPER; }
// // public static void ID_MAPPER(Object value, ) { net.minecraft.client.render.item.property.select.SelectProperties.ID_MAPPER = value; }

// public void bootstrap() { wrapperContained.bootstrap(); }
public static void bootstrap() { net.minecraft.client.render.item.property.select.SelectProperties.bootstrap(); }

}