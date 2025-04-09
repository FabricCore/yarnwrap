package yarnwrap.client.realms.dto;
public class PlayerInfo { public net.minecraft.client.realms.dto.PlayerInfo wrapperContained; public PlayerInfo(net.minecraft.client.realms.dto.PlayerInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public boolean operator() { return wrapperContained.operator; }
// public boolean accepted() { return wrapperContained.accepted; }
// public boolean online() { return wrapperContained.online; }
public java.lang.String getName() { return wrapperContained.getName(); }
public void setName(java.lang.String name) { wrapperContained.setName(name); }
public void setOperator(boolean operator) { wrapperContained.setOperator(operator); }
public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
public void setUuid(java.util.UUID uuid) { wrapperContained.setUuid(uuid); }
public void setAccepted(boolean accepted) { wrapperContained.setAccepted(accepted); }
public boolean isOperator() { return wrapperContained.isOperator(); }
public void setOnline(boolean online) { wrapperContained.setOnline(online); }
public boolean isAccepted() { return wrapperContained.isAccepted(); }
public boolean isOnline() { return wrapperContained.isOnline(); }

}