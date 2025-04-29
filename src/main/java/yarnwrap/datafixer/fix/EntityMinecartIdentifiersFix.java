package yarnwrap.datafixer.fix;
public class EntityMinecartIdentifiersFix { public net.minecraft.datafixer.fix.EntityMinecartIdentifiersFix wrapperContained; public EntityMinecartIdentifiersFix(net.minecraft.datafixer.fix.EntityMinecartIdentifiersFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityMinecartIdentifiersFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityMinecartIdentifiersFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_59879(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.method_59879(entityDynamic); }
// public static com.mojang.serialization.Dynamic method_59879(com.mojang.serialization.Dynamic entityDynamic, ) { return net.minecraft.datafixer.fix.EntityMinecartIdentifiersFix.method_59879(entityDynamic); }

}