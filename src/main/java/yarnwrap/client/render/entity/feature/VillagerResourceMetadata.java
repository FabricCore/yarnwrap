package yarnwrap.client.render.entity.feature;
public class VillagerResourceMetadata { public net.minecraft.client.render.entity.feature.VillagerResourceMetadata wrapperContained; public VillagerResourceMetadata(net.minecraft.client.render.entity.feature.VillagerResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object hatType() { return wrapperContained.hatType; }
// // public void hatType(Object value) { wrapperContained.hatType = value; }
// // public static Object hatType() { return net.minecraft.client.render.entity.feature.VillagerResourceMetadata.hatType; }
// // public static void hatType(Object value, ) { net.minecraft.client.render.entity.feature.VillagerResourceMetadata.hatType = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.render.entity.feature.VillagerResourceMetadata.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.render.entity.feature.VillagerResourceMetadata.CODEC = value; }

// public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
public static yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(net.minecraft.client.render.entity.feature.VillagerResourceMetadata.SERIALIZER); }
// public static void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value, ) { net.minecraft.client.render.entity.feature.VillagerResourceMetadata.SERIALIZER = value.wrapperContained; }

// public VillagerResourceMetadata(Object hatType) { this.wrapperContained = new net.minecraft.client.render.entity.feature.VillagerResourceMetadata(hatType); }
// public Object hatType() { return wrapperContained.hatType(); }
// // public static Object hatType() { return net.minecraft.client.render.entity.feature.VillagerResourceMetadata.hatType(); }
// public com.mojang.datafixers.kinds.App method_65888(Object instance) { return wrapperContained.method_65888(instance); }
// public static com.mojang.datafixers.kinds.App method_65888(Object instance, ) { return net.minecraft.client.render.entity.feature.VillagerResourceMetadata.method_65888(instance); }

}