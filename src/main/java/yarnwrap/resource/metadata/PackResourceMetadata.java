package yarnwrap.resource.metadata;
public class PackResourceMetadata { public net.minecraft.resource.metadata.PackResourceMetadata wrapperContained; public PackResourceMetadata(net.minecraft.resource.metadata.PackResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
public static yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(net.minecraft.resource.metadata.PackResourceMetadata.SERIALIZER); }
// public static void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value, ) { net.minecraft.resource.metadata.PackResourceMetadata.SERIALIZER = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.resource.metadata.PackResourceMetadata.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.resource.metadata.PackResourceMetadata.CODEC = value; }

// public PackResourceMetadata(yarnwrap.text.Text description,int format) { this.wrapperContained = new net.minecraft.resource.metadata.PackResourceMetadata(description.wrapperContained,format); }
// public com.mojang.datafixers.kinds.App method_52434(Object instance) { return wrapperContained.method_52434(instance); }
// public static com.mojang.datafixers.kinds.App method_52434(Object instance, ) { return net.minecraft.resource.metadata.PackResourceMetadata.method_52434(instance); }

}