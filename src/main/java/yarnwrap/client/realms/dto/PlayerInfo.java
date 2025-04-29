package yarnwrap.client.realms.dto;
public class PlayerInfo { public net.minecraft.client.realms.dto.PlayerInfo wrapperContained; public PlayerInfo(net.minecraft.client.realms.dto.PlayerInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.realms.dto.PlayerInfo.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.realms.dto.PlayerInfo.name = value; }

// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public void uuid(java.util.UUID value) { wrapperContained.uuid = value; }
// public static java.util.UUID uuid() { return net.minecraft.client.realms.dto.PlayerInfo.uuid; }
// public static void uuid(java.util.UUID value, ) { net.minecraft.client.realms.dto.PlayerInfo.uuid = value; }

// public boolean operator() { return wrapperContained.operator; }
// public void operator(boolean value) { wrapperContained.operator = value; }
// public static boolean operator() { return net.minecraft.client.realms.dto.PlayerInfo.operator; }
// public static void operator(boolean value, ) { net.minecraft.client.realms.dto.PlayerInfo.operator = value; }

// public boolean accepted() { return wrapperContained.accepted; }
// public void accepted(boolean value) { wrapperContained.accepted = value; }
// public static boolean accepted() { return net.minecraft.client.realms.dto.PlayerInfo.accepted; }
// public static void accepted(boolean value, ) { net.minecraft.client.realms.dto.PlayerInfo.accepted = value; }

// public boolean online() { return wrapperContained.online; }
// public void online(boolean value) { wrapperContained.online = value; }
// public static boolean online() { return net.minecraft.client.realms.dto.PlayerInfo.online; }
// public static void online(boolean value, ) { net.minecraft.client.realms.dto.PlayerInfo.online = value; }

public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.client.realms.dto.PlayerInfo.getName(); }
public void setName(java.lang.String name) { wrapperContained.setName(name); }
// public static void setName(java.lang.String name, ) { net.minecraft.client.realms.dto.PlayerInfo.setName(name); }
public void setOperator(boolean operator) { wrapperContained.setOperator(operator); }
// public static void setOperator(boolean operator, ) { net.minecraft.client.realms.dto.PlayerInfo.setOperator(operator); }
public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
// public static java.util.UUID getUuid() { return net.minecraft.client.realms.dto.PlayerInfo.getUuid(); }
public void setUuid(java.util.UUID uuid) { wrapperContained.setUuid(uuid); }
// public static void setUuid(java.util.UUID uuid, ) { net.minecraft.client.realms.dto.PlayerInfo.setUuid(uuid); }
public void setAccepted(boolean accepted) { wrapperContained.setAccepted(accepted); }
// public static void setAccepted(boolean accepted, ) { net.minecraft.client.realms.dto.PlayerInfo.setAccepted(accepted); }
public boolean isOperator() { return wrapperContained.isOperator(); }
// public static boolean isOperator() { return net.minecraft.client.realms.dto.PlayerInfo.isOperator(); }
public void setOnline(boolean online) { wrapperContained.setOnline(online); }
// public static void setOnline(boolean online, ) { net.minecraft.client.realms.dto.PlayerInfo.setOnline(online); }
public boolean isAccepted() { return wrapperContained.isAccepted(); }
// public static boolean isAccepted() { return net.minecraft.client.realms.dto.PlayerInfo.isAccepted(); }
public boolean isOnline() { return wrapperContained.isOnline(); }
// public static boolean isOnline() { return net.minecraft.client.realms.dto.PlayerInfo.isOnline(); }

}