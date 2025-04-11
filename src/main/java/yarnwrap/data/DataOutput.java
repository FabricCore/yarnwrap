package yarnwrap.data;
public class DataOutput { public net.minecraft.data.DataOutput wrapperContained; public DataOutput(net.minecraft.data.DataOutput wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path path() { return wrapperContained.path; }
// public void path(java.nio.file.Path value) { wrapperContained.path = value; }
public DataOutput(java.nio.file.Path path) { this.wrapperContained = new net.minecraft.data.DataOutput(path); }
public java.nio.file.Path getPath() { return wrapperContained.getPath(); }
// public java.nio.file.Path resolvePath(Object outputType) { return wrapperContained.resolvePath(outputType); }
// public Object getResolver(Object outputType,java.lang.String directoryName) { return wrapperContained.getResolver(outputType,directoryName); }
public Object getResolver(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getResolver(registryRef.wrapperContained); }
public Object getTagResolver(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getTagResolver(registryRef.wrapperContained); }

}