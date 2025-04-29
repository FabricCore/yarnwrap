package yarnwrap.client.realms.dto;
public class RealmsNotification { public net.minecraft.client.realms.dto.RealmsNotification wrapperContained; public RealmsNotification(net.minecraft.client.realms.dto.RealmsNotification wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.RealmsNotification.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.RealmsNotification.LOGGER = value; }

// public java.lang.String NOTIFICATION_UUID_KEY() { return wrapperContained.NOTIFICATION_UUID_KEY; }
// public void NOTIFICATION_UUID_KEY(java.lang.String value) { wrapperContained.NOTIFICATION_UUID_KEY = value; }
// public static java.lang.String NOTIFICATION_UUID_KEY() { return net.minecraft.client.realms.dto.RealmsNotification.NOTIFICATION_UUID_KEY; }
// public static void NOTIFICATION_UUID_KEY(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsNotification.NOTIFICATION_UUID_KEY = value; }

// public java.lang.String DISMISSABLE_KEY() { return wrapperContained.DISMISSABLE_KEY; }
// public void DISMISSABLE_KEY(java.lang.String value) { wrapperContained.DISMISSABLE_KEY = value; }
// public static java.lang.String DISMISSABLE_KEY() { return net.minecraft.client.realms.dto.RealmsNotification.DISMISSABLE_KEY; }
// public static void DISMISSABLE_KEY(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsNotification.DISMISSABLE_KEY = value; }

// public java.lang.String SEEN_KEY() { return wrapperContained.SEEN_KEY; }
// public void SEEN_KEY(java.lang.String value) { wrapperContained.SEEN_KEY = value; }
// public static java.lang.String SEEN_KEY() { return net.minecraft.client.realms.dto.RealmsNotification.SEEN_KEY; }
// public static void SEEN_KEY(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsNotification.SEEN_KEY = value; }

// public java.lang.String TYPE_KEY() { return wrapperContained.TYPE_KEY; }
// public void TYPE_KEY(java.lang.String value) { wrapperContained.TYPE_KEY = value; }
// public static java.lang.String TYPE_KEY() { return net.minecraft.client.realms.dto.RealmsNotification.TYPE_KEY; }
// public static void TYPE_KEY(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsNotification.TYPE_KEY = value; }

// public java.lang.String VISIT_URL_TYPE() { return wrapperContained.VISIT_URL_TYPE; }
// public void VISIT_URL_TYPE(java.lang.String value) { wrapperContained.VISIT_URL_TYPE = value; }
// public static java.lang.String VISIT_URL_TYPE() { return net.minecraft.client.realms.dto.RealmsNotification.VISIT_URL_TYPE; }
// public static void VISIT_URL_TYPE(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsNotification.VISIT_URL_TYPE = value; }

// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public void uuid(java.util.UUID value) { wrapperContained.uuid = value; }
// public static java.util.UUID uuid() { return net.minecraft.client.realms.dto.RealmsNotification.uuid; }
// public static void uuid(java.util.UUID value, ) { net.minecraft.client.realms.dto.RealmsNotification.uuid = value; }

// public boolean dismissable() { return wrapperContained.dismissable; }
// public void dismissable(boolean value) { wrapperContained.dismissable = value; }
// public static boolean dismissable() { return net.minecraft.client.realms.dto.RealmsNotification.dismissable; }
// public static void dismissable(boolean value, ) { net.minecraft.client.realms.dto.RealmsNotification.dismissable = value; }

// public boolean seen() { return wrapperContained.seen; }
// public void seen(boolean value) { wrapperContained.seen = value; }
// public static boolean seen() { return net.minecraft.client.realms.dto.RealmsNotification.seen; }
// public static void seen(boolean value, ) { net.minecraft.client.realms.dto.RealmsNotification.seen = value; }

// public java.lang.String type() { return wrapperContained.type; }
// public void type(java.lang.String value) { wrapperContained.type = value; }
// public static java.lang.String type() { return net.minecraft.client.realms.dto.RealmsNotification.type; }
// public static void type(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsNotification.type = value; }

// public java.lang.String INFO_POPUP_TYPE() { return wrapperContained.INFO_POPUP_TYPE; }
// public void INFO_POPUP_TYPE(java.lang.String value) { wrapperContained.INFO_POPUP_TYPE = value; }
// public static java.lang.String INFO_POPUP_TYPE() { return net.minecraft.client.realms.dto.RealmsNotification.INFO_POPUP_TYPE; }
// public static void INFO_POPUP_TYPE(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsNotification.INFO_POPUP_TYPE = value; }

// public yarnwrap.text.Text OPEN_LINK_TEXT() { return new yarnwrap.text.Text(wrapperContained.OPEN_LINK_TEXT); }
// public void OPEN_LINK_TEXT(yarnwrap.text.Text value) { wrapperContained.OPEN_LINK_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text OPEN_LINK_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.realms.dto.RealmsNotification.OPEN_LINK_TEXT); }
// public static void OPEN_LINK_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.realms.dto.RealmsNotification.OPEN_LINK_TEXT = value.wrapperContained; }

// public RealmsNotification(java.util.UUID uuid,boolean dismissable,boolean seen,java.lang.String type) { this.wrapperContained = new net.minecraft.client.realms.dto.RealmsNotification(uuid,dismissable,seen,type); }
public boolean isSeen() { return wrapperContained.isSeen(); }
// public static boolean isSeen() { return net.minecraft.client.realms.dto.RealmsNotification.isSeen(); }
// public yarnwrap.client.realms.dto.RealmsNotification fromJson(com.google.gson.JsonObject json) { return new yarnwrap.client.realms.dto.RealmsNotification(wrapperContained.fromJson(json)); }
// public static yarnwrap.client.realms.dto.RealmsNotification fromJson(com.google.gson.JsonObject json, ) { return new yarnwrap.client.realms.dto.RealmsNotification(net.minecraft.client.realms.dto.RealmsNotification.fromJson(json)); }
// public java.util.List parse(java.lang.String json) { return wrapperContained.parse(json); }
// public static java.util.List parse(java.lang.String json, ) { return net.minecraft.client.realms.dto.RealmsNotification.parse(json); }
public boolean isDismissable() { return wrapperContained.isDismissable(); }
// public static boolean isDismissable() { return net.minecraft.client.realms.dto.RealmsNotification.isDismissable(); }
public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
// public static java.util.UUID getUuid() { return net.minecraft.client.realms.dto.RealmsNotification.getUuid(); }

}