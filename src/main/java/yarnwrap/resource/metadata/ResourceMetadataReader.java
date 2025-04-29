package yarnwrap.resource.metadata;
public class ResourceMetadataReader { public net.minecraft.resource.metadata.ResourceMetadataReader wrapperContained; public ResourceMetadataReader(net.minecraft.resource.metadata.ResourceMetadataReader wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getKey() { return wrapperContained.getKey(); }
// public static java.lang.String getKey() { return net.minecraft.resource.metadata.ResourceMetadataReader.getKey(); }
public java.lang.Object fromJson(com.google.gson.JsonObject json) { return wrapperContained.fromJson(json); }
// public static java.lang.Object fromJson(com.google.gson.JsonObject json, ) { return net.minecraft.resource.metadata.ResourceMetadataReader.fromJson(json); }

}