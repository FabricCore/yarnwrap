package yarnwrap.datafixer.fix;
public class CatTypeFix { public net.minecraft.datafixer.fix.CatTypeFix wrapperContained; public CatTypeFix(net.minecraft.datafixer.fix.CatTypeFix wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic fixCatTypeData(com.mojang.serialization.Dynamic catDynamic) { return wrapperContained.fixCatTypeData(catDynamic); }

}