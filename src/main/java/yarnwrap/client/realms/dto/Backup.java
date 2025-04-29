package yarnwrap.client.realms.dto;
public class Backup { public net.minecraft.client.realms.dto.Backup wrapperContained; public Backup(net.minecraft.client.realms.dto.Backup wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String backupId() { return wrapperContained.backupId; }
public void backupId(java.lang.String value) { wrapperContained.backupId = value; }
// public static java.lang.String backupId() { return net.minecraft.client.realms.dto.Backup.backupId; }
// public static void backupId(java.lang.String value, ) { net.minecraft.client.realms.dto.Backup.backupId = value; }

public java.util.Date lastModifiedDate() { return wrapperContained.lastModifiedDate; }
public void lastModifiedDate(java.util.Date value) { wrapperContained.lastModifiedDate = value; }
// public static java.util.Date lastModifiedDate() { return net.minecraft.client.realms.dto.Backup.lastModifiedDate; }
// public static void lastModifiedDate(java.util.Date value, ) { net.minecraft.client.realms.dto.Backup.lastModifiedDate = value; }

public long size() { return wrapperContained.size; }
public void size(long value) { wrapperContained.size = value; }
// public static long size() { return net.minecraft.client.realms.dto.Backup.size; }
// public static void size(long value, ) { net.minecraft.client.realms.dto.Backup.size = value; }

public java.util.Map metadata() { return wrapperContained.metadata; }
public void metadata(java.util.Map value) { wrapperContained.metadata = value; }
// public static java.util.Map metadata() { return net.minecraft.client.realms.dto.Backup.metadata; }
// public static void metadata(java.util.Map value, ) { net.minecraft.client.realms.dto.Backup.metadata = value; }

public java.util.Map changeList() { return wrapperContained.changeList; }
public void changeList(java.util.Map value) { wrapperContained.changeList = value; }
// public static java.util.Map changeList() { return net.minecraft.client.realms.dto.Backup.changeList; }
// public static void changeList(java.util.Map value, ) { net.minecraft.client.realms.dto.Backup.changeList = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.Backup.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.Backup.LOGGER = value; }

// public boolean uploadedVersion() { return wrapperContained.uploadedVersion; }
// public void uploadedVersion(boolean value) { wrapperContained.uploadedVersion = value; }
// public static boolean uploadedVersion() { return net.minecraft.client.realms.dto.Backup.uploadedVersion; }
// public static void uploadedVersion(boolean value, ) { net.minecraft.client.realms.dto.Backup.uploadedVersion = value; }

public boolean isUploadedVersion() { return wrapperContained.isUploadedVersion(); }
// public static boolean isUploadedVersion() { return net.minecraft.client.realms.dto.Backup.isUploadedVersion(); }
// public yarnwrap.client.realms.dto.Backup parse(com.google.gson.JsonElement node) { return new yarnwrap.client.realms.dto.Backup(wrapperContained.parse(node)); }
// public static yarnwrap.client.realms.dto.Backup parse(com.google.gson.JsonElement node, ) { return new yarnwrap.client.realms.dto.Backup(net.minecraft.client.realms.dto.Backup.parse(node)); }
public void setUploadedVersion(boolean uploadedVersion) { wrapperContained.setUploadedVersion(uploadedVersion); }
// public static void setUploadedVersion(boolean uploadedVersion, ) { net.minecraft.client.realms.dto.Backup.setUploadedVersion(uploadedVersion); }

}