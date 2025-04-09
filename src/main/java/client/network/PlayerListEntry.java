package yarnwrap.client.network;
public class PlayerListEntry { public net.minecraft.client.network.PlayerListEntry wrapperContained; public PlayerListEntry(net.minecraft.client.network.PlayerListEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public int latency() { return wrapperContained.latency; }
// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public yarnwrap.network.message.MessageVerifier messageVerifier() { return new yarnwrap.network.message.MessageVerifier(wrapperContained.messageVerifier); }
// public yarnwrap.network.encryption.PublicPlayerSession session() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.session); }
// public java.util.function.Supplier texturesSupplier() { return wrapperContained.texturesSupplier; }
public yarnwrap.scoreboard.Team getScoreboardTeam() { return new yarnwrap.scoreboard.Team(wrapperContained.getScoreboardTeam()); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
public int getLatency() { return wrapperContained.getLatency(); }
public void setDisplayName(yarnwrap.text.Text displayName) { wrapperContained.setDisplayName(displayName.wrapperContained); }
// public void setGameMode(yarnwrap.world.GameMode gameMode) { wrapperContained.setGameMode(gameMode.wrapperContained); }
public com.mojang.authlib.GameProfile getProfile() { return wrapperContained.getProfile(); }
// public void setLatency(int latency) { wrapperContained.setLatency(latency); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
public yarnwrap.network.message.MessageVerifier getMessageVerifier() { return new yarnwrap.network.message.MessageVerifier(wrapperContained.getMessageVerifier()); }
// public void setSession(yarnwrap.network.encryption.PublicPlayerSession session) { wrapperContained.setSession(session.wrapperContained); }
public yarnwrap.network.encryption.PublicPlayerSession getSession() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.getSession()); }
public boolean hasPublicKey() { return wrapperContained.hasPublicKey(); }
// public void resetSession(boolean secureChatEnforced) { wrapperContained.resetSession(secureChatEnforced); }
// public yarnwrap.network.message.MessageVerifier getInitialVerifier(boolean secureChatEnforced) { return new yarnwrap.network.message.MessageVerifier(wrapperContained.getInitialVerifier(secureChatEnforced)); }
// public java.util.function.Supplier texturesSupplier(com.mojang.authlib.GameProfile profile) { return wrapperContained.texturesSupplier(profile); }
public yarnwrap.client.util.SkinTextures getSkinTextures() { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures()); }

}