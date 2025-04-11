package yarnwrap.resource;
public class ResourceFactory { public net.minecraft.resource.ResourceFactory wrapperContained; public ResourceFactory(net.minecraft.resource.ResourceFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.ResourceFactory MISSING() { return new yarnwrap.resource.ResourceFactory(wrapperContained.MISSING); }
// public void MISSING(yarnwrap.resource.ResourceFactory value) { wrapperContained.MISSING = value.wrapperContained; }
public java.util.Optional getResource(yarnwrap.util.Identifier id) { return wrapperContained.getResource(id.wrapperContained); }

}