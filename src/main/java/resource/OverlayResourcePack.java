package yarnwrap.resource;
public class OverlayResourcePack { public net.minecraft.resource.OverlayResourcePack wrapperContained; public OverlayResourcePack(net.minecraft.resource.OverlayResourcePack wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourcePack base() { return new yarnwrap.resource.ResourcePack(wrapperContained.base); }
// public java.util.List overlaysAndBase() { return wrapperContained.overlaysAndBase; }

}