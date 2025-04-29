package yarnwrap.datafixer.fix;
public class CatTypeFix { public net.minecraft.datafixer.fix.CatTypeFix wrapperContained; public CatTypeFix(net.minecraft.datafixer.fix.CatTypeFix wrapperContained) { this.wrapperContained = wrapperContained; }

public CatTypeFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.CatTypeFix(outputSchema,changesType); }
public com.mojang.serialization.Dynamic fixCatTypeData(com.mojang.serialization.Dynamic catDynamic) { return wrapperContained.fixCatTypeData(catDynamic); }
// public static com.mojang.serialization.Dynamic fixCatTypeData(com.mojang.serialization.Dynamic catDynamic, ) { return net.minecraft.datafixer.fix.CatTypeFix.fixCatTypeData(catDynamic); }

}