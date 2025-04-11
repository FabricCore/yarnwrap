package yarnwrap.resource;
public class ResourceFinder { public net.minecraft.resource.ResourceFinder wrapperContained; public ResourceFinder(net.minecraft.resource.ResourceFinder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String directoryName() { return wrapperContained.directoryName; }
// public void directoryName(java.lang.String value) { wrapperContained.directoryName = value; }
// public java.lang.String fileExtension() { return wrapperContained.fileExtension; }
// public void fileExtension(java.lang.String value) { wrapperContained.fileExtension = value; }
public ResourceFinder(java.lang.String directoryName,java.lang.String fileExtension) { this.wrapperContained = new net.minecraft.resource.ResourceFinder(directoryName,fileExtension); }
public yarnwrap.util.Identifier toResourcePath(yarnwrap.util.Identifier id) { return new yarnwrap.util.Identifier(wrapperContained.toResourcePath(id.wrapperContained)); }
public java.util.Map findResources(yarnwrap.resource.ResourceManager resourceManager) { return wrapperContained.findResources(resourceManager.wrapperContained); }
public yarnwrap.resource.ResourceFinder json(java.lang.String directoryName) { return new yarnwrap.resource.ResourceFinder(wrapperContained.json(directoryName)); }
public yarnwrap.util.Identifier toResourceId(yarnwrap.util.Identifier path) { return new yarnwrap.util.Identifier(wrapperContained.toResourceId(path.wrapperContained)); }
public java.util.Map findAllResources(yarnwrap.resource.ResourceManager resourceManager) { return wrapperContained.findAllResources(resourceManager.wrapperContained); }
// public boolean method_45117(yarnwrap.util.Identifier path) { return wrapperContained.method_45117(path.wrapperContained); }
// public boolean method_45118(yarnwrap.util.Identifier path) { return wrapperContained.method_45118(path.wrapperContained); }

}