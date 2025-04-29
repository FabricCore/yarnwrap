package yarnwrap.client.session;
public class Session { public net.minecraft.client.session.Session wrapperContained; public Session(net.minecraft.client.session.Session wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String username() { return wrapperContained.username; }
// public void username(java.lang.String value) { wrapperContained.username = value; }
// public static java.lang.String username() { return net.minecraft.client.session.Session.username; }
// public static void username(java.lang.String value, ) { net.minecraft.client.session.Session.username = value; }

// public java.lang.String accessToken() { return wrapperContained.accessToken; }
// public void accessToken(java.lang.String value) { wrapperContained.accessToken = value; }
// public static java.lang.String accessToken() { return net.minecraft.client.session.Session.accessToken; }
// public static void accessToken(java.lang.String value, ) { net.minecraft.client.session.Session.accessToken = value; }

// public Object accountType() { return wrapperContained.accountType; }
// // public void accountType(Object value) { wrapperContained.accountType = value; }
// // public static Object accountType() { return net.minecraft.client.session.Session.accountType; }
// // public static void accountType(Object value, ) { net.minecraft.client.session.Session.accountType = value; }

// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public void uuid(java.util.UUID value) { wrapperContained.uuid = value; }
// public static java.util.UUID uuid() { return net.minecraft.client.session.Session.uuid; }
// public static void uuid(java.util.UUID value, ) { net.minecraft.client.session.Session.uuid = value; }

// public java.util.Optional xuid() { return wrapperContained.xuid; }
// public void xuid(java.util.Optional value) { wrapperContained.xuid = value; }
// public static java.util.Optional xuid() { return net.minecraft.client.session.Session.xuid; }
// public static void xuid(java.util.Optional value, ) { net.minecraft.client.session.Session.xuid = value; }

// public java.util.Optional clientId() { return wrapperContained.clientId; }
// public void clientId(java.util.Optional value) { wrapperContained.clientId = value; }
// public static java.util.Optional clientId() { return net.minecraft.client.session.Session.clientId; }
// public static void clientId(java.util.Optional value, ) { net.minecraft.client.session.Session.clientId = value; }

// public Session(java.lang.String username,java.util.UUID uuid,java.lang.String accessToken,java.util.Optional xuid,java.util.Optional clientId,Object accountType) { this.wrapperContained = new net.minecraft.client.session.Session(username,uuid,accessToken,xuid,clientId,accountType); }
public java.lang.String getAccessToken() { return wrapperContained.getAccessToken(); }
// public static java.lang.String getAccessToken() { return net.minecraft.client.session.Session.getAccessToken(); }
public java.lang.String getSessionId() { return wrapperContained.getSessionId(); }
// public static java.lang.String getSessionId() { return net.minecraft.client.session.Session.getSessionId(); }
public java.lang.String getUsername() { return wrapperContained.getUsername(); }
// public static java.lang.String getUsername() { return net.minecraft.client.session.Session.getUsername(); }
public Object getAccountType() { return wrapperContained.getAccountType(); }
// public static Object getAccountType() { return net.minecraft.client.session.Session.getAccountType(); }
public java.util.Optional getClientId() { return wrapperContained.getClientId(); }
// public static java.util.Optional getClientId() { return net.minecraft.client.session.Session.getClientId(); }
public java.util.Optional getXuid() { return wrapperContained.getXuid(); }
// public static java.util.Optional getXuid() { return net.minecraft.client.session.Session.getXuid(); }
public java.util.UUID getUuidOrNull() { return wrapperContained.getUuidOrNull(); }
// public static java.util.UUID getUuidOrNull() { return net.minecraft.client.session.Session.getUuidOrNull(); }

}