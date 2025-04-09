package yarnwrap.client.realms.dto;
public class RealmsNotification { public net.minecraft.client.realms.dto.RealmsNotification wrapperContained; public RealmsNotification(net.minecraft.client.realms.dto.RealmsNotification wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String NOTIFICATION_UUID_KEY() { return wrapperContained.NOTIFICATION_UUID_KEY; }
// public java.lang.String DISMISSABLE_KEY() { return wrapperContained.DISMISSABLE_KEY; }
// public java.lang.String SEEN_KEY() { return wrapperContained.SEEN_KEY; }
// public java.lang.String TYPE_KEY() { return wrapperContained.TYPE_KEY; }
// public java.lang.String VISIT_URL_TYPE() { return wrapperContained.VISIT_URL_TYPE; }
// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public boolean dismissable() { return wrapperContained.dismissable; }
// public boolean seen() { return wrapperContained.seen; }
// public java.lang.String type() { return wrapperContained.type; }
// public java.lang.String INFO_POPUP_TYPE() { return wrapperContained.INFO_POPUP_TYPE; }
// public yarnwrap.text.Text OPEN_LINK_TEXT() { return new yarnwrap.text.Text(wrapperContained.OPEN_LINK_TEXT); }
public boolean isSeen() { return wrapperContained.isSeen(); }
// public yarnwrap.client.realms.dto.RealmsNotification fromJson(com.google.gson.JsonObject json) { return new yarnwrap.client.realms.dto.RealmsNotification(wrapperContained.fromJson(json)); }
public java.util.List parse(java.lang.String json) { return wrapperContained.parse(json); }
public boolean isDismissable() { return wrapperContained.isDismissable(); }
public java.util.UUID getUuid() { return wrapperContained.getUuid(); }

}