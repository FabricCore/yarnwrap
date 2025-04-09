package yarnwrap.client.realms.dto;
public class Backup { public net.minecraft.client.realms.dto.Backup wrapperContained; public Backup(net.minecraft.client.realms.dto.Backup wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String backupId() { return wrapperContained.backupId; }
public java.util.Date lastModifiedDate() { return wrapperContained.lastModifiedDate; }
public long size() { return wrapperContained.size; }
public java.util.Map metadata() { return wrapperContained.metadata; }
public java.util.Map changeList() { return wrapperContained.changeList; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public boolean uploadedVersion() { return wrapperContained.uploadedVersion; }
public boolean isUploadedVersion() { return wrapperContained.isUploadedVersion(); }
public yarnwrap.client.realms.dto.Backup parse(com.google.gson.JsonElement node) { return new yarnwrap.client.realms.dto.Backup(wrapperContained.parse(node)); }
public void setUploadedVersion(boolean uploadedVersion) { wrapperContained.setUploadedVersion(uploadedVersion); }

}