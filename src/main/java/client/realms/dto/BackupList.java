package yarnwrap.client.realms.dto;
public class BackupList { public net.minecraft.client.realms.dto.BackupList wrapperContained; public BackupList(net.minecraft.client.realms.dto.BackupList wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List backups() { return wrapperContained.backups; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.realms.dto.BackupList parse(java.lang.String json) { return new yarnwrap.client.realms.dto.BackupList(wrapperContained.parse(json)); }

}