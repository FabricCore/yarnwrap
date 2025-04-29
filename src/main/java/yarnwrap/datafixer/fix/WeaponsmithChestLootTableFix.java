package yarnwrap.datafixer.fix;
public class WeaponsmithChestLootTableFix { public net.minecraft.datafixer.fix.WeaponsmithChestLootTableFix wrapperContained; public WeaponsmithChestLootTableFix(net.minecraft.datafixer.fix.WeaponsmithChestLootTableFix wrapperContained) { this.wrapperContained = wrapperContained; }

public WeaponsmithChestLootTableFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.WeaponsmithChestLootTableFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic method_40070(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.method_40070(dynamic); }
// public static com.mojang.serialization.Dynamic method_40070(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.WeaponsmithChestLootTableFix.method_40070(dynamic); }

}