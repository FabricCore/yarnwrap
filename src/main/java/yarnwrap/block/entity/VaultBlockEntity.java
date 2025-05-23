package yarnwrap.block.entity;
public class VaultBlockEntity { public net.minecraft.block.entity.VaultBlockEntity wrapperContained; public VaultBlockEntity(net.minecraft.block.entity.VaultBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.vault.VaultServerData serverData() { return new yarnwrap.block.vault.VaultServerData(wrapperContained.serverData); }
// public void serverData(yarnwrap.block.vault.VaultServerData value) { wrapperContained.serverData = value.wrapperContained; }
// public static yarnwrap.block.vault.VaultServerData serverData() { return new yarnwrap.block.vault.VaultServerData(net.minecraft.block.entity.VaultBlockEntity.serverData); }
// public static void serverData(yarnwrap.block.vault.VaultServerData value, ) { net.minecraft.block.entity.VaultBlockEntity.serverData = value.wrapperContained; }

// public yarnwrap.block.vault.VaultSharedData sharedData() { return new yarnwrap.block.vault.VaultSharedData(wrapperContained.sharedData); }
// public void sharedData(yarnwrap.block.vault.VaultSharedData value) { wrapperContained.sharedData = value.wrapperContained; }
// public static yarnwrap.block.vault.VaultSharedData sharedData() { return new yarnwrap.block.vault.VaultSharedData(net.minecraft.block.entity.VaultBlockEntity.sharedData); }
// public static void sharedData(yarnwrap.block.vault.VaultSharedData value, ) { net.minecraft.block.entity.VaultBlockEntity.sharedData = value.wrapperContained; }

// public yarnwrap.block.vault.VaultClientData clientData() { return new yarnwrap.block.vault.VaultClientData(wrapperContained.clientData); }
// public void clientData(yarnwrap.block.vault.VaultClientData value) { wrapperContained.clientData = value.wrapperContained; }
// public static yarnwrap.block.vault.VaultClientData clientData() { return new yarnwrap.block.vault.VaultClientData(net.minecraft.block.entity.VaultBlockEntity.clientData); }
// public static void clientData(yarnwrap.block.vault.VaultClientData value, ) { net.minecraft.block.entity.VaultBlockEntity.clientData = value.wrapperContained; }

// public yarnwrap.block.vault.VaultConfig config() { return new yarnwrap.block.vault.VaultConfig(wrapperContained.config); }
// public void config(yarnwrap.block.vault.VaultConfig value) { wrapperContained.config = value.wrapperContained; }
// public static yarnwrap.block.vault.VaultConfig config() { return new yarnwrap.block.vault.VaultConfig(net.minecraft.block.entity.VaultBlockEntity.config); }
// public static void config(yarnwrap.block.vault.VaultConfig value, ) { net.minecraft.block.entity.VaultBlockEntity.config = value.wrapperContained; }

public VaultBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.VaultBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void setConfig(yarnwrap.block.vault.VaultConfig config) { wrapperContained.setConfig(config.wrapperContained); }
// public static void setConfig(yarnwrap.block.vault.VaultConfig config, ) { net.minecraft.block.entity.VaultBlockEntity.setConfig(config.wrapperContained); }
public yarnwrap.block.vault.VaultServerData getServerData() { return new yarnwrap.block.vault.VaultServerData(wrapperContained.getServerData()); }
// public static yarnwrap.block.vault.VaultServerData getServerData() { return new yarnwrap.block.vault.VaultServerData(net.minecraft.block.entity.VaultBlockEntity.getServerData()); }
// public void method_56734(Object nbt) { wrapperContained.method_56734(nbt); }
// public static void method_56734(Object nbt, ) { net.minecraft.block.entity.VaultBlockEntity.method_56734(nbt); }
public yarnwrap.block.vault.VaultSharedData getSharedData() { return new yarnwrap.block.vault.VaultSharedData(wrapperContained.getSharedData()); }
// public static yarnwrap.block.vault.VaultSharedData getSharedData() { return new yarnwrap.block.vault.VaultSharedData(net.minecraft.block.entity.VaultBlockEntity.getSharedData()); }
public yarnwrap.block.vault.VaultClientData getClientData() { return new yarnwrap.block.vault.VaultClientData(wrapperContained.getClientData()); }
// public static yarnwrap.block.vault.VaultClientData getClientData() { return new yarnwrap.block.vault.VaultClientData(net.minecraft.block.entity.VaultBlockEntity.getClientData()); }
public yarnwrap.block.vault.VaultConfig getConfig() { return new yarnwrap.block.vault.VaultConfig(wrapperContained.getConfig()); }
// public static yarnwrap.block.vault.VaultConfig getConfig() { return new yarnwrap.block.vault.VaultConfig(net.minecraft.block.entity.VaultBlockEntity.getConfig()); }

}