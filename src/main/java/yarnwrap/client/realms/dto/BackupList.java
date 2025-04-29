package yarnwrap.client.realms.dto;
public class BackupList { public net.minecraft.client.realms.dto.BackupList wrapperContained; public BackupList(net.minecraft.client.realms.dto.BackupList wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List backups() { return wrapperContained.backups; }
public void backups(java.util.List value) { wrapperContained.backups = value; }
// public static java.util.List backups() { return net.minecraft.client.realms.dto.BackupList.backups; }
// public static void backups(java.util.List value, ) { net.minecraft.client.realms.dto.BackupList.backups = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.BackupList.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.BackupList.LOGGER = value; }

// public yarnwrap.client.realms.dto.BackupList parse(java.lang.String json) { return new yarnwrap.client.realms.dto.BackupList(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.BackupList parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.BackupList(net.minecraft.client.realms.dto.BackupList.parse(json)); }

}