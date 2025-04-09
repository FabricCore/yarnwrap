package yarnwrap.block.entity;
public class VaultBlockEntity { public net.minecraft.block.entity.VaultBlockEntity wrapperContained; public VaultBlockEntity(net.minecraft.block.entity.VaultBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.block.vault.VaultServerData serverData() { return new yarnwrap.block.vault.VaultServerData(wrapperContained.serverData); }
// public yarnwrap.block.vault.VaultSharedData sharedData() { return new yarnwrap.block.vault.VaultSharedData(wrapperContained.sharedData); }
// public yarnwrap.block.vault.VaultClientData clientData() { return new yarnwrap.block.vault.VaultClientData(wrapperContained.clientData); }
// public yarnwrap.block.vault.VaultConfig config() { return new yarnwrap.block.vault.VaultConfig(wrapperContained.config); }
// public yarnwrap.nbt.NbtElement encodeValue(com.mojang.serialization.Codec codec,java.lang.Object value,Object registries) { return new yarnwrap.nbt.NbtElement(wrapperContained.encodeValue(codec,value,registries)); }
public void setConfig(yarnwrap.block.vault.VaultConfig config) { wrapperContained.setConfig(config.wrapperContained); }
public yarnwrap.block.vault.VaultServerData getServerData() { return new yarnwrap.block.vault.VaultServerData(wrapperContained.getServerData()); }
public yarnwrap.block.vault.VaultSharedData getSharedData() { return new yarnwrap.block.vault.VaultSharedData(wrapperContained.getSharedData()); }
public yarnwrap.block.vault.VaultClientData getClientData() { return new yarnwrap.block.vault.VaultClientData(wrapperContained.getClientData()); }
public yarnwrap.block.vault.VaultConfig getConfig() { return new yarnwrap.block.vault.VaultConfig(wrapperContained.getConfig()); }

}