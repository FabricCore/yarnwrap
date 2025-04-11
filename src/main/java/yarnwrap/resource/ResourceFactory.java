package yarnwrap.resource;
public class ResourceFactory { public net.minecraft.resource.ResourceFactory wrapperContained; public ResourceFactory(net.minecraft.resource.ResourceFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.ResourceFactory MISSING() { return new yarnwrap.resource.ResourceFactory(wrapperContained.MISSING); }
// public void MISSING(yarnwrap.resource.ResourceFactory value) { wrapperContained.MISSING = value.wrapperContained; }
// public yarnwrap.resource.ResourceFactory fromMap(java.util.Map map) { return new yarnwrap.resource.ResourceFactory(wrapperContained.fromMap(map)); }
// public yarnwrap.resource.Resource getResourceOrThrow(yarnwrap.util.Identifier id) { return new yarnwrap.resource.Resource(wrapperContained.getResourceOrThrow(id.wrapperContained)); }
public java.util.Optional getResource(yarnwrap.util.Identifier id) { return wrapperContained.getResource(id.wrapperContained); }
// public java.util.Optional method_45307(java.util.Map id) { return wrapperContained.method_45307(id); }
// public java.util.Optional method_56937(yarnwrap.util.Identifier id) { return wrapperContained.method_56937(id.wrapperContained); }
// public java.io.InputStream open(yarnwrap.util.Identifier id) { return wrapperContained.open(id.wrapperContained); }
// public java.io.BufferedReader openAsReader(yarnwrap.util.Identifier id) { return wrapperContained.openAsReader(id.wrapperContained); }

}