package yarnwrap.datafixer.fix;
public class EquippableAssetRenameFix { public net.minecraft.datafixer.fix.EquippableAssetRenameFix wrapperContained; public EquippableAssetRenameFix(net.minecraft.datafixer.fix.EquippableAssetRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EquippableAssetRenameFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EquippableAssetRenameFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_65333(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.method_65333(dynamic); }
// public static com.mojang.serialization.Dynamic method_65333(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.EquippableAssetRenameFix.method_65333(dynamic); }

}