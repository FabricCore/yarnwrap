package yarnwrap.resource;
public class OverlayResourcePack { public net.minecraft.resource.OverlayResourcePack wrapperContained; public OverlayResourcePack(net.minecraft.resource.OverlayResourcePack wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourcePack base() { return new yarnwrap.resource.ResourcePack(wrapperContained.base); }
// public void base(yarnwrap.resource.ResourcePack value) { wrapperContained.base = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePack base() { return new yarnwrap.resource.ResourcePack(net.minecraft.resource.OverlayResourcePack.base); }
// public static void base(yarnwrap.resource.ResourcePack value, ) { net.minecraft.resource.OverlayResourcePack.base = value.wrapperContained; }

// public java.util.List overlaysAndBase() { return wrapperContained.overlaysAndBase; }
// public void overlaysAndBase(java.util.List value) { wrapperContained.overlaysAndBase = value; }
// public static java.util.List overlaysAndBase() { return net.minecraft.resource.OverlayResourcePack.overlaysAndBase; }
// public static void overlaysAndBase(java.util.List value, ) { net.minecraft.resource.OverlayResourcePack.overlaysAndBase = value; }

public OverlayResourcePack(yarnwrap.resource.ResourcePack base,java.util.List overlays) { this.wrapperContained = new net.minecraft.resource.OverlayResourcePack(base.wrapperContained,overlays); }

}