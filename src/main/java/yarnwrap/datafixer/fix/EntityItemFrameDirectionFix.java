package yarnwrap.datafixer.fix;
public class EntityItemFrameDirectionFix { public net.minecraft.datafixer.fix.EntityItemFrameDirectionFix wrapperContained; public EntityItemFrameDirectionFix(net.minecraft.datafixer.fix.EntityItemFrameDirectionFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityItemFrameDirectionFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityItemFrameDirectionFix(outputSchema,changesType); }
public com.mojang.serialization.Dynamic fixDirection(com.mojang.serialization.Dynamic itemFrameDynamic) { return wrapperContained.fixDirection(itemFrameDynamic); }
// public static com.mojang.serialization.Dynamic fixDirection(com.mojang.serialization.Dynamic itemFrameDynamic, ) { return net.minecraft.datafixer.fix.EntityItemFrameDirectionFix.fixDirection(itemFrameDynamic); }
// public byte updateDirection(byte oldDirection) { return wrapperContained.updateDirection(oldDirection); }
// public static byte updateDirection(byte oldDirection, ) { return net.minecraft.datafixer.fix.EntityItemFrameDirectionFix.updateDirection(oldDirection); }

}