package yarnwrap.datafixer.fix;
public class ItemBannerColorFix { public net.minecraft.datafixer.fix.ItemBannerColorFix wrapperContained; public ItemBannerColorFix(net.minecraft.datafixer.fix.ItemBannerColorFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ItemBannerColorFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemBannerColorFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_5004(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_5004(itemStackTyped); }
// public static com.mojang.datafixers.Typed method_5004(com.mojang.datafixers.OpticFinder itemStackTyped, ) { return net.minecraft.datafixer.fix.ItemBannerColorFix.method_5004(itemStackTyped); }

}