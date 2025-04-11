package yarnwrap.client.realms;
public class RealmsClient { public net.minecraft.client.realms.RealmsClient wrapperContained; public RealmsClient(net.minecraft.client.realms.RealmsClient wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String sessionId() { return wrapperContained.sessionId; }
// public void sessionId(java.lang.String value) { wrapperContained.sessionId = value; }
// public java.lang.String username() { return wrapperContained.username; }
// public void username(java.lang.String value) { wrapperContained.username = value; }
// public yarnwrap.client.realms.CheckedGson JSON() { return new yarnwrap.client.realms.CheckedGson(wrapperContained.JSON); }
// public void JSON(yarnwrap.client.realms.CheckedGson value) { wrapperContained.JSON = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.lang.String COUNT_PENDING_ENDPOINT() { return wrapperContained.COUNT_PENDING_ENDPOINT; }
// public void COUNT_PENDING_ENDPOINT(java.lang.String value) { wrapperContained.COUNT_PENDING_ENDPOINT = value; }
// public java.lang.String PENDING_ENDPOINT() { return wrapperContained.PENDING_ENDPOINT; }
// public void PENDING_ENDPOINT(java.lang.String value) { wrapperContained.PENDING_ENDPOINT = value; }
// public java.lang.String ACCEPT_INVITATION_ENDPOINT() { return wrapperContained.ACCEPT_INVITATION_ENDPOINT; }
// public void ACCEPT_INVITATION_ENDPOINT(java.lang.String value) { wrapperContained.ACCEPT_INVITATION_ENDPOINT = value; }
// public java.lang.String REJECT_INVITATION_ENDPOINT() { return wrapperContained.REJECT_INVITATION_ENDPOINT; }
// public void REJECT_INVITATION_ENDPOINT(java.lang.String value) { wrapperContained.REJECT_INVITATION_ENDPOINT = value; }
// public java.lang.String WORLD_ENDPOINT_4() { return wrapperContained.WORLD_ENDPOINT_4; }
// public void WORLD_ENDPOINT_4(java.lang.String value) { wrapperContained.WORLD_ENDPOINT_4 = value; }
// public java.lang.String WORLD_ENDPOINT_5() { return wrapperContained.WORLD_ENDPOINT_5; }
// public void WORLD_ENDPOINT_5(java.lang.String value) { wrapperContained.WORLD_ENDPOINT_5 = value; }
// public java.lang.String WORLD_SLOT_ENDPOINT() { return wrapperContained.WORLD_SLOT_ENDPOINT; }
// public void WORLD_SLOT_ENDPOINT(java.lang.String value) { wrapperContained.WORLD_SLOT_ENDPOINT = value; }
// public java.lang.String WORLD_OPEN_ENDPOINT() { return wrapperContained.WORLD_OPEN_ENDPOINT; }
// public void WORLD_OPEN_ENDPOINT(java.lang.String value) { wrapperContained.WORLD_OPEN_ENDPOINT = value; }
// public java.lang.String WORLD_CLOSE_ENDPOINT() { return wrapperContained.WORLD_CLOSE_ENDPOINT; }
// public void WORLD_CLOSE_ENDPOINT(java.lang.String value) { wrapperContained.WORLD_CLOSE_ENDPOINT = value; }
// public java.lang.String WORLD_RESET_ENDPOINT() { return wrapperContained.WORLD_RESET_ENDPOINT; }
// public void WORLD_RESET_ENDPOINT(java.lang.String value) { wrapperContained.WORLD_RESET_ENDPOINT = value; }
// public java.lang.String WORLD_ENDPOINT_6() { return wrapperContained.WORLD_ENDPOINT_6; }
// public void WORLD_ENDPOINT_6(java.lang.String value) { wrapperContained.WORLD_ENDPOINT_6 = value; }
// public java.lang.String WORLD_BACKUPS_ENDPOINT() { return wrapperContained.WORLD_BACKUPS_ENDPOINT; }
// public void WORLD_BACKUPS_ENDPOINT(java.lang.String value) { wrapperContained.WORLD_BACKUPS_ENDPOINT = value; }
// public java.lang.String WORLD_SLOT_DOWNLOAD_ENDPOINT() { return wrapperContained.WORLD_SLOT_DOWNLOAD_ENDPOINT; }
// public void WORLD_SLOT_DOWNLOAD_ENDPOINT(java.lang.String value) { wrapperContained.WORLD_SLOT_DOWNLOAD_ENDPOINT = value; }
// public java.lang.String WORLD_BACKUPS_UPLOAD_ENDPOINT() { return wrapperContained.WORLD_BACKUPS_UPLOAD_ENDPOINT; }
// public void WORLD_BACKUPS_UPLOAD_ENDPOINT(java.lang.String value) { wrapperContained.WORLD_BACKUPS_UPLOAD_ENDPOINT = value; }
// public java.lang.String CLIENT_COMPATIBLE_ENDPOINT() { return wrapperContained.CLIENT_COMPATIBLE_ENDPOINT; }
// public void CLIENT_COMPATIBLE_ENDPOINT(java.lang.String value) { wrapperContained.CLIENT_COMPATIBLE_ENDPOINT = value; }
// public java.lang.String TOS_AGREED_ENDPOINT() { return wrapperContained.TOS_AGREED_ENDPOINT; }
// public void TOS_AGREED_ENDPOINT(java.lang.String value) { wrapperContained.TOS_AGREED_ENDPOINT = value; }
// public java.lang.String NEWS_ENDPOINT() { return wrapperContained.NEWS_ENDPOINT; }
// public void NEWS_ENDPOINT(java.lang.String value) { wrapperContained.NEWS_ENDPOINT = value; }
// public java.lang.String WORLDS_ENDPOINT() { return wrapperContained.WORLDS_ENDPOINT; }
// public void WORLDS_ENDPOINT(java.lang.String value) { wrapperContained.WORLDS_ENDPOINT = value; }
// public java.lang.String INVITES_ENDPOINT() { return wrapperContained.INVITES_ENDPOINT; }
// public void INVITES_ENDPOINT(java.lang.String value) { wrapperContained.INVITES_ENDPOINT = value; }
// public java.lang.String MCO_ENDPOINT() { return wrapperContained.MCO_ENDPOINT; }
// public void MCO_ENDPOINT(java.lang.String value) { wrapperContained.MCO_ENDPOINT = value; }
// public java.lang.String SUBSCRIPTIONS_ENDPOINT() { return wrapperContained.SUBSCRIPTIONS_ENDPOINT; }
// public void SUBSCRIPTIONS_ENDPOINT(java.lang.String value) { wrapperContained.SUBSCRIPTIONS_ENDPOINT = value; }
// public java.lang.String ACTIVITIES_ENDPOINT() { return wrapperContained.ACTIVITIES_ENDPOINT; }
// public void ACTIVITIES_ENDPOINT(java.lang.String value) { wrapperContained.ACTIVITIES_ENDPOINT = value; }
// public java.lang.String OPS_ENDPOINT() { return wrapperContained.OPS_ENDPOINT; }
// public void OPS_ENDPOINT(java.lang.String value) { wrapperContained.OPS_ENDPOINT = value; }
// public java.lang.String PING_STAT_ENDPOINT() { return wrapperContained.PING_STAT_ENDPOINT; }
// public void PING_STAT_ENDPOINT(java.lang.String value) { wrapperContained.PING_STAT_ENDPOINT = value; }
// public java.lang.String TRIAL_ENDPOINT() { return wrapperContained.TRIAL_ENDPOINT; }
// public void TRIAL_ENDPOINT(java.lang.String value) { wrapperContained.TRIAL_ENDPOINT = value; }
// public java.lang.String WORLD_INITIALIZE_ENDPOINT() { return wrapperContained.WORLD_INITIALIZE_ENDPOINT; }
// public void WORLD_INITIALIZE_ENDPOINT(java.lang.String value) { wrapperContained.WORLD_INITIALIZE_ENDPOINT = value; }
// public java.lang.String WORLD_ENDPOINT() { return wrapperContained.WORLD_ENDPOINT; }
// public void WORLD_ENDPOINT(java.lang.String value) { wrapperContained.WORLD_ENDPOINT = value; }
// public java.lang.String LIVEPLAYERLIST_ENDPOINT() { return wrapperContained.LIVEPLAYERLIST_ENDPOINT; }
// public void LIVEPLAYERLIST_ENDPOINT(java.lang.String value) { wrapperContained.LIVEPLAYERLIST_ENDPOINT = value; }
// public java.lang.String WORLD_ENDPOINT_2() { return wrapperContained.WORLD_ENDPOINT_2; }
// public void WORLD_ENDPOINT_2(java.lang.String value) { wrapperContained.WORLD_ENDPOINT_2 = value; }
// public java.lang.String WORLD_PROFILE_ENDPOINT() { return wrapperContained.WORLD_PROFILE_ENDPOINT; }
// public void WORLD_PROFILE_ENDPOINT(java.lang.String value) { wrapperContained.WORLD_PROFILE_ENDPOINT = value; }
// public java.lang.String MINIGAMES_ENDPOINT() { return wrapperContained.MINIGAMES_ENDPOINT; }
// public void MINIGAMES_ENDPOINT(java.lang.String value) { wrapperContained.MINIGAMES_ENDPOINT = value; }
// public java.lang.String AVAILABLE_ENDPOINT() { return wrapperContained.AVAILABLE_ENDPOINT; }
// public void AVAILABLE_ENDPOINT(java.lang.String value) { wrapperContained.AVAILABLE_ENDPOINT = value; }
// public java.lang.String TEMPLATES_ENDPOINT() { return wrapperContained.TEMPLATES_ENDPOINT; }
// public void TEMPLATES_ENDPOINT(java.lang.String value) { wrapperContained.TEMPLATES_ENDPOINT = value; }
// public java.lang.String JOIN_PC_ENDPOINT() { return wrapperContained.JOIN_PC_ENDPOINT; }
// public void JOIN_PC_ENDPOINT(java.lang.String value) { wrapperContained.JOIN_PC_ENDPOINT = value; }
// public java.lang.String ID_ENDPOINT() { return wrapperContained.ID_ENDPOINT; }
// public void ID_ENDPOINT(java.lang.String value) { wrapperContained.ID_ENDPOINT = value; }
// public java.lang.String WORLD_ENDPOINT_3() { return wrapperContained.WORLD_ENDPOINT_3; }
// public void WORLD_ENDPOINT_3(java.lang.String value) { wrapperContained.WORLD_ENDPOINT_3 = value; }
// public java.lang.String INVITE_ENDPOINT() { return wrapperContained.INVITE_ENDPOINT; }
// public void INVITE_ENDPOINT(java.lang.String value) { wrapperContained.INVITE_ENDPOINT = value; }
// public java.lang.String SEEN_ENDPOINT() { return wrapperContained.SEEN_ENDPOINT; }
// public void SEEN_ENDPOINT(java.lang.String value) { wrapperContained.SEEN_ENDPOINT = value; }
// public java.lang.String DISMISS_ENDPOINT() { return wrapperContained.DISMISS_ENDPOINT; }
// public void DISMISS_ENDPOINT(java.lang.String value) { wrapperContained.DISMISS_ENDPOINT = value; }
// public java.lang.String NOTIFICATIONS_ENDPOINT() { return wrapperContained.NOTIFICATIONS_ENDPOINT; }
// public void NOTIFICATIONS_ENDPOINT(java.lang.String value) { wrapperContained.NOTIFICATIONS_ENDPOINT = value; }
public Object ENVIRONMENT() { return wrapperContained.ENVIRONMENT; }
// // public void ENVIRONMENT(Object value) { wrapperContained.ENVIRONMENT = value; }
// public java.lang.String LIST_USER_WORLDS_OF_TYPE_ANY_ENDPOINT() { return wrapperContained.LIST_USER_WORLDS_OF_TYPE_ANY_ENDPOINT; }
// public void LIST_USER_WORLDS_OF_TYPE_ANY_ENDPOINT(java.lang.String value) { wrapperContained.LIST_USER_WORLDS_OF_TYPE_ANY_ENDPOINT = value; }
// public java.lang.String CREATE_PRERELEASE_REALM_ENDPOINT() { return wrapperContained.CREATE_PRERELEASE_REALM_ENDPOINT; }
// public void CREATE_PRERELEASE_REALM_ENDPOINT(java.lang.String value) { wrapperContained.CREATE_PRERELEASE_REALM_ENDPOINT = value; }
// public java.lang.String LIST_PRERELEASE_ELIGIBLE_WORLDS_ENDPOINT() { return wrapperContained.LIST_PRERELEASE_ELIGIBLE_WORLDS_ENDPOINT; }
// public void LIST_PRERELEASE_ELIGIBLE_WORLDS_ENDPOINT(java.lang.String value) { wrapperContained.LIST_PRERELEASE_ELIGIBLE_WORLDS_ENDPOINT = value; }
public yarnwrap.client.realms.RealmsClient createRealmsClient(yarnwrap.client.MinecraftClient client) { return new yarnwrap.client.realms.RealmsClient(wrapperContained.createRealmsClient(client.wrapperContained)); }
// public yarnwrap.client.realms.dto.WorldTemplatePaginatedList fetchWorldTemplates(int page,int pageSize,Object type) { return new yarnwrap.client.realms.dto.WorldTemplatePaginatedList(wrapperContained.fetchWorldTemplates(page,pageSize,type)); }
// public yarnwrap.client.realms.dto.RealmsServer getOwnWorld(long worldId) { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.getOwnWorld(worldId)); }
// public boolean switchSlot(long worldId,int slot) { return wrapperContained.switchSlot(worldId,slot); }
// public void updateSlot(long worldId,int slot,yarnwrap.client.realms.dto.RealmsWorldOptions options) { wrapperContained.updateSlot(worldId,slot,options.wrapperContained); }
// public void uninvite(long worldId,java.util.UUID profileUuid) { wrapperContained.uninvite(worldId,profileUuid); }
// public java.lang.Boolean resetWorldWithSeed(long worldId,yarnwrap.client.realms.gui.screen.ResetWorldInfo resetWorldInfo) { return wrapperContained.resetWorldWithSeed(worldId,resetWorldInfo.wrapperContained); }
// public void initializeWorld(long worldId,java.lang.String name,java.lang.String motd) { wrapperContained.initializeWorld(worldId,name,motd); }
// public void sendPingResults(yarnwrap.client.realms.dto.PingResult pingResult) { wrapperContained.sendPingResults(pingResult.wrapperContained); }
// public java.lang.String execute(yarnwrap.client.realms.Request r) { return wrapperContained.execute(r.wrapperContained); }
// public void acceptInvitation(java.lang.String invitationId) { wrapperContained.acceptInvitation(invitationId); }
// public yarnwrap.client.realms.dto.WorldDownload download(long worldId,int slotId) { return new yarnwrap.client.realms.dto.WorldDownload(wrapperContained.download(worldId,slotId)); }
// public yarnwrap.client.realms.dto.RealmsServer invite(long worldId,java.lang.String profileName) { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.invite(worldId,profileName)); }
// public void update(long worldId,java.lang.String name,java.lang.String motd) { wrapperContained.update(worldId,name,motd); }
// public void rejectInvitation(java.lang.String invitationId) { wrapperContained.rejectInvitation(invitationId); }
// public java.lang.String url(java.lang.String path,java.lang.String queryString) { return wrapperContained.url(path,queryString); }
// public yarnwrap.client.realms.dto.RealmsServerAddress join(long worldId) { return new yarnwrap.client.realms.dto.RealmsServerAddress(wrapperContained.join(worldId)); }
// public void restoreWorld(long worldId,java.lang.String backupId) { wrapperContained.restoreWorld(worldId,backupId); }
// public java.lang.String url(java.lang.String path) { return wrapperContained.url(path); }
// public void uninviteMyselfFrom(long worldId) { wrapperContained.uninviteMyselfFrom(worldId); }
// public java.lang.Boolean putIntoMinigameMode(long worldId,java.lang.String minigameId) { return wrapperContained.putIntoMinigameMode(worldId,minigameId); }
// public yarnwrap.client.realms.dto.RealmsServerList listWorlds() { return new yarnwrap.client.realms.dto.RealmsServerList(wrapperContained.listWorlds()); }
// public yarnwrap.client.realms.dto.BackupList backupsFor(long worldId) { return new yarnwrap.client.realms.dto.BackupList(wrapperContained.backupsFor(worldId)); }
// public yarnwrap.client.realms.dto.Ops op(long worldId,java.util.UUID profileUuid) { return new yarnwrap.client.realms.dto.Ops(wrapperContained.op(worldId,profileUuid)); }
// public yarnwrap.client.realms.dto.RealmsServerPlayerList getLiveStats() { return new yarnwrap.client.realms.dto.RealmsServerPlayerList(wrapperContained.getLiveStats()); }
// public java.lang.Boolean open(long worldId) { return wrapperContained.open(worldId); }
// public yarnwrap.client.realms.dto.Ops deop(long worldId,java.util.UUID profileUuid) { return new yarnwrap.client.realms.dto.Ops(wrapperContained.deop(worldId,profileUuid)); }
// public java.lang.Boolean close(long worldId) { return wrapperContained.close(worldId); }
// public java.lang.Boolean resetWorldWithTemplate(long worldId,java.lang.String worldTemplateId) { return wrapperContained.resetWorldWithTemplate(worldId,worldTemplateId); }
// public yarnwrap.client.realms.dto.Subscription subscriptionFor(long worldId) { return new yarnwrap.client.realms.dto.Subscription(wrapperContained.subscriptionFor(worldId)); }
// public yarnwrap.client.realms.dto.UploadInfo upload(long worldId,java.lang.String token) { return new yarnwrap.client.realms.dto.UploadInfo(wrapperContained.upload(worldId,token)); }
// public Object clientCompatible() { return wrapperContained.clientCompatible(); }
// public void deleteWorld(long worldId) { wrapperContained.deleteWorld(worldId); }
// public int pendingInvitesCount() { return wrapperContained.pendingInvitesCount(); }
// public yarnwrap.client.realms.dto.PendingInvitesList pendingInvites() { return new yarnwrap.client.realms.dto.PendingInvitesList(wrapperContained.pendingInvites()); }
// public void agreeToTos() { wrapperContained.agreeToTos(); }
// public yarnwrap.client.realms.dto.RealmsNews getNews() { return new yarnwrap.client.realms.dto.RealmsNews(wrapperContained.getNews()); }
// public java.lang.Boolean trialAvailable() { return wrapperContained.trialAvailable(); }
// public boolean isOwnerBlocked(yarnwrap.client.realms.dto.PendingInvite invite) { return wrapperContained.isOwnerBlocked(invite.wrapperContained); }
// public yarnwrap.client.realms.dto.PlayerActivities getPlayerActivities(long worldId) { return new yarnwrap.client.realms.dto.PlayerActivities(wrapperContained.getPlayerActivities(worldId)); }
public yarnwrap.client.realms.RealmsClient create() { return new yarnwrap.client.realms.RealmsClient(wrapperContained.create()); }
// public void markNotificationsAsSeen(java.util.List notifications) { wrapperContained.markNotificationsAsSeen(notifications); }
// public void dismissNotifications(java.util.List notifications) { wrapperContained.dismissNotifications(notifications); }
// public com.google.gson.JsonArray toJsonArray(java.util.List uuids) { return wrapperContained.toJsonArray(uuids); }
// public java.util.List listNotifications() { return wrapperContained.listNotifications(); }
// public boolean mcoEnabled() { return wrapperContained.mcoEnabled(); }
// public yarnwrap.client.realms.dto.RealmsServer createPrereleaseServer(java.lang.Long parentWorldId) { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.createPrereleaseServer(parentWorldId)); }
// public java.util.List getPrereleaseEligibleServers() { return wrapperContained.getPrereleaseEligibleServers(); }

}