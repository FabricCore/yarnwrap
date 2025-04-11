package yarnwrap.datafixer.fix;
public class EntityItemFrameDirectionFix { public net.minecraft.datafixer.fix.EntityItemFrameDirectionFix wrapperContained; public EntityItemFrameDirectionFix(net.minecraft.datafixer.fix.EntityItemFrameDirectionFix wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic fixDirection(com.mojang.serialization.Dynamic itemFrameDynamic) { return wrapperContained.fixDirection(itemFrameDynamic); }
// public byte updateDirection(byte oldDirection) { return wrapperContained.updateDirection(oldDirection); }

}