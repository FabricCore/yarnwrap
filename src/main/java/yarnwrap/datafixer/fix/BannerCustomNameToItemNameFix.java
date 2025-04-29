package yarnwrap.datafixer.fix;
public class BannerCustomNameToItemNameFix { public net.minecraft.datafixer.fix.BannerCustomNameToItemNameFix wrapperContained; public BannerCustomNameToItemNameFix(net.minecraft.datafixer.fix.BannerCustomNameToItemNameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BannerCustomNameToItemNameFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.BannerCustomNameToItemNameFix(outputSchema); }
// public com.mojang.datafixers.Typed fix() { return wrapperContained.fix(); }
// public static com.mojang.datafixers.Typed fix() { return net.minecraft.datafixer.fix.BannerCustomNameToItemNameFix.fix(); }
// public boolean method_58600(java.lang.String name) { return wrapperContained.method_58600(name); }
// public static boolean method_58600(java.lang.String name, ) { return net.minecraft.datafixer.fix.BannerCustomNameToItemNameFix.method_58600(name); }

}