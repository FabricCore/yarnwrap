package yarnwrap.resource;
public class OverlayResourcePack { public net.minecraft.resource.OverlayResourcePack wrapperContained; public OverlayResourcePack(net.minecraft.resource.OverlayResourcePack wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourcePack base() { return new yarnwrap.resource.ResourcePack(wrapperContained.base); }
// public void base(yarnwrap.resource.ResourcePack value) { wrapperContained.base = value.wrapperContained; }
// public java.util.List overlaysAndBase() { return wrapperContained.overlaysAndBase; }
// public void overlaysAndBase(java.util.List value) { wrapperContained.overlaysAndBase = value; }

}