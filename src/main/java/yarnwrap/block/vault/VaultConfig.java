package yarnwrap.block.vault;
public class VaultConfig { public net.minecraft.block.vault.VaultConfig wrapperContained; public VaultConfig(net.minecraft.block.vault.VaultConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String CONFIG_KEY() { return wrapperContained.CONFIG_KEY; }
// public void CONFIG_KEY(java.lang.String value) { wrapperContained.CONFIG_KEY = value; }
// public yarnwrap.block.vault.VaultConfig DEFAULT() { return new yarnwrap.block.vault.VaultConfig(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.block.vault.VaultConfig value) { wrapperContained.DEFAULT = value.wrapperContained; }
// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
public VaultConfig(yarnwrap.registry.RegistryKey lootTable,double activationRange,double deactivationRange,yarnwrap.item.ItemStack keyItem,java.util.Optional overrideLootTableToDisplay) { this.wrapperContained = new net.minecraft.block.vault.VaultConfig(lootTable.wrapperContained,activationRange,deactivationRange,keyItem.wrapperContained,overrideLootTableToDisplay); }
// public com.mojang.datafixers.kinds.App method_56764(Object instance) { return wrapperContained.method_56764(instance); }
// public com.mojang.serialization.DataResult validate() { return wrapperContained.validate(); }

}