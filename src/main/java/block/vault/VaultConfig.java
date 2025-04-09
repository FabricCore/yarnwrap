package yarnwrap.block.vault;
public class VaultConfig { public net.minecraft.block.vault.VaultConfig wrapperContained; public VaultConfig(net.minecraft.block.vault.VaultConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String CONFIG_KEY() { return wrapperContained.CONFIG_KEY; }
// public yarnwrap.block.vault.VaultConfig DEFAULT() { return new yarnwrap.block.vault.VaultConfig(wrapperContained.DEFAULT); }
// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public com.mojang.serialization.DataResult validate() { return wrapperContained.validate(); }

}