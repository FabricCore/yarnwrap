package yarnwrap.datafixer.fix;
public class EntitySalmonSizeFix { public net.minecraft.datafixer.fix.EntitySalmonSizeFix wrapperContained; public EntitySalmonSizeFix(net.minecraft.datafixer.fix.EntitySalmonSizeFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntitySalmonSizeFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EntitySalmonSizeFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_65079(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.method_65079(dynamic); }
// public static com.mojang.serialization.Dynamic method_65079(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.EntitySalmonSizeFix.method_65079(dynamic); }

}