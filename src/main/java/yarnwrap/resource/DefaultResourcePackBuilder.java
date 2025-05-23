package yarnwrap.resource;
public class DefaultResourcePackBuilder { public net.minecraft.resource.DefaultResourcePackBuilder wrapperContained; public DefaultResourcePackBuilder(net.minecraft.resource.DefaultResourcePackBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer callback() { return wrapperContained.callback; }
// public void callback(java.util.function.Consumer value) { wrapperContained.callback = value; }
public static java.util.function.Consumer callback() { return net.minecraft.resource.DefaultResourcePackBuilder.callback; }
// public static void callback(java.util.function.Consumer value, ) { net.minecraft.resource.DefaultResourcePackBuilder.callback = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.resource.DefaultResourcePackBuilder.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.resource.DefaultResourcePackBuilder.LOGGER = value; }

// public java.util.Map RESOURCE_TYPE_TO_PATH() { return wrapperContained.RESOURCE_TYPE_TO_PATH; }
// public void RESOURCE_TYPE_TO_PATH(java.util.Map value) { wrapperContained.RESOURCE_TYPE_TO_PATH = value; }
// public static java.util.Map RESOURCE_TYPE_TO_PATH() { return net.minecraft.resource.DefaultResourcePackBuilder.RESOURCE_TYPE_TO_PATH; }
// public static void RESOURCE_TYPE_TO_PATH(java.util.Map value, ) { net.minecraft.resource.DefaultResourcePackBuilder.RESOURCE_TYPE_TO_PATH = value; }

// public java.util.Set rootPaths() { return wrapperContained.rootPaths; }
// public void rootPaths(java.util.Set value) { wrapperContained.rootPaths = value; }
// public static java.util.Set rootPaths() { return net.minecraft.resource.DefaultResourcePackBuilder.rootPaths; }
// public static void rootPaths(java.util.Set value, ) { net.minecraft.resource.DefaultResourcePackBuilder.rootPaths = value; }

// public java.util.Map paths() { return wrapperContained.paths; }
// public void paths(java.util.Map value) { wrapperContained.paths = value; }
// public static java.util.Map paths() { return net.minecraft.resource.DefaultResourcePackBuilder.paths; }
// public static void paths(java.util.Map value, ) { net.minecraft.resource.DefaultResourcePackBuilder.paths = value; }

// public yarnwrap.resource.metadata.ResourceMetadataMap metadataMap() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.metadataMap); }
// public void metadataMap(yarnwrap.resource.metadata.ResourceMetadataMap value) { wrapperContained.metadataMap = value.wrapperContained; }
// public static yarnwrap.resource.metadata.ResourceMetadataMap metadataMap() { return new yarnwrap.resource.metadata.ResourceMetadataMap(net.minecraft.resource.DefaultResourcePackBuilder.metadataMap); }
// public static void metadataMap(yarnwrap.resource.metadata.ResourceMetadataMap value, ) { net.minecraft.resource.DefaultResourcePackBuilder.metadataMap = value.wrapperContained; }

// public java.util.Set namespaces() { return wrapperContained.namespaces; }
// public void namespaces(java.util.Set value) { wrapperContained.namespaces = value; }
// public static java.util.Set namespaces() { return net.minecraft.resource.DefaultResourcePackBuilder.namespaces; }
// public static void namespaces(java.util.Set value, ) { net.minecraft.resource.DefaultResourcePackBuilder.namespaces = value; }

public yarnwrap.resource.DefaultResourcePackBuilder withDefaultPaths() { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withDefaultPaths()); }
// public static yarnwrap.resource.DefaultResourcePackBuilder withDefaultPaths() { return new yarnwrap.resource.DefaultResourcePackBuilder(net.minecraft.resource.DefaultResourcePackBuilder.withDefaultPaths()); }
public yarnwrap.resource.DefaultResourcePackBuilder withMetadataMap(yarnwrap.resource.metadata.ResourceMetadataMap metadataMap) { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withMetadataMap(metadataMap.wrapperContained)); }
// public static yarnwrap.resource.DefaultResourcePackBuilder withMetadataMap(yarnwrap.resource.metadata.ResourceMetadataMap metadataMap, ) { return new yarnwrap.resource.DefaultResourcePackBuilder(net.minecraft.resource.DefaultResourcePackBuilder.withMetadataMap(metadataMap.wrapperContained)); }
// public java.util.Set method_45199(yarnwrap.resource.ResourceType type2) { return wrapperContained.method_45199(type2.wrapperContained); }
// public static java.util.Set method_45199(yarnwrap.resource.ResourceType type2, ) { return net.minecraft.resource.DefaultResourcePackBuilder.method_45199(type2.wrapperContained); }
public yarnwrap.resource.DefaultResourcePackBuilder withPaths(yarnwrap.resource.ResourceType type,java.lang.Class clazz) { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withPaths(type.wrapperContained,clazz)); }
// public static yarnwrap.resource.DefaultResourcePackBuilder withPaths(yarnwrap.resource.ResourceType type,java.lang.Class clazz, ) { return new yarnwrap.resource.DefaultResourcePackBuilder(net.minecraft.resource.DefaultResourcePackBuilder.withPaths(type.wrapperContained,clazz)); }
public yarnwrap.resource.DefaultResourcePackBuilder withPath(yarnwrap.resource.ResourceType type,java.nio.file.Path path) { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withPath(type.wrapperContained,path)); }
// public static yarnwrap.resource.DefaultResourcePackBuilder withPath(yarnwrap.resource.ResourceType type,java.nio.file.Path path, ) { return new yarnwrap.resource.DefaultResourcePackBuilder(net.minecraft.resource.DefaultResourcePackBuilder.withPath(type.wrapperContained,path)); }
// public void method_45202(yarnwrap.resource.DefaultResourcePackBuilder builder) { wrapperContained.method_45202(builder.wrapperContained); }
// public static void method_45202(yarnwrap.resource.DefaultResourcePackBuilder builder, ) { net.minecraft.resource.DefaultResourcePackBuilder.method_45202(builder.wrapperContained); }
public yarnwrap.resource.DefaultResourcePackBuilder withRoot(java.nio.file.Path root) { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withRoot(root)); }
// public static yarnwrap.resource.DefaultResourcePackBuilder withRoot(java.nio.file.Path root, ) { return new yarnwrap.resource.DefaultResourcePackBuilder(net.minecraft.resource.DefaultResourcePackBuilder.withRoot(root)); }
// public java.util.List reverse(java.util.Collection paths) { return wrapperContained.reverse(paths); }
// public static java.util.List reverse(java.util.Collection paths, ) { return net.minecraft.resource.DefaultResourcePackBuilder.reverse(paths); }
public yarnwrap.resource.DefaultResourcePackBuilder withNamespaces(java.lang.String[] namespaces) { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withNamespaces(namespaces)); }
// public static yarnwrap.resource.DefaultResourcePackBuilder withNamespaces(java.lang.String[] namespaces, ) { return new yarnwrap.resource.DefaultResourcePackBuilder(net.minecraft.resource.DefaultResourcePackBuilder.withNamespaces(namespaces)); }
public yarnwrap.resource.DefaultResourcePackBuilder runCallback() { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.runCallback()); }
// public static yarnwrap.resource.DefaultResourcePackBuilder runCallback() { return new yarnwrap.resource.DefaultResourcePackBuilder(net.minecraft.resource.DefaultResourcePackBuilder.runCallback()); }
// public void addPath(yarnwrap.resource.ResourceType type,java.nio.file.Path path) { wrapperContained.addPath(type.wrapperContained,path); }
// public static void addPath(yarnwrap.resource.ResourceType type,java.nio.file.Path path, ) { net.minecraft.resource.DefaultResourcePackBuilder.addPath(type.wrapperContained,path); }
// public boolean exists(java.nio.file.Path path) { return wrapperContained.exists(path); }
// public static boolean exists(java.nio.file.Path path, ) { return net.minecraft.resource.DefaultResourcePackBuilder.exists(path); }
public yarnwrap.resource.DefaultResourcePack build(yarnwrap.resource.ResourcePackInfo info) { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.build(info.wrapperContained)); }
// public static yarnwrap.resource.DefaultResourcePack build(yarnwrap.resource.ResourcePackInfo info, ) { return new yarnwrap.resource.DefaultResourcePack(net.minecraft.resource.DefaultResourcePackBuilder.build(info.wrapperContained)); }
// public void method_45211(yarnwrap.resource.ResourceType type,java.nio.file.Path path) { wrapperContained.method_45211(type.wrapperContained,path); }
// public static void method_45211(yarnwrap.resource.ResourceType type,java.nio.file.Path path, ) { net.minecraft.resource.DefaultResourcePackBuilder.method_45211(type.wrapperContained,path); }
// public void addRootPath(java.nio.file.Path path) { wrapperContained.addRootPath(path); }
// public static void addRootPath(java.nio.file.Path path, ) { net.minecraft.resource.DefaultResourcePackBuilder.addRootPath(path); }
// public java.util.List method_66030(yarnwrap.resource.ResourceType type) { return wrapperContained.method_66030(type.wrapperContained); }
// public static java.util.List method_66030(yarnwrap.resource.ResourceType type, ) { return net.minecraft.resource.DefaultResourcePackBuilder.method_66030(type.wrapperContained); }

}