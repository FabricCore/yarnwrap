package yarnwrap.resource;
public class ResourceManager { public net.minecraft.resource.ResourceManager wrapperContained; public ResourceManager(net.minecraft.resource.ResourceManager wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Set getAllNamespaces() { return wrapperContained.getAllNamespaces(); }
// public static java.util.Set getAllNamespaces() { return net.minecraft.resource.ResourceManager.getAllNamespaces(); }
public java.util.Map findResources(java.lang.String startingPath,java.util.function.Predicate allowedPathPredicate) { return wrapperContained.findResources(startingPath,allowedPathPredicate); }
// public static java.util.Map findResources(java.lang.String startingPath,java.util.function.Predicate allowedPathPredicate, ) { return net.minecraft.resource.ResourceManager.findResources(startingPath,allowedPathPredicate); }
public java.util.List getAllResources(yarnwrap.util.Identifier id) { return wrapperContained.getAllResources(id.wrapperContained); }
// public static java.util.List getAllResources(yarnwrap.util.Identifier id, ) { return net.minecraft.resource.ResourceManager.getAllResources(id.wrapperContained); }
public java.util.stream.Stream streamResourcePacks() { return wrapperContained.streamResourcePacks(); }
// public static java.util.stream.Stream streamResourcePacks() { return net.minecraft.resource.ResourceManager.streamResourcePacks(); }
public java.util.Map findAllResources(java.lang.String startingPath,java.util.function.Predicate allowedPathPredicate) { return wrapperContained.findAllResources(startingPath,allowedPathPredicate); }
// public static java.util.Map findAllResources(java.lang.String startingPath,java.util.function.Predicate allowedPathPredicate, ) { return net.minecraft.resource.ResourceManager.findAllResources(startingPath,allowedPathPredicate); }

}