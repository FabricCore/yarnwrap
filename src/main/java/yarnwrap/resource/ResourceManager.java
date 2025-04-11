package yarnwrap.resource;
public class ResourceManager { public net.minecraft.resource.ResourceManager wrapperContained; public ResourceManager(net.minecraft.resource.ResourceManager wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Set getAllNamespaces() { return wrapperContained.getAllNamespaces(); }
public java.util.Map findResources(java.lang.String startingPath,java.util.function.Predicate allowedPathPredicate) { return wrapperContained.findResources(startingPath,allowedPathPredicate); }
public java.util.List getAllResources(yarnwrap.util.Identifier id) { return wrapperContained.getAllResources(id.wrapperContained); }
public java.util.stream.Stream streamResourcePacks() { return wrapperContained.streamResourcePacks(); }
public java.util.Map findAllResources(java.lang.String startingPath,java.util.function.Predicate allowedPathPredicate) { return wrapperContained.findAllResources(startingPath,allowedPathPredicate); }

}