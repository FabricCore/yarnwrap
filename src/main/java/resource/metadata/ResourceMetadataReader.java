package yarnwrap.resource.metadata;
public class ResourceMetadataReader { public net.minecraft.resource.metadata.ResourceMetadataReader wrapperContained; public ResourceMetadataReader(net.minecraft.resource.metadata.ResourceMetadataReader wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getKey() { return wrapperContained.getKey(); }
public java.lang.Object fromJson(com.google.gson.JsonObject json) { return wrapperContained.fromJson(json); }

}