package yarnwrap.client.realms.dto;
public class Backup { public net.minecraft.client.realms.dto.Backup wrapperContained; public Backup(net.minecraft.client.realms.dto.Backup wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String backupId() { return wrapperContained.backupId; }
public void backupId(java.lang.String value) { wrapperContained.backupId = value; }
public java.util.Date lastModifiedDate() { return wrapperContained.lastModifiedDate; }
public void lastModifiedDate(java.util.Date value) { wrapperContained.lastModifiedDate = value; }
public long size() { return wrapperContained.size; }
public void size(long value) { wrapperContained.size = value; }
public java.util.Map metadata() { return wrapperContained.metadata; }
public void metadata(java.util.Map value) { wrapperContained.metadata = value; }
public java.util.Map changeList() { return wrapperContained.changeList; }
public void changeList(java.util.Map value) { wrapperContained.changeList = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean uploadedVersion() { return wrapperContained.uploadedVersion; }
// public void uploadedVersion(boolean value) { wrapperContained.uploadedVersion = value; }
public boolean isUploadedVersion() { return wrapperContained.isUploadedVersion(); }
public yarnwrap.client.realms.dto.Backup parse(com.google.gson.JsonElement node) { return new yarnwrap.client.realms.dto.Backup(wrapperContained.parse(node)); }
public void setUploadedVersion(boolean uploadedVersion) { wrapperContained.setUploadedVersion(uploadedVersion); }

}