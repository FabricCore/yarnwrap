package yarnwrap.entity;
public class SkinOverlayOwner { public net.minecraft.entity.SkinOverlayOwner wrapperContained; public SkinOverlayOwner(net.minecraft.entity.SkinOverlayOwner wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean shouldRenderOverlay() { return wrapperContained.shouldRenderOverlay(); }

}