package yarnwrap.resource;
public class ResourceType { public net.minecraft.resource.ResourceType wrapperContained; public ResourceType(net.minecraft.resource.ResourceType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String directory() { return wrapperContained.directory; }
// public void directory(java.lang.String value) { wrapperContained.directory = value; }
// public static java.lang.String directory() { return net.minecraft.resource.ResourceType.directory; }
// public static void directory(java.lang.String value, ) { net.minecraft.resource.ResourceType.directory = value; }

// public ResourceType(java.lang.String directory) { this.wrapperContained = new net.minecraft.resource.ResourceType(directory); }
public java.lang.String getDirectory() { return wrapperContained.getDirectory(); }
// public static java.lang.String getDirectory() { return net.minecraft.resource.ResourceType.getDirectory(); }

}