package yarnwrap.resource;
public class ResourceType { public net.minecraft.resource.ResourceType wrapperContained; public ResourceType(net.minecraft.resource.ResourceType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String directory() { return wrapperContained.directory; }
// public void directory(java.lang.String value) { wrapperContained.directory = value; }
// public ResourceType(java.lang.String directory) { this.wrapperContained = new net.minecraft.resource.ResourceType(directory); }
public java.lang.String getDirectory() { return wrapperContained.getDirectory(); }

}